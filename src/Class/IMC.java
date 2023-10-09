package Class;

public class IMC {

    //Atributos
    Double altura;
    Double peso;

    //Constructor

    public IMC(Double altura, Double peso) {
        this.altura = altura;
        this.peso = peso;
    }
            
    //Metodos 
    
    public Double CalcularIMC(Double altura, Double peso) {
        Double respuesta = peso / (this.altura * this.altura);        
        return respuesta;
    }
    
    //Getter && Setter

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }        
    
    
    
}
