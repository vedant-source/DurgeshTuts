package com.springcore.autowire.using_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address2")
		private Address address;

		public Emp() {
			super();
			// TODO Auto-generated constructor stub
		}
		//@Autowired
		public Emp(Address address) {
			super();
			System.out.println("Inside emp constr...");
			this.address = address;
		}

		public Address getAddress() {
			return address;
		}
		//@Autowired
		public void setAddress(Address address) {
			System.out.println("Inside Emp setter...");
			this.address = address;
		}

		@Override
		public String toString() {
			return "Emp [address=" + address + "]";
		}
		
		
		
}
