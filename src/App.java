/**
 * strstr finds needle substring in haystack String
 */
public class App {
    public static void main(String[] args) throws Exception {

        String haystack = "There is a needle somewhere in this haystack.";
        String needle = "needle";
        System.out.println("\nHaystack: " + haystack);
        System.out.println("Find index of substring: " + needle);
        System.out.printf("Index of needle is: %d\n", needleIndex(haystack, needle));
    }

    /**
     * find first occurrence of substring needle in String haystack
     * 
     * @param haystack
     * @param needle
     * @return int index of subtring or -1 if substring not found
     */
    private static int needleIndex(String haystack, String needle) {
        int needleIndex = haystack.indexOf(needle);
        return needleIndex;
        // TODO return haystack.indexOf(needle);

    }
}
