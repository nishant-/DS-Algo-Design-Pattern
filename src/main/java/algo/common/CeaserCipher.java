/*
package common;

import java.util.stream.Stream;

public class CeaserCipher {

    private static final String ALPHABET = Stream.iterate('A' , x -> (char)(x + 1))
            .limit(26)
            .map(c -> c.toString())
            .reduce("", (u , v) -> u + v);

    public String encrypt(String s, int offset) {

        String cipherText = "";
        for(int i = 0 ; i < s.length() ; i++) {
            char encryptedVal = ' ';
            if(s.charAt(i) != ' ') {
                int alphabetPos = ALPHABET.indexOf(i);
                int keyVal = (alphabetPos + offset) % 26;
                encryptedVal = ALPHABET.charAt(keyVal);
            }
            cipherText = cipherText + encryptedVal;
        }
        return  cipherText;
    }

    public String decrypt(String s, int offset) {

        String plainText = "";
        for(int i = 0 ; i < s.length() ; i++) {
            char decryptedVal = ' ';
            if(s.charAt(i) != ' ') {
                int alphabetPos = ALPHABET.indexOf(i);
                int keyVal = (alphabetPos - offset) % 26;
                if(keyVal < 0) {
                    keyVal = keyVal + ALPHABET.length();
                }
                decryptedVal = ALPHABET.charAt(keyVal);
            }
            plainText = plainText + decryptedVal;
        }
        return plainText;
    }
}
*/
