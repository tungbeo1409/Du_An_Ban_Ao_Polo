package com.example.Xuong_duAn_L1.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ProductDetail")
public class ProductDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idProductDetail;

    private String code;

    Integer idProduct;
    @ManyToOne
    @JoinColumn(name = "idProduct", insertable = false, updatable = false)
    @JsonIgnore
    Product product;

    Integer idSize;
    @ManyToOne
    @JoinColumn(name = "idSize", insertable = false, updatable = false)
    Size size;

    Integer idColor;
    @ManyToOne
    @JoinColumn(name = "idColor", insertable = false, updatable = false)
    Color color;

    private double inputPrice;

    private double Price;

    @Column(name = "amount")
    private int amount;

}
