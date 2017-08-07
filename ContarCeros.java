import java.util.Scanner;
/**
 * Programa para hayar el numero de ceros del factorial de un numero.
 * 
 * @author (Juan León -Leonardo sotelo) 
 * 
 */
public class ContarCeros
{
     public static void main(String[] args)
     {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T -->0) {
            int n = in.nextInt();
            long powerof5=5;
            long ans =0;
            
            while(powerof5 <= n) 
            {
                ans  +=  n / powerof5;
                powerof5 *=5; 
            }
            System.out.println(ans);
            }
     }
    }