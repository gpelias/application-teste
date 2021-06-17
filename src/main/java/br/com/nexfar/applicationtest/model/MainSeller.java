package br.com.nexfar.applicationtest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.util.List;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class MainSeller {

    @Field(name = "id", targetType = FieldType.OBJECT_ID)
    private ObjectId id;

    @Field(name = "name")
    private String name;

    @Field(name = "externalId")
    private String externalId;

    @Field(name = "mainSeller")
    private Boolean mainSeller;

    @Field(name = "externalClientId")
    private String externalClientId;

    @Field(name = "origin")
    private String origin;

    @Field(name = "salesSupervisors")
    private List<ObjectId> salesSupervisors;

}
