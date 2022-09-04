/*
In excel sheets there are multiple rows and columns. The rows are numbered like 1, 2, 3…
The columns are numbered like A, B, C,…X, Y, Z, AA, AB,...AY, AZ, BA,...ZY, ZZ, AAA, AAB,...
Here the column numbers denote the following:
A => 1
B => 2
C => 3
....
X => 24
Y => 25
Z => 26
Given an excel column number, find the numerical column number.
 */
class ExcelColumnNumber {
    static int numericalColumnNumber(String s) {
        int number = 0, base = 1;

        for(char c : s.toCharArray()){
            number += (Character.valueOf(c) - 'A' + 1) * base;

            base *= 26;
        }
        return number;
    }

    public static void main(String[] args) {
        String str = "ABCA";

        System.out.print(numericalColumnNumber(str));
    }
}