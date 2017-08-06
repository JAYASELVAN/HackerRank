import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int inversionCount(int n, int m, int[] a) {
        // Complete this function
        int b[]=new int[m];
        int invCount=0;
        for(int i=0;i<=(n-m);i++){
            for(int j=0;j<m;j++){
                b[j]=a[i+j];
            }
            for(int j=0;j<(m-1);j++){
                for(int k=j+1;k<m;k++){
                    if(b[j]>b[k]){
                        invCount++;
                    }
                }
            }
        }
        return invCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = inversionCount(n, m, a);
        System.out.println(result);
        in.close();
    }
}
