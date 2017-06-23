package boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import boot.model.CarroCompra;
import boot.model.Game;

public interface CarroRepository extends JpaRepository<CarroCompra,Long>{

}
