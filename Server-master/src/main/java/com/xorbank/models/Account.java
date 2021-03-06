package com.xorbank.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="accountdata")
public class Account implements Serializable{				
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountId;
	
	@Column
	private String accountType;
	
	@Column
	private String dateCreated;
	
	@Column
	private Double balance;
	
	@ManyToOne
	private User user;

	public Account() {
		
	}
	public Account(int accountId, String accountType, String dateCreated, Double balance, User user) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.dateCreated = dateCreated;
		this.balance = balance;
		this.user = user;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountType=" + accountType + ", dateCreated=" + dateCreated
				+ ", balance=" + balance + ", user=" + user + "]";
	}
	
	
}
