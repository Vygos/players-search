package br.com.vygos.playerssearch.service;

import br.com.vygos.playerssearch.model.Player;
import br.com.vygos.playerssearch.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public Player findById(Integer id) {
        return playerRepository.findById(id).orElse(null);
    }
}
