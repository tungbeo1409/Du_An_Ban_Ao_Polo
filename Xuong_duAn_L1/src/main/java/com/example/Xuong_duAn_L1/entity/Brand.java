package com.example.Xuong_duAn_L1.entity;

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
@Table(name = "Brand")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBrand;

    private String code;

    private String name;

    Integer status;

    LocalDate uploadDate;

    @OneToMany(fetch = FetchType.LAZY , mappedBy = "brand")
    Set<Product> productSet;
}
