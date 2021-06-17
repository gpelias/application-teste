package br.com.nexfar.applicationtest.holder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class ProductItemHolder {

    private String id;
    private String sku;
    private String barcode;
    private String name;
    private String maker;
    private String category;
    private String principle;
    private BigDecimal boxQuantity;
    private String imageURL;
    private Date validUntil;
    private BigDecimal averagePrice;

}
