package toDoList;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
	static ArrayList<String> arrList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int choice ;
		do {
		
		System.out.println("To Do list Menu:");
		System.out.println("1. Add Task");
		System.out.println("2. View Tasks");
		System.out.println("3. Mark Task as completed");
		System.out.println("4.Exit");
		choice = sc.nextInt();
		switch (choice) {
		case 1: {
			addTask();
			break;
		}
		case 2: {
			viewTask();
			break;
		}
		case 3: {
			markTask();
			break;
		}case 4:{
			System.out.println("Exiting the programe");
			break;
		}
		default: {
			System.out.println("Enter valid number:");
		}
		}
	} while (choice != 4);
	}

	private static void addTask() {
		System.out.println("Enter task to add: ");
		String st = sc.next();
		arrList.add(st);
		System.out.println("Task added successfuly");
	}

	private static void viewTask() {
		System.out.println("Task List:");
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(i + 1 + ". " + arrList.get(i));
		}
	}

	private static void markTask() {
		viewTask();
		System.out.println("Enter the number of task to mark as completed:S");
		int num = sc.nextInt();
		arrList.remove(num - 1);
		System.out.println("Task marked completed");
	}
}
