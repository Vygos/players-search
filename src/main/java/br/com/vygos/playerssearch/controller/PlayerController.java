package br.com.vygos.playerssearch.controller;

import br.com.vygos.playerssearch.model.Player;
import br.com.vygos.playerssearch.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Player> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(playerService.findById(id));
    }
}
