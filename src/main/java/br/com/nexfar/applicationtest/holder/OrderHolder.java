package br.com.nexfar.applicationtest.holder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
@Document(collection = "order")
public class OrderHolder {

    private Integer _id;
    private String status;
    private String syncStatus;
    private ClientHolder client;
    private MainSellerHolder mainSeller;
    private List<ItemHolder> items;
    private List<PromotionItemHolder> promotionItems;
    private List<PaymentHolder> payment;
    private BigDecimal grossTotal;
    private BigDecimal discount;
    private BigDecimal netTotal;
    private BigDecimal totalWithTaxes;
    private Date createdAt;
    private Date updatedAt;

}
