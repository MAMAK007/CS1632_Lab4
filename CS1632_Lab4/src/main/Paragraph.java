package main;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
	private List<String> words;
	
	public Paragraph() {
		words = new ArrayList<>();
	}
	
	public void add(String paragraph) {
		words.add(paragraph);
	}

	public String get(int index) {
		return words.get(index);
	}

	public int size() {
		return words.size();
	}

	public boolean isEmpty() {
		return words.isEmpty();
	}

	public void set(int index, String paragraph) {
		words.set(index, paragraph);
	}
	
	public void remove(int index) {
		words.remove(index);
	}
	
	@Override
	public String toString() {
		String printString = "";
		for (String i : words) {
			printString = printString.concat(i);
		}
		return printString + "PARAGRAPH END\n";
	}
}
