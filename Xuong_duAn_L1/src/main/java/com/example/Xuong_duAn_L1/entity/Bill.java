package com.example.Xuong_duAn_L1.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import java.util.Date;

@Entity
@Table(name = "Bill")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_nhan_vien")
    private Employee nhanVien;

    @ManyToOne
    @JoinColumn(name = "id_khach_hang")
    private Customer khachHang;

    private String ma;
    private Date thoi_gian_tao;
    private String trang_thai;
    private Double tong_tien;
    private String kieu;
    private Date ngay_nhan;
    private String sdt_khach_hang;
    private Date ngay_ship;
    private String ten_khach_hang;
    private String dia_chi_nhan_hang;
    private String ghi_chu;
    private Date ngay_tao;
    private Date ngay_sua;
    private String nguoi_tao;
    private String nguoi_sua;
}
