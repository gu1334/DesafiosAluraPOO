package br.com.dezafios.segundo.animal;

public class Cachorro extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("au au au");
    }

    public void abanarRabo(){
        System.out.println("abanando rabo!");
    }
}
