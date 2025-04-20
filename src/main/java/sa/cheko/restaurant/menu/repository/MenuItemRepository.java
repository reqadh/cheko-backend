package sa.cheko.restaurant.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sa.cheko.restaurant.menu.domain.MenuItem;

import java.util.List;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    List<MenuItem> findByCategoryId(Integer categoryId);

}
