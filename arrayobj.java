//Array of object.
import java.util.*;

class student {
    int mark[] = new int[10];
    string name;
    int rn, std, total;
    char div, grade;
    float per;

    Scanner sc = new Scanner(System.in);

    public void setter() {
        System.out.print("enter the name : ");
        String name = sc.nextLine();
        System.out.print("enter the standard : ");
        std = sc.nextInt();
        System.out.print("enter the roll number : ");
        rn = sc.nextInt();
        System.out.print("enter the division : ");
        div = sc.next().charAt(0);
    }

    public void Result() {
        System.out.print("enter the subject u want :->");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("subject" + "[" + (i + 1) + "] :");
            mark[i] = sc.nextInt();
            total = total + mark[i];
        }
        System.out.println("Total mark out of" + n + "==" + total);
        per = total / n;
        System.out.println("persentage :" + per + "%");

        if (per >= 90 && per <= 100) {
            System.out.println("Grade of :" + "A+");
        } else if (per >= 80 && per <= 89) {
            System.out.println("Grade of :" + "A");
        } else if (per >= 70 && per <= 79) {
            System.out.println("Grade of :" + "B+");
        } else if (per >= 60 && per <= 69) {
            System.out.println("Grade of:" + "B");
        } else if (per >= 50 && per <= 59) {
            System.out.println("Grade of:" + "c+");
        } else if (per >= 49 && per <= 33) {
            System.out.println("Grade of:" + name + "c");
        } else {
            System.out.println("you are fail");
        }
    }

    public void getter() {
        System.out.println("----------student details-----------");
        System.out.println(name + "\t" + std + "\t" + rn + "\t" + div + "\t" + total + "/t" + per);
    }
}

public class arrayobj {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("how many student Details you want :");
        int n = sc.nextInt();

        student s[] = new student[n];
        for (int i = 0; i < n; i++) {
            s[i] = new student();
            s[i].setter();
            s[i].Result();
        }
        System.out.println("student name" + "/tStandard" + "\tRoll no" + "/tdivision" + "/tTotal" + "/tpersentage");
        for (int i = 0; i < n; i++) {
            s[i].getter();
        }
        sc.close();
    }
}
