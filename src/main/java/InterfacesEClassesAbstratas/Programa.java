package InterfacesEClassesAbstratas;

public class Programa {
    public static void main(String[] args) {
        
        Musico musico = new Baixista();
        musico.afinarInstrumento();
        
        musico = new Baterista();
        musico.afinarInstrumento();
        
        musico = new Guitarrista();
        musico.afinarInstrumento();
        
        System.out.println("TESTANDO INTERFACE VEICULO");
        Veiculo minhaMoto = new Moto();
        System.out.println("Quantidade cavalos MOTO: " + minhaMoto.getPotencia());
        Veiculo meuCarro = new Carro();
        System.out.println("Quantidade cavalos CARRO: " + meuCarro.getPotencia());
        Veiculo meuCaminhao = new Caminhao();
        System.out.println("Quantidade cavalos CAMINHÃO: " + meuCaminhao.getPotencia());
        
        System.out.println("O caminhão é um veiculo de passeio? " + ( meuCaminhao.isVeiculoDePasseio() ? "Sim" : "Não")
        );
    }
}
