package br.com.nexfar.applicationtest.model;

import br.com.nexfar.applicationtest.enums.EnumPaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class Payment {

    @Field(name = "paymentStatus")
    private EnumPaymentStatus paymentStatus;

    @Field(name = "paymentCondition")
    private PaymentCondition paymentCondition;

}
