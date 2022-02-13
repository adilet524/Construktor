package com.company;

public class Main {

    public static void main(String[] args) {

//        Student student = new Student("Adilet" , (byte) 17);
//        System.out.println(student.getName() + " " + student.getAge());




//
//        Rectangle rectangle = new Rectangle((byte) 4, (byte) 14, (byte) 4, (byte) 14);
//        System.out.println(rectangle.sideA + " " + rectangle.sideB + " " + rectangle.sideC + " " + rectangle.sideD);




//        Course course = new Course("Java", (byte) 5, "Мухаммед Алланов", "05.01.2022");
//        Student student = new Student("Adilet", "Zhumakadyrov", (byte) -17, "11.14.2004");
//
//        System.out.println("\nName of course: " + course.getName() + "\n" + "Number of course: " +
//                course.getNumber() + "\n" + "Full name of teacher: " + course.getFullName() + "\n" +
//                "Date of start: " + course.getStartDate() + "\n\n");
//
//        System.out.println("Name: " + student.getName() + "\n" + "Surname: " + student.getSurname() + "\n" +
//                "Age: " + student.getAge() + "\n" + "Date of birth: " + student.getDateOfBirth() + "\n\n");



        Class sClass = new Class(2025, "Hello world!", new int[] {12, 21, 34, 56});

        System.out.print(sClass.getNumber() + " " + sClass.getWord()+ " "); Class.allInfo();



    }
}
