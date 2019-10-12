package budgetbuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Delimiter {
	
	
	
	//final static String dateRegex = "(\\d{2}\\/\\d{2}{1})";
	
	final static String descriptionRegex = "(?m)(^(\\d{2}\\/\\d{2}).+(\\d+\\.\\d{2})$)";
	final static String amountRegex = "(?=\\d*[,]*\\d+\\.\\d{2}{1}$)"; //matches transaction amount
	
	//final static String regex = dateRegex + "|" + amountRegex;
	
	public static void delimiter(String statement, ArrayList<String> listOfDates, 
			ArrayList<String> listOfDescriptions, ArrayList<String> listOfAmounts) {
		
		Pattern descriptionPattern = Pattern.compile(descriptionRegex);
		Matcher descriptionMatcher = descriptionPattern.matcher(statement);

		while (descriptionMatcher.find()) {
			String string = descriptionMatcher.group();
			
			String transaction[] = string.substring(6).split(amountRegex, 2);
			String date = string.substring(0, 5);
			String amount = transaction[1];
			String description = transaction[0].trim();
			
			//System.out.println("Date: " + date + " Description: " + description + " Amount: " + amount);
			
			listOfDates.add(date);
			listOfDescriptions.add(description);
			listOfAmounts.add(amount);
		}
	}	
}
