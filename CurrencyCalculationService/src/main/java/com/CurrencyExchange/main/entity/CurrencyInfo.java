package com.CurrencyExchange.main.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity(name="currency_rate")
public class CurrencyInfo {
	@Id 
	@Column(name="Id")
	private int id;
	@Column(name="Rate")
	private String rate;
	@Column(name="Currency")
	private String currency;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
}
