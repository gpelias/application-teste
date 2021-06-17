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
public class ProductHolder {

    private String id;
    private String sku;
    private String barcode;
    private String name;
    private String maker;
    private String category;
    private String principle;
    private BigDecimal boxQuantity;
    private String imageURL;

}
