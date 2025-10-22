package in.satyam.billing.Software.repository;

import in.satyam.billing.Software.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository <CategoryEntity , Long> {
}
