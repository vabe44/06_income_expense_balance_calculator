package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner konzol = new Scanner(System.in);

        System.out.println("Enter the incomes, one per line. When done, press 0 and enter!");
        ArrayList<Integer> incomes = new ArrayList<>();
        functions.array_fill(incomes, konzol);

        System.out.println("Enter the expenses, one per line. When done, press 0 and enter!");
        ArrayList<Integer> expenses = new ArrayList<>();
        functions.array_fill(expenses, konzol);

        konzol.close();

        int sumIncome = functions.array_getsum(incomes);
        int sumExpense = functions.array_getsum(expenses);
        int balance = sumIncome - sumExpense;
        int maxExpense = functions.array_getmax(expenses);

        System.out.println("Sum of incomes: " + sumIncome);
        System.out.println("Sum of expenses: " + sumExpense);

        System.out.println("Balance: " + balance);
        System.out.println("Highest expense: " + maxExpense);

    }
}
