package sa.cheko.restaurant.menu.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sa.cheko.restaurant.menu.dto.MenuFilterRequest;
import sa.cheko.restaurant.menu.dto.MenuItemDto;
import sa.cheko.restaurant.menu.service.MenuItemService;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
@RequiredArgsConstructor
public class MenuItemController {

    private final MenuItemService menuItemService;

    @PostMapping
    public List<MenuItemDto> getMenuItems(@RequestBody(required = false) MenuFilterRequest request) {
        if (request == null) {
            request = new MenuFilterRequest(); // handles when body is empty
        }
        return menuItemService.getMenuItems(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MenuItemDto> getMenuItemById(@PathVariable Long id) {
        MenuItemDto item = menuItemService.getMenuItemById(id);
        return ResponseEntity.ok(item);
    }
}
