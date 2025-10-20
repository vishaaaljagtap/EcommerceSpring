package com.example.ecommerce.gateway.api;

import com.example.ecommerce.dto.FakeStoreCategoryResponseDTO;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface FakeStoreCategoryApi {
    @GET("/products/categories")
    Call<List<String>> getAllFakeCategories();
}