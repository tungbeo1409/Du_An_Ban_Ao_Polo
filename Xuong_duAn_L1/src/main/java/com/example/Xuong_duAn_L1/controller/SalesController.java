package com.example.Xuong_duAn_L1.controller;

import com.example.Xuong_duAn_L1.entity.Bill;
import com.example.Xuong_duAn_L1.entity.Cart;
import com.example.Xuong_duAn_L1.entity.ProductDetail;
import com.example.Xuong_duAn_L1.repository.BillRepo;
import com.example.Xuong_duAn_L1.repository.ProductDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SalesController {

    @Autowired
    ProductDetailRepo productDetailRepo;

    List<Cart> carts = new ArrayList<>();

    @ModelAttribute("listProduct")
    public Page<ProductDetail> listProduct() {
        Sort sort = Sort.by(Sort.Direction.DESC, "idProductDetail");
        System.out.println("Truy Xuất Danh Sách Sản Phẩm Chi Tiết.");
        Pageable page = PageRequest.of(0, 20, sort);
        return productDetailRepo.findAll(page);
    }

    @ModelAttribute("carts")
    public List<Cart> cart() {
        return carts;
    }

    @ModelAttribute("totalPrice")
    public int getTotalPrice(){
        int totalPrice=0;
        for (Cart c:carts){
            totalPrice+=c.getQuantity()*c.getProductDetail().getPrice();
        }
        return totalPrice;
    }

    @RequestMapping("/sales")
    public String viewSales(Model model) {
        return "sales/banhang";
    }

    @GetMapping("/addtocart/{id}")
    public String addToCart(@ModelAttribute("id") int id) {
        System.out.println("Thêm SP Vào Cart.");
        carts.add(new Cart(carts.size(), 1, productDetailRepo.findById(id).get()));
        return "redirect:/sales";
    }

    @GetMapping("/removecart/{id}")
    public String removeToCart(@PathVariable("id") int id) {
        System.out.println("Xóa SP Khỏi Cart.");
        carts.removeIf(cart -> cart.getId() == id); // Remove cart by id
        return "redirect:/sales";
    }

    @PostMapping("/updatecart/{id}")
    public String updateCart(@PathVariable("id") int id, @ModelAttribute("c") Cart cart) {
        System.out.println("Cập Nhật Cart");
        for (Cart c : carts) {
            if (c.getId() == id) {
                c.setQuantity(cart.getQuantity());
                System.out.println("Cập Nhật số lượng của SP " + c.getId());
            }
        }
        return "redirect:/sales";
    }
}
