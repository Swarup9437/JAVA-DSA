import java.util.*;
public class PatternMakingOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();


    }
}


/*
1.
                        *
                       ***
                      *****
                     *******
                    *********
                    *********
                     *******
                      *****
                       ***
                        *
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
/*
2.
                            1
                           212
                          32123
                         4321234
                        543212345
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
*/
/*
3.
                        1
                       2 2
                      3 3 3
                     4 4 4 4
                    5 5 5 5 5
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
*/
/*
4.
                              * * * * *
                            * * * * *
                          * * * * *
                        * * * * *
                      * * * * *
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/
/*
5.
                    *                     *
                    * *                 * *
                    * * *             * * *
                    * * * *         * * * *
                    * * * * *     * * * * *
                    * * * * * * * * * * * *
                    * * * * * * * * * * * *
                    * * * * *     * * * * *
                    * * * *         * * * *
                    * * *             * * *
                    * *                 * *
                    *                     *
        // for upper half
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j =1; j <= 2*(size-i); j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
                System.out.println();
        }
        // for lower half
        for (int i = size; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j =1; j <= 2*(size-i); j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/
/*
6.
                    1
                    0 1
                    1 0 1
                    0 1 0 1
                    1 0 1 0 1

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2==0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
*/
/*
7.                  1
                    2  3
                    4  5  6
                    7  8  9  10
                    11 12 13 14 15
        int sum = 1;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(sum++ + " ");
            }
            System.out.println();
        }
    }
}
*/
/*
                    1
                    1 2
                    1 2 3
                    1 2 3 4
                    1 2 3 4 5
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
*/
/*
8.
                        * * * * * * * *
                        *             *
                        *             *
                        *             *
                        *             *
                        * * * * * * * *
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
*/

/*
9.
                            *
                           * *
                          * * *
                         * * * *
                        * * * * *
        for (int i = 1; i <=size; i++) {
            // print first space
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // then star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
 */
