package main;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static ArrayList<Paragraph> RecursiveMethod(ArrayList<String> lines) {
		ArrayList<Paragraph> container = new ArrayList<Paragraph>();
		
		Paragraph newParagraph = new Paragraph();
		
		for (int i = 0; i < lines.size(); i++) {
			String line = lines.get(i);

			if (line.isBlank()) {
				container.add(newParagraph);
				newParagraph = new Paragraph();
			} else {
				newParagraph.add(line + "\n");
			}
		}
		
		if (!newParagraph.isEmpty()) {
			container.add(newParagraph);
		}
		
		return container;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Paragraph> myContainer = new ArrayList<Paragraph>();
		
		while (true) {
			try {
				System.out.print("What file do you want to read? (from src/data directory)\n> ");
				
				String myFile = sc.nextLine();
				
				System.out.println();
				ReadFile fileRes = new ReadFile("data/" + myFile);
				System.out.println();
				
				ArrayList<String> lines = fileRes.getLines();
				myContainer = RecursiveMethod(lines);
				break;
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getStackTrace());
				System.out.println();
			}
		}
		
		System.out.println(myContainer);
	}
}