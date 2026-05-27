package Registration;

public class Course {
    private String courseCode;
    private String courseTitle;
    private int courseUnit;
    
    public Course( String courseCode, String courseTitle, int courseUnit) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.courseUnit = courseUnit;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public int getCourseUnit() {
        return courseUnit;
    }

   



    @Override
    public String toString(){
        return "code= " + this.courseCode + ", title= "+ this.courseTitle +", unit= "+ this.courseUnit ;
    }
}
