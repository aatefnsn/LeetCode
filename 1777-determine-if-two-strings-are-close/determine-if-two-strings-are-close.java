import java.util.*;

class Solution {
    public boolean matchingHashMaps(HashMap HM1, HashMap HM2) {
        Collection<Integer> HM1values_ = HM1.values();
        Integer HM1valArray[] = HM1values_.toArray(new Integer[0]);

        Collection<Integer> HM2values_ = HM2.values();
        Integer HM2valArray[] = HM2values_.toArray(new Integer[0]);

        Arrays.sort(HM1valArray);
        Arrays.sort(HM2valArray);

        for (int i = 0; i < HM1valArray.length; i++) {
            if (HM1valArray[i] != HM2valArray[i]) {
                return false;
            }
        }

        /*
         * Collection<Integer> HM1values = HM1.values();
         * ArrayList<Integer> HM1ValuesList = new ArrayList<>(HM1values);
         * System.out.println("The Values of the Map are " + HM1ValuesList);
         * 
         * Collection<Integer> HM2values = HM2.values();
         * ArrayList<Integer> HM2ValuesList = new ArrayList<>(HM2values);
         * System.out.println("The Values of the Map are " + HM2ValuesList);
         */

        return true;
    }

    public boolean closeStrings(String word1, String word2) {
        if (word1.toCharArray().length != word2.toCharArray().length) {
            return false;
        }
        int[] word1_arr = new int[26];
        int[] word2_arr = new int[26];

        for (char c : word1.toCharArray()) {
            word1_arr[c - 'a'] = word1_arr[c - 'a'] + 1;
        }

        for (char c : word2.toCharArray()) {
            word2_arr[c - 'a'] = word2_arr[c - 'a'] + 1;
        }

        for (int i = 0; i < 26; i++) {
            if ((word1_arr[i] == 0 && word2_arr[i] != 0) || (word1_arr[i] != 0 && word2_arr[i] == 0)) {
                return false;
            }
        }

            Arrays.sort(word1_arr);
            Arrays.sort(word2_arr);

            for (int j = 0; j < 26; j++) {
                if (word1_arr[j] != word2_arr[j]) {
                    return false;
                }
            }
            return true;

            /*
             * char[] word1_arr = word1.toCharArray();
             * char[] word2_arr = word2.toCharArray();
             * 
             * if (word1_arr.length != word2_arr.length) {
             * return false;
             * } else {
             * HashMap<Character, Integer> word1Map = new HashMap<Character, Integer>();
             * for (char c : word1_arr) {
             * if (word1Map.containsKey(c)) {
             * word1Map.put(c, word1Map.get(c) + 1);
             * } else {
             * word1Map.put(c, 1);
             * }
             * }
             * 
             * HashMap<Character, Integer> word2Map = new HashMap<Character, Integer>();
             * for (char c : word2_arr) {
             * if (word2Map.containsKey(c)) {
             * word2Map.put(c, word2Map.get(c) + 1);
             * } else {
             * word2Map.put(c, 1);
             * }
             * }
             * return matchingHashMaps(word1Map, word2Map);
             */
        }
}