package com.example.demo.service;

import com.example.demo.controller.model.ExchangeResponse;

public interface ExchangeService {

     ExchangeResponse CalculateExchangeRate(double amount, String origen, String destino);

     void updateExchangeRate(double amount, String origen, String destino);

}
