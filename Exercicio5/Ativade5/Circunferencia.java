package Exercicio5.Ativade5;

public class Circunferencia {
    float raio; 

    public Circunferencia(float raio){
        this.raio = raio;
    }

    public float calcularArea(){
        float area = (float) (Math.PI * Math.pow(this.raio, 2));
        return area;
    }
    
}
