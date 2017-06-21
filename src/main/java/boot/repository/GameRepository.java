package boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import boot.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game,Integer> {

}
