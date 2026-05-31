

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistrationSystem {

    private Map<Integer, Student> students = new HashMap<>();

    private Map<String, Course> courses = new HashMap<>();
    
  

    public Student getStudent(int id) { return students.get(id); }
    public Course getCourse(String code) { return courses.get(code); }

    public Collection<Student> getAllStudents() { return students.values(); }
    public Collection<Course> getAllCourses() { return courses.values(); }

    public void addStudent(Student s){
        students.put(s.getStudentId(), s);
    }

    public void addCourse(Course c){
        courses.put(c.getCourseCode(), c);
    }

   
}
