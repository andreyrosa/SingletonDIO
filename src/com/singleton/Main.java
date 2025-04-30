package com.singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Primeira instância");
        Singleton instanceOne = Singleton.getInstance();

        instanceOne.showMessage();

        System.out.println("\nSegunda instância");
        Singleton instanceTwo = Singleton.getInstance();

        instanceTwo.showMessage();

        if (instanceOne == instanceTwo) {
            System.out.println("HashCode instanceOne: " + instanceOne.hashCode());
            System.out.println("HashCode instanceTwo: " + instanceTwo.hashCode());
        } else {
            System.out.println("Algo deu errado! instanceOne e instanceTwo são instâncias diferentes.");
        }
    }
}

