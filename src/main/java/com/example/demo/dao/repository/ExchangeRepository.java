package com.example.demo.dao.repository;

import com.example.demo.entity.Exchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ExchangeRepository extends JpaRepository<Exchange, String> {


    @Query(
            value = "SELECT tipo_de_cambio FROM Exchange u WHERE u.moneda_origen = ?1 AND u.moneda_destino = ?2",
            nativeQuery = true)
    double findTypeExchange(String monedaOrigen, String monedaDestino);


    @Modifying
    @Transactional
    @Query(
            value = "UPDATE Exchange u SET u.tipo_de_cambio = ?1 WHERE u.moneda_origen = ?2 AND u.moneda_destino = ?3",
            nativeQuery = true)
    void updateExchange(double monto, String monedaOrigen, String monedaDestino);


}
