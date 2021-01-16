package br.com.vygos.playerssearch.controller;

import br.com.vygos.playerssearch.model.Player;
import br.com.vygos.playerssearch.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping
    public ResponseEntity<List<Player>> findAll() {
        return ResponseEntity.ok(playerService.findAll());
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Player> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(playerService.findById(id));
    }

    @GetMapping(value = "query")
    public ResponseEntity<List<Player>> findBy(Player player) {
        return ResponseEntity.ok(playerService.findBy(player));
    }
}
