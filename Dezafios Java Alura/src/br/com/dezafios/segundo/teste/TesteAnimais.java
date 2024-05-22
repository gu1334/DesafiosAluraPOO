package br.com.dezafios.segundo.teste;

import br.com.dezafios.segundo.animal.Cachorro;
import br.com.dezafios.segundo.animal.Gato;

public class TesteAnimais {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("belinha");
        System.out.println(cachorro.getNome());
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.setNome("garfild");
        System.out.println(gato.getNome());
        gato.emitirSom();
        gato.arranharMoveis();

    }
}
