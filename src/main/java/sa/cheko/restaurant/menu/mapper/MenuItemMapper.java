package sa.cheko.restaurant.menu.mapper;

import sa.cheko.restaurant.menu.domain.MenuItem;
import sa.cheko.restaurant.menu.dto.MenuItemDto;

public class MenuItemMapper {

    public static MenuItemDto toDTO(MenuItem item) {
        return MenuItemDto.builder()
                .id(item.getId())
                .name(item.getName())
                .imageUrl(item.getImageUrl())
                .description(item.getDescription())
                .calories(item.getCalories())
                .price(item.getPrice())
                .categoryId(item.getCategory().getId())
                .categoryName(item.getCategory().getName())
                .build();
    }
}
