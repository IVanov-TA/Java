import java.util.Scanner;


public class Genereta3word {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
           
            String input = sc.nextLine();
           
            System.out.println(generateWords(input));

    }

    private static String generateWords(String input) {

            String result = "";
            char[] inputElements = input.toCharArray();
            for (int i = 0; i < inputElements.length; i++) {
                    for (int j = 0; j < inputElements.length; j++) {
                            for (int k = 0; k < inputElements.length; k++) {
                                    result += inputElements[i] + "" + inputElements[j] + "" + inputElements[k] + " ";
                            }
                    }
            }
            return result;
    }

}
