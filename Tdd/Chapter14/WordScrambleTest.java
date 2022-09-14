package Chapter14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordScrambleTest {

    @BeforeEach
    void setUp() {}
    @Test
    public void generateThreeLetterCharacterCombinationTest(){
        String word = "bathe";
        var combinations  = WordScramble.generateThreeLetterCharacterCombinations(word);
        for(String wrd : combinations){
           // assertArrayEquals(3, wrd.length());
           // assertArrayEquals(wrd.matches("\\w"));
        }
    }
}