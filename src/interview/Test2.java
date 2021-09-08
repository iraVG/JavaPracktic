package interview;

// Write a program that prints the numbers from 1 to 100 and for multiples of '3' print "Fizz" instead of the number and for the multiples of '5' print "Buzz".
//
// 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14,
// Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26,
// Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, ...
public class Test2 {
    public static void main(String args[]) {
        // TODO
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 1; i < 100; i++) {
//            if (i > 0) {
//                sb.append(",");
//            }
//            if (i % 3 == 0) {
//                sb.append("Fizz");
//
//            }
//            if (i % 5 == 0)
//                sb.append(" Buzz");
//            else{
//                sb.append(i);}
//            sb.toString();
//
//        }
        for (int i = 1; i <= 100; i++) {
            if (i > 1) {
                System.out.print(", ");
            }
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i);
            } else if (i % 3 == 0 && i % 5 != 0) {
                System.out.print("Fizz");
            } else if (i % 3 != 0 && i % 5 == 0) {
                System.out.print("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("Fizz Buzz");
            }


        }

    }
}

