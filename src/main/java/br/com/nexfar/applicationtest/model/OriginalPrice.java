package br.com.nexfar.applicationtest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.Decimal128;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class OriginalPrice {

    @Field(name = "discount")
    private Decimal128 discount;

    @Field(name = "allowNegotiationUp")
    private Boolean allowNegotiationUp;

    @Field(name = "allowNegotiationDown")
    private Boolean allowNegotiationDown;

    @Field(name = "allowCreditUp")
    private Boolean allowCreditUp;

    @Field(name = "allowCreditDown")
    private Boolean allowCreditDown;

    @Field(name = "sellerKickback")
    private Decimal128 sellerKickback;

    @Field(name = "price")
    private Decimal128 price;

    @Field(name = "finalPrice")
    private Decimal128 finalPrice;

    @Field(name = "taxes")
    private Decimal128 taxes;

    @Field(name = "taxesPerc")
    private Decimal128 taxesPerc;

    @Field(name = "taxesSuccess")
    private Boolean taxesSuccess;

    @Field(name = "taxesDistribution")
    private List<TaxesDistribution> taxesDistribution;

}
