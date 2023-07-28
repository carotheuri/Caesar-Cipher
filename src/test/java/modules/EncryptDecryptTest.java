package modules;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptDecryptTest {
    @Test
    public void EncryptTestBehaviour() {
        Encrypt word = new Encrypt(3,"THE");
        assertEquals("QEB",word.encryptSentence());
    }
}