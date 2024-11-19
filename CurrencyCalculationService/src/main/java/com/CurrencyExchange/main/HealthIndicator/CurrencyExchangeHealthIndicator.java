package com.CurrencyExchange.main.HealthIndicator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Controller;

@Controller
public class CurrencyExchangeHealthIndicator implements HealthIndicator{

	public boolean isHealthGood() {
		return true;
	}
	@Override
	public Health health() {
		if(isHealthGood()) {
		return Health.up().withDetail("Database health","Database is up").build();
		}
		else {
			return Health.down().withDetail("Database health","Database is down").build();
		}
	}

}
