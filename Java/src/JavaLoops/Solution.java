package JavaLoops;

import java.util.*;

class Solution{
  public static void main(String []argh){
    // exercise -> https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
    Scanner in = new Scanner(System.in);
    double result;
    int t=in.nextInt();
    if(t<0 || t>500){
      System.out.println("Numero de iteracion no permitido");
      in.close();
      return ;
    }
    
    for(int i=0;i<t;i++){
      int a = in.nextInt();
      int b = in.nextInt();
      int n = in.nextInt();
      if(a<0 || b<0 || a>50 || b>50 || n<1 || n>15) {
        System.out.println("Numeros no permitidos");
        in.close();
        return;
      }
      result = a + (Math.pow(2,0) * b);
      System.out.printf("%.0f ", result);
      
      for(int j=1; j<n; j++){
        result = result + (Math.pow(2,j) * b);
        System.out.printf("%.0f ", result);
      }
      System.out.print("\n");
    }
    in.close();
    System.out.println();
  }
}