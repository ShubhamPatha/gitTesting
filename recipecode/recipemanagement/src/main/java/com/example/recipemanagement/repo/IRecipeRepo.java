package com.example.recipemanagement.repo;

import com.example.recipemanagement.model.Recipe;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRecipeRepo extends CrudRepository<Recipe, Integer> {


    @Query(value = "select * from recipe where RecId = :id" , nativeQuery = true)
    Recipe findfirstbyRecipeId(Integer id);
}
