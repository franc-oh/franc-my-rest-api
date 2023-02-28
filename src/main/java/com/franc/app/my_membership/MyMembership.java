package com.franc.app.my_membership;

import com.franc.app.membership.MembershipGrade;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@IdClass(MyMembershipKey.class)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MyMembership {

    @Id
    private Long account_id;

    @Id
    @Column(length = 15)
    private String msp_id;

    @Column(length = 1, columnDefinition = "char(1) default '1'")
    @Enumerated(EnumType.STRING)
    private MyMembershipStatus status = MyMembershipStatus.USING;

    @Column(columnDefinition = "int default 0")
    private Integer total_point = 0;

    @Column(nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private MembershipGrade msp_grade;

    private LocalDateTime withdrawal_date;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime insertDate;


}
