package io.saidbouig.competitions.battledev13;


import java.util.Scanner;

public class Solution2 {

    public static void main( String[] argv ) throws Exception {
        int c;
        int b,a;
        Scanner sc = new Scanner(System.in);
        c= sc.nextInt();
        while(sc.hasNextLine()) {
            sc.nextLine();
            b= sc.nextInt();
            a= sc.nextInt();
            c -=a;
            c +=b;
        }
        if(c<= 100) {
            System.out.println("1000");
        }else if (c>=100000){
            System.out.println("KO");
        }else {
            System.out.println("100");
        }
    }
}
