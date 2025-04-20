package sa.cheko.restaurant.category.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sa.cheko.restaurant.category.dto.CategoryDto;
import sa.cheko.restaurant.category.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public List<CategoryDto> getCategories() {
        return categoryService.getAllCategories();
    }
}
