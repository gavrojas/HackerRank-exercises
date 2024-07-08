package InterviewPreparation.week1;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
  
  /*
   * Complete the 'plusMinus' function below.
   *
   * The function accepts INTEGER_ARRAY arr as parameter.
   */
  
  public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int positiveCounter = 0;
    int negativeCounter = 0;
    int zeroCounter = 0;
    
    int n = arr.size();
    // recorrer arreglo con foreach
    for(Integer number : arr){
      if (number == 0){
        zeroCounter++;
      } else if (number>0){
        positiveCounter++;
      } else{
        negativeCounter++;
      }
    }
    
    // Calcular ratios
    double ratioPositive = (double) positiveCounter / n;
    double ratioNegative = (double) negativeCounter / n;
    double ratioZero = (double) zeroCounter / n;
    
    // imprimir valores con 6 decimales.
    System.out.printf("%.6f\n", ratioPositive);
    System.out.printf("%.6f\n", ratioNegative);
    System.out.printf("%.6f\n", ratioZero);
  }
  
}

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(bufferedReader.readLine().trim());
    
    List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
    
    Result.plusMinus(arr);
    
    bufferedReader.close();
  }
}