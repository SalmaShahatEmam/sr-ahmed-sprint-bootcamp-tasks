package com.product.app.model;



import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="product_details")
@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
@Builder
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="description")
    private String description;

    @Column(name="expiration_date")
    private LocalDate expirationDate;

    @Column(name="manufacturer")
    private String manufacturer;

    @Column(name="price")
    private Double price;

    @Column(name="availability")
    private Integer availability;

}
