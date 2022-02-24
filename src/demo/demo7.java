package demo;
/*8.递归乘法。 写一个递归函数，不使用 * 运算符， 实现两个正整数的相乘。可以使用加号、减号、位移，但要吝啬一些。

        示例1:
        输入：A = 1, B = 10
        输出：10

        示例2:
        输入：A = 3, B = 4
        输出：12
        提示:

        保证乘法范围不会溢出*/


public class demo7 {
    public static void main(String[] args) {

    }

    //递归
    public static int test(int A,int B ){
        if(A < B)
            A^=B^=A^=B;//swap大的在前，少递归几次
        if(B==1)
            return A;
        if((B&1)==0)//B是偶数
            return test(A,B>>1)<<1;
        else
            return A + (test(A,B>>1)<<1);
    }
}

























