package sa.cheko.restaurant.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sa.cheko.restaurant.category.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Optional<Category> findByNameIgnoreCase(String name);
}
