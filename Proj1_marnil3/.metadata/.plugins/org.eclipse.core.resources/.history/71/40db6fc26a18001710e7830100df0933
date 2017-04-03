package Lecture4;
import java.util.*;
import java.io.*;
import java.util.ArrayList;

import Lecture3.Employee;

public class FileLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dataFile = "iris.csv";
		// Define buffer and split element
		BufferedReader br = null;
		String line = null;
		//split
		ArrayList<Flower> flowerList = new ArrayList<Flower>();
		//String[] parts = line.split(",");
		
		//print
		System.out.println("Print what has been read" + dataFile);
		
		
		//fr = new FileReader("C:\\Users\\marnil3\\workspace\\Proj1_marnil3\\Lecture4\\" + dataFile);
		//BufferedReader br = new BufferedReader(fr); 
		
		//"C:\\Users\\marnil3\\workspace\\Proj1_marnil3\\Lecture4\\" 
		// Create and ArrayList for Flowers (flowerList)
		try {
		
			br = new BufferedReader(new FileReader("C:\\Users\\marnil3\\workspace\\Proj1_marnil3\\Lecture4\\" + dataFile)); // load a file into buffer
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage() + "The file was not found");
			e.printStackTrace();
		} 
			//String line = null;
		// Cycle through the file
		try {
			int i = 0; 			
			while ((line = br.readLine()) != null) {
				// Read each line of file and store data into database
				//System.out.println(line);				
				
							
				String[] parts = line.split(",");
				String part1 = parts[0]; 
				String part2 = parts[1]; 
				String part3 = parts[2]; 
				String part4 = parts[3]; 
				String part5 = parts[4]; 
				String[] name_parts = part5.split("-");
				String part6 = name_parts[1]; // 004
				System.out.println(part5);
				
				String i_String = Integer.toString(i);
				Flower ii = new Flower();
				flowerList.add(ii);
				ii.type = part6;
				ii.sepal_length = part1;
				ii.sepal_width= part2;
				ii.petal_length= part3;
				ii.pepal_width= part4;											
				
				Flower john = new Flower();
				//Flower(String part6, String part1, String part2, String part3, String part4);
				i = i +1;
				System.out.println(i);
				System.out.println(flowerList.size());
				}
		} catch (IOException ioex) {
			System.out.println(ioex.getMessage() + "Error reading file");
		}
		// Print out fields of flowerList elements. To get element of ArrayList, command
		//flowerList.get(i) can be used. Remember to read fields of the objects.
		System.out.println(flowerList.size());
		for(int i = 0; i < flowerList.size(); i++) {   
			print(flowerList.get(i));			
		} 
		 }
	public static void print(Flower x){
		System.out.println("Type: " + x.type + "; SL " + x.sepal_length + "; SW " + x.sepal_length + "; PL " + x.sepal_length + "; PW " + x.sepal_length);
	// method for printing out a result
	}
		//}
	

	}
	