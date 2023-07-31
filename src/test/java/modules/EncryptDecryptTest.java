package modules;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class EncryptDecryptTest {
    @Test
    public void EncryptTestBehaviour() {
        Encrypt word = new Encrypt(3,"THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD",word.encryptSentence().toUpperCase());
    }
    @Test
    public void DecryptTestBehaviour() {
        Decrypt word = new Decrypt(3,"QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD");
        assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG",word.decryptSentence().toUpperCase());
    }
}