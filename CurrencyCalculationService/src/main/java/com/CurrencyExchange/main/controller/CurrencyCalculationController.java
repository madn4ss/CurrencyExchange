package com.CurrencyExchange.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.CurrencyExchange.main.entity.CurrencyFromToAmount;
import com.CurrencyExchange.main.service.CurrencyCalculationServiceLayer;

@RestController
public class CurrencyCalculationController {
@Autowired
private CurrencyCalculationServiceLayer currencyCalculationService;
	@GetMapping("/Convert/From/{FirstCurrency}/To/{SecondCurrency}/{Amount}")
	public ResponseEntity<CurrencyFromToAmount> getCalculatedAmount(@PathVariable String FirstCurrency, @PathVariable String SecondCurrency, @PathVariable float Amount) {	
		CurrencyFromToAmount Final = currencyCalculationService.getCurrentCurrencyRateAndAmount(FirstCurrency,SecondCurrency);		
		System.out.println(Amount);
		System.out.println(Float.parseFloat(Final.getFrom()));
		System.out.println(Float.parseFloat(Final.getTo()));
		Final.setFinalAmount((Amount/Float.parseFloat(Final.getFrom())*Float.parseFloat(Final.getTo())));
		Final.setFrom(FirstCurrency);
		Final.setTo(SecondCurrency);
		return new ResponseEntity<>(Final,HttpStatus.OK);
	}
	
}
