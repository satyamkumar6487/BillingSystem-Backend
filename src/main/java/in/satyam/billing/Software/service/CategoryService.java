package in.satyam.billing.Software.service;

import in.satyam.billing.Software.dto.CategoryRequest;
import in.satyam.billing.Software.dto.CategoryResponse;

import java.util.List;


public interface CategoryService {
    CategoryResponse add(CategoryRequest request);


    List<CategoryResponse>  read();
 void delete (String categoryId);
}


