package br.com.nexfar.applicationtest.holder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class ClientHolder {

    private Integer id;
    private String name;
    private String razaoSocial;
    private String cnpj;
    private String externalClientId;

}
