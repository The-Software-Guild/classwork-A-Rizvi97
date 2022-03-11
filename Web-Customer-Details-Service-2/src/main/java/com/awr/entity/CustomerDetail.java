package com.awr.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerDetail {
	
	@Setter
	@Getter
	private String customerId;
	@Setter
	@Getter
	private String shareName;
	@Setter
	@Getter
	private int quantity;
	@Setter
	@Getter
	private double marketPrice;
	@Setter
	@Getter
	private double totalValuation;
	@Setter
	@Getter
	private String shareType;

}
