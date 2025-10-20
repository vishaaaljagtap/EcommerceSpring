package com.example.ecommerce.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FakeStoreCategoryResponseDTO {
    List<String> categories;
}
