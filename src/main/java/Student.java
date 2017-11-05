/**
 * Created by StasMaster on 30.10.17.
 */
public class Student {


    private int id = 0;
    private int age;
    private String name;
    private static int numOfStudents = 0;

    public Student(int age,String name) {
        this.age = age;
        this.name = name;
        this.id = numOfStudents;
        numOfStudents++;

    }

    public Student(Student stud) {
        this.id = stud.id;
        this.age = stud.age;
        this.name = stud.name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
