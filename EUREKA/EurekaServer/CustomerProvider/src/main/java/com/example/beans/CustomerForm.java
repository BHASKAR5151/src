package com.example.beans;

/*@Entity*/
public class CustomerForm {

	/* @Id */
	/* @Column */
	private int customerId;
	private String customerName;
	private String customerPhone;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public CustomerForm(int customerId, String customerName, String customerPhone) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhone = customerPhone;
	}

}
