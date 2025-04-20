package sa.cheko.restaurant.restaurant.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sa.cheko.restaurant.menu.repository.MenuItemRepository;
import sa.cheko.restaurant.restaurant.domain.Restaurant;
import sa.cheko.restaurant.restaurant.dto.RestaurantMapDto;
import sa.cheko.restaurant.restaurant.mapper.RestaurantMapper;
import sa.cheko.restaurant.restaurant.repository.RestaurantRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;
    private final MenuItemRepository menuItemRepository;

    public List<RestaurantMapDto> getAllRestaurants() {
        return restaurantRepository.findAll().stream()
                .map(RestaurantMapper::toMapDto)
                .collect(Collectors.toList());
    }

    public RestaurantMapDto getRestaurantById(Long id) {
        Restaurant restaurant = restaurantRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Restaurant not found with id: " + id));
        return RestaurantMapper.toMapDto(restaurant);
    }
}
