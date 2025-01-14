package ca.gbc.productservice.dto;

import java.math.BigDecimal;

public record ProductRequest(
         String product_id,
         String product_name,
         String product_description,
         BigDecimal product_price
) {
}
