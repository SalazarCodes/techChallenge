package com.example.demo.controller;


import com.example.demo.controller.model.ExchangeRequest;
import com.example.demo.controller.model.ExchangeResponse;
import com.example.demo.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rate")
public class ExchangeController {

    @Autowired
    private ExchangeService exchangeService;


    @PostMapping("/calcular")
    public ExchangeResponse calculateAmmount(@RequestBody ExchangeRequest exchangeRequest){


        return exchangeService.CalculateExchangeRate(exchangeRequest.getMonto(), exchangeRequest.getMonedaOrigen(), exchangeRequest.getMonedaDestino());
    }

    @PatchMapping("/actualizar")
    public void updateExchange(@RequestBody ExchangeRequest exchangeRequest){

         exchangeService.updateExchangeRate(exchangeRequest.getMonto(), exchangeRequest.getMonedaOrigen(), exchangeRequest.getMonedaDestino());

    }

}
