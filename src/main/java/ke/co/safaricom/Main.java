package ke.co.safaricom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your message: ");
        String yourMessage = input.nextLine();
        System.out.println("Enter your key: ");
        int yourKey = input.nextInt();

        System.out.println("(E)ncode or (D)ecode?");
        char choice = input.next().charAt(0);

        switch (choice) {
            case 'E':
            case 'e':
                Encode random = new Encode(yourMessage, yourKey);
                System.out.println("your encryption is: " + random.encrypt(yourMessage, yourKey));
                break;
            case 'D':
            case 'd':
                Decode another = new Decode("", ' ');
                System.out.println("your decryption is: " + another.decrypt(yourMessage, yourKey));

        }
    }
}

