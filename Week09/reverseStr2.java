package week09;

public class reverseStr2 {

    public static void main(String[] args) {

        System.out.println(reverseStr2("abcdefg",2));

    }

    public static String reverseStr2(String s, int k) {

        if (s.length() == 0) {
            return s;
        }

        int i = 0;


        for (; i < s.length() - k - 1; i = i + 2 * k) {

            if ((i + 2 * k) < s.length()) {
                String temp = swapStr(s.substring(i, (i+2 * k)), k);
                s = s.replace(s.substring(i, (i+2 * k)), temp);
            } else {
                String temp = swapStr(s.substring(i, s.length()), k);
                s = s.replace(s.substring(i, s.length()), temp);
            }
        }

        if (i < s.length() -1 ) {
            String temp = swapStr(s.substring(i, s.length()), k);
            s = s.replace(s.substring(i, s.length()), temp);
        }

        return s;
    }

    private static String swapStr(String s, int m) {

        char[] strToChar = s.toCharArray();
        int j = ( m < s.length() ? m -1 : s.length() -1);

        int totalLenght = j + 1;
        for (int i = 0; i < totalLenght / 2; i++, j--) {
            char temp = strToChar[j];
            strToChar[j] = strToChar[i];
            strToChar[i] = temp;
        }

        return String.valueOf(strToChar);
    }
}


