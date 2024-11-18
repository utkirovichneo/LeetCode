package com.tolik.chellange75;

public class ReverseVowelsofaString {

    public String reverseVowels(String s) {
            String vowel = "aeiouAEIOU";
            StringBuilder vowels = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(vowel.contains(String.valueOf(s.charAt(i)))){
                vowels.append(s.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        int n = vowels.length();
            for (int i = 0; i < s.length(); i++) {
                if(vowels.toString().contains(String.valueOf(s.charAt(i)))){
                    result.append(vowels.charAt(n - 1));
                    n--;
                }
                else{
                    result.append(s.charAt(i));
                }
            }
        return result.toString();
    }
}
