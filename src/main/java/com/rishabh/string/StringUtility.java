package com.rishabh.string;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtility {

    public static String reverse(String text){
        if (text == null) {
            return null;
        }
        StringBuilder res = new StringBuilder();
        int i = text.length() - 1;
        while (i >= 0) {
            res.append(text.charAt(i));
            i--;
        }
        return res.toString();
    }

    public static Boolean isPalindrome(String text){
        if (text == null) {
            return false;
        }
        String normalized = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int j = normalized.length() - 1;
        int i = 0;
         while (i < j) {
             if (normalized.charAt(i) != normalized.charAt(j)) {
                 return false;
             } else {
                 i++;
                 j--;
             }
         }
         return true;
    }

    public static Map<Character, Integer> countCharacter(String text) {
        Map<Character, Integer> count = new HashMap<>();
        if (text != null) {
            for (char ch : text.toCharArray()) {
                count.put(ch, count.getOrDefault(ch, 0) + 1);
            }
        }
        return count;
    }

    public static boolean checkRotation(String text1, String text2) {
        if (text1 == null || text2 == null) {
            return false;
        }
        String temp = text1 + text1;
        return temp.contains(text2);
    }

    public static String toUpperCase(String text) {
        if (text == null) {
            return null;
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (Character.isLowerCase(currentChar)) {
                res.append(Character.toUpperCase(currentChar));
            } else {
                res.append(currentChar);
            }
        }
        return res.toString();
    }

    public static String toLowerCase(String text) {
        if (text == null) {
            return null;
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                res.append(Character.toLowerCase(currentChar));
            } else {
                res.append(currentChar);
            }
        }
        return res.toString();
    }

    public static boolean isAnagram(String text1, String text2) {
        if (text1 == null || text2 == null || text1.length() != text2.length()) {
            return false;
        }
        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static String randomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * chars.length());
            sb.append(chars.charAt(index));
        }
        return sb.toString();
    }

    public static String toAlphaNumeric(String text) {
        if (text == null) {
            return null;
        }
        return text.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static int substringOccurrences(String text, String sub) {
        if (text == null || sub == null || sub.isEmpty()) {
            return 0;
        }
        int count = 0;
        int index = text.indexOf(sub);
        while (index != -1) {
            count++;
            index = text.indexOf(sub, index + sub.length());
        }
        return count;
    }

    public static String capitalizeFirst(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        String[] words = text.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        return result.toString().trim();
    }

    public static int stringLength(String text) {
        return text == null ? 0 : text.length();
    }

    public static String camelToSnake(String text) {
        StringBuilder res = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                res.append("_");
                res.append(Character.toLowerCase(ch));
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }

    public static String snakeToCamel(String text) {
        StringBuilder res = new StringBuilder();
        boolean toUpperCase = false;

        for (char ch : text.toCharArray()) {
            if (ch == '_') {
                toUpperCase = true;
            } else {
                if (toUpperCase) {
                    res.append(Character.toUpperCase(ch));
                    toUpperCase = false;
                } else {
                    res.append(ch);
                }
            }
        }
        return res.toString();
    }

    public static String slugGenerator(String text){
        StringBuilder res = new StringBuilder();
        for(char ch : text.toCharArray()){
            if(Character.isWhitespace(ch)){
                res.append("-");
            } else if(Character.isLetterOrDigit(ch)){
                res.append(Character.toLowerCase(ch));
            }
        }
        return res.toString();
    }

    public static boolean isValidEmail(String text){
        String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

    public static boolean isValidURL(String text){
        String URL_PATTERN = "^(https?|ftp|file)://[a-zA-Z0-9.-]+(:[0-9]{1,5})?(/.*)?$";
        Pattern pattern = Pattern.compile(URL_PATTERN);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }


    public static boolean isStrongPassword(String text){
        String STRONG_PATTERN =  "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(STRONG_PATTERN);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

    public static String emojiRemoval(String text){
        String EMOJI_PATTER = "[\\p{So}\\p{C}]";
        return text.replaceAll(EMOJI_PATTER,"");
    }

    public static int hammingDistance(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return 0;
        }
        int distance = 0;
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }

    public static String base64Encode(String text){
        return Base64.getEncoder().encodeToString(text.getBytes());
    }

    public static String base64Decode(String text){
        byte[] decodedBytes = Base64.getDecoder().decode(text);
        return new String(decodedBytes);
    }

    public static List<String> sentenceTokenizer(String text) {
        List<String> sentences = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (j < text.length()) {
            if (text.charAt(j) == '.') {
                sentences.add(text.substring(i, j + 1).trim());
                i = j + 1;
            }
            j++;
        }
        if (i < text.length()) {
            sentences.add(text.substring(i).trim());
        }
        return sentences;
    }

    public static List<String> wordTokenizer(String text) {
        List<String> sentencesList = sentenceTokenizer(text);
        List<String> tokens = new ArrayList<>();
        for (String sentence : sentencesList) {
            String[] words = sentence.split("\\s+");
            Collections.addAll(tokens, words);
        }

        return tokens;
    }


}
