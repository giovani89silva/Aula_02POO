package InterfacesEClassesAbstratas;
//A palavra chave extends aplica o conceito de herança, um
// baixista é teoricamente um músico
//tudo que estiver especificado por musico é 
// automaticamente herdado por baixista
public class Baixista extends Musico {

    // a notação @Override é aplicada de modo que 
    // o método abstrato definido na classe base, ou
    // classe pai (musico) seja sobrescrita e tenha um 
    // comportamento diferenciado na classe filha(baixista)
    @Override
    public String getNomeDoInstrumento() 
    {
        return "Baixo";
        
    }
    
}
