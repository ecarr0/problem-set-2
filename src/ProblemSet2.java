/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */

import java.util.Scanner;


public class ProblemSet2 {
	Scanner in  = new Scanner(System.in);
	/**
	 * You need not modify the main method.
	 */
	
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		Scanner in  = new Scanner(System.in);
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
	
	public void sayHello() {
		System.out.println("What is your first name?");
		String firstName = in.nextLine();
		System.out.println("What is your last name?");
		String lastName = in.nextLine();
		System.out.println("Hello, " + firstName + " " + lastName + "!");
	}
	
	public void gradeMe() {
		System.out.println("Enter your first homework grade : ");
		double homework1 = in.nextDouble() / 100;
		System.out.println("Enter your second homework grade : ");
		double homework2 = in.nextDouble() / 100;
		System.out.println("Enter your third homework grade : ");
		double homework3 = in.nextDouble() / 100;
		double avgHomework = (homework1 + homework2 + homework3) / 3;
		System.out.println("Enter your first quiz grade : ");
		double quiz1 = in.nextDouble() / 100;
		System.out.println("Enter your second quiz grade : ");
		double quiz2 = in.nextDouble() / 100;
		System.out.println("Enter your third quiz grade : ");
		double quiz3 = in.nextDouble() / 100;
		double avgQuiz = (quiz1 + quiz2 + quiz3) / 3;
		System.out.println("Enter your first test grade : ");
		double test1 = in.nextDouble() / 100;
		System.out.println("Enter your second test grade : ");
		double test2 = in.nextDouble() / 100;
		System.out.println("Enter your third test grade : ");
		double test3 = in.nextDouble() / 100;
		double avgTest = (test1 + test2 + test3) / 3;
		double finalScore = (avgHomework * 0.15) + (avgQuiz * 0.30) + (avgTest * 0.55);
		finalScore *= 100;
		System.out.print("Final Grade : "); 
		System.out.printf(" %.2f", finalScore);
		System.out.println("%");
	}
	
	public void groupUs() {
		System.out.println("Enter number of teachers: ");
		int numPeople = in.nextInt();
		System.out.println("Enter number of students: ");
		numPeople += in.nextInt();
		int numBuses = numPeople / 47;
		if((numBuses * 47) != numPeople)
		{
			numBuses++;
		}
		System.out.println("You need " + numBuses + " buses.");
		System.out.println((numBuses - 1) + " buses have 47 passengers. Bus " + numBuses + " has "  + (numPeople % 47) + " passengers.");
	}
	
	public void info() {
		System.out.println("Enter your first name: ");
		String firstName = in.nextLine();
		System.out.println("Enter your last name : ");
		String lastName = in.nextLine();
		System.out.println("Enter your grade : ");
		int grade = in.nextInt();
		System.out.println("Enter your age : ");
		int age = in.nextInt();
		in.nextLine();
		System.out.println("Enter your hometown : ");
		String hometown = in.nextLine();
		System.out.println("NAME\t : " + firstName + " " + lastName + "\nGRADE\t : " + grade + "\nAGE\t : " + age + "\nHOMETOWN : " + hometown);
	}
	
	public void initials() {
		System.out.println("Please enter your first name: ");
		char firstName = in.nextLine().charAt(0);
		System.out.println("Please enter your middle name: ");
		char middleName = in.nextLine().charAt(0);
		System.out.println("Please enter your last name: ");
		char lastName = in.nextLine().charAt(0);
		
		System.out.println("\nYour initials are " + firstName + middleName + lastName + ".\n");
		in.close();
	}
}
