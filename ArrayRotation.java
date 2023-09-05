package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <rotations ; i++) {
            int firstNum = numbers[0];

            for (int index = 0; index <numbers.length-1 ; index++) {
                numbers[index]=numbers[index+1];
            }
            numbers[numbers.length-1]=firstNum;
        }
        for (int number:numbers) {
            System.out.print(number+" ");
        }
    }
}
//1. ВЗИМАМЕ ПЪРВИЯ ЕЛЕМЕНТ
//2. преместваме всички елементи с 1 -> ляво
//всички индекси от първия до пред последния (не вкл.)
//3. слагаме на последна позиция да е първия взет елемент