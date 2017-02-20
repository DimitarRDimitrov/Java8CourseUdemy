package com.autoboxing.challange;

import java.util.ArrayList;

public class Bank {
	private String name;
	private ArrayList<Branch> branches;

	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Branch> getBranches() {
		return branches;
	}

	public boolean addBranch(Branch b) {
		if (branches.contains(b)) {
			return false;
		}
		branches.add(b);
		return true;
	}

	private Branch containsBranchWithName(String bName) {
		for (int i = 0; i < branches.size(); i++) {
			Branch name = branches.get(i);
			if (name.getNameOfBranch().equals(bName)) {
				return name;
			}
		}
		return null;
	}

	public boolean addBranch(String name) {
		if (containsBranchWithName(name) != null) {
			return false;
		}
		branches.add(Branch.init(name));
		return true;
	}

	public boolean addCustomer(String branchName, String customerName, double initAmount) {
		Branch branch = containsBranchWithName(branchName);
		if (branch != null) {
			return branch.addCustomer(customerName, initAmount);
		}

		return false;
	}

	public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
		Branch branch = containsBranchWithName(branchName);
		if (branch != null) {
			return branch.addTransaction(customerName, amount);
		}
		return false;
	}

	public boolean listCustomers(String branchName, boolean showTransactions) {
		Branch branch = containsBranchWithName(branchName);
		if (branch != null) {
			System.out.println("Customer details for branch " + branch.getNameOfBranch());

			ArrayList<Customer> branchCustomers = branch.getCustomers();
			for (Customer c : branchCustomers) {
				System.out.println("Customer: " + c.getName() + "[" + (branchCustomers.indexOf(c)+1) + "]");
				if (showTransactions) {
					System.out.println("Transactions");
					ArrayList<Double> transactions = c.getTransactions();
					for (int j = 0; j < transactions.size(); j++) {
						System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
					}
				}
			}

			return true;
		} else {
			return false;
		}
	}

}
