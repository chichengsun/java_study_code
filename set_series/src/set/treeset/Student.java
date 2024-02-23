package set.treeset;

import java.util.Objects;

class Student implements Comparable<Student> {
    private String name;
    private int age;
    static int count = 0;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name: " + this.name + ", " + "age: " + this.age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Student o) {
        Student.count ++;
//        System.out.println("this: " + this);
//        System.out.println("   o: " + o);
        int sub = this.getAge() - o.getAge();
        sub = sub == 0 ? this.getName().compareTo(o.getName()) : sub;
        return sub;
    }
}
