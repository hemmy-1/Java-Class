

public class Student extends Person {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0 || score > 100){
            System.out.println("Invalid score");
            return;
        }
        this.score = score;
    }

    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Score: " + getScore());

    }

    public void checkResult(){
        System.out.println("Result: " + (score>=50? "Pass" : "Fail"));
    }
    
}
