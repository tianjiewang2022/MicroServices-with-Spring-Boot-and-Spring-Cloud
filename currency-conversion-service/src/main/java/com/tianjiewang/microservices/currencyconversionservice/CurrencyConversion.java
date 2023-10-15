package com.tianjiewang.microservices.currencyconversionservice;

import java.math.BigDecimal;

//import jakarta.persistence.Column;
//import jakarta.persistence.Id;

//@Entity
public class CurrencyConversion {

//	@Id
	private Long id;
	
//	@Column(name = "currency_from")
	private String from;
//	@Column(name = "currency_to")
	private String to;
	private BigDecimal quantity;
	private BigDecimal ConversionMultiple;
	private BigDecimal totalCalculatedAmount;
	private String environment;
	
	
	public CurrencyConversion() {
		super();
	}
	
	
	public CurrencyConversion(Long id, String from, String to, BigDecimal quantity, BigDecimal conversionMultiple,
			BigDecimal totalCalculatedAmount, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.ConversionMultiple = conversionMultiple;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.environment = environment;
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
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}
	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	

}
