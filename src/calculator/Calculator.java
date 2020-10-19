/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        char operator;
        double jawab = 0.0;
        
        Scanner scanObject = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama : ");
        num1 = scanObject.nextInt();
        System.out.print("Masukkan angka kedua : ");
        num2 = scanObject.nextInt();
        System.out.print("Masukkan operator anda : ");
        operator = scanObject.next().charAt(0);
        
        switch (operator) {
            case '+': jawab = num1 + num2;
            break;
            case '-': jawab = num1 - num2;
            break;
            case '*': jawab = num1 * num2;
            break;
            case '/': jawab = num1 / num2;
            break;
            case '%': jawab = num1 % num2;
            break;
        }
        System.out.println(num1+" "+operator+" "+num2+" = "+jawab);
                
        
    }
    
}
