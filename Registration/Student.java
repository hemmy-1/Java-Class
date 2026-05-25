package Registration;

public class Student {
    private String name;
    private int studentId;
    private String depaartment;

    public Student(String name, int studentId, String department){
        this.name = name;
        this.studentId = studentId;
        this.depaartment = department;
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

    public String toString(){
        return "Student [name=" + this.name + ", id= " + this.studentId +", department= "+ this.depaartment +" ]";
    }
}
