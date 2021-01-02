package br.com.vygos.playerssearch.repository;

import br.com.vygos.playerssearch.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
