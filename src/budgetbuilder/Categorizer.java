package budgetbuilder;

import java.util.ArrayList;

public class Categorizer {

	private String type;
	final String[] incomes = {"h", "g"};
	//String[] income = new String[10] = {"DEPOSIT"};
	
	//ArrayList<String> income = new ArrayList<String>();
	ArrayList<String> savings = new ArrayList<String>();
	ArrayList<String> expense = new ArrayList<String>();
	ArrayList<String> ignore = new ArrayList<String>();
	ArrayList<String> unknown = new ArrayList<String>();
	
	public void categorize() {
		String string = listOfTransactions.get(1);
		
		if (string.contains("food")) {
			listOfTransactions.add("food");
		}
		else if (string.contains("energy")) {
			listOfTransactions.add("energy");
		}
		else {
			listOfTransactions.add("Unknown");
		}
	
}
