package com.CurrencyExchange.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CurrencyExchange.main.entity.CurrencyFromToAmount;
import com.CurrencyExchange.main.repository.CurrencyCalculationRepository;

@Service
public class CurrencyCalculationServiceLayer {
	@Autowired
	private CurrencyCalculationRepository currencyCalculationRepository;
	@Autowired
	private CurrencyFromToAmount CFTA;
	
	public CurrencyFromToAmount getCurrentCurrencyRateAndAmount(String FirstCurrency, String SecondCurrency) {		
		CFTA.setFrom(currencyCalculationRepository.findByCurrency(FirstCurrency).getRate());
		CFTA.setTo(currencyCalculationRepository.findByCurrency(SecondCurrency).getRate());
		return CFTA;
	}
}
