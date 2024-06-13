//import java.util.List;
//
//public class NumbersUtils {
//    public static void printReverse(List<Integer> numbers) {
//        for (int i = numbers.size() - 1; i >= 0; i--) {
//            if (i == 0) {
//                System.out.println(numbers.get(i));
//            } else {
//                System.out.print(numbers.get(i) + ", ");
//            }
//        }
//    }
//
//    public static void sumNumbers(List<Integer> numbers) {
//        int sum = 0;
//        for (int i = 0; i < numbers.size(); i++) {
//            sum += numbers.get(i);
//            if (i == numbers.size() - 1) {
//                System.out.print(numbers.get(i) + " = ");
//            } else {
//                System.out.print(numbers.get(i) + " + ");
//            }
//        }
//        System.out.println(sum);
//    }
//
//    public static void largestNumber(List<Integer> numbers) {
//        int largest = 0;
//        for (int i = 0; i < numbers.size(); i++) {
//            int a = numbers.get(i);
//            if (a > largest) {
//                largest = numbers.get(i);
//            }
//        }
//        System.out.println("Największa liczba w liście to " + largest);
//    }
//
//    public static void smallestNumber(List<Integer> numbers) {
//        int smallest = Integer.MAX_VALUE;
//        for (int i = 0; i < numbers.size(); i++) {
//            int a = numbers.get(i);
//            if (a < smallest) {
//                smallest = numbers.get(i);
//            }
//        }
//        System.out.println("Najmniejsza liczba w liście to " + smallest);
//    }
//}
