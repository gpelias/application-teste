package br.com.nexfar.applicationtest.holder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class PromotionItemHolder {

    private String promotionItemId;
    private ProductHolder product;
    private BigDecimal minPrice;
    private BigDecimal industryPrice;
    private BigDecimal pmcPrice;
    private BigDecimal distributorBuyingPrice;
    private BigDecimal totalPrice;
    private BigDecimal totalPriceWithTaxes;
    private Integer quantity;
    private BigDecimal discount;
    private BigDecimal originalSellerKickback;
    private BigDecimal sellerKickback;
    private BigDecimal price;
    private BigDecimal finalPrice;
    private BigDecimal taxes;
    private BigDecimal taxesPerc;
    private Boolean taxesSuccess;
    private List<TaxesDistributionHolder> taxesDistribution;

}
