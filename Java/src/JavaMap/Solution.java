//Complete this code or write your own from scratch
package JavaMap;
import java.util.*;

public class Solution{
  public static void main(String []argh)
  {
    // Definir un Map para el nombre y el numero de telefono
    Map<String,Integer> phoneBook = new HashMap<>();
    
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    in.nextLine();
    for(int i=0;i<n;i++)
    {
      String name=in.nextLine();
      int phone=in.nextInt();
      in.nextLine();
      // Insertar en el map cada nombre y telefono
      phoneBook.put(name, phone);
    }
    while(in.hasNext())
    {
      String s=in.nextLine();
      
      // Si lo ingresado como nombre coincide con alguna clave en el map, entonces imprimir
      if (phoneBook.get(s) != null) {
        System.out.println(s + "=" + phoneBook.get(s));
      } else {
        System.out.println("Not found");
      }
    }
    
    in.close();
  }
}
