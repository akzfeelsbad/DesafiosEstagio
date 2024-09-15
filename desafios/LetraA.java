import java.util.Scanner;

public class LetraA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma frase: ");
        String inputString = scanner.nextLine();
        scanner.close();


        int count = countLetterA(inputString);


        System.out.println("A letra 'a' ocorre " + count + " vezes.");
    }


    public static int countLetterA(String str) {
        int count = 0;


        String lowerCaseStr = str.toLowerCase();

        for (char ch : lowerCaseStr.toCharArray()) {
            if (ch == 'a') {
                count++;
            }
        }

        return count;
    }
}
