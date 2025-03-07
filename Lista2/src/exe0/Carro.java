package exe0;
public class Carro {

    // modificador de acesso private - variáveis são encapsuladas
    private String marca;
    private String modelo;
    private int ano;
    private float velocidade;

    public Carro(){
        this.marca = "sem marca";
        this.modelo = "sem modelo";
    }

    // getters
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getAno(){
        return this.ano;
    }
    public float getVelocidade(){
        return this.velocidade;
    }
    // setters
    public void setVelocidade(float velocidade){
        // isso é encapsular
        if (velocidade >= 0){
            this.velocidade = velocidade;
        }
    }

    public String exibeDados(){
        return "Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Ano: " + this.ano +
                " Velocidade: " + this.velocidade;
    }



}
