package com.myProject;

import java.util.Scanner;

public class Locker {
	public static void main(String[] args) {
		
		int ch = 0, choice = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Please choose one of the following options :");
			System.out.println("1. Retrieving all the files names");
			System.out.println("2. User Operations");
			System.out.println("3. Exit");
			try {
				ch = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Null Exception occurred");
			}

			switch (ch) {
			// List function feature to list all files in ascending order.
			case 1:
				BusinessOperations.listFiles();
				break;
			case 2:
				System.out.println("Please choose one of the following options :");
				System.out.println("1. Add a File");
				System.out.println("2. Delete a File");
				System.out.println("3. Search for a File");
				System.out.println("4. Return to the main menu");
				try {
					choice = sc.nextInt();
				} catch (Exception e) {
					System.out.println("Please choose valid option");
				}
				
				switch (choice) {
				case 1:
					// Creation of a file takes place
					System.out.println("Enter the name of a file to be created: ");
					String fileCreate = sc.next();

					// Calling the function to create the file
					BusinessOperations.createFile(fileCreate);
					break;

				case 2:
					// deletion of a file takes place
					System.out.print("Enter the name of a file to be deleted: ");
					String fileDelete = sc.next();

					// Calling the function to delete the file
					BusinessOperations.deleteFile(fileDelete);
					break;
				case 3:
					// Search for a file takes place
					System.out.println("Enter the name of a file to be searched: ");
					String fileSearch = sc.next();

					// Calling the function to search the file
					BusinessOperations.searchFile(fileSearch);
					break;

				case 4:
					System.out.println("Current execution context Closed Succesfully......\n");
					break;

				default:
					// In the case of unprecedented input execute this
					System.out.println("Invalid Input, Enter a valid option...!");
					break;
				}
				break;
			case 3:
				// Voluntarily exiting the application
				sc.close();
				System.out.println("Thanks for using...!");
				System.exit(1);
				break;

			default:
				// In the case of unprecedented input execute this
				System.out.println("Invalid option, Please enter a valid option...!");
				break;
			}
		}
	}
}


