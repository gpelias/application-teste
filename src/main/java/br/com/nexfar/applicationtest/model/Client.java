package br.com.nexfar.applicationtest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.BsonInt32;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class Client {

    @Field(name = "id")
    private BsonInt32 id;

    @Field(name = "name")
    private String name;

    @Field(name = "razaoSocial")
    private String razaoSocial;

    @Field(name = "cnpj")
    private String cnpj;

    @Field(name = "externalClientId")
    private String externalClientId;

}
