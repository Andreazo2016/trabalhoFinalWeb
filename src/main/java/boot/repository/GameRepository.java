package boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import boot.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game,Integer> {
	
		@Query(value = "select * from game where categoria_game = ?1 ", nativeQuery = true)
		List<Game> findGameByCategoria(String categoria);
		
}
