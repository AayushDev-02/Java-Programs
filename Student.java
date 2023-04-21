//package com.company;
//
//class Book{
//    String title;
//    String author;
//
//    public void display(){
//        System.out.println("Display Book");
//    }
//
//    //constructor
//    Book (String a, String b){
//        this.title = a;
//        this.author = b;
//    }
//}
//
//
//class EnggStudent extends Student{
//    String branch;
//
//    public void display3(){
//        System.out.println("Branch Name");
//    }
//
//    EnggStudent(String a, String b, String c){
//        super(a,b);
//        this.branch = c;
//    }
//}
//
//class ArtsStudent extends Student{
//    String subject;
//    public void display4(){
//        System.out.println("Subect");
//    }
//
//    ArtsStudent(String a, String b, String c){
//        super(a,b);
//        this.subject = c;
//    }
//}
//
//class B {
//    public static void main(String[] args) {
//        Student a = new Student("Aaysuh", "books");
//        a.display2();
//        EnggStudent b = new EnggStudent("Aayush","Yadav","ravi");
//        b.display3();
//        ArtsStudent c = new ArtsStudent("Aayush","Yadav","ravi");
//        c.display4();
//    }
//}
//
//class Student{
//    String name;
//    String email;
//
//    public void ReadData(){
//        System.out.println("Read Books");
//    }
//
//    Student(String c, String d){
//        this.name = c;
//        this.email = d;
//    }
//
//    Book b = new Book("a","b");     // instance of book obj
//    public void display2(){
//        System.out.println(this.name + " read " + b.title);
//    }
//}