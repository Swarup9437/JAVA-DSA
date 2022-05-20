import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for (int i = max; i > 0; i--){
            for(int j = 0; j < n; j++){
                if (arr[j] >= i){
                    System.out.print("**  ");
                }
                else{
                    System.out.print("    ");
                }
            }
            System.out.println();
        }


    }
}

/*

[6, 3, 2, 5, 0, 7]
you have given an array you have to print * vertically as per the sequence;


                      *
        *             *
        *        *    *
        *        *    *
        *  *     *    *
        *  *  *  *    *
        *  *  *  *    *

--------------------------------

 */
