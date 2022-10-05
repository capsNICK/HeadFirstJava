package ch01.exercise;

//решение задачи A
public class ch01_p51_exercise_a {
    public static void main(String[] args) {
        int x = 1; //при данном значении x без ++ выводиться ничего не будет
        while (x < 10) {
            x++; // +1 к значению переменной x
            if (x > 3) {
                System.out.println("большой икс");
            }

        }
    }
}