package br.com.nexfar.applicationtest.enums;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public enum EnumPaymentStatus {
    PENDING_PAYMENT("PENDING PAYMENT");

    EnumPaymentStatus(String status) {
    }
}
