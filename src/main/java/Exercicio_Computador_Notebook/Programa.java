package Exercicio_Computador_Notebook;
import java.util.Scanner;

public class Programa {

    Computador computador = new Computador();
    Notebook notebook = new Notebook();

    public static void main(String[] args) {

        Programa programa = new Programa();

        boolean exit = true;
        int option = 0;
        Scanner sc = new Scanner(System.in);

        do // faz depois checka
        {
            System.out.println("BEM-VINDO A VOVOZONA INFORMÁTICA");
            System.out.println("--------------------------------");
            System.out.println("Selecione a opção: ");
            System.out.println("1-Incluir Computador");
            System.out.println("2-Incluir Notebook");
            System.out.println("3-Mostrar Computador");
            System.out.println("4-Mostrar Notebook");
            System.out.println("5-Verificar Computador bom para jogo");
            System.out.println("6-Verificar Notebook bom para jogo");
            System.out.println("0- SAIR");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    programa.IncluirComputador();
                    break;

                case 2:
                    programa.IncluirNotebook();
                    break;

                case 3:
                    programa.MostrarComputador();
                    break;

                case 4:
                    programa.MostrarNotebook();
                    break;

                case 5:
                    programa.ComputadorBomPraJogo();
                    break;

                case 6:
                    programa.NotebookBomPraJogo();
                            
                    break;

                case 0:
                    System.out.println("Obrigado e volte sempre!");
                    exit = false;
                    break;

                default:
                    System.out.println("ATENÇÃO: Opção Inválida!");
                    exit = true;

            }
        } while (exit);

    }

    public void IncluirComputador() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os dados do computador");
        System.out.println("------------------------------");
        System.out.println("Marca: ");
        String marca = sc.nextLine();
        System.out.println("Processador: ");
        String processador = sc.nextLine();
        System.out.println("Capacidade de Memória (GB): ");
        float memoria = sc.nextFloat();
        System.out.println("Capacidade de HD (GB): ");
        float hd = sc.nextFloat();

        this.computador
                = new Computador(marca, processador, memoria, hd);
        System.out.println("SUCESSO! COMPUTADOR REGISTRADO");
    }

    public void IncluirNotebook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os dados do notebook");
        System.out.println("------------------------------");
        System.out.println("Marca: ");
        String marca = sc.nextLine();
        System.out.println("Processador: ");
        String processador = sc.nextLine();
        System.out.println("Capacidade de Memória (GB): ");
        float memoria = sc.nextFloat();
        System.out.println("Capacidade de HD (GB): ");
        float hd = sc.nextFloat();
        System.out.println("Duração d a bateria: ");
        float durBateria = sc.nextFloat();

        this.notebook
                = new Notebook(durBateria, marca, processador, memoria, hd);
        System.out.println("SUCESSO! Notebook REGISTRADO");
    }

    public void MostrarNotebook() {
        if (this.notebook != null) {
            System.out.println("DADOS DO NOTEBOOK");
            System.out.println("------------------");
            System.out.println("Marca: " + this.notebook.getMarca());
            System.out.println("Processador: " + this.notebook.getProcessador());
            System.out.println("Memória: " + this.notebook.getCapacidadeMemoria());
            System.out.println("HD: " + this.notebook.getCapacidadeHD());
            System.out.println("Duração Bateria: " + this.notebook.getDurBateria());
        } else {
            System.out.println("NOTEBOOK NÃO INFORMADO!");
        }

    }

    public void MostrarComputador() {
        if (this.notebook != null) {
            System.out.println("DADOS DO COMPUTADOR");
            System.out.println("------------------");
            System.out.println("Marca: " + this.computador.getMarca());
            System.out.println("Processador: " + this.computador.getProcessador());
            System.out.println("Memória: " + this.computador.getCapacidadeMemoria());
            System.out.println("HD: " + this.computador.getCapacidadeHD());

        } else {
            System.out.println("COMPUTADOR NÃO INFORMADO!");
        }
    }
    
    public void NotebookBomPraJogo()
    {
        if ( this.notebook.isBomParaJogo())
            System.out.println("ESSE NOTE É BOM PARA GAMES");
        else
            System.out.println("INFELIZMENTE ESSE NOTE NÃO É BOM PARA GAMES");
    }
    
    public void ComputadorBomPraJogo()
    {
        if ( this.computador.isBomParaJogo())
            System.out.println("ESSE COMPUTADOR É BOM PARA GAMES");
        else
            System.out.println("INFELIZMENTE ESSE COMPUTADOR NÃO É BOM PARA GAMES");
    }
}

