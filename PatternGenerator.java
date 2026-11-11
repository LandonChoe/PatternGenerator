//  Class author:  Landon Choe
//  Date created:  10/28
//  General description: Does certain methods of patterns and outputs stuff based on what the user puts in that aligns to the preconditions and use loops.
public class PatternGenerator {
public static void main(String [] args){
        stars(4);
        triangle(5);
        odds(7);
        eo(6);
        pyramid(5);
}
    // Precondition: enter the number of lines you want and dont put negative
    // Postcondition: It will out put that amount of lines as stars in a descending order with like the first line having 1, second having 3 and the pattern goes on.
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
    // Precondition: Add the number of lines you want for the triangle of numbers, dont put negative 
    // Postcondition: It will output the lines you put starting with 1 and going down a pyramid to the number of lines you put.
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
    // Precondition: Put in the highest odd number and no even numbers
    // Postcondition: then it will have a reverse staircase only going by odd numbers and odd lengths based on the highest odd number you put.
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
System.out.println();
}
    // Precondition: Add the highest number of E's you want for your pattern.
    // Postcondition: If its even then the starting letter is O and if its odd the starting letter is E and then goes up to the max amount of E's in maxE and does back down.
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
    System.out.println();
}
    // Precondition: Input how many rows you want for a reverse pyramid pattern, just dont do negative like every other precondition.
    // Postcondition: It will output a reverse centered pyramid starting with 1 then going down a line to the number of rows you added.
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