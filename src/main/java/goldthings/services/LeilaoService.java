package goldthings.services;

import goldthings.models.Leilao;
import goldthings.repository.LeilaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeilaoService {

    @Autowired
    private LeilaoRepository leilaoRepository;

    public Leilao saveLeilao(Leilao leilao) {
        return leilaoRepository.save(leilao);
    }


}
