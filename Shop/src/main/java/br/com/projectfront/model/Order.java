package br.com.projectfront.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Getter
@Setter
public class Order {
    private String nameProduct;
    private BigDecimal negotiatingPrice;
    private LocalDateTime deliveryDate;
    private String urlProduct;
    private String urlImage;
    private String description;
}