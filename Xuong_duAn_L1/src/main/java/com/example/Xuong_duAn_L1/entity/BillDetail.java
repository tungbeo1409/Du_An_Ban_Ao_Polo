package com.example.Xuong_duAn_L1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "billdetail")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BillDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @ManyToOne
    @JoinColumn(name = "idBill")
    Bill bill;

    @ManyToOne
    @JoinColumn(name = "idProductDetail")
    ProductDetail productDetail;

    Date ngaySua;
    Date ngayTao;
    String nguoiSua;
    String nguoiTao;
}
