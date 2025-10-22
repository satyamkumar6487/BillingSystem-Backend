package in.satyam.billing.Software.service;

import in.satyam.billing.Software.io.CategoryRequest;
import in.satyam.billing.Software.io.CategoryResponse;
import org.springframework.stereotype.Service;


public interface CategoryService {
    CategoryResponse add(CategoryRequest request);
}
