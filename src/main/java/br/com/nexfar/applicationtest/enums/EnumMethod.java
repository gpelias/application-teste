package br.com.nexfar.applicationtest.enums;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public enum EnumMethod {
    BOLETO("BOLETO");

    EnumMethod(String status) {
    }
}
