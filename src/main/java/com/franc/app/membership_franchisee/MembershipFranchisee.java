package com.franc.app.membership_franchisee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@IdClass(MembershipFranchiseeKey.class)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MembershipFranchisee {

    @Id
    @Column(nullable = false, length = 15)
    private String msp_id;

    @Id
    @Column(nullable = false, length = 15)
    private String franchisee_id;

    @Column(nullable = false, length = 100)
    private String franchisee_nm;

    @Column(length = 1, columnDefinition = "char(1) default '1'")
    @Enumerated(EnumType.STRING)
    private MembershipFranchiseeStatus status = MembershipFranchiseeStatus.USING;

    @Column(length = 5)
    private String zip_cd;

    @Column(length = 200)
    private String addr1;

    @Column(length = 200)
    private String addr2;

    @Column(length = 20)
    private String tel_no;

    @Column(length = 2000)
    private String bigo;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime insertDate;

    @Column(updatable = false)
    private Integer insert_user;

    @LastModifiedDate
    private LocalDateTime update_date;

    private Integer update_user;


}
