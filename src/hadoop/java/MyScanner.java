package hadoop.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyScanner {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("/Users/Kiem/Desktop/kiem.txt");
		
		Scanner scanner = new Scanner(file);
		scanner.useDelimiter(",");
		
		String name = scanner.next();
		int age = scanner.nextInt();
		
		System.out.println("Your name is: " + name);
		System.out.println("Your age is: " + age);

	}

}

