package com.nimap.Assignment.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nimap.Assignment.Entity.Category;

	
@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {
    // Inherits findAll(Pageable) from JpaRepository
    // No need to redeclare save() or findAll()
}
