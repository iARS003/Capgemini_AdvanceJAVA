package org.example;

import org.example.dao.StudentDAO;
import org.example.dto.StudentDTO;
import org.example.entity.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while(true){
            System.out.println("\n1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    StudentDTO dto = new StudentDTO(name,email);
                    Student student = new Student(dto.getName(), dto.getEmail());

                    dao.save(student);
                    System.out.println("Student Saved!");
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    Long id = sc.nextLong();
                    Student s = dao.findById(id);
                    if(s != null)
                        System.out.println("Name: "+s.getName()+" Email: "+s.getEmail());
                    else
                        System.out.println("Not Found");
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    Long delId = sc.nextLong();
                    dao.delete(delId);
                    System.out.println("Deleted!");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}