import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number Conversion Menu:");
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Binary to Decimal");
        System.out.println("3. Binary to Octal");
        System.out.println("4. Octal to Binary");
        System.out.print("Enter your choice (1/2/3/4): ");

        int choice = scanner.nextInt();
        long number;

        switch (choice) {
            case 1:
                System.out.print("Enter a decimal number: ");
                number = scanner.nextLong();
                String binaryResult = decimalToBinary(number);
                System.out.println("Binary: " + binaryResult);
                break;
            case 2:
                System.out.print("Enter a binary number: ");
                scanner.nextLine(); // Consume the newline character
                String binaryInput = scanner.nextLine();
                long decimalResult = binaryToDecimal(binaryInput);
                System.out.println("Decimal: " + decimalResult);
                break;
            case 3:
                System.out.print("Enter a binary number: ");
                scanner.nextLine(); // Consume the newline character
                String binaryInput2 = scanner.nextLine();
                String octalResult = binaryToOctal(binaryInput2);
                System.out.println("Octal: " + octalResult);
                break;
            case 4:
                System.out.print("Enter an octal number: ");
                scanner.nextLine(); // Consume the newline character
                String octalInput = scanner.nextLine();
                String binaryResult2 = octalToBinary(octalInput);
                System.out.println("Binary: " + binaryResult2);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        scanner.close();
    }

    public static String decimalToBinary(long number) {
        return Long.toBinaryString(number);
    }

    public static long binaryToDecimal(String binary) {
        return Long.parseLong(binary, 2);
    }

    public static String binaryToOctal(String binary) {
        long decimal = binaryToDecimal(binary);
        return Long.toOctalString(decimal);
    }

    public static String octalToBinary(String octal) {
        long decimal = Long.parseLong(octal, 8);
        return Long.toBinaryString(decimal);
    }
}
