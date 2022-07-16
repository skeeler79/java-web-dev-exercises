package exercises.ChapterThree;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main (String[] args){
        HashMap<String, Double> rosterInfo = new HashMap<String, Double>();
        String studentName;
        Double studentId;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your students (or ENTER to finish):");
//        HashMapPractice.createRoster(rosterInfo);}

//    public static void createRoster(HashMap<String, Double> rosterInfo){
        do {
            System.out.print("Student: ");
            studentName = input.nextLine();

            if (!studentName.equals ("")) {
                System.out.print("Student ID: ");
                studentId = input.nextDouble();
                rosterInfo.put(studentName, studentId);
            }
                input.nextLine();
            } while (!studentName.equals (""));

            input.close();


        System.out.println("Class roster: ");
            for (Map.Entry<String, Double> student:rosterInfo.entrySet()){
                System.out.println(student.getKey() + ", " +student.getValue());
            }

        }
    }
