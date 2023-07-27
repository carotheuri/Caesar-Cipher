package modules;

import java.util.HashMap;

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
        char[] alphabetArr = {'A','B','C','D','E','F'};
        HashMap<Integer,String> valuehmp = new HashMap<Integer,String>();
        valuehmp.put(0,"A");
        valuehmp.put(1,"B");
        valuehmp.put(2,"C");
        valuehmp.put(3,"D");
        valuehmp.put(4,"E");
        valuehmp.put(5,"F");
        //String newWord = "QEB";
        char[] letters = word.toCharArray();
        String newWord = "";
        for(char letter: letters){
            int newShiftedKey = alphabetArr[letter] + key;
            newWord = String.format(valuehmp.ge);
        }
        return newWord;
    }
}
