package boot.ui;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.validator.internal.engine.messageinterpolation.parser.BeginState;
import org.springframework.beans.factory.annotation.Autowired;

import boot.dao.connectionFactory;
import boot.model.CarroCompra;
import boot.model.Game;
import boot.model.User;
import boot.repository.CarroRepository;

public class teste {
	@Autowired
	CarroRepository carro;
	public void  add(CarroCompra c){
		System.out.println("entrou");
		System.out.println(c.getCod_carro());
		//System.out.println(c.getGames());
		System.out.println(c.getUser());
		carro.save(c);
	}
	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		//new connectionFactory().getConnection();
//		
//		
//		
//		
//		
//	}

}
