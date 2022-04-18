package POO;

import java.util.Scanner;

public class Animal {
    // Atributos
    public String Nome;
    public String Habitat;
    public double Peso;
    public String Origem;
    public boolean Perigoso;
    
    // Métodos Construtores
    public Animal(String Nome, String Habitat, double Peso, String Origem, boolean Perigoso){
        this.Nome = Nome;
        this.Habitat = Habitat;
        this.Peso = Peso;
        this.Origem = Origem;
        this.Perigoso = Perigoso;
    }
    public Animal(){
    }
    
    // Método Alimentar
    public void Alimentar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por gentileza, indique qual alimento irá servir: ");
        String comida = sc.nextLine();
        System.out.println("O/A " + this.Nome + " de alimentou de " + comida + "!");
    }
    // Método Pesar
    public void Pesar(){
        System.out.println("O/A " + this.Nome + " pesa: " + this.Peso + "quilos");
        if(this.Peso > 200){
            System.out.println("Precisa emagrecer!!!");
            }
        else{System.out.println("Dentro Peso ideal");}
    }
    
    //Método mostra os dados animal
    @Override
    public String toString(){
        return "Animal { Nome = " + this.Nome + 
                ", Habitat = " + this.Habitat + 
                ", Peso = " + this.Peso + 
                ", Orgiem = " + this.Origem + 
                ", Perigoso = " + this.Perigoso + 
                "}";
    }
    
    //Método Correr
    public void Correr(){
        System.out.println("Ei!!!" + this.Nome + " Corra Agora!!!!!!");
    }
}
