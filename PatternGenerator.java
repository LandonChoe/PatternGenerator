//  Class author:  Landon Choe
//  Date created:  10/28
//  General description: Does certain methods of patterns and outputs stuff based on what the user puts in that aligns to the preconditions and use loops.
// Precondition: enter the number of lines you want
public class PatternGenerator {
public static void main(String [] args){
        stars(4);
        triangle(5);
        odds(7);
        eo(6);
        pyramid(5);
}
public static void stars(int rows){
    int i = 1;
while (i <= rows) 
{
int j = 1;
    while (j <= 2*i - 1){
    System.out.print("*");
    j++;
    }
    System.out.println();
i++;
}
}
public static void triangle(int rows){
    int i = 0;
    int j = 0;
    while (i <= rows) {
        int p = 1;
        while (p <= i) {
            System.out.print(j);
            p++;
        }
        j++;
        System.out.println();
        i++;
    }
    System.out.println();
}
public static void odds(int start){
    int i = 0;
    int j = 0;
    j = start;
    while (i <= start/2) {
        int p = 1;
        while (p <= j) {
            System.out.print(j);
            p++;
        }
        System.out.println();
        i++;
        j = j - 2;
    }
}

public static void eo(int maxE) {
    boolean printE = (maxE % 2 != 0); 

    int i = 1;
    while (i <= maxE) {
        for (int j = 0; j < i; j++) {
            if (printE) {
                System.out.print("E");
            } else {
                System.out.print("O");
            }
        }
        System.out.println();
        if (printE) {
            printE = false;
        } else {
            printE = true;
        }

        i++;
    }

    int j = maxE - 1;
    while (j >= 1) {
        for (int k = 0; k < j; k++) {
            if (printE) {
                System.out.print("E");
            } else {
                System.out.print("O");
            }
        }
        System.out.println();
        if (printE) {
            printE = false;
        } else {
            printE = true;
        }
        j--;
    }
}
public static void pyramid(int rows) {
    int i = 1;
    while (i <= rows) {
        int s = 1;
        while (s <= i - 1) {
            System.out.print(" ");
            s++;
        }
        int d = 1;
        int digits = (2 * (rows - i) + 1);
        while (d <= digits) {
            System.out.print(i);
            d++;
        }
        System.out.println();
        i++;
    }
}
}