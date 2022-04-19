package Recursividade;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("++++++++++++++++++");
        System.out.println("FATORIAL RECURSIVO");
        System.out.println("++++++++++++++++++");
        
        System.out.println("Informe o número para calcular a Fatorial: ");
        int n = 0;
        n = sc.nextInt();
        long resultado = 0;
        Fatorial fatorial = new Fatorial(); // new instanciando o objeto
        resultado = fatorial.Fatorial(n);
        
        System.out.println(n + "! = " + resultado);
        
        System.out.println("\n\n");
        System.out.println("++++++++++++++++++");
        System.out.println("POTENCIAÇÃO RECURSIVA");
        System.out.println("++++++++++++++++++");
        int base, expo, resultPot = 0;
        System.out.println("Informe o número base: ");
        base = sc.nextInt();
        System.out.println("Informe o expoente: ");
        expo = sc.nextInt();
        Potencia potencia = new Potencia();
        resultPot = potencia.Potencia(base, expo);
        System.out.println(base + " ^ " + expo + " = " + resultPot);
        
        System.out.println("\n\n");
        System.out.println("++++++++++++++++++");
        System.out.println("NÚMERO DE FIBONACCI");
        System.out.println("++++++++++++++++++");
        int fib, resultFib = 0;
        System.out.println("Informe o número FIB: ");
        fib = sc.nextInt();
        resultFib = Fibonacci.Fibonacci(fib);
        System.out.println("Fibonacci de " + fib + " = " + resultFib);
        
        */
                
        System.out.println("\n\n");
        System.out.println("++++++++++++++++++");
        System.out.println("CONTAGEM REGRESSIVA");
        System.out.println("++++++++++++++++++");
        
        int countDesc = 0;
        System.out.println("Informe um número: ");
        countDesc = sc.nextInt();
        ContagemRegressiva countReg =
                new ContagemRegressiva();
        countReg.Contagem(countDesc);
        
                
    }
}
