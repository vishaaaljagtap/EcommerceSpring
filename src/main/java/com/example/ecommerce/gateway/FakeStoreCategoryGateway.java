package com.example.ecommerce.gateway;

import com.example.ecommerce.dto.CategoryDTO;
import com.example.ecommerce.dto.FakeStoreCategoryResponseDTO;
import com.example.ecommerce.gateway.api.FakeStoreCategoryApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway {

    private final FakeStoreCategoryApi fakeStoreCategoryApi;

    public FakeStoreCategoryGateway(FakeStoreCategoryApi fakeStoreCategoryApi) {
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        List<String> response =  this.fakeStoreCategoryApi.getAllFakeCategories().execute().body();
        if(response==null){
            throw new IOException("Failed to fetch categories");
        }
        return response.stream()
                .map( category -> CategoryDTO.builder()
                        .name(category)
                        .build())
                .toList();
    }
}
