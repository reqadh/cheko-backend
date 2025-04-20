package sa.cheko.restaurant.restaurant.mapper;

import sa.cheko.restaurant.restaurant.domain.Restaurant;
import sa.cheko.restaurant.restaurant.dto.RestaurantMapDto;

public class RestaurantMapper {

    public static RestaurantMapDto toMapDto(Restaurant restaurant) {
        return RestaurantMapDto.builder()
                .id(restaurant.getId())
                .name(restaurant.getName())
                .latitude(restaurant.getLatitude())
                .longitude(restaurant.getLongitude())
                .logoUrl(restaurant.getLogoUrl())
                .build();
    }
}
