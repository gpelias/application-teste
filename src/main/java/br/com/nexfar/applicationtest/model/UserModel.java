package br.com.nexfar.applicationtest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
@Document(collection = "user")
public class UserModel {

    @Field(name = "_id")
    private ObjectId _id;

    @Field(name = "name")
    private String name;

    @Field(name = "login")
    private String login;

    @Field(name = "password")
    private String password;

}
