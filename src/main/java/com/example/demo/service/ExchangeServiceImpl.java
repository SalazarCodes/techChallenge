package com.example.demo.service;

import com.example.demo.controller.model.ExchangeResponse;
import com.example.demo.dao.repository.ExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExchangeServiceImpl implements ExchangeService {

    @Autowired
    private ExchangeRepository exchangeRepository;


    @Override
    public ExchangeResponse CalculateExchangeRate(double monto, String origen, String destino) {


        double typeExchange =  exchangeRepository.findTypeExchange(origen,destino);

        double exchangeAmount;

        if(origen.equals("SOL")){

            exchangeAmount = monto / typeExchange;

        }
        else{

            exchangeAmount = typeExchange * monto;

        }

        return exchangeResponseBuilder(origen,destino,monto, typeExchange,exchangeAmount);

    }

    @Override
    public void updateExchangeRate(double amount, String origen, String destino) {

        exchangeRepository.updateExchange(amount, origen, destino);

    }


    private ExchangeResponse exchangeResponseBuilder(String origen, String destino, double monto, double exchange, double montoConvertido) {


            return ExchangeResponse.builder()
                    .monedaOrigen(origen)
                    .monedaDestino(destino)
                    .tipodeCambio(exchange)
                    .monto(monto)
                    .montoConvertido(montoConvertido)
                    .build();

    }

}
