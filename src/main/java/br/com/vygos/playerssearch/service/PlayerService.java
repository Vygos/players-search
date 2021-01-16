package br.com.vygos.playerssearch.service;

import br.com.vygos.playerssearch.model.Player;
import br.com.vygos.playerssearch.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public Player findById(Integer id) {
        return playerRepository.findById(id).orElse(null);
    }

    public List<Player> findBy(Player player) {
        Example<Player> example = Example.of(player, ExampleMatcher.matchingAny().withIgnoreNullValues());
        return playerRepository.findAll(example);
    }

    public List<Player> findAll() {
        return playerRepository.findAll();
    }
}
