package budgetbuilder;

import java.util.ArrayList;

public class Categorizer {

	private String type;

	//Income
	private String[] deposit = {"DEPOSIT", };
	private String[] Paycheck = {"EFT PYMT NOVANT HEALTH"};
	private String[] otherIncome = {};

//Expense
	private String[] savings = {"BB&T ONLINE TRANSFER TRANSFER TO SAVINGS"};
	
	//food
	private String[] groceries = {"food lion", "lowes food", "trader joes", 
			"WAL-MART"};
	private String[] eatingOut = {"CHILI'S", "CHICK-FIL-A", "ARBYS", "BOJANGLES", "COOK OUT", "COLDSTONE", "NEW HONG KONG CHIN", "MCDONALD'S", "MCDONALD'S", "CHINA RESTAURANT"};
	private String[] coffee = {"CARIBOU COFFEE"};
	private String[] gas = {"SHEETZ"};
	
	//Bills_Utilities
	private String[] energy = {"DUKE ENERGY"};	
	private String[] garbage = {};	
	private String[] water = {"DAVIDSON WATER INC"};	
	private String[] cable_internet = {"TWC*TIME WARNER", "Hulu", "NETFLIX.COM"};
	private String[] phone = {"OOMA,INC", "AT&T"};	
	private String[] rent_mortgage = {"ALABAMA HOUSING", "FIRST AMER HOME BU"};	
	private String[] car_insurance = {"DIRECTPAY CAPITAL ONE AUTO"};	
	private String[] creditCard = {"SYNCHRONY MC", "CHASE CREDIT CRD"};

	private String[] shopping = {"AMZN", "TRACTOR SUPPLY CO", "Etsy.com", "ITUNESAPPST", "CHEGG", "PLAYSTATION NETWOR", "SHOE DEPT", "BATH & BODY WORKS", "BEDBATH&BEYOND#", "VICTORIASSE", "TARGET", "SPREADSHIRT"};
	
	private String[] entertainment = {"REGAL GREENSBORO"};
	
	private String[] otherExpenses = {"CASH WITHDRAWAL", "DMV DRIVER LIC.", "CFNA PYMT CREDIT FIRST"};

	private ArrayList<String> ignore = new ArrayList<String>();
	private ArrayList<String> unknown = new ArrayList<String>();
	
	//ArrayList<String> income = new ArrayList<String>();
	//ArrayList<String> savings = new ArrayList<String>();
	//ArrayList<String> expense = new ArrayList<String>();
	
	
	public void categorize(String description) {
		for (int i = 0; i < listOfDescriptions.size(); i++) {
			if (string.contains(deposit[i])) {
				
			}
		}
		
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
