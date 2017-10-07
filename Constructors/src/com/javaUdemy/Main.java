package com.javaUdemy;

public class Main {

    public static void main(String[] args) {
		Account bobsAccount = new Account();
//		Account bobsAccount = new Account("12345", 0.00 , "bob@email.com", "Bob",
//                "8159029229");
//	    bobsAccount.setNumber("12345");
//	    bobsAccount.setBalance(0.0);
//	    bobsAccount.setCustomerName("Bob");
//	    bobsAccount.setCustomerEmailAddress();
//	    bobsAccount.setCustomerPhoneNumber("8159029229");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        bobsAccount.deposit(100.0);
	    bobsAccount.withdrawal(500.0);
        bobsAccount.withdrawal(50.0);

        Account timsAccount = new Account("email@email.com",
                "Tim","1234567890");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
    }
}
