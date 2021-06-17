package br.com.nexfar.applicationtest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.BsonDateTime;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class Promotion {

    @Field(name = "id")
    private Integer id;

    @Field(name = "branchId")
    private Integer branchId;

    @Field(name = "branchName")
    private Integer branchName;

    @Field(name = "warehouseId")
    private Integer warehouseId;

    @Field(name = "warehouseName")
    private Integer warehouseName;

    @Field(name = "title")
    private Integer title;

    @Field(name = "totalPrice")
    private Integer totalPrice;

    @Field(name = "totalPriceWithTaxes")
    private Integer totalPriceWithTaxes;

    @Field(name = "type")
    private Integer type;

    @Field(name = "items")
    private List<PromotionItem> items;

    @Field(name = "subsidizedItems")
    private List<Map<Object, Object>> subsidizedItems;

    @Field(name = "promotionLimits")
    private PromotionLimits promotionLimits;

    @Field(name = "quantityAvailable")
    private Integer quantityAvailable;

    @Field(name = "startDate")
    private BsonDateTime startDate;

    @Field(name = "endDate")
    private BsonDateTime endDate;

    @Field(name = "scope")
    private String scope;

}
