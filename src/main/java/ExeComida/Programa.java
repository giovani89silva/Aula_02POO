package ExeComida;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) 
    {
        System.out.println("**** PROGRAMA EXE COMIDA ****");
        System.out.println("**** VOÇÊ TEM DIREITO A 3 PRATOS ****");
                     
        Comida c1 = new Comida();
        Comida c2 = new Comida();
        Comida c3 = new Comida();
                
        Scanner sc = new Scanner(System.in);
        
        String descricao;
        Float peso;
        Integer quantidade;
        
        System.out.println("**** Primeiro Prato ****");
        System.out.println("Informe o prato: ");
        descricao = sc.nextLine();
        c1.setDescricao( descricao );//coloca o que o usuario digita na primeira linha
        System.out.println("Informe o peso em gramas: ");
        peso = sc.nextFloat();
        c1.setPeso ( peso );
        System.out.println("Informe a quantidade: ");
        quantidade = sc.nextInt();
        c1.setQtdePorcao( quantidade );
        
        System.out.println("**** Segundo Prato ****");
        System.out.println("Informe o prato: ");
        descricao = sc.nextLine();
        c2.setDescricao( descricao );//coloca o que o usuario digita na primeira linha
        System.out.println("Informe o peso em gramas: ");
        peso = sc.nextFloat();
        c2.setPeso ( peso );
        System.out.println("Informe a quantidade: ");
        quantidade = sc.nextInt();
        c2.setQtdePorcao( quantidade );
        
        System.out.println("**** Terceiroa Prato ****");
        System.out.println("Informe o prato: ");
        descricao = sc.nextLine();
        c3.setDescricao( descricao );//coloca o que o usuario digita na primeira linha
        System.out.println("Informe o peso em gramas: ");
        peso = sc.nextFloat();
        c3.setPeso ( peso );
        System.out.println("Informe a quantidade: ");
        quantidade = sc.nextInt();
        c3.setQtdePorcao( quantidade );
        
    }
    
}
