package io.iamofoe.ecommerceservice.dto.response;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.util.Date;

@Value
@Builder
public class CheckoutResponseDto {
    long id;
    double amount;
    Date date;
}
