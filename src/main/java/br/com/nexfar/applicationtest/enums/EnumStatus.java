package br.com.nexfar.applicationtest.enums;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public enum EnumStatus {
    BILLED("BILLED"),
    RECEIVED_BY_DISTRIBUTOR("RECEIVED BY DISTRIBUTOR"),
    CANCELED("CANCELED");

    EnumStatus(String status) {
    }
}
