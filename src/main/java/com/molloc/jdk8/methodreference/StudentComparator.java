package com.molloc.jdk8.methodreference;

/**
 * @author yanleichang
 * @date 2018/1/21
 */
public class StudentComparator {

    public int comparaStudentByScore(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }

    public int comparaStudentByName(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}
