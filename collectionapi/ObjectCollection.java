import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Student {
    private int id;
    private String name;
    private String gender;

    public Student(){

    }
    public Student(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", gender=" + gender + "]";
    }

    

    
}

public class ObjectCollection {
    public static void main(String[] args) {
        //Student std = new Student(34, "Ade", "Male");
        List<Student> stds = new ArrayList<Student>();

        stds.add(new Student(1, "Emmanuel", "Male"));
        stds.add(new Student(2, "John", "Ambidextrous"));
        stds.add(new Student(3, "Honour", "Male"));

       // System.out.println(stds.get(1).toString());

        // for (int i=0; i<3; i++){
        //     System.out.println(stds.get(i).toString());
        // }
        Queue<Integer> q = new LinkedList<>();
        for (Student s: stds){
            System.out.println(s.toString());
        }
    }
 
}
