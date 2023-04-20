package com.example.miniProj3.domain.customer;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class BoardView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Column(name = "content", length = 1000)
    private String content;
    @OneToOne
    @JoinColumn(name = "boardlist_id")
    private BoardList boardList;

}
