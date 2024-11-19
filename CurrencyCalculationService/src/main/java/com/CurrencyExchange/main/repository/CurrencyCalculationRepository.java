package com.CurrencyExchange.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CurrencyExchange.main.entity.CurrencyInfo;

@Repository
public interface CurrencyCalculationRepository extends JpaRepository<CurrencyInfo,Integer>{
	public CurrencyInfo findByCurrency(String Currency);
}
  