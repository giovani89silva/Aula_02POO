package POO;

public class Executando_Animal {
    public static void main(String[] args) {
        Animal animal_1 = new Animal("Cavalo", "Fazenda", 256, "Videira", false);
        Animal animal_2 = new Animal("Quati", "Floresta Gaúcha", 73, "Rio Grande do Sul", true);
        Animal animal_3 = new Animal("Gamba", "Floresta Nativa", 17, "Santa Catarina", false);
        Animal animal_4 = new Animal("Tilápia", "Açude", 11, "Tangará", false);
        Animal animal_5 = new Animal("Cachorro", "Casa do Giovani", 26, "Videira", true);
        System.out.println("******** Alimentar Animal ***********");        
        animal_1.Alimentar();
        animal_2.Alimentar();
        animal_3.Alimentar();
        animal_4.Alimentar();
        animal_5.Alimentar();
        System.out.println("************Peso Animal***************");
        animal_1.Pesar();
        animal_2.Pesar();
        animal_3.Pesar();
        animal_4.Pesar();
        animal_5.Pesar();
        System.out.println("************Detalhes Animal***************");
        System.out.println("Animal 1 = " + animal_1.Nome);
        System.out.println("Animal 2 = " + animal_2.Nome);
        System.out.println("Animal 3 = " + animal_3.Nome);
        System.out.println("Animal 4 = " + animal_4.Nome);
        System.out.println("Animal 5 = " + animal_5.Nome);
        System.out.println("************Animal Correr***************");
        animal_1.Correr();
        animal_2.Correr();
        animal_3.Correr();
        animal_4.Correr();
        animal_5.Correr();
             
    }
}
