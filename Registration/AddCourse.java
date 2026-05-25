package Registration;

public class AddCourse {
    private String courseCode;
    private String courseTitle;
    private int courseUnit;
    
    public AddCourse(String courseCode, String courseTitle, int courseUnit) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.courseUnit = courseUnit;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCourseUnit() {
        return courseUnit;
    }

    public void setCourseUnit(int courseUnit) {
        this.courseUnit = courseUnit;
    }

    public String tString(){
        return "AddCourse [code= "+ this.courseCode +", title= "+ this.courseTitle +", unit= "+ this.courseUnit +"]";
    }
}
