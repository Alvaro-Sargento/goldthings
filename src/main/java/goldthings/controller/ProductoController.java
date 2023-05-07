package goldthings.controller;

import goldthings.models.Cliente;
import goldthings.models.Leilao;
import goldthings.models.Produto;
import goldthings.repository.ClienteRepository;
import goldthings.repository.ProductRepository;
import goldthings.services.ProdutoService;
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
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Controller
@RequestMapping("/produtos/")
public class ProductoController {
    @Autowired
    private ProdutoService produtoService;

    @Value("${upload.directory}")
    private String uploadDirectory;

    @PostMapping("/produto-save")
    public String create(@ModelAttribute("produto") Produto produto, @RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) throws IOException {
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

        Produto p = new Produto();
        p.setNome(produto.getNome());
        p.setDescricao(produto.getDescricao());
        p.setQuantidade(produto.getQuantidade());
        p.setPreco(produto.getPreco());
        p.setData_exp(produto.getData_exp());
        p.setImagem(uniqueFileName);
        produtoService.saveAllProducs(p);
        return "redirect:/produtos/listar";
    }

    @GetMapping("/formulario")
    public String formulario(Model model) {
        List<Produto> produtoList = produtoService.findAllProducts();
        model.addAttribute("produto", new Produto());
        model.addAttribute("dados", produtoList);
        return "produto";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Produto> produtoList = produtoService.findAllProducts();
        System.out.println(produtoList);
        model.addAttribute("produto", new Produto());
        model.addAttribute("dados", produtoList);
        return "produto-action";
    }

    @PostMapping("/produto/{id}/excluir")
    public String excluir(@PathVariable Long id) {
        System.out.println(id);
        produtoService.deleteWithId(id);
        return "redirect:/produtos/listar";
    }
}
