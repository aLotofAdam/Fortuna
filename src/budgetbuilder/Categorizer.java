package budgetbuilder;

import java.util.ArrayList;

public class Categorizer {

	//public Categorizer() {
	//private String type;

	//Income
	static String[] deposit = {"DEPOSIT"};
	static String[] paycheck = {"EFT PYMT NOVANT HEALTH"};
	static String[] otherIncome = {};

//Expense
	static String[] savings = {"BB&T ONLINE TRANSFER TRANSFER TO SAVINGS"};
	
	//food
	static String[] groceries = {"FOOD LION", "LOWE'S FOODS", "TRADER JOES", "DOLLAR-GENERAL",
			"WAL-MART"};
	static String[] eatingOut = {"CHILI'S", "CHICK-FIL-A", "ARBYS", "BOJANGLES", "COOK OUT", "COLDSTONE", "NEW HONG KONG CHIN", "MCDONALD'S", "CHINA RESTAURANT", "CARIBOU COFFEE"};
	static String[] gas = {"SHEETZ"};
	
	//Bills_Utilities
	static String[] energy = {"DUKE ENERGY"};	
	static String[] garbage = {};	
	static String[] water = {"DAVIDSON WATER INC"};	
	static String[] cable_internet = {"TWC*TIME WARNER", "Hulu", "NETFLIX.COM"};
	static String[] phone = {"OOMA,INC", "AT&T"};	
	static String[] rent_mortgage = {"ALABAMA HOUSING", "FIRST AMER HOME BU"};	
	static String[] car_insurance = {"DIRECTPAY CAPITAL ONE AUTO"};	
	static String[] creditCard = {"SYNCHRONY MC", "CHASE CREDIT CRD"};

	static String[] shopping = {"AMZN", "Amzn.com/bill", "TRACTOR SUPPLY CO", "Etsy.com", "ITUNESAPPST", "CHEGG", "PLAYSTATION NETWORT", "SHOE DEPT", "BATH & BODY WORKS", "BEDBATH&BEYOND#", "VICTORIASSE", "TARGET", "SPREADSHIRT"};
	
	static String[] entertainment = {"REGAL GREENSBORO"};
	
	static String[] otherExpenses = {"CASH WITHDRAWAL", "DMV DRIVER LIC.", "CFNA PYMT CREDIT FIRST"};

	static ArrayList<String> ignore = new ArrayList<String>();
	//private ArrayList<String> unknown = new ArrayList<String>();
	
	//ArrayList<String> income = new ArrayList<String>();
	//ArrayList<String> savings = new ArrayList<String>();
	//ArrayList<String> expense = new ArrayList<String>();
	//}
	
	//description from transaction
	public static String categorize(String s) {
		Boolean matched = false;
		String category = "Unknown";
		int notHere = 0;
		int i = 0;
		
		while (matched != true) {
			//System.out.println("Category notHere: " + notHere);
			if (i < deposit.length) {
				if (s.contains(deposit[i])) {
					category = "Deposit";
					matched = true;
					return category;
				}
				if ((i + 1) >= deposit.length) {
					notHere++;
				}
			}
			if (i < cable_internet.length) {
				if (s.contains(cable_internet[i])) {
					category = "Cable/Internet";
					matched = true;
					return category;
				}
				if ((i + 1) >= cable_internet.length) {
					notHere++;
				}
			}
			if (i < car_insurance.length) {
				if (s.contains(car_insurance[i])) {
					category = "Car/Insurance";
					matched = true;
					return category;
				}
				if ((i + 1) >= car_insurance.length) {
					notHere++;
				}
			}
			if (i < creditCard.length) {
				if (s.contains(creditCard[i])) {
					category = "Credit Card";
					matched = true;
					return category;
				}
				if ((i + 1) >= creditCard.length) {
					notHere++;
				}
			}
			if (i < eatingOut.length) {
				if (s.contains(eatingOut[i])) {
					category = "Eating Out";
					matched = true;
					return category;
				}
				if ((i + 1) >= eatingOut.length) {
					notHere++;
				}
			}
			if (i < energy.length) {
				if (s.contains(energy[i])) {
					category = "Energy";
					matched = true;
					return category;
				}
				if ((i + 1) >= energy.length) {
					notHere++;
				}
			}
			if (i < entertainment.length) {
				if (s.contains(entertainment[i])) {
					category = "Entertainment";
					matched = true;
					return category;
				}
				if ((i + 1) >= entertainment.length) {
					notHere++;
				}
			}
			if (i < garbage.length) {
				if (s.contains(garbage[i])) {
					category = "Garbage";
					matched = true;
					return category;
				}
				if ((i + 1) >= garbage.length) {
					notHere++;
				}
			}
			if (i < gas.length) {
				if (s.contains(gas[i])) {
					category = "Gas";
					matched = true;
					return category;
				}
				if ((i + 1) >= gas.length) {
					notHere++;
				}
			}
			if (i < groceries.length) {
				if (s.contains(groceries[i])) {
					category = "Groceries";
					matched = true;
					return category;
				}
				if ((i + 1) >= groceries.length) {
					notHere++;
				}
			}
			if (i < ignore.size()) {
				if (s.contains(ignore.get(i))) {
					category = "Ignore";
					matched = true;
					return category;
				}
				if ((i + 1) >= ignore.size()) {
					notHere++;
				}
			}
			if (i < otherExpenses.length) {
				if (s.contains(otherExpenses[i])) {
					category = "Other Expenses";
					matched = true;
					return category;
				}
				if ((i + 1) >= otherExpenses.length) {
					notHere++;
				}
			}
			if (i < otherIncome.length) {
				if (s.contains(otherIncome[i])) {
					category = "Other Income";
					matched = true;
					return category;
				}
				if ((i + 1) >= otherIncome.length) {
					notHere++;
				}
			}
			if (i < paycheck.length) {
				if (s.contains(paycheck[i])) {
					category = "Paycheck";
					matched = true;
					return category;
				}
				if ((i + 1) >= paycheck.length) {
					notHere++;
				}
			}
			if (i < phone.length) {
				if (s.contains(phone[i])) {
					category = "Phone";
					matched = true;
					return category;
				}
				if ((i + 1) >= phone.length) {
					notHere++;
				}
			}
			if (i < rent_mortgage.length) {
				if (s.contains(rent_mortgage[i])) {
					category = "Rent/Mortgage";
					matched = true;
					return category;
				}
				if ((i + 1) >= rent_mortgage.length) {
					notHere++;
				}
			}
			if (i < savings.length) {
				if (s.contains(savings[i])) {
					category = "Savings";
					matched = true;
					return category;
				}
				if ((i + 1) >= savings.length) {
					notHere++;
				}
			}
			if (i < shopping.length) {
				if (s.contains(shopping[i])) {
					category = "Shopping";
					matched = true;
					return category;
				}
				if ((i + 1) >= shopping.length) {
					notHere++;
				}
			}
			if (i < water.length) {
				if (s.contains(water[i])) {
					category = "Water";
					matched = true;
					return category;
				}
				if ((i + 1) >= water.length) {
					notHere++;
				}
			}
			if (notHere >= 16){
				return category;
			}
			
			i++;
		}
	return category;
	}
}
