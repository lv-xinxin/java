package demo;
/*6.给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。

        如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。

        假设环境不允许存储 64 位整数（有符号或无符号）。

        示例 1：
        输入：x = 123
        输出：321

        示例 2：
        输入：x = -123
        输出：-321

        示例 3：
        输入：x = 120
        输出：21

        示例 4：
        输入：x = 0
        输出：0*/

public class demo5 {
    public static void main(String[] args) {

    }

    public int reverse(int x) {
        int reverse = 0;
        while(x!=0){
            if (reverse>Integer.MAX_VALUE/10||(reverse==Integer.MAX_VALUE/10&&x>7)){
                return 0;
            }
            if (reverse<Integer.MIN_VALUE/10||(reverse==Integer.MIN_VALUE/10&&x<-8)){
                return 0;
            }
            reverse = reverse*10+x%10;
            x=x/10;
        }
        return reverse;
    }
    public static int reverse2(int x) {
        if (x > 230 || x < -231 || x == 0) {
            return 0;
        }
        //记录反转后的数据
        int result = 0;
        // 假如 x = 210 ，
        // 第1次遍历  tmp = 0; result = 0; x = 21
        // 第2次遍历 tmp = 0; result = 1 ; x = 2
        // 第3次遍历 tmp = 1; result = 12 ; x = 0 此进循环结束，输出 12

        //假如 x = -123
        // 第1次遍历  tmp = 0; result = -3; x = -12
        // 第2次遍历 tmp = -3; result = -32 ; x = -1
        // 第3次遍历 tmp = -32; result = -321 ; x = 0
        while (x != 0) {
            //保存临时的结果
            int tmp = result;
            result = result * 10 + x % 10;
            x = x / 10;
            // 将计算之后的结果 / 10，判断是否与计算之前相同，如果不同，证明发生溢出，返回0
            if(result / 10 != tmp){
                return  0;
            }
        }
        return result;
    }


}
