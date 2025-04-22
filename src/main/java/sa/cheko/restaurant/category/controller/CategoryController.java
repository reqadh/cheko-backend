package sa.cheko.restaurant.category.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sa.cheko.restaurant.category.dto.CategoryDto;
import sa.cheko.restaurant.category.service.CategoryService;
import sa.cheko.restaurant.common.dto.ChekoApiResponse;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public ResponseEntity<ChekoApiResponse<List<CategoryDto>>> getCategories() {
        List<CategoryDto> categories = categoryService.getAllCategories();
        return ResponseEntity.ok(ChekoApiResponse.success(categories));
    }
}
