package com.example.Xuong_duAn_L1.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;

    private String code;

    private String name;

    private Integer idMaterial;
    @ManyToOne
    @JoinColumn(name = "idMaterial", insertable = false, updatable = false)
    Material material;

    private Integer idStyle;
    @ManyToOne
    @JoinColumn(name = "idStyle", insertable = false, updatable = false)
    Style style;

    private Integer idImage;
    @ManyToOne
    @JoinColumn(name = "idImage", insertable = false, updatable = false)
    Image image;

    private Integer idBrand;
    @ManyToOne
    @JoinColumn(name = "idBrand", insertable = false, updatable = false)
    Brand brand;

    private LocalDate uploadDate;

    private Integer status;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    @JsonIgnoreProperties
    private Set<ProductDetail> productDetails;
}
