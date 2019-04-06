package io.saidbouig.competitions.battledev13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution1 {

    public static void main( String[] argv ) throws Exception {
        int p;
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(sc.hasNextLine()) {
            sc.nextLine();
            p= sc.nextInt();
            list.add(p);
            Collections.sort(list);
        }
        int good = 0;
        int count;
        for(int i=0; i<list.size() ; i++) {
            count = list.get(i);
            for(int j=i+1; i<list.size();i++) {
                if(count+list.get(j)<=100)
                    count +=list.get(j);
                else
                    continue;
            }
            good ++;
        }
        System.out.println(good);
    }
}