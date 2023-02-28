package com.franc.app.membership_benefit;

import com.franc.app.membership.MembershipGrade;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@IdClass(MembershipBenefitKey.class)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MembershipBenefit {

    @Id
    @Column(nullable = false, length = 15)
    private String msp_id;

    @Id
    @Column(nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private MembershipGrade msp_grade;

    @Column(nullable = false)
    private Integer grade_point_fr;

    @Column(nullable = false)
    private Integer grade_point_to;

    @Column(columnDefinition = "int default 1")
    private Integer accum_rat = 1;

    @Column(columnDefinition = "int default 1")
    private Integer discount_rat = 1;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime insertDate;

    @Column(updatable = false)
    private Integer insert_user;

    @LastModifiedDate
    private LocalDateTime update_date;

    private Integer update_user;

}
