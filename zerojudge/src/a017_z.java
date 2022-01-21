    
import java.util.Scanner;

public class a017_z {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String cal = sc.nextLine();
            System.out.println(answerMe(cal));
        }
        sc.close();
    }

    private static int answerMe(String cal) {
        int temp1 = 0;
        char op1 = ' ';
        int temp2 = 0;
        char op2 = ' ';
        int temp3 = 0;
        int length = cal.length() - 1; //算式的最後不能用空白做結尾，length 為最後一位非空白的位置
        for (; length > 0; length--) {
            if (cal.charAt(length) != ' ') {
                break;
            }
        }
        for (int i = 0; i <= length; i++) {
            if (cal.charAt(i) == '(') {
                short t = 1;
                int j = i + 1;
                for (; j <= length; j++) {
                    if (cal.charAt(j) == '(') {
                        t++;
                    } else if (cal.charAt(j) == ')') {
                        t--;
                        if (t == 0) {
                            break;
                        }
                    }
                }
                if (op1 == ' ') {
                    temp1 = answerMe(cal.substring(i + 1, j));
                } else if (op2 == ' ') {
                    temp2 = answerMe(cal.substring(i + 1, j));
                } else {
                    temp3 = answerMe(cal.substring(i + 1, j));
                }
                i = j; //這裡的 j 是 相對應的右括號位置
                if (opLevel(op1) < opLevel(op2)) {
                    temp2 = fiveOp(temp2, op2, temp3);
                    op2 = ' ';
                    if (j == length) {
                        return fiveOp(temp1, op1, temp2);
                    }
                } else if (op1 != ' ' && op2 != ' ') {
                    temp1 = fiveOp(temp1, op1, temp2);
                    op1 = op2;
                    temp2 = temp3;
                    op2 = ' ';
                    if (j == length) {
                        return fiveOp(temp1, op1, temp2);
                    }
                } else if (op1 != ' ' && j == length) {
                    return fiveOp(temp1, op1, temp2);
                }
            } else if ('0' <= cal.charAt(i) && cal.charAt(i) <= '9') {
                int j = i;
                for (; j <= length; j++) {
                    if (cal.charAt(j) < '0' || '9' < cal.charAt(j)) {
                        break;
                    }
                }
                if (op1 == ' ') {
                    temp1 = Integer.parseInt(cal.substring(i, j));
                } else if (op2 == ' ') {
                    temp2 = Integer.parseInt(cal.substring(i, j));
                } else {
                    temp3 = Integer.parseInt(cal.substring(i, j));
                }
                i = j - 1; //這裡的 j 是數字的後一個位置
                if (opLevel(op1) < opLevel(op2)) {
                    temp2 = fiveOp(temp2, op2, temp3);
                    op2 = ' ';
                    if (j == length + 1) {
                        return fiveOp(temp1, op1, temp2);
                    }
                } else if (op1 != ' ' && op2 != ' ') {
                    temp1 = fiveOp(temp1, op1, temp2);
                    op1 = op2;
                    temp2 = temp3;
                    op2 = ' ';
                    if (j == length + 1) {
                        return fiveOp(temp1, op1, temp2);
                    }
                } else if (op1 != ' ' && j == length + 1) {
                    return fiveOp(temp1, op1, temp2);
                }
            } else if (cal.charAt(i) == '+' || cal.charAt(i) == '-' || cal.charAt(i) == '*' || cal.charAt(i) == '/' || cal.charAt(i) == '%') {
                if (op1 == ' ') {
                    op1 = cal.charAt(i);
                } else if (op2 == ' ') {
                    op2 = cal.charAt(i);
                }
            }
        }
        return temp1;
    }

    private static int fiveOp(int a, char op, int b) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '%':
                return a % b;
            default:
                return 0;
        }
    }

    private static byte opLevel(char op) { //運算子的先後順序，byte 應該就夠分了
        switch (op) {
            case '+':
                return 1;
            case '-':
                return 1;
            case '*':
                return 2;
            case '/':
                return 2;
            case '%':
                return 2;
            default:
                return 0;
        }
    }
}
