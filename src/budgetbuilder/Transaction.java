package budgetbuilder;

import java.util.ArrayList;

public class Transaction {
	
	private String fileName;
	private int numOfTransactions;
	/*
	
	private String description;
	private String amount;
	private String fromFile;
	private String category;
	*/
	
	public Transaction(String fileName, int size, String transactions[][], ArrayList<String> listOfDates, 
			ArrayList<String> listOfDescriptions, ArrayList<String> listOfAmounts) {
		//String[][] transactions = new String[5][size];
		this.numOfTransactions = size;
		this.fileName = fileName;
		
		for (int i = 0; i < numOfTransactions; i++) {
			//transactions[0][i] = fileName;
			transactions[0][i] = listOfDates.get(i);
			transactions[1][i] = listOfDescriptions.get(i);
			transactions[2][i] = listOfAmounts.get(i);
			//transactions[3][i] = listOfCategories.get(i);
		}
	}
	
	public void printTransactions(String transactions[][]) {
		for (int i = 0; i < numOfTransactions; i++) {
			System.out.println("File Name: " + fileName);
			System.out.println("Date: " + transactions[0][i] + " " + 
			"Description: " + transactions[1][i] + " " + "Amount: " + transactions[2][i]);
		}
	}
	public void buildStatement() {
		
		
	}
}
