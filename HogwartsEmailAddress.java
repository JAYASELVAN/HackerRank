import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isValid(String email) {
        // Complete this function
        String s="No";
        String str[]=email.split("@");
        if(str.length==2&&str[1].equals("hogwarts.com")){
            if(str[0].length()==5){
                int count=0;
                for(char c:str[0].toCharArray()){
                    int asc=(int) c;
                    if(asc>=97&&asc<=122){
                        count++;
                    }
                }
                if(count==5){
                    s="Yes";
                }
            }   
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
        in.close();
    }
}
