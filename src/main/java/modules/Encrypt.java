package modules;

import java.util.HashMap;

class Encrypt {
    private int key;
    private String word;
    public Encrypt(int shiftKey, String wordToDecrypt) {
        HashMap<String,Integer> hmp = new HashMap<String,Integer>();
        hmp.put("A",1);
        hmp.put("B",2);
        hmp.put("C",3);
        hmp.put("D",4);
        hmp.put("E",5);
        hmp.put("F",6);
    }
    public static String encryptSentence(){
        String newWord = "QEB";
        return newWord;
    }
}
