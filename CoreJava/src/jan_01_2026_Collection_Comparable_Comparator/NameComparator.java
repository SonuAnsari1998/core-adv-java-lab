package jan_01_2026_Collection_Comparable_Comparator;

import module java.base;

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
//Main
