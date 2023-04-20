package com.example.miniProj3.domain.stock;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class institutionalPurchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Column(name = "head")
    private String head; // 기간 외국인 매수 상위
    @Column(name = "buyer")
    private String buyer; //
    @Column(name = "purchase_amount")
    private String purchaseAmount;
    @Column(name = "unit")
    private String unit; // 억원
}
