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
        String alphabetArr = "ABCDEF";
        System.out.println(alphabetArr.indexOf('A'));
        System.out.println(alphabetArr.charAt(4));
        char[] letters = word.toCharArray();
        for(char letter: letters){
            int newShiftedKey = alphabetArr.indexOf(letter) - key;
            if(newShiftedKey < 0){
                newShiftedKey = maxNum + newShiftedKey;
                word = word.replace(letter,alphabetArr.charAt(newShiftedKey));
            }
            word = word.replace(letter, alphabetArr.charAt(newShiftedKey));
        }
        return word;
    }
}
