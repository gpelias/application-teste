package br.com.nexfar.applicationtest.model;

import br.com.nexfar.applicationtest.enums.EnumStatus;
import br.com.nexfar.applicationtest.enums.EnumSyncStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.BsonDateTime;
import org.bson.types.Decimal128;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
@Document(collection = "order")
public class Order {

    @Field(name = "_id")
    private Integer _id;

    @Field(name = "status")
    private EnumStatus status;

    @Field(name = "syncStatus")
    private EnumSyncStatus syncStatus;

    @Field(name = "client")
    private Client client;

    @Field(name = "mainSeller")
    private MainSeller mainSeller;

    @Field(name = "items")
    private List<Item> items;

    @Field(name = "promotionItems")
    private List<PromotionItem> promotionItems;

    @Field(name = "payment")
    private List<Payment> payment;

    @Field(name = "grossTotal")
    private Decimal128 grossTotal;

    @Field(name = "discount")
    private Decimal128 discount;

    @Field(name = "netTotal")
    private Decimal128 netTotal;

    @Field(name = "totalWithTaxes")
    private Decimal128 totalWithTaxes;

    @Field(name = "createAt")
    private BsonDateTime createAt;

    @Field(name = "updateAt")
    private BsonDateTime updateAt;

}
