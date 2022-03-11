package com.awr.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class CustomerDetails {
	
	@Setter
	@Getter
	List<CustomerDetail> customerDetailList;

}
