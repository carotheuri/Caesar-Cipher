package modules;

import java.util.Arrays;
import java.util.List;


class Encrypt {
    private int key;
    private String word;
    private int maxNum = 26;
    private int minNum = 0;
    public Encrypt(int shiftKey, String wordToDecrypt) {
        this.word = wordToDecrypt;
        this.key = shiftKey;
    }
    public String encryptSentence(){
        // Create a hashmap that stores alphabets letter number equivalent
        String alphabetArr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int newShiftedKey;
        System.out.println(alphabetArr.indexOf('H'));
        System.out.println(alphabetArr.charAt(7));
        char[] letters = word.toCharArray();
        String newWord = "";
        for(char letter: letters){
            newShiftedKey = alphabetArr.indexOf(letter) - key;
            if(newShiftedKey < 0){
                newShiftedKey = maxNum + newShiftedKey;
                word = word.replace(letter,alphabetArr.charAt(newShiftedKey));
            }
            else{
                System.out.println("new position");
                System.out.println(alphabetArr.charAt(newShiftedKey));
                newWord = newWord + alphabetArr.charAt(newShiftedKey);
                word = word.replace(letter, alphabetArr.charAt(newShiftedKey));
            }
        }
        return newWord;
    }
}
