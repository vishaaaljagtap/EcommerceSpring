package com.example.ecommerce.gateway;

import com.example.ecommerce.dto.CategoryDTO;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public interface ICategoryGateway {
    List<CategoryDTO> getAllCategories() throws IOException;
}
