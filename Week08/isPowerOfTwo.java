package week08;

/*
* 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
* */

public class isPowerOfTwo {

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(2));

    }

    public static boolean isPowerOfTwo(int n) {

        if(n <= 0) return false;
        int count = 0;
        while(n != 0) {
            n &= (n - 1);
            count++;
        }
        return count == 1;
    }
}
