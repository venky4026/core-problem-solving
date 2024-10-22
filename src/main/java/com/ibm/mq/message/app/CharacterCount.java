package com.ibm.mq.message.app;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "aaabbcdd";
        System.out.println(compressString(str));
    }

    public static String compressString(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result.append(str.charAt(i)).append(count);
                count = 1;
            }
        }

        return result.toString();
    }
}
