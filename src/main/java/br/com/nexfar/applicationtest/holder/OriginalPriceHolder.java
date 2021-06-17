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
public class OriginalPriceHolder {

    private BigDecimal discount;
    private Boolean allowNegotiationUp;
    private Boolean allowNegotiationDown;
    private Boolean allowCreditUp;
    private Boolean allowCreditDown;
    private BigDecimal sellerKickback;
    private BigDecimal price;
    private BigDecimal finalPrice;
    private BigDecimal taxes;
    private BigDecimal taxesPerc;
    private Boolean taxesSuccess;
    private List<TaxesDistributionHolder> taxesDistribution;

}
