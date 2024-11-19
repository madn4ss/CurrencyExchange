package com.CurrencyExchange.main.entity;

import org.springframework.stereotype.Component;

@Component
public class CurrencyFromToAmount {
	private String From;
	private String To;
	private float FinalAmount;

	public String getFrom() {
		return From;
	}

	public void setFrom(String from) {
		From = from;
	}

	public String getTo() {
		return To;
	}

	public void setTo(String to) {
		To = to;
	}

	public float getFinalAmount() {
		return FinalAmount;
	}

	public void setFinalAmount(float finalAmount) {
		FinalAmount = finalAmount;
	}

}
