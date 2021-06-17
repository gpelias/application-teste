package br.com.nexfar.applicationtest.model;

import br.com.nexfar.applicationtest.enums.EnumMethod;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.BsonInt32;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class PaymentCondition {

    @Field("id")
    private ObjectId id;

    @Field("method")
    private EnumMethod method;

    @Field("name")
    private String name;

    @Field("mediumTerm")
    private Integer mediumTerm;

    @Field("timeInDays")
    private List<BsonInt32> timeInDays;

    @Field("externalId")
    private String externalId;

    @Field("instalments")
    private Integer instalments;

    @Field("orderMinValue")
    private Decimal128 orderMinValue;

    @Field("discount")
    private Decimal128 discount;

}
