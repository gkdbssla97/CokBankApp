package com.example.miniProj3.domain.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberAuthoritiesMapping {

    @Id
    @GeneratedValue
    @Column(name = "member_authorities_mapping_id")
    private long memberAuthoritiesMappingSeq;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="member_authorities_code_id")
    private MemberAuthoritiesCode memberAuthoritiesCode;

    @Column
    @CreationTimestamp
    private LocalDate registerDate;
}
