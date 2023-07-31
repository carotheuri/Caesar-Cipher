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
}
