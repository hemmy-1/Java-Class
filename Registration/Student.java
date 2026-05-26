package Registration;
import java.util.HashSet;
import java.util.Set;

public class Student {
    private String name;
    private int studentId;
    private String depaartment;
    private Set<Course> registerCourses;


    public Student(String name, int studentId, String depaartment, Set<Course> registerCourses) {
        this.name = name;
        this.studentId = studentId;
        this.depaartment = depaartment;
        this.registerCourses = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDepaartment() {
        return depaartment;
    }

    public void setDepaartment(String depaartment) {
        this.depaartment = depaartment;
    }


    public void registerCourse(Course course) throws Exception{
        if (course == null) {
            throw new IllegalAccessException("Course can not be empty");
        }

        if (!registerCourses.add(course)){
            throw new Exception("Duplicate registration error")
        }
    }



    @Override
    public String toString(){
        return "name=" + this.name + ", id= " + this.studentId +", department= "+ this.depaartment ;
    }


}
