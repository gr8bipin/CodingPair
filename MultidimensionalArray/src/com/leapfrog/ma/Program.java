/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ma;

import java.util.Scanner;

/**
 *
 * @author Bipins
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] students = {"Ramesh", "Suresh", "Rabin", "Nabin", "Suraj"};
        String[] subjects = {"English", "Nepali", "Science", "Maths", "Computer"};
        double[][] marks = new double[students.length][subjects.length];
        double[] percentage=new double[students.length];
        Scanner input = new Scanner(System.in);

        double total = 0;
       

        System.out.println("Result of the students");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("Enter the name of the student.");
        String choice = input.next();
        
        switch (choice) {

            case "Ramesh":

                for (int i = 0; i < 1; i++) {
                    for (int j = 0; j < subjects.length; j++) {
                        System.out.println("Enter the marks for" + " " + subjects[j] + " " + "of" + " " + students[i]);
                        marks[i][j] = input.nextDouble();
                    }

                }

                if (marks[0][0] < 32 || marks[0][1] < 32 || marks[0][2] < 32 || marks[0][3] < 32 || marks[0][4] < 32) {
                    System.out.println("Fail");
                } else {
                    System.out.println("Pass");
                    for (int i = 0; i < 1; i++) {
                        for (int j = 0; j < subjects.length; j++) {
                            total = total + marks[i][j];
                            percentage[i] = (total / 500) * 100;
                              
                        }
                        System.out.println("The total marks of " + students[i] + ": " + total);
                        System.out.println("The total percentage of " + students[i] + ": " + percentage[i]);
                        
                    }
                    
                    
                }
                break;

            case "Suresh":
                
                for (int i = 1; i <2; i++) 
                {
                    for (int j = 0; j < subjects.length; j++) 
                    {
                        System.out.println("Enter the marks for" + " " + subjects[j] + " " + "of" + " " + students[i]);
                        marks[i][j] = input.nextDouble();
                    }

                }

                if (marks[1][0] < 32 || marks[1][1] < 32 || marks[1][2] < 32 || marks[1][3] < 32 || marks[1][4] < 32) 
                {
                    System.out.println("Fail");
                } else {
                    System.out.println("Pass");
                    for (int i = 1; i < 2; i++) {
                        for (int j = 0; j < subjects.length; j++) {
                            total = total + marks[i][j];
                            percentage[i] = (total / 500) * 100;
                        }
                        System.out.println("The total marks of " + students[i] + ": " + total);
                        System.out.println("The total percentage of " + students[i] + ": " + percentage[i]);
                    }
                }
                break;

                
            case "Rabin":

                for (int i = 2; i < 3; i++) {
                    for (int j = 0; j < subjects.length; j++) {
                        System.out.println("Enter the marks for" + " " + subjects[j] + " " + "of" + " " + students[i]);
                        marks[i][j] = input.nextDouble();
                    }

                }

                if (marks[2][0] < 32 || marks[2][1] < 32 || marks[2][2] < 32 || marks[2][3] < 32 || marks[2][4] < 32) {
                    System.out.println("Fail");
                } else {
                    System.out.println("Pass");
                    for (int i = 2; i < 3; i++) {
                        for (int j = 0; j < subjects.length; j++) {
                            total = total + marks[i][j];
                            percentage[i] = (total / 500) * 100;
                        }
                        System.out.println("The total marks of " + students[i] + ": " + total);
                        System.out.println("The total percentage of " + students[i] + ": " + percentage[i]);
                    }
                }
                break;

            case "Nabin":

                for (int i = 3; i < 4; i++) {
                    for (int j = 0; j < subjects.length; j++) {
                        System.out.println("Enter the marks for" + " " + subjects[j] + " " + "of" + " " + students[i]);
                        marks[i][j] = input.nextDouble();
                    }

                }

                if (marks[3][0] < 32 || marks[3][1] < 32 || marks[3][2] < 32 || marks[3][3] < 32 || marks[3][4] < 32) {
                    System.out.println("Fail");
                } else {
                    System.out.println("Pass");
                    for (int i = 3; i < 4; i++) {
                        for (int j = 0; j < subjects.length; j++) {
                            total = total + marks[i][j];
                            percentage[i] = (total / 500) * 100;
                        }
                        System.out.println("The total marks of " + students[i] + ": " + total);
                        System.out.println("The total percentage of " + students[i] + ": " + percentage[i]);
                    }
                }
                break;

            case "Suraj":

                for (int i = 4; i < 5; i++) {
                    for (int j = 0; j < subjects.length; j++) {
                        System.out.println("Enter the marks for" + " " + subjects[j] + " " + "of" + " " + students[i]);
                        marks[i][j] = input.nextDouble();
                    }

                }

                if (marks[4][0] < 32 || marks[4][1] < 32 || marks[4][2] < 32 || marks[4][3] < 32 || marks[4][4] < 32) {
                    System.out.println("Fail");
                } else {
                    System.out.println("Pass");
                    for (int i = 4; i < 5; i++) {
                        for (int j = 0; j < subjects.length; j++) {
                            total = total + marks[i][j];
                            percentage[i] = (total / 500) * 100;
                        }
                        System.out.println("The total marks of " + students[i] + ": " + total);
                        System.out.println("The total percentage of " + students[i] + ": " + percentage[i]);
                    }
                }
                break;   
            }
        
        
        
        
        
        
    }
}
