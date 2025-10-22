package in.satyam.billing.Software.service;

import in.satyam.billing.Software.entity.CategoryEntity;
import in.satyam.billing.Software.io.CategoryRequest;
import in.satyam.billing.Software.io.CategoryResponse;
import in.satyam.billing.Software.repository.CategoryRepository;
import lombok.RequiredArgsConstructor; // <-- Added for clean constructor
import org.springframework.stereotype.Service; // <-- Added Service annotation

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {


    private final CategoryRepository categoryRepository;


    @Override
    public CategoryResponse add(CategoryRequest request){
        CategoryEntity newCategory = convertToEntity(request);

        newCategory = categoryRepository.save(newCategory);

        return convertToResponse(newCategory);
    }


    private CategoryResponse convertToResponse(CategoryEntity newCategory){
        return CategoryResponse.builder()
                .categoryId(newCategory.getCategoryId()) // <-- Parentheses theek kiye
                .name(newCategory.getName())

                .description(newCategory.getDescription())
                .bgColor(newCategory.getBgColor())
                .imgUrl(newCategory.getImgUrl())
                .createdAt(newCategory.getCreatedAt())
                .updatedAt(newCategory.getUpdatedAt())
                .build();
    }


    private CategoryEntity convertToEntity(CategoryRequest request){
        return CategoryEntity.builder() // <-- 6. Return statement aur semicolon theek kiye
                .categoryId(UUID.randomUUID().toString())
                .name(request.getName())
                .description(request.getDescription()) // Assuming you have fixed this
                .bgColor(request.getBgColor())
                .build();
    }

}