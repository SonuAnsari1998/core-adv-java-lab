package jan_01_2026_Collection_Comparable_Comparator;

class Student implements Comparable<Student> {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Comparable logic (natural ordering)
    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.marks, s.marks);
    }
}
 

