package utils.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class In {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static String getUserInput(String out){
		System.out.println(out);
		System.out.println("Enter command:");
		String input;
		try {
			input = br.readLine();
		} catch (IOException e) {
			input = "WTF?";
		}
		return input;
	}
	
	public static String getUserInputInteger(String out){
		System.out.println(out);
		System.out.println("Enter command:");
		String input = "";
		try {
			input = br.readLine();
		} catch (NumberFormatException e) {
			getUserInputInteger("Wrong number:");
		} catch (IOException e) {
			input = "WTF?";
		}
		return input;
	}
}
