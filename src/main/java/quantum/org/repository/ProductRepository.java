package quantum.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import quantum.org.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
