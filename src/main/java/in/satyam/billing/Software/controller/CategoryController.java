package in.satyam.billing.Software.controller;

import in.satyam.billing.Software.io.CategoryRequest;
import in.satyam.billing.Software.io.CategoryResponse;
import in.satyam.billing.Software.service.CategoryService; // <-- Import kiya
import lombok.RequiredArgsConstructor; // <-- Added for clean constructor
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService; // <-- Dependency jodi

    @PostMapping

    public CategoryResponse addCategory(@RequestBody CategoryRequest request){

        return categoryService.add(request); // <-- Service ko call kiya aur return kiya
    }
}