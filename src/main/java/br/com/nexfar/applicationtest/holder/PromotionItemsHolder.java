package br.com.nexfar.applicationtest.holder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class PromotionItemsHolder {

    private PromotionHolder promotionHolder;
    private Integer quantity;
    private String origin;

}
