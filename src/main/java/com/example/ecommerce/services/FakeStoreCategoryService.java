package com.example.ecommerce.services;

import com.example.ecommerce.dto.CategoryDTO;
import com.example.ecommerce.gateway.FakeStoreCategoryGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreCategoryService implements ICategoryService {

    private final FakeStoreCategoryGateway fakeStoreCategoryGateway;

    public FakeStoreCategoryService(FakeStoreCategoryGateway fakeStoreCategoryGateway) {
        this.fakeStoreCategoryGateway = fakeStoreCategoryGateway;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.fakeStoreCategoryGateway.getAllCategories();
    }
}
