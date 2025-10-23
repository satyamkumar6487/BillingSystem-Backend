package in.satyam.billing.Software.controller;

import in.satyam.billing.Software.dto.CategoryRequest;
import in.satyam.billing.Software.dto.CategoryResponse;
import in.satyam.billing.Software.service.CategoryService; // <-- Import kiya
import lombok.RequiredArgsConstructor; // <-- Added for clean constructor
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService; // <-- Dependency jodi

    @PostMapping

    public CategoryResponse addCategory(@RequestBody CategoryRequest request){

        return categoryService.add(request);
    }


    @GetMapping
    public List<CategoryResponse> fetechCategories() {

        return categoryService.read();
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
@DeleteMapping("/{categoryId}")
   public  void  remove ( @PathVariable  String categoryId){
        try {
            categoryService .delete(categoryId);
        } catch (Exception e ){
            throw  new ResponseStatusException(HttpStatus.NOT_FOUND,"Category  not found" + e.getMessage());
        }

    }
}