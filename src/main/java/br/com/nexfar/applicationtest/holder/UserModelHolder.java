package br.com.nexfar.applicationtest.holder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class UserModelHolder {

    private ObjectId _id;
    private String name;
    private String login;
    private String password;

}
