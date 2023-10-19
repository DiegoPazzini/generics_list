package generics_list; // Declarando o nome do pacote

import java.util.ArrayList; // Importando a classe ArrayList
import java.util.List; // Importando a classe List

public class Main { // Declaração da classe Main

    public static void main(String[] args) { // Declaração do método main
        System.out.println("Modulo 17 - Generics"); // Imprimindo uma mensagem no console

        Onix onix = new Onix(); // Instanciando um objeto da classe Onix
        Cruze cruze = new Cruze(); // Instanciando um objeto da classe Cruze
        Spin spin = new Spin(); // Instanciando um objeto da classe Spin
        Montana montana = new Montana(); // Instanciando um objeto da classe Montana

        List<Carro> listaDeCarros = new ArrayList<>(); // Criando uma lista de carros usando ArrayList

        listaDeCarros.add(onix); // Adicionando o objeto onix à lista de carros
        listaDeCarros.add(cruze); // Adicionando o objeto cruze à lista de carros
        listaDeCarros.add(spin); // Adicionando o objeto spin à lista de carros
        listaDeCarros.add(montana); // Adicionando o objeto montana à lista de carros

        System.out.println("Os modelos de carros são:"); // Imprimindo uma mensagem no console

        listaDeCarros.forEach(carro -> System.out.println(carro.getClass().getName())); // Iterando sobre a lista e imprimindo o nome da classe de cada objeto
    }
}



