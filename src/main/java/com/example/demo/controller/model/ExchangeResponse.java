package com.example.demo.controller.model;

import lombok.*;

import javax.persistence.Column;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExchangeResponse {

    private String monedaOrigen;

    private String monedaDestino;

    private double tipodeCambio;

    private double monto;

    private double montoConvertido;


}
