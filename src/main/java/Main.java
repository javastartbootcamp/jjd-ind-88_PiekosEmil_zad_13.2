import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {
        int number = 0;
        while (number >= 0) {
            number = scanner.nextInt();
            if (number >= 0) {
                numbers.add(number);
            }
        }
        printReverse(numbers);
        sumNumbers(numbers);
        largestNumber(numbers);
        smallestNumber(numbers);
    }

    public void printReverse(List<Integer> numbers) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numbers.get(i));
            } else {
                System.out.print(numbers.get(i) + ", ");
            }
        }
    }

    public void sumNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            if (i == numbers.size() - 1) {
                System.out.print(numbers.get(i) + " = ");
            } else {
                System.out.print(numbers.get(i) + " + ");
            }
        }
        System.out.println(sum);
    }

    public void largestNumber(List<Integer> numbers) {
        int largest = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int a = numbers.get(i);
            if (a > largest) {
                largest = numbers.get(i);
            }
        }
        System.out.println("Największa liczba w liście to " + largest);
    }

    public void smallestNumber(List<Integer> numbers) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.size(); i++) {
            int a = numbers.get(i);
            if (a < smallest) {
                smallest = numbers.get(i);
            }
        }
        System.out.println("Najmniejsza liczba w liście to " + smallest);
    }
}
