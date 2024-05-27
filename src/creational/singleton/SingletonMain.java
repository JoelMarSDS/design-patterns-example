package creational.singleton;

import creational.singleton.pattern.SingletonPatternsDatabase;

import java.util.Map;

/*
 * Design tem que ter
 * 1. Class attribute (Atributo da classe)
 * 2. Private constructor (Construtor privado)
 * 3. Static method (Metodo statico)
 * */

public class SingletonMain {
    public static void main(String[] args) {
        Map<String, String> hashMap = SingletonPatternsDatabase.getConnection();
        Map<String, String> hashMap2 = SingletonPatternsDatabase.getConnection();

        if (hashMap == hashMap2){
            System.out.println("É igual");
        } else {
            System.out.println("É Diferente");
        }
    }
}
