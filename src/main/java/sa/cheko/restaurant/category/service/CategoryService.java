package sa.cheko.restaurant.category.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sa.cheko.restaurant.category.dto.CategoryDto;
import sa.cheko.restaurant.category.mapper.CategoryMapper;
import sa.cheko.restaurant.category.repository.CategoryRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<CategoryDto> getAllCategories() {
        return categoryRepository.findAll()
                .stream()
                .map(CategoryMapper::toDTO)
                .collect(Collectors.toList());
    }
}

