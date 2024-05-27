package quantum.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import quantum.org.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
