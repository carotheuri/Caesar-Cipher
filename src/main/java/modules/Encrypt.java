package modules;

import java.util.Arrays;
import java.util.List;


class Encrypt {
    private int key;
    private String word;
    private int maxNum = 26;
    private int minNum = 0;
    public Encrypt(int shiftKey, String wordToDecrypt) {
        this.word = wordToDecrypt.toUpperCase();
        this.key = shiftKey;
    }
    public String encryptSentence(){
        // Create a hashmap that stores alphabets letter number equivalent
        String alphabetArr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int newShiftedKey;
        char[] letters = word.toCharArray();
        String newWord = "";
        for(Character letter: letters){
            if(Character.isLetter(letter)){
//                newShiftedKey = ((alphabetArr.indexOf(letter) - key));
                newShiftedKey = ((alphabetArr.indexOf(letter) - key + maxNum) % 26);
                newWord = newWord + alphabetArr.charAt(newShiftedKey);
            }
            else{
                newWord = newWord + letter;
            }
        }

        return newWord;
    }
}
