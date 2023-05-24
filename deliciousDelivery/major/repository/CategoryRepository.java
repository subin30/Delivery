package com.deliciousDelivery.major.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deliciousDelivery.major.model.Category;



public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
