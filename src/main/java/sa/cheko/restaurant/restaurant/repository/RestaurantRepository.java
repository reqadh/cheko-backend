package sa.cheko.restaurant.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sa.cheko.restaurant.restaurant.domain.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
