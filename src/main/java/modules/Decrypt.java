package modules;

class Decrypt {
    private int key;
    private String word;
    private int maxNum = 26;
    private int minNum = 0;
    public Decrypt(int shiftKey, String wordToDecrypt) {
        this.word = wordToDecrypt;
        this.key = shiftKey;
    }
    public String decryptSentence(){
        // Create a hashmap that stores alphabets letter number equivalent
        String alphabetArr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int newShiftedKey;
        char[] letters = word.toCharArray();
        String newWord = "";
        for(Character letter: letters){
            if(Character.isLetter(letter)){
//                newShiftedKey = ((alphabetArr.indexOf(letter) - key));
                newShiftedKey = ((alphabetArr.indexOf(letter) + key) % 26);
                if(newShiftedKey > 25){
                    newShiftedKey = newShiftedKey - maxNum;
                }
                newWord = newWord + alphabetArr.charAt(newShiftedKey);
            }
            else{
                newWord = newWord + letter;
            }
        }

        return newWord;
    }
}
