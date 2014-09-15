package hadoop.java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MyStringTokenizer {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name and age: " );
		String input = bufferReader.readLine();
		
		StringTokenizer tokenizer  = new StringTokenizer(input,",");

		String name = tokenizer.nextToken();
		int age = Integer.parseInt(tokenizer.nextToken());
		
		System.out.println("Your name is: " + name + " and your age is: " + age);
	}
}