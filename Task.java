package GenericQues;
import java.util.ArrayList;
import java.util.Scanner;
public class Task {
	    public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);    // take input from user
	        ArrayList<Double> grades = new ArrayList<>();  //  to store input in array list
	        String input;

	        System.out.println("Enter student grades (type  only 'done' to finish):");

	        while (true) {
	            System.out.print("Enter a grade: ");   // after every valid input 
	            input = sc.nextLine();

	            if (input.equalsIgnoreCase("done")) {   // after entered all grades"type done" to exit
	                break;
	            }

	            try {
	                double grade = Double.parseDouble(input);
	                if (grade < 0 || grade > 100) {
	                    System.out.println("Grade must be between 0 and 100. Try again.");
	                } else {
	                    grades.add(grade);
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input. Please enter a number.");
	            }
	        }

	        if (grades.isEmpty()) {
	            System.out.println("No grades were entered.");  //if not any grade enterd
	        } else {
	            double sum = 0;
	            for (double grade : grades) {
	                sum += grade;
	            }
	            double average = sum / grades.size();
	            System.out.printf("The average grade is: %.2f%n", average);
	        }

	        sc.close();
	    }
	}

