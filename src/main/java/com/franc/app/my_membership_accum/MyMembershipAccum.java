package com.franc.app.my_membership_accum;

import com.franc.app.membership.MembershipGrade;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MyMembershipAccum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long point_accum_seq;

    @Column(nullable = false)
    private Long account_id;

    @Column(nullable = false, length = 15)
    private String msp_id;

    @Column(nullable = false, length = 15)
    private String franchisee_id;

    @Column(nullable = false)
    private Integer trade_amt;

    @Column(nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private MembershipGrade msp_grade;

    @Column(nullable = false)
    private Integer accum_rat;

    @Column(nullable = false)
    private Integer accum_point;

    @Column(nullable = false, length = 8)
    private String expire_ymd;

}
