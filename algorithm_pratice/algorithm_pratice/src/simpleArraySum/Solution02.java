package simpleArraySum;

import java.io.*;
import java.util.*;

public class Solution02 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int su=0;
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            su+=a[i];
        }
        System.out.print(su);

    }
}