package com.example.miniProj3.domain.customer;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Column(name = "header_head")
    private String headerHead;
    @Column(name = "header_body")
    private String headerBody;
    @Column(name = "header_footer")
    private String headerFooter;
    @Column(name = "email")
    private String email;
    @Column(name = "service")
    private String service;
    @JoinColumn(name = "body")
    private String body;
    @Column(name = "image_url")
    private String imageUrl;
}
