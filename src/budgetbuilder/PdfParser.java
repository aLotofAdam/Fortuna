package budgetbuilder;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfParser {
	
	public static void main (String args[]) throws IOException {		
		ArrayList<String> listOfDates = new ArrayList<String>();
		ArrayList<String> listOfDescriptions = new ArrayList<String>();
		ArrayList<String> listOfAmounts = new ArrayList<String>();
		ArrayList<String> listOfCategories = new ArrayList<String>();
		
		FileDialog dialog = new FileDialog((Frame)null, "Select PDF file to open");
		dialog.setMode(FileDialog.LOAD);
		dialog.setVisible(true);
		String path = dialog.getDirectory() + dialog.getFile();
		String fileName = dialog.getFile();
		File file = new File(path);
		System.out.println(file + " selected.");
		
		PDDocument document = PDDocument.load(file.getAbsoluteFile());
		System.out.println("PDF loaded");
		
		PDFTextStripper pdfStripper = new PDFTextStripper();
		
		String statement = pdfStripper.getText(document);
		//System.out.println(statement);
		//String text = "12/19";
		
		Delimiter delimiter = new Delimiter();
		Delimiter.delimiter(statement, listOfDates, listOfDescriptions, listOfAmounts);
		
		Categorizer categorizer = new Categorizer();
		categorizer.categorize(listOfDescriptions, listOfCategories);
		
		if (listOfDates.size() == listOfDescriptions.size() && 
				listOfDescriptions.size() == listOfAmounts.size()) {
			int size = listOfDates.size();
			
			String[][] transactions = new String[4][size];
			
			Transaction newTransaction = new Transaction(fileName, size, transactions, 
					listOfDates, listOfDescriptions, listOfAmounts);
			
			newTransaction.printTransactions(transactions);
		}
		
		
		
		document.close();
		System.out.println("PDF closed");
		System.exit(0);
	}
}
