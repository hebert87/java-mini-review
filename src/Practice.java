public class Practice {

    /**
     * Prints each item from an array on a separate line.
     * 
     * Example:
     * 
     * input:
     * {"welcome", "to", "sdev", "220"}
     * 
     * printed output:
     * welcome
     * to
     * sdev
     * 220
     * 
     * @param items an array of strings to print
     */
    public static void printItems(String[] items) {
        // TODO: Implement this method here!
        for (String elem : items) {
            System.out.println(elem);
        }
    }

    /**
     * Returns whether a is more than twice the value of b.
     * 
     * Examples:
     * input:
     *   a: 10, b: 3
     * return:
     *   true
     * 
     * input:
     *   a: 6, b: 4
     * return:
     *   false
     * 
     * input:
     *   a: 4, b: 2
     * return:
     *   false
     * 
     * @param a an int
     * @param b an int
     * @return true if a is strictly more than twice the value of b, false otherwise
     */
    public static boolean moreThanDouble(int a, int b) {
        // TODO: Delete the dummy return statement and implement this method here!
        return  2 * b < a;
    }


    /**
     * Returns whether every word in the array starts with the letter A (either
     * upper or lower case).
     * 
     * Examples:
     * input:
     *   {"alligators", "are", "AWESOME"}
     * return:
     *   true
     * 
     * input:
     *   {"apes", "can", "be", "amazing"}
     * return:
     *   false
     * 
     * Edge case: If array is empty, return true.
     * 
     * @param words a array of words
     * @return true if every word starts with A (case-insensitive), false otherwise.
     */
    public static boolean allStartWithA(String[] words) {
        // TODO: Delete the dummy return statement and implement this method here!
        for(String word : words){
            if (Character.toLowerCase(word.charAt(0)) != 'a') {
                return false ;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("///// Print items /////");
        System.out.println("Calling printItems(new String[]{\"welcome\", \"to\", \"sdev\", \"220\"})");
        printItems(new String[]{"welcome", "to", "sdev", "220"});
        System.out.println();
        System.out.println("Calling printItems(new String[]{\"hello\", \"world\"})");
        printItems(new String[]{"hello", "world"});

        System.out.println();
        System.out.println("///// More than Double /////");
        System.out.println("moreThanDouble(10, 3): " + moreThanDouble(10, 3));
        System.out.println("moreThanDouble(6, 4): " + moreThanDouble(6, 4));
        System.out.println("moreThanDouble(4, 2): " + moreThanDouble(4, 2));

        System.out.println();
        System.out.println("///// All Start With A /////");
        System.out.println("allStartWithA(new String[]{\"alligators\", \"are\", \"AWESOME\"}): " + allStartWithA(new String[]{"alligators", "are", "AWESOME"}));
        System.out.println("allStartWithA(new String[]{\"apes\", \"can\", \"be\", \"amazing\"}): " + allStartWithA(new String[]{"apes", "can", "be", "amazing"}));
        System.out.println("allStartWithA(new String[]{}): " + allStartWithA(new String[]{}));
        System.out.println();
    }
}