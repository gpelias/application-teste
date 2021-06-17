package br.com.nexfar.applicationtest.holder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class PromotionLimitsHolder {

    private Integer cartLimit;
    private Integer clientLimit;
    private Integer sellerLimit;

}
