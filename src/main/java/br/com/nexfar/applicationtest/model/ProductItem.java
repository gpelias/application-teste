package br.com.nexfar.applicationtest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.BsonDateTime;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.math.BigDecimal;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class ProductItem {

    @Field(name = "id")
    private ObjectId id;

    @Field(name = "sku")
    private String sku;

    @Field(name = "barcode")
    private String barcode;

    @Field(name = "name")
    private String name;

    @Field(name = "maker")
    private String maker;

    @Field(name = "category")
    private String category;

    @Field(name = "principle")
    private String principle;

    @Field(name = "boxQuantity")
    private Decimal128 boxQuantity;

    @Field(name = "imageURL")
    private String imageURL;

    @Field(name = "validUntil")
    private BsonDateTime validUntil;

    @Field(name = "averagePrice", targetType = FieldType.DECIMAL128)
    private BigDecimal averagePrice;

}
