package com.aniketh;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        // Nested switch cases means you've switch case under a switch case.
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Aniketh paul");
            case 2 -> System.out.println("Sumi Paul");
            case 3 -> {
                System.out.println("Employee number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department Entered");
                }
            }
            default -> System.out.println("Enter correct employee ID");
        }
        // Better way to write switch statements, and it's clearer than the older switch syntax.

    }
}
