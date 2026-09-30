package main;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void RecursiveMethod(ArrayList<String> lines) {
		int linenum = 0;
		int paragraph_length = 0;
		
		for (String line: lines) {
			if (line.isEmpty()) {
				System.out.println(linenum + ": " + "Paragraph Length: " + (paragraph_length));				
				paragraph_length = 0;
			} else if ((linenum + 1) >= lines.size()) { 
				System.out.println(linenum + ": " + line + "\nParagraph Length: " + (paragraph_length + 1));
			} else {
				System.out.println(linenum + ": " + line);
				paragraph_length++;
			}
			linenum++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.print("What file do you want to read? (from src/data directory)\n> ");
				// String myFile = sc.nextLine();
				System.out.print("GettysburgAddress.txt");
				String myFile = "GettysburgAddress.txt";
				ReadFile fileRes = new ReadFile("data/" + myFile);
				System.out.println();
				
				ArrayList<String> lines = fileRes.getLines();
				RecursiveMethod(lines);
				
				break;
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getStackTrace());
				System.out.println();
			}
		}
	}
}