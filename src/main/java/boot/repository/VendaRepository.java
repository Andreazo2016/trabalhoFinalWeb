package boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import boot.model.User;
import boot.model.Venda;

public interface VendaRepository extends JpaRepository<Venda,Integer> {

}
