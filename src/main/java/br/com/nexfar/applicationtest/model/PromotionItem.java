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
public class PromotionItem {

    @Field(name = "promotionItemId")
    private String promotionItemId;

    @Field(name = "product")
    private Product product;

    @Field(name = "minPrice")
    private Decimal128 minPrice;

    @Field(name = "industryPrice")
    private Decimal128 industryPrice;

    @Field(name = "pmcPrice")
    private Decimal128 pmcPrice;

    @Field(name = "distributorBuyingPrice")
    private Decimal128 distributorBuyingPrice;

    @Field(name = "totalPrice")
    private Decimal128 totalPrice;

    @Field(name = "totalPriceWithTaxes")
    private Decimal128 totalPriceWithTaxes;

    @Field(name = "quantity")
    private Integer quantity;

    @Field(name = "discount")
    private Decimal128 discount;

    @Field(name = "originalSellerKickback")
    private Decimal128 originalSellerKickback;

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
