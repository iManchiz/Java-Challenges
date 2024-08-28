import java.util.Scanner;

public class Challenge7_InvertedString {
    public static void main(String[] args) {
        
        System.out.print("Write text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        reversed(text);

    }

    public static void reversed(String text){

        char[] arrayText = text.toCharArray();
        int counter = 1;
        for (int i = 0; i < arrayText.length; i++){
            System.out.print(arrayText[arrayText.length-counter]);
            counter++;
        }
    }

}
