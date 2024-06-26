package com.example.Xuong_duAn_L1.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "Image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idImage;
    private String code;

    private String name;

    Integer status;

    LocalDate uploadDate;

    @OneToMany(fetch = FetchType.LAZY , mappedBy = "image")
    @JsonIgnoreProperties
    Set<Product> productSet;
}
