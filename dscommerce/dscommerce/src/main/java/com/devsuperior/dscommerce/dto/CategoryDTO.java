package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Category;
import jakarta.validation.constraints.NotEmpty;

public class CategoryDTO {

    private Long id;
    private String name;

    public CategoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @NotEmpty(message = "É necessário ter pelo menos uma categoria.")
    public CategoryDTO(Category entity) {
        id = entity.getId();
        name = entity.getName();
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
