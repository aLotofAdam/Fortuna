package budgetbuilder;

public class BuildBudget {
	double paycheck = 0;
	double deposit = 0;
	double otherIncome = 0;
	double unknown = 0;
	double savings = 0;
	double housing = 0;
	double gas = 0;
	double shopping = 0;
	double otherExpenses = 0;
	double car = 0;
	double creditCard = 0;
	double entertainment = 0;
	
	double cable_internet = 0;
	double phone = 0;
	double energy = 0;
	double garbage = 0;
	double water = 0;
	
	double eatingOut = 0;
	double groceries = 0;
	
	public void analyze(String[][] transactions, int size) {
		for (int i = 0; i < size; i++) {
			double amount = Double.valueOf(transactions[2][i]);
			
			switch(transactions[3][i]) {
				case "Paycheck":
					paycheck += amount;
					break;
				case "Deposit":
					deposit += amount;
					break;
				case "Other Income":
					otherIncome += amount;
					break;
				case "Rent/Mortgage":
					housing += amount;
					break;
				case "Gas":
					gas += amount;
					break;
				case "Shopping":
					shopping += amount;
					break;
				case "Other Expenses":
					otherExpenses += amount;
					break;
				case "Car/Insurance":
					car += amount;
					break;
				case "Credit Card":
					creditCard += amount;
					break;
				case "Entertainment":
					entertainment += amount;
					break;
				case "Cable/Internet":
					cable_internet += amount;
					break;
				case "Phone":
					phone += amount;
					break;
				case "Energy":
					energy += amount;
					break;
				case "Garbage":
					garbage += amount;
					break;
				case "Water":
					water += amount;
					break;
				case "Eating Out":
					eatingOut += amount;
					break;
				case "Groceries":
					groceries += amount;
					break;
				case "Savings":
					savings += amount;
					break;
				case "Unknown":
					unknown += amount;
					break;
				default:
					System.out.println("Ignored: " + transactions[3][i]);
			}
		}
	}
	
	public void printBudget(String startDate, String endDate) {
		System.out.println("Budget from: " + startDate + " to " + endDate);
		System.out.println("Income: $" + getTotalIncome());
		System.out.println("Expense: $" + getTotalExpense());
		System.out.println("Net Gain/Loss: $" + getNetTotal() + "\n");
		
		System.out.println("Food Expense: $" + getFoodExpense() + "\n$" + 
				groceries +" from groceries and $" + eatingOut + " from eating out.\n");
		System.out.println("Utilities Expense: $" + getUtilitiesExpense() + "\nCable/Internet: $" + 
				cable_internet + "\nPhone: $" + phone + "\nEnergy: $" + energy + 
				"\nGarbage: $" + garbage + "\nWater: $" + water + "\n");
		System.out.println("Shopping: $" + shopping + "\nEntertainment: $" + entertainment +
				"\nOther Expenses: $" + otherExpenses);
	}
	
	public double getFoodExpense() {
		double food = eatingOut + groceries;
		return food;
	}
	
	public double getUtilitiesExpense() {
		double utilities = cable_internet + phone + energy + garbage + water;
		return utilities;
	}
	
	public double getTotalExpense() {
		double totalExpense = getFoodExpense() + getUtilitiesExpense() + 
				car + creditCard + entertainment + housing + gas + shopping + otherExpenses;
		return totalExpense;
	}
	
	public double getTotalIncome() {
		double totalIncome = paycheck + deposit + otherIncome;
		return totalIncome;
	}
	
	public double getNetTotal() {
		double netTotal = getTotalIncome() - getTotalExpense();
		return netTotal;
	}
}
