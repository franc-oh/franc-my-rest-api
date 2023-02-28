package com.franc.app.membership;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Membership {

    @Id
    @Column(nullable = false, length = 15)
    private String msp_id;

    @Column(nullable = false, length = 100)
    private String msp_nm;

    @Column(length = 1, columnDefinition = "char(1) default '1'")
    @Enumerated(EnumType.STRING)
    private MembershipStatus status = MembershipStatus.USING;

    @Column(nullable = false, length = 200)
    private String msp_info;

    @Column(length = 200)
    private String msp_img_url;

    @Column(length = 200)
    private String homepage_url;

    @Column(columnDefinition = "int default 3")
    private Integer msp_point_active_months = 3;

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
