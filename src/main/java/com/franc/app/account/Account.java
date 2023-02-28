package com.franc.app.account;

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
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long account_id;

    @Column(nullable = false, length = 50)
    private String account_nm;

    @Column(length = 1, columnDefinition = "char(1) default '1'")
    @Enumerated(EnumType.STRING)
    private AccountStatus status = AccountStatus.USING;

    @Column(nullable = false, length = 8)
    private String birth;

    @Column(nullable = false, length = 11)
    private String hphone;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(length = 10, columnDefinition = "varchar(10) default 'USER'")
    @Enumerated(EnumType.STRING)
    private AccountGrade grade = AccountGrade.USER;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime insertDate;

    @Column(updatable = false)
    private Integer insert_user;

    @LastModifiedDate
    private LocalDateTime update_date;

    private Integer update_user;
}
