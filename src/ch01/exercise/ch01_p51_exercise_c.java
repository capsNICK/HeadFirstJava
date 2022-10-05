package ch01.exercise;

public class ch01_p51_exercise_c {
    public static void main(String[] args) { //код без хотя бы одного метода main работать не будет
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("маленький икс");
            }
        }
    }
}
