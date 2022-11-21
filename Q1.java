import java.util.*;
public class Main {
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
     String result = "";
 while(n>0){
 int rem = n%3;
 n = n/3;
 result = rem + result;
}
System.out.println(result);
}
}