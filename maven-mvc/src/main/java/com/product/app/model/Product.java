package com.product.app.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@ToString
@Builder
@Table(name="products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL ,  fetch = FetchType.LAZY)
    @JoinColumn(name = "product_detail_id")
    private ProductDetails details;
}
