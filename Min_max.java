/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package min_max;
import java.util.Scanner;
/**
 *
 * @author Felipe Contri Rabelo
 */
public class Min_max {

    public static void main(String[] args) {
        Scanner resp = new Scanner(System.in);
        int n;
        System.out.println("Digite a quantidade de numeros na sequencia:");
        n=resp.nextInt();
        int sequencia[]= new int [n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número");
            sequencia[i] = resp.nextInt();    
        }
        int menor=9999999,maior= 0;
        
        for (int i = 0;i < n;i++)
        {
            
             menor = Math.min(menor, sequencia[i]);
             maior = Math.max(maior, sequencia[i]);
        }
        System.out.println("O menor numero e:"+menor);
        System.out.println("O maior numero e:"+maior);
        
        
    }
    
}
