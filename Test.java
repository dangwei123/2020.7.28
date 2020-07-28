小度有一个小写字母组成的字符串s.字符串s已经被写在墙上了.
小度还有很多卡片,每个卡片上有一个小写字母,组成一个字符串t。小度可以选择字符串t中任意一个字符,然后覆盖在字符串s的一个字符之上。

小度想知道在选取一些卡片覆盖s的一些字符之后,可以得到的字典序最大的字符串是什么。
输入描述:
输入包括两行,第一行一个字符串s,字符串s长度length(1 ≤ length ≤ 50),s中每个字符都是小写字母
第二行一个字符串t,字符串t长度length(1 ≤ length ≤ 50),t中每个字符都是小写字母

输出描述:
输出一个字符串,即可以得到的字典序最大字符串

import java.util.*;
public class Main{
    public static String replace(String s,String t){
        char[] origin=s.toCharArray();
        char[] rep=t.toCharArray();
        Arrays.sort(rep);
        for(int i=rep.length-1;i>=0;i--){
            for(int j=0;j<origin.length;j++){
                if(origin[j]<rep[i]){
                    origin[j]=rep[i];
                    break;
                }
            }
        }
        return new String(origin);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            String t=sc.nextLine();
            String res=replace(s,t);
            System.out.println(res);
        }
    }
}