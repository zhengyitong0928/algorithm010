package week09;

/*
* 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
* 给定的字符串是否区分大小写？假定都是小写字母
* */

import java.util.HashMap;
import java.util.HashSet;

public class firstUniqChar {

    public static void main(String[] args) {

        System.out.println(firstUniqChar("loveleecode"));

    }

    public static int firstUniqChar(String str) {
        int result = -1;

        HashMap<Character,Integer> codeNum = new HashMap<>();

        for (int i=0;i<str.length();i++) {
            Character temp = str.charAt(i);
            codeNum.put(temp, codeNum.getOrDefault(temp,0)+1);
        }

        for (int i=0;i<str.length();i++) {
            if (codeNum.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return result;
    }
}
