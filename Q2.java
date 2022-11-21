import java.util.*;
public class Main {
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 String s1 = sc.nextLine();
 String s2= sc.nextLine();
 char[] ref=new char[s1.length()];
 int c=0;
 char ch=s2.charAt(s2.length()-1);
for(int i=0;i<s1.length();i++){
    ref[i]=s1.charAt(i);
    if(ref[i]==ch)
    c++;
    else
    continue;
}
System.out.println(c);
}
}