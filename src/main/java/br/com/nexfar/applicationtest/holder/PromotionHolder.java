package br.com.nexfar.applicationtest.holder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class PromotionHolder {

    private Integer id;
    private String branchId;
    private String branchName;
    private String warehouseId;
    private String warehouseName;
    private String title;
    private BigDecimal totalPrice;
    private BigDecimal totalPriceWithTaxes;
    private String type;
    private List<PromotionItemHolder> items;
    private List<Map<Object, Object>> subsidizedItems;
    private PromotionLimitsHolder promotionLimitsHolder;
    private Integer quantityAvailable;
    private Date startDate;
    private Date endDate;
    private String scope;

}
