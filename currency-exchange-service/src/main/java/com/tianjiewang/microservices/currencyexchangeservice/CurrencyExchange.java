package com.tianjiewang.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class CurrencyExchange {
	@Id
	private Long id;
	
	@Column(name = "currency_from")
	private String from;
	@Column(name = "currency_to")
	private String to;
	private BigDecimal ConversionMultiple;
	private String environment;
	
	
	public CurrencyExchange() {
		super();
	}
	public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		ConversionMultiple = conversionMultiple;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMultiple() {
		return ConversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		ConversionMultiple = conversionMultiple;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	

}
