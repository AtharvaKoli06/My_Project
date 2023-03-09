package Basic_program;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number to print the pattern: ");
                int n = sc.nextInt();

                // for (int i = 0; i < n; i++) {
                //  for (int j = 0; j < n; j++) {
                //      if (i==0 || j==0 || i==n-1 || j==n-1) {
                //          System.out.print("*");
                //      } else {
                //          System.out.print(" ");
                //      }
                //  }
                //  System.out.println();
                // }

                // for (int i = 0; i < n; i++) {
                //     for (int j = 0; j < n; j++) {
                //         if (i==0 || j==0 || i==(n-1)/2 || j==n-1) {
                //             System.out.print("*");
                //         } else {
                //             System.out.print(" ");
                //         }
                //     }
                //     System.out.println();
                //    }

                // for (int i = 0; i < n; i++) {
                //     for (int j = 0; j < n; j++) {
                //         if (j==0 || i==(n-1)/2 || j==n-1) {
                //             System.out.print("*");
                //         } else {
                //             System.out.print(" ");
                //         }
                //     }
                //     System.out.println();
                //    }

                //    for (int i = 0; i < n; i++) {
                //     for (int j = 0; j < n; j++) {
                //         if (i==0 || j==(n-1)/2) {
                //             System.out.print("*");
                //         } else {
                //             System.out.print(" ");
                //         }
                //     }
                //     System.out.println();
                //    }

                // for (int i = 0; i < n; i++) {
                //     for (int j = 0; j < n; j++) {
                //         if (i==0 || j==0|| i==(n-1)/2 || j==(n-1)/2) {
                //             System.out.print("*");
                //         } else {
                //             System.out.print(" ");
                //         }
                //     }
                //     System.out.println();
                //    }

                // for (int i = 0; i < n; i++) {
                //     for (int j = 0; j < n; j++) {
                //         if (i == 0 && j > 0 && j < (n-1)/2 || j == 0 && i > 0 ||
                //          i == (n-1)/2 && j <= (n-1)/2 || j==(n-1)/2 && i>0) {
                //             System.out.print("*");
                //         } else {
                //             System.out.print(" ");
                //         }
                //     }
                //     System.out.println();
                //    }

                // for (int i = 0; i < n; i++) {
                //     for (int j = 0; j < n; j++) {
                //         if (i==0 && j < (n-1)/2 || j==0 || j==(n-1)/2 && 1 > 0 && i< n-1 || i==n-1 && j< (n-1)/2) {
                //             System.out.print("*");
                //         } else {
                //             System.out.print(" ");
                //         }
                //     }
                //     System.out.print(" ");
                //     for (int j = 0; j < n; j++) {
                //         if (i==0 && j < (n-1)/2 || j==0 || j==(n-1)/2 && 1 > 0 && i< n-1 || i==n-1 && j< (n-1)/2) {
                //             System.out.print("*");
                //         } else {
                //             System.out.print(" ");
                //         }
                //     }
                //     System.out.println();
                // }


                // I L E F H T

                // for (int i = 0; i < n; i++) {
                //     for (int j = 0; j < n; j++) {
                //         if (i == j || i+j == n-1 || i==0 || j==0 || i==n-1 || j==n-1) {
                //             System.out.print("*");
                //         } else {
                //             System.out.print(" ");
                //         }
                //     }
                //     System.out.println();
                //    }


                // for (int i = 0; i < n; i++) {
                //     for (int j = 0; j < n; j++) {
                //         if (i == j || i+j == n-1 || i==0 || i==n-1) {
                //             System.out.print("*");
                //         } else {
                //             System.out.print(" ");
                //         }
                //     }
                //     System.out.println();
                // }

                // System.out.println();

                // for (int i = 0; i < n; i++) {
                //     for (int j = 0; j < n; j++) {
                //         if (i == j || i+j == n-1 || j==0 || j==n-1) {
                //             System.out.print("*");
                //         } else {
                //             System.out.print(" ");
                //         }
                //     }
                //     System.out.println();
                //    }

                // for (int i = 0; i < n; i++) {
                //     for (int j = 0; j < n; j++) {
                //         if (i==0 || j==0 || j== n-1 || i== n-1 || i+j == (n-1)/2 || i+j == n-1 ||
                //         i==j || i-j == (n-1)/2 || j-i == (n-1)/2 || i+j == (n-1) + (n-1)/2) {
                //             System.out.print("*");
                //         } else {
                //             System.out.print(" ");
                //         }
                //     }
                //     System.out.print(" ");

                //     for (int j = 0; j < n; j++) {
                //         if (i+j == (n-1)/2|| i-j == (n-1)/2 || j-i == (n-1)/2 || i+j == (n-1) + (n-1)/2) {
                //             System.out.print("*");
                //         } else {
                //             System.out.print(" ");
                //         }
                //     }
                //     System.out.print(" ");
                //     for (int j = 0; j < n; j++) {
                //         if (i+j == n-1 || i==j) {
                //             System.out.print("*");
                //         } else {
                //             System.out.print(" ");
                //         }
                //     }
                //     System.out.print(" ");
                //     // p1 Downp2 p3 downp4
                //     for (int j = 0; j < n; j++) {
                //         if (i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2 || i+j <= (n-1)/2 ||
                //         i==0 && j >= (n-1)/2 || j==n-1 && i<=(n-1)/2 || j-i>= (n-1)/2 ||
                //         j==0 && i>= (n-1)/2 || i==n-1 && j<=(n-1)/2 || i-j >= (n-1)/2 ||
                //         j==n-1 && i >=(n-1)/2 || i==n-1 && j>=(n-1)/2 || i+j >= (n-1)+(n-1)/2) {
                //             System.out.print("*");
                //         } else {
                //             System.out.print(" ");
                //         }
                //     }
                //     System.out.print(" ");

                //     for (int j = 0; j < n; j++) {
                //         if (i+j == (n-1)/2 || j-i == (n-1)/2 || i==(n-1)/2 ||
                //         i-j == (n-1)/2 || i+j== (n-1) + (n-1)/2 || i==(n-1)/2) {
                //             System.out.print("*");
                //         } else {
                //             System.out.print(" ");
                //         }
                //     }
                //     // System.out.print(" ");
                //     for (int j = 0; j < n; j++) {
                //         if (j==(n-1)/2 || j-i==(n-1)/2 || i+j == (n-1) + (n-1)/2) {
                //             System.out.print("*");
                //         } else {
                //             System.out.print(" ");
                //         }
                //     }
                //     for (int j = 0; j < n; j++) {
                //         if (i+j==(n-1)/2 || j-i==(n-1)/2 || i-j==(n-1)/2 || i+j==(n-1) + (n-1)/2) {
                //             System.out.print("*");
                //         } else {
                //             System.out.print(" ");
                //         }
                //     }
                //     for (int j = 0; j < n; j++) {
                //         if (i+j == (n-1)/2 || j==(n-1)/2 || i-j==(n-1)/2) {
                //             System.out.print("*");
                //         } else {
                //             System.out.print(" ");
                //         }
                //     }
                //     System.out.println();
                //    }
    }
}