package com.example.miniProj3.domain.customer;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "top_header")
    private String topHead;
    @Column(name = "top_body")
    private String topBody;
    @Column(name = "bottom_header")
    private String bottomHead;
    @Column(name = "bottom_body_first")
    private String bottomBodyFirst;
    @Column(name = "bottom_body_second")
    private String bottomBodySecond;
}
