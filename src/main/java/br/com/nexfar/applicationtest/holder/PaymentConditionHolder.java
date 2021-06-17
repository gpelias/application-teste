package br.com.nexfar.applicationtest.holder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class PaymentConditionHolder {

    private String id;
    private String method;
    private String name;
    private Integer mediumTerm;
    private List<Integer> timesInDays;
    private String externalId;
    private Integer instalments;
    private BigDecimal orderMinValue;
    private BigDecimal discount;

}
