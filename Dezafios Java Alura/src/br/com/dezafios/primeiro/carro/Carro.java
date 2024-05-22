package br.com.dezafios.primeiro.carro;

public class Carro {

    private String modelo;
    private double mediaAno1;
    private double mediaAno2;
    private double mediaAno3;

    public void maior(){
        if (mediaAno1 > mediaAno2 && mediaAno1 > mediaAno3){
            System.out.println("O ano que mais vendeu foi o primeiro ano! ");
        }else if (mediaAno2 > mediaAno1 && mediaAno2 > mediaAno3){
            System.out.println("O ano que mais vendeu foi o segundo ano!");
        }else {
            System.out.println("O ano que mais vendeu foi o terceiro ano!");
        }
    }

    public void menor(){
        if (mediaAno1 < mediaAno2 && mediaAno1 < mediaAno3){
            System.out.println("O ano que menos vendeu foi o primeiro ano! ");
        }else if (mediaAno2 < mediaAno1 && mediaAno2 < mediaAno3){
            System.out.println("O ano que menos vendeu foi o segundo ano!");
        }else {
            System.out.println("O ano que menos vendeu foi o terceiro ano!");
        }
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMediaAno1() {
        return mediaAno1;
    }

    public void setMediaAno1(double mediaAno1) {
        this.mediaAno1 = mediaAno1;
    }

    public double getMediaAno2() {
        return mediaAno2;
    }

    public void setMediaAno2(double mediaAno2) {
        this.mediaAno2 = mediaAno2;
    }

    public double getMediaAno3() {
        return mediaAno3;
    }

    public void setMediaAno3(double mediaAno3) {
        this.mediaAno3 = mediaAno3;
    }
}
