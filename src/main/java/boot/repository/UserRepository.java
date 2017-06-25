package boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import boot.model.Game;
import boot.model.User;

public interface UserRepository extends JpaRepository<User,String>{
		@Query(value = "select * from usuario where login = ?1 and senha = ?2 " , nativeQuery = true)
		User findLoginAndSenha(String login,String senha);
}
