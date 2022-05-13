package sort.javacomparable;

import sort.javacomparator.SortByID;

import java.util.Arrays;

public class Student implements Comparable<Student> {
    public int studentId;
    int studentGeneration;
//
//    private void setStudentId(int studentId){
//        this.studentId = studentId;
//    }
//
//    private void setStudentGeneration(int studentGeneration){
//        this.studentGeneration = studentGeneration;
//    }

    public Student(int studentId, int studentGeneration) {
        this.studentId = studentId;
        this.studentGeneration = studentGeneration;
    }

    @Override
    public String toString() {
        return studentId + "/" + studentGeneration % 100;
    }

    @Override
    public int compareTo(Student student) {
        int result = this.studentGeneration - student.studentGeneration;
        if (result != 0)
            return result;
        else
            return this.studentId - student.studentId;
    }


    //TODO Fix
    public static void main(String[] args) {
        //Student[] a = new SortingAlgorithms.Student[5];
        Student[] a = null;
        a[0] = new Student(75, 2016);
        a[1] = new Student(52, 2019);
        a[2] = new Student(57, 2016);
        a[3] = new Student(220, 2014);
        a[4] = new Student(16, 2018);

        Arrays.sort(a);

        //Alternative way to sort!!! ---> Utilizes comparator interface
        Arrays.sort(a, new SortByID());


        System.out.println(Arrays.toString(a));
    }

    //TODO TODO TODO -> Work needed to figure out how this builder works! And randomly assign values for Student
    public class SortingAlgorithms{

    }

}