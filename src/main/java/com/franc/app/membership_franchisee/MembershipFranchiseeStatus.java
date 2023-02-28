package com.franc.app.membership_franchisee;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MembershipFranchiseeStatus {

    USING("1", "사용"),
    NON_USING("9", "정지");

    private final String code;
    private final String value;

}
