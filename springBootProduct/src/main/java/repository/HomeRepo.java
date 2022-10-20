package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Product;

public interface HomeRepo extends JpaRepository<Product, String>{

}
