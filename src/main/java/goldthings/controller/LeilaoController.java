package goldthings.controller;

import goldthings.models.Leilao;
import goldthings.services.LeilaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.util.unit.DataSize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

@Controller
@RequestMapping("/leilao")
public class LeilaoController {
    @Autowired
    private LeilaoService leilaoService;

    @Value("${upload.directory}")
    private String uploadDirectory;

    @GetMapping("/formulario")
    public String formulario(Model model) {
        model.addAttribute("leilao", new Leilao());
        return "formLeilao";
    }

    @PostMapping("/leilao-save")
    public String salvar(@ModelAttribute("leilao") Leilao leilao, @RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) throws IOException {

        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("erro", "Selecione um arquivo para fazer upload");
            return "redirect:/";
        }

        // Defina o tamanho máximo permitido para o arquivo (por exemplo, 5MB)
        DataSize maxFileSize = DataSize.ofMegabytes(5);
        if (file.getSize() > maxFileSize.toBytes()) {
            redirectAttributes.addFlashAttribute("erro", "O arquivo excede o tamanho máximo permitido");
            return "redirect:/leilao/formulario";
        }

        String fileName = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));
        String originalFileName = file.getOriginalFilename();
        String extension = originalFileName.substring(originalFileName.lastIndexOf("."));
        String uniqueFileName = UUID.randomUUID().toString() + extension;

        try {
            File dest = new File(uploadDirectory + File.separator + uniqueFileName);
            file.transferTo(dest);
            redirectAttributes.addFlashAttribute("message", "Arquivo '" + fileName + "' foi enviado com sucesso");
        } catch (IOException e) {
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("message", "Falha ao enviar o arquivo");
        }

        Leilao l = new Leilao();
        l.setProduto(leilao.getProduto());
        l.setInicio(leilao.getInicio());
        l.setFim(leilao.getFim());
        l.setValor_inicial(leilao.getValor_inicial());
        l.setImagem(uniqueFileName);
        leilaoService.saveLeilao(l);

        return "redirect:/leilao/formulario";
    }
}
