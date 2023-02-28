package com.franc.app.account.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AccountStatus {

    USING("1", "사용"),
    NON_USING("9", "정지"),
    WITHDRAWAL("0", "탈퇴");

    private final String code;
    private final String value;

}
