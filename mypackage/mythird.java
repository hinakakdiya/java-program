package mypackage;

import java.util.*;

public class mythird {
    public int n, i, a, sum = 0, temp;

    Scanner sc = new Scanner(System.in);

    public void set() {
        System.out.print("enter the value of n (armstrong) number=");
        n = sc.nextInt();

    }

    public void arm() {
        temp = n;
        for (int i = 0; n > 0; i++) {
            a = n % 10;
            sum += a * a * a;
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println("This is armstrong number");
        } else {
            System.out.println("This is not armstrong number");
        }
    }

    public void fact() {
        int n, fact = 1;
        System.out.print("enter the n (factorial) number=");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("factorial=" + fact);
    }

    public void fibonaci() {
        int n, a = 0, b = 1, c;
        System.out.print("enter the n (fibonaci) number=");
        n = sc.nextInt();
        // System.out.println("a="+a);
        // System.out.println("b="+b);
        for (int i = 1; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }

    }

    public void perfect() {
        int number, sum = 0;
        System.out.print("enter the n (perfect) number=");
        n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            if(number%i==0){
            sum = sum + i;
            }
        }
        if(sum==number){
            System.out.println("This is perfect number");
        }
        else{
            System.out.println("This is not perfect number");
        }

        }
    }


