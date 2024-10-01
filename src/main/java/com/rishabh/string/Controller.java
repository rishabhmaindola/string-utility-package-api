package com.rishabh.string;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class Controller {

    @GetMapping("/reverse")
    public String reverse(@RequestParam String text) {
        return StringUtility.reverse(text);
    }

    @GetMapping("/isPalindrome")
    public Boolean isPalindrome(@RequestParam String text) {
        return StringUtility.isPalindrome(text);
    }

    @GetMapping("/countCharacters")
    public Map<Character, Integer> countCharacters(@RequestParam String text) {
        return StringUtility.countCharacter(text);
    }

    @GetMapping("/checkRotation")
    public boolean checkRotation(@RequestParam String text1, @RequestParam String text2) {
        return StringUtility.checkRotation(text1, text2);
    }

    @GetMapping("/toUpperCase")
    public String toUpperCase(@RequestParam String text) {
        return StringUtility.toUpperCase(text);
    }

    @GetMapping("/toLowerCase")
    public String toLowerCase(@RequestParam String text) {
        return StringUtility.toLowerCase(text);
    }

    @GetMapping("/isAnagram")
    public boolean isAnagram(@RequestParam String text1, @RequestParam String text2) {
        return StringUtility.isAnagram(text1, text2);
    }

    @GetMapping("/randomString")
    public String randomString(@RequestParam int length) {
        return StringUtility.randomString(length);
    }

    @GetMapping("/toAlphaNumeric")
    public String toAlphaNumeric(@RequestParam String text) {
        return StringUtility.toAlphaNumeric(text);
    }

    @GetMapping("/substringOccurrences")
    public int substringOccurrences(@RequestParam String text, @RequestParam String sub) {
        return StringUtility.substringOccurrences(text, sub);
    }

    @GetMapping("/capitalizeFirst")
    public String capitalizeFirst(@RequestParam String text) {
        return StringUtility.capitalizeFirst(text);
    }

    @GetMapping("/stringLength")
    public int stringLength(@RequestParam String text) {
        return StringUtility.stringLength(text);
    }

    @GetMapping("/camelToSnake")
    public String camelToSnake(@RequestParam String text) {
        return StringUtility.camelToSnake(text);
    }

    @GetMapping("/snakeToCamel")
    public String snakeToCamel(@RequestParam String text) {
        return StringUtility.snakeToCamel(text);
    }

    @GetMapping("/slugGenerator")
    public String slugGenerator(@RequestParam String text) {
        return StringUtility.slugGenerator(text);
    }

    @GetMapping("/isValidEmail")
    public boolean isValidEmail(@RequestParam String text) {
        return StringUtility.isValidEmail(text);
    }

    @GetMapping("/isValidURL")
    public boolean isValidURL(@RequestParam String text) {
        return StringUtility.isValidURL(text);
    }

    @GetMapping("/isStrongPassword")
    public boolean isStrongPassword(@RequestParam String text) {
        return StringUtility.isStrongPassword(text);
    }

    @GetMapping("/emojiRemoval")
    public String emojiRemoval(@RequestParam String text) {
        return StringUtility.emojiRemoval(text);
    }

    @GetMapping("/hammingDistance")
    public int hammingDistance(@RequestParam String text1, @RequestParam String text2) {
        return StringUtility.hammingDistance(text1, text2);
    }

    @GetMapping("/base64Encode")
    public String base64Encode(@RequestParam String text) {
        return StringUtility.base64Encode(text);
    }

    @GetMapping("/base64Decode")
    public String base64Decode(@RequestParam String text) {
        return StringUtility.base64Decode(text);
    }

    @GetMapping("/sentenceTokenizer")
    public List<String> sentenceTokenizer(@RequestParam String text) {
        return StringUtility.sentenceTokenizer(text);
    }

    @GetMapping("/wordTokenizer")
    public List<String> wordTokenizer(@RequestParam String text) {
        return StringUtility.wordTokenizer(text);
    }
}
