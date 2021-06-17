package br.com.nexfar.applicationtest.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.BsonString;

import java.lang.reflect.Field;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class Login {

    private BsonString email;
    private BsonString password;

    public boolean checkNull() throws IllegalAccessException {
        for (Field f : getClass().getDeclaredFields()) {
            if (f.get(this) == null) {
                return true;
            }
        }
        return false;
    }

}
