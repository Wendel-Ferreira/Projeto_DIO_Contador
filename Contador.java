/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiocontrolefluxo;
import java.util.Scanner;
public class Contador {

    
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int parametroUm = terminal.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        int parametroDois = terminal.nextInt();
        
        try{
            contar(parametroUm,parametroDois);
        }
        catch(ParametrosInvalidosException e){
        }
        terminal.close();
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }else{
         for( int x = parametroUm; x < parametroDois; x++){
            int contagem = parametroDois - x;
             System.out.println(contagem);
             
         }
        }
    }
    
    
}
