package sa.cheko.restaurant.restaurant.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sa.cheko.restaurant.restaurant.dto.RestaurantMapDto;
import sa.cheko.restaurant.restaurant.service.RestaurantService;
import sa.cheko.restaurant.common.dto.ChekoApiResponse;

import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping
    public ResponseEntity<ChekoApiResponse<List<RestaurantMapDto>>> getAllRestaurants() {
        List<RestaurantMapDto> restaurants = restaurantService.getAllRestaurants();
        return ResponseEntity.ok(ChekoApiResponse.success(restaurants));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ChekoApiResponse<RestaurantMapDto>> getRestaurantById(@PathVariable Long id) {
        RestaurantMapDto restaurant = restaurantService.getRestaurantById(id);
        return ResponseEntity.ok(ChekoApiResponse.success(restaurant));
    }
}
