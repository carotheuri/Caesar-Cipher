package modules;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean programRunning = true;
        String output = "";
        while(programRunning){
            System.out.println("What would you like to do?. To encrypt put 1 to decrypt put 2. To exit type exit.");
            String navigationChosen = bufferedReader.readLine();

            if(navigationChosen.equals("1")){
                System.out.println("Type the word you would like to encrypt");
                String wordToEncrypt = bufferedReader.readLine();
                Encrypt word = new Encrypt(3,wordToEncrypt);
                output = String.format("The encrypted word is: %s", word.encryptSentence());
                System.out.println(output);
            }
            else if(navigationChosen.equals("2")) {
                System.out.println("Type the word you would like to decrypt");
                String wordToDecrypt = bufferedReader.readLine();
                Decrypt word = new Decrypt(3, wordToDecrypt);
                output = String.format("The decrypted word is: %s", word.decryptSentence());
                System.out.println(output);
            }
            else if (navigationChosen.equals("exit")) {
                programRunning = false;
            }
            else{
                System.out.println("I cannot understand your input");
            }
        }


    }
}