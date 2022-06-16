/**
 * Implements strStr().
 * 
 * From https://leetcode.com/problems/implement-strstr/
 * 
 * Given two strings needle and haystack, return the index of the first occurrence of needle in
 * haystack, or -1 if needle is not part of haystack.
 */
public class MyStrStr {
    public static void main(String[] args) throws Exception {

        String haystack = "There is a needle somewhere in this haystack.";
        String subString = "needle";

        System.out.println("\nHaystack: " + haystack);
        System.out.println("\nSubstring: " + subString);
        System.out.printf("Index of substring is: %d\n", needleIndex(haystack, subString));

        subString = "chicken";
        System.out.println("\nFind index of substring: " + subString);
        System.out.printf("Index of substring is: %d\n", needleIndex(haystack, subString));

        subString = "There is a needle somewhere in this haystack.";
        System.out.println("\nFind index of substring: " + subString);
        System.out.printf("Index of substring is: %d\n", needleIndex(haystack, subString));

    }

    /**
     * find first occurrence of substring needle in String haystack
     * 
     * @param haystack
     * @param needle
     * @return int index of subtring or -1 if substring not found
     */
    private static int needleIndex(String haystack, String needle) {
        if (haystack.equals(needle))
            return 0;

        int index;
        int lastSearchIndex = haystack.length() - needle.length();

        // search for needle in successive substrings of haystack
        for (int i = 0; i <= lastSearchIndex; i++) {
            index = findSubstr(haystack, needle, i);

            if (index != -1)
                return index;
        }

        // needle substring not found
        return -1;

        // Java .indexOf() implements strstr()!
        // int needleIndex = haystack.indexOf(needle);
        // return needleIndex;
        // TODO return haystack.indexOf(needle);

    }

    private static int findSubstr(String haystack, String needle, int startIndex) {
        int i;

        for (i = 0; i < needle.length(); i++) {
            if (needle.charAt(i) != haystack.charAt(startIndex + i)) {
                return -1;
            }
        }
        return startIndex;
    }
}
