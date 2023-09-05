package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();

        while (true){
            String[] command = scanner.nextLine().split(" ");
            if (command[0].equals("end")){
                break;
            }
            if (command[0].equals("decrease")){
                for (int i = 0; i < numbers.length ; i++) {
                    int decreaseNum = numbers[i];
                    numbers[i]= Integer.parseInt(String.valueOf(decreaseNum-1));
                }
            }else {
                String index1 = String.valueOf(Integer.valueOf(command[1]));
                String index2 = String.valueOf(Integer.valueOf(command[2]));

                if (command[0].equals("swap")){
                    String swapIndex = String.valueOf(numbers[Integer.parseInt(String.valueOf(index2))]);
                    numbers[Integer.parseInt(index2)]= numbers[Integer.parseInt(index1)];
                    numbers[Integer.parseInt(index1)]= Integer.parseInt(swapIndex);
                } else if (command[0].equals("multiply")){
                    numbers[Integer.parseInt(index1)]= Integer.parseInt(String.valueOf
                            ((numbers[Integer.parseInt(index1)])*(numbers[Integer.parseInt(index2)])));
                }
            }
        }
        for (int i = 0; i < numbers.length ; i++) {
            if (i== numbers.length-1){
                System.out.println(numbers[i]);
            }else {
                System.out.print(numbers[i]+", ");
            }
        }
    }
}
