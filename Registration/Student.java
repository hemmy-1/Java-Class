
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Student implements Serializable{
    private String name;
    private int studentId;
    private String depaartment;
    private Set<Course> registerCourses;


    public Student(int studentId, String name, String depaartment) {
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
    
    public Set<Course> getRegisterCourses() {
        return registerCourses;
    }


    public void registerCourse(Course course) throws Exception{
        if (registerCourses.contains(course)) {
            throw new Exception("Error: Student is already registered for " + course.getCourseCode());
        }
        registerCourses.add(course);

    
    }



    @Override
    public String toString(){
        return String.format("ID: %s | Name: %s | Dept: %s", studentId, name, depaartment);
    }

}
