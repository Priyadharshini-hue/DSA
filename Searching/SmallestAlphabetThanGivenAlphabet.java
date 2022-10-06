/*
Smallest Letter Greater than Target
Given an array of lowercase letters sorted in ascending order, and a target letter, 
find the smallest letter in the array that is greater than the target.
Note that, Letters also wrap around. For example, if target = 'z' and letters = ['a', 'b'], 
the answer is 'a'. 

Input: letters = ["d", "h", "l"], target = "a"
Output: "d"
*/
class SmallestAlphabetThanGivenAlphabet {
    static char searchNext(char[] letterKeys, char letterKey) {

        int start = 0, end = letterKeys.length - 1;
        char nextletterKey = letterKeys[start];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If the mid alphabet is greater than letterKey, store that alphabet and ignore
            // right half
            if (letterKeys[mid] > letterKey) {
                nextletterKey = letterKeys[mid];
                end = mid - 1;
            }
            // If the mid alphabet is lesser than letterKey, ignore left half
            else {
                start = mid + 1;
            }
        }

        return nextletterKey;
    }

    public static void main(String[] args) {
        char[] letterKeys = { 'd', 'k', 't' };
        char letterKey = 'z';
        System.out.println(searchNext(letterKeys, letterKey));
    }
}