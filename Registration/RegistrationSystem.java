package Registration;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistrationSystem {

    private Map<String, Student> students = new HashMap<>();
    private Map<String, Course> courses = new HashMap<>();
    private Scanner scanner = new Scanner(String.valueOf(System.in));
    public static void main(String[] args) {
        RegistrationSystem system = new RegistrationSystem();

        // system.run();
    }
    
   
}
