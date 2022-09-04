/*
Find Excel column name from a given column number
MS Excel columns have a pattern like A, B, C, …, Z, 
AA, AB, AC, …., AZ, BA, BB, … ZZ, AAA, AAB ….. etc. 
In other words, column 1 is named “A”, column 2 as “B”, and column 27 as “AA”.
Given a column number, find its corresponding Excel column name. 
The following are more examples.

Input          Output
 26             Z
 51             AY
 52             AZ
 80             CB
 676            YZ
 702            ZZ
 705            AAC
*/
class ExcelColumnName {
    // log26(n)
    static StringBuilder commanName(int n) {
        StringBuilder str = new StringBuilder();

        while (n > 0) {
            int r = n % 26;
            // If reminder equals zero and 'Z' to str
            if (r == 0) {
                str.append('Z');
                // Reduce n by 26 and subract one from it
                n = (n / 26) - 1;
            } else {
                // Find the reminder and subract by 1 and add 'A'
                str.append((char) (((r) - 1) + 'A'));
                // Reduce n by 26
                n = n / 26;
            }
        }
        return str.reverse();
    }

    public static void main(String[] args) {
        int number = 19007;

        System.out.println(commanName(number));
    }
}
