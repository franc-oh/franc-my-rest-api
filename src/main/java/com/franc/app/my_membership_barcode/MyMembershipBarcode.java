package com.franc.app.my_membership_barcode;

import com.franc.app.my_membership.MyMembershipKey;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.time.LocalDateTime;

@Entity
@IdClass(MyMembershipBarcodeKey.class)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MyMembershipBarcode {

    @Id
    private Long account_id;

    @Id
    @Column(length = 15)
    private String msp_id;

    @Column(nullable = false, length = 50)
    private String barcode_no;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime create_date;
}
