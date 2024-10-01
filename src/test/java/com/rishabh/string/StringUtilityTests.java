package com.rishabh.string;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilityTests {

    @AfterEach
    public void afterEach() {
        System.out.println("Test passed!");
    }

    @Test
    public void testReverse() {
        assertEquals("olleh", StringUtility.reverse("hello"));
        assertEquals("54321", StringUtility.reverse("12345"));
        assertEquals("desrever si siht", StringUtility.reverse("this is reversed"));
        assertEquals("", StringUtility.reverse(""));
        assertNull(StringUtility.reverse(null));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(StringUtility.isPalindrome("racecar"));
        assertFalse(StringUtility.isPalindrome("hello"));
        assertTrue(StringUtility.isPalindrome("A man a plan a canal Panama"));
        assertFalse(StringUtility.isPalindrome("12345"));
        assertFalse(StringUtility.isPalindrome(null));
        assertTrue(StringUtility.isPalindrome(""));
    }

    @Test
    public void countCharacters(){

    }

 @Test
    public void checkRotation(){

    }

 @Test
    public void toUppercase(){

    }

 @Test
    public void toLowercase(){

    }

 @Test
    public void isAnagram(){

    }

 @Test
    public void randomString(){

    }

 @Test
    public void isAlphanumeric(){

    }

 @Test
    public void substringOccurences(){

    }

 @Test
    public void capitalizedFirst(){

    }

 @Test
    public void stringLength(){

    }

 @Test
    public void camelToSnake(){

    }

 @Test
    public void snakeToCamel(){

    }

 @Test
    public void slugGenerator(){

    }

 @Test
    public void isValidEmail(){

    }

 @Test
    public void isValidURL(){

    }

@Test
    public void isStrongPassword(){

    }

@Test
    public void emojiRemoval(){

    }

@Test
    public void hammingDistance(){

    }

@Test
    public void base64Encode(){

    }

@Test
    public void base64Decode(){

    }

@Test
    public void sentenceTokenizer(){

    }

@Test
    public void wordTokenizer(){

    }

}
