package com.example.miniProj3.domain.main;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CertificationCar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Column(name = "head")
    private String head;
    @Column(name = "body")
    private String body;
    @Column(name = "input_txt")
    private String inputText;
    @Column(name = "footer_first")
    private String footerFirst;
    @Column(name = "footer_second")
    private String footerSecond;
    @Column(name = "head_image_url")
    private String headImageUrl;
}
