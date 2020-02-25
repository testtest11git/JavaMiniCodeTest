import java.util.*;

public class Solution1 {
    public static final String MESSAGE_ERROR_NEGATIVE_VALUE = "Error: Negative value in input array is not allowed.";
    public static final String MESSAGE_ERROR_EXCEED_VALUE = "Error: Value bigger than 99 in input array is not allowed.";

    private static final Map<String, String> phoneDigitLetterMap = new HashMap<>();
    static {
        phoneDigitLetterMap.put("0", "");
        phoneDigitLetterMap.put("1", "");
        phoneDigitLetterMap.put("2", "abc");
        phoneDigitLetterMap.put("3", "def");
        phoneDigitLetterMap.put("4", "ghi");
        phoneDigitLetterMap.put("5", "jkl");
        phoneDigitLetterMap.put("6", "mno");
        phoneDigitLetterMap.put("7", "pqrs");
        phoneDigitLetterMap.put("8", "tuv");
        phoneDigitLetterMap.put("9", "wxyz");
    }


    private static void letterCombinationUtil(List<String> letterList, String combination, String digitString) {
        // if there is no more digits to check, the combination is done, store it into the list.
        if (digitString.length() == 0) {
            letterList.add(combination);
        }
        // if there are still digits to check, iterate all the digits
        else {
            String digit = digitString.substring(0, 1);
            String letters = phoneDigitLetterMap.get(digit);

//            for (int i = 0; i < letters.length(); i++) {
//                String letter = letters.substring(i, i + 1);
            for (char ch : letters.toCharArray()) {
                String letter = Character.toString(ch);
                // append the current letter to the combination and proceed the leftover digits
                letterCombinationUtil(letterList,combination + letter, digitString.substring(1));
            }
        }
    }

    public static String letterCombination(int[] inputArray) {
        if (inputArray.length == 0) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();

        // Validate the input numbers
        for (int i : inputArray) {
            if (i < 0) {
                return MESSAGE_ERROR_NEGATIVE_VALUE;
            } else if (i > 99) {
                return MESSAGE_ERROR_EXCEED_VALUE;
            } else {
                stringBuilder.append(i);
            }
        }

        // Delete the "0" and "1" in the string, because they map to ""
        while (stringBuilder.indexOf("0") >= 0) {
            stringBuilder.deleteCharAt(stringBuilder.indexOf("0"));
        }

        while (stringBuilder.indexOf("1") >= 0) {
            stringBuilder.deleteCharAt(stringBuilder.indexOf("1"));
        }

        String digitString = stringBuilder.toString();


        // To store the converting result
        List<String> letterList = new ArrayList<>();

        letterCombinationUtil(letterList,"", digitString);

        // Return the result as a String
        StringJoiner stringJoiner = new StringJoiner(" ");

        for (String letters : letterList) {
            stringJoiner.add(letters);
        }

        return stringJoiner.toString();
    }

}

