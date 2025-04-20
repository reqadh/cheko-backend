package sa.cheko.restaurant.category.mapper;

import sa.cheko.restaurant.category.domain.Category;
import sa.cheko.restaurant.category.dto.CategoryDto;

public class CategoryMapper {

    public static CategoryDto toDTO(Category category) {
        return CategoryDto.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }
}
