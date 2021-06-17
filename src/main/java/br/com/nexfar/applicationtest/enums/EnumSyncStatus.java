package br.com.nexfar.applicationtest.enums;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public enum EnumSyncStatus {
    DONE("DONE");

    EnumSyncStatus(String syncStatus) {
    }
}
