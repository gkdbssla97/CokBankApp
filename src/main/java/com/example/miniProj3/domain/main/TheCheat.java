package com.example.miniProj3.domain.main;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class TheCheat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Column(name = "head")
    private String head;
    @Column(name = "body")
    private String body;
    @Column(name = "footer")
    private String footer;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "head_image_url")
    private String headImageUrl;
}
