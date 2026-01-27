import java.util.Scanner;
	
	public class Grades {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter marks (0-100):");
		int marks = sc.nextInt();

		if(marks > 90 && marks < 100){
		System.out.println("Grade : AA");
                }

		else if (marks >= 80 && marks <= 90){
		System.out.println("Grade : AB");

		else if(marks >= 70 && marks <= 80){
		System.out.println("Grade : BB");

		else if(marks >= 60 && marks <= 70){
		System.out.println("Grade : BC");

		else if(marks >= 50 && marks <= 60){
		System.out.println("Grade : CC");

		else if(marks >= 35 && marks <= 50){
		System.out.println("Grade : DD");

		else{
		System.out.println("Grade : FF");
               }
else if(marks >= 60 && marks <= 70){
		System.out.println("Grade : BC");




