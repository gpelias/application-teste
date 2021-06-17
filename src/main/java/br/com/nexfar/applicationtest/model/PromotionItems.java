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
public class PromotionItems {

    @Field(name = "promotion")
    private Promotion promotion;

    @Field(name = "quantity")
    private Integer quantity;

    @Field(name = "origin")
    private String origin;

}
