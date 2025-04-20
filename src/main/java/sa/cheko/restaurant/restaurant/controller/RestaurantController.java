package sa.cheko.restaurant.restaurant.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sa.cheko.restaurant.restaurant.dto.RestaurantMapDto;
import sa.cheko.restaurant.restaurant.service.RestaurantService;

import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantService restaurantService;

    // ✅ GET /api/restaurants — returns all restaurant locations with marker info
    @GetMapping
    public List<RestaurantMapDto> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RestaurantMapDto> getRestaurantById(@PathVariable Long id) {
        RestaurantMapDto restaurant = restaurantService.getRestaurantById(id);
        return ResponseEntity.ok(restaurant);
    }
}
