package sa.cheko.restaurant.menu.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sa.cheko.restaurant.category.repository.CategoryRepository;
import sa.cheko.restaurant.menu.domain.MenuItem;
import sa.cheko.restaurant.menu.dto.MenuItemDto;
import sa.cheko.restaurant.menu.dto.MenuFilterRequest;
import sa.cheko.restaurant.menu.mapper.MenuItemMapper;
import sa.cheko.restaurant.menu.repository.MenuItemRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MenuItemService {

    private final MenuItemRepository menuItemRepository;
    private final CategoryRepository categoryRepository;

    public List<MenuItemDto> getMenuItems(MenuFilterRequest request) {
        Integer categoryId = request.getCategoryId();

        // If no categoryId is passed, default to "Breakfast"
        if (categoryId == null) {
            categoryId = categoryRepository.findByNameIgnoreCase("Breakfast")
                    .map(category -> category.getId())
                    .orElse(null);
        }

        return menuItemRepository.findByCategoryId(categoryId)
                .stream()
                .map(MenuItemMapper::toDTO)
                .collect(Collectors.toList());
    }

    public MenuItemDto getMenuItemById(Long id) {
        MenuItem item = menuItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Menu item not found with id: " + id));
        return MenuItemMapper.toDTO(item);
    }
}
