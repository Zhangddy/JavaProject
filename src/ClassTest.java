class Person{
    private String name;
    private String gender;
    private int age;

    public Person(String name) {
        this.name = name;
    }
}
class Student extends Person {
    private String id;
    private String cname;
    private double score;

    public Student(String id, String name) {
        super(name);
        this.id = id;
        System.out.println("姓名："+name+" "+"学号："+id);
    }

    public Student(String name, String id, String cname, double score) {
        this(id, name);
        this.cname = cname;
        this.score = score;
    }

    public String display() {
        return "Student{" +
                "id='" + id + '\'' +
                ", cname='" + cname + '\'' +
                ", score=" + score +
                '}';
    }
}
public class ClassTest {
    public static void main(String[] args) {
        Student student = new Student("201706010623","张栋瑜");
    }
}
