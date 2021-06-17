package br.com.nexfar.applicationtest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class PromotionLimits {

    @Field(name = "cartLimit")
    private Integer cartLimit;

    @Field(name = "clientLimit")
    private Integer clientLimit;

    @Field(name = "sellerLimit")
    private Integer sellerLimit;

}
