package com.OOPS.StaticExamples;

public class Message {
    public static void main(String[] args) {

    }
    public  static  void message()
    {
        System.out.println("this course is awesome");
    }

    public static class Main {
        String name;
        public static void main(String[] args) {
            // 5 roll num
        int[] numbers =new int[5];
        // 5 names
          String[] name = new String[5];
         // data  of 5 student
            int[] rno = new int[5];
            String[] names = new String[5];
            float[] marks = new float[5];
            Student[] student = new Student[5];
            //Student kunal;
           // System.out.println(Arrays.toString(student));
          Student kunal=new Student();
    //        System.out.println(kunal.rno);
           // kunal.marks=98.0f;
            System.out.println(kunal.rno);
            System.out.println(kunal.name);
            System.out.println(kunal.marks);
            Student rahul=new Student();
          //  System.out.println(gre);
            kunal.greeting();
        }


        //create class
       static class Student {
            int rno;
            String name;
            float marks;
            Student (){
            this.rno=13;
            this.name="dk";
            this.marks=78.8f;
            }
           public  void greeting()
            {
                System.out.println("Hello! my name is "+ this.name);
            }
        }
    }
}
