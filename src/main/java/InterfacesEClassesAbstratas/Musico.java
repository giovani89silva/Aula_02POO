package InterfacesEClassesAbstratas;

/* Classe Abstrata
    Permite a definicao de métodos que serão sobrescritos
    posteriormente, outros objetos que herdem da SUPER CLASSE poderão
    apresentar comportamentos distintos.
*/
public abstract class Musico {
    /* Este método abstrato não possui implementação
       Apenas é declarado ou especificado    
    */
    public abstract String getNomeDoInstrumento();
    
    /* Este método concreto possui implementação
       Ele é declarado e IMPLEMENTADO normalmente  
    */
    public void afinarInstrumento(){
        System.out.println(
                "Eu Estou afinando o/a " + getNomeDoInstrumento());
    }
}
