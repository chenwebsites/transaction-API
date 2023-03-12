package com.spring.transaction.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Transaction {

	@Id
	private long transactionId;
	
	private String dateAndTime;
	private long customerId;
	
	@Transient
	private DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");


	public Transaction(long customerId) {
		super();
		this.transactionId = new Date().getTime();
		this.dateAndTime = LocalDateTime.now().format(dateTimeFormat);
		this.customerId = customerId;
	}
	
	
	
	
	
}
