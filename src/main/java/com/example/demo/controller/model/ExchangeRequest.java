package com.example.demo.controller.model;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExchangeRequest {

    private String monedaOrigen;

    private String monedaDestino;

    private double monto;
}
