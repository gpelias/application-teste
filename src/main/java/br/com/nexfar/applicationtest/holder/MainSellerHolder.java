package br.com.nexfar.applicationtest.holder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class MainSellerHolder {

    private String id;
    private String name;
    private String externalId;
    private Boolean mainSeller;
    private String origin;
    private List<String> salesSupervisors;

}
