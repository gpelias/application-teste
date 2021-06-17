package br.com.nexfar.applicationtest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.Decimal128;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class Item {

    @Field(name = "product")
    private ProductItem product;

    @Field(name = "quantity")
    private Integer quantity;

    @Field(name = "originalPrice")
    private OriginalPrice originalPrice;

    @Field(name = "finalPrice")
    private FinalPrice finalPrice;

    @Field(name = "industryPrice")
    private Decimal128 industryPrice;

    @Field(name = "pmcPrice")
    private Decimal128 pmcPrice;

    @Field(name = "distributorBuyingPrice")
    private Decimal128 distributorBuyingPrice;

}
