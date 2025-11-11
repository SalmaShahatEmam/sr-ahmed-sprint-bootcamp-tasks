package com.product.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class productDto {


    private int id;

    @NotBlank(message = "Name field is required")
    private String name;

    @NotBlank(message = "Description field is required")
    private String description;

    @NotBlank(message = "Expiration date is required")
    private String expirationDate;

    @NotBlank(message = "Manufacturer field is required")
    private String manufacturer;

    @NotNull(message = "Price field is required")
    private Double price;

    @NotNull(message = "Availability status is required")
    private Integer availability;

}
