import java.util.*;
public class Recursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // call the function here
        
    }

    // initialize the function here
   
}



/*         ------------ FUNCTIONS ARE AVAILABLE HERE --------------

1. Print The Number From start to end (Decremental Order): -> 8 7 6 5 4 3

    public static void printNumDec(int num1,int num2){
        // Write Your Base Case
        if (num1 == num2-1 ) return;
        // What you want from this function
        System.out.print(num1+" ");
        printNumDec(num1-1,num2);
    }

2. Print The Number From start to end (Incremental Order): -> 3 4 5 6 7 8

    public static void printNumInc(int num1,int num2) {
        // Write Your Base Case
        if (num1 == num2 + 1) return;
        // What you want from this function
        System.out.print(num1 + " ");
        printNumInc(num1 + 1, num2);
    }

3. Print the sum of Numbers from start to end: - > 4+5+6+7+8+9

    * For N natural number "start" will be "1" and "end" will be "N"

    public static void printSum(int num1, int num2,int sum){
        if (num1 == num2) {
            sum += num2;
            System.out.println(sum);
            return;
        }
        sum += num1;
        printSum(num1+1,num2,sum);
    }

4. Print the multiplication of Numbers from start to end: - > 4*5*6*7*8

    --- Method 1---
    public static void printMul(int num1, int num2, int mul){
        if (num1==num2){
            mul *= num2;
            System.out.print(mul);
            return;
        }
        mul *= num1;
        printMul(num1+1,num2,mul);
    }
    --- Method 2 ---

    // initialize the function
    public static int printFact(int num){
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * printFact(num-1);
    }
    // in main function print the value of

        printFact(num2)/printFact(num1-1)


5. Factorial of a Number: -> 5! = 5*4*3*2*1 or 5*4! like this

        public static int printFact(int num){
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * printFact(num-1);
    }

6. 

*/
