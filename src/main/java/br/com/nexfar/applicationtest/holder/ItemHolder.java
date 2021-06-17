package br.com.nexfar.applicationtest.holder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class ItemHolder {

    private ProductItemHolder product;
    private Integer quantity;
    private OriginalPriceHolder originalPrice;
    private FinalPriceHolder finalPrice;
    private BigDecimal industryPrice;
    private BigDecimal pmcPrice;
    private BigDecimal distributorBuyingPrice;

}
