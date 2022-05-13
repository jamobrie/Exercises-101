package sort.javacomparator;

import sort.javacomparable.Student;

import java.util.Comparator;

//TODO -> Why is static not allowed here?
public class SortByID implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return a.studentId - b.studentId;
    }

    //Collection.sort() works by calling the underlying Arrays.sort() method, while the sorting itself uses Insertion Sort for arrays shorter than 47, and Quicksort for the rest.
    //
    //It's based on a specific two-pivot implementation of Quicksort which ensures it avoids most of the typical causes of degradation into quadratic performance, according to the JDK10 documentation.

}