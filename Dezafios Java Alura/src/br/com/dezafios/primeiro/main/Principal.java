package br.com.dezafios.primeiro.main;

import br.com.dezafios.primeiro.carro.ModeloCarro;

public class Principal {
    public static void main(String[] args) {

        ModeloCarro m1 = new ModeloCarro();

        m1.setModelo("Volvo");
        m1.setQualOcombustivel("Eletrico");
        m1.setQunatasPortas(4);
        m1.setMediaAno1(50.000);
        m1.setMediaAno2(80.000);
        m1.setMediaAno3(10.000);

        System.out.println("modelo: " + m1.getModelo());
        System.out.println("combustivel: " + m1.getQualOcombustivel());
        System.out.println("Portas: " + m1.getQunatasPortas() );
        m1.maior();
        m1.menor();


    }


}
