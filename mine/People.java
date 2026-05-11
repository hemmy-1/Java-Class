package mine;

public class People {


    int age;
    int score;
    String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        if (score < 0 || score > 100){
            System.out.print("Invalid score");
        }
        this.score = score;
    }



    public void displayInformation(){
        System.out.print("Name" + getName());
        System.out.print("Age" + getAge());
        System.out.print("Score" + getScore());
    }

    
}





