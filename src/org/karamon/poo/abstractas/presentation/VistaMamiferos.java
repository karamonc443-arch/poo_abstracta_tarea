package org.karamon.poo.abstractas.presentation;

import org.karamon.poo.abstractas.mamiferos.*;

public class VistaMamiferos {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[6];

        Mamifero leon = new Leon("Sabana, praderas y bosques abiertos de África", 1.2F, 2.5F, 190F, "Panthera Leo", 5F, 80, 15, 114D);
        Mamifero tigre = new Tigre("Selvas tropicales, bosques, manglares y praderas", 1.0F, 3.0F, 220F, "Panthera Tigris", 10, 65, "Tigre de Bengala");
        Mamifero lobo = new Lobo("Bosques, montañas, tundras y praderas", 0.85F, 1.5F, 40F, "Canis lupus", "Gris,blanco,negro o marrón", 5F, 5, "Lobo gris");
        Mamifero perro = new Perro("Hogares,ciudades y zonas ruales", 0.60F, 1.0F, 25F, "Canis lupus familiaris", "Negro,blanco,marrón,gris o dorado", 2.5F, 230);
        Mamifero tigreBengala = new Tigre("Selvas tropicales, bosques, manglares y praderas de India, Nepal, Bangladés y Bután", 1.0F, 3.0F, 220F, "Panthera tigris tigris", 10F, 65, "Tigre de Bengala");
        Mamifero guepardo = new Guepardo("Sabanas, praderas y zonas semiáridas de África", 0.85F, 1.5F, 55F, "Acinonyx jubatus", 2.0F, 110);

        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = lobo;
        mamiferos[3] = perro;
        mamiferos[4] = tigreBengala;
        mamiferos[5] = guepardo;

        for (Mamifero animal : mamiferos) {

            System.out.println(" =============== " + animal.getClass().getSimpleName() + " =============== ");
            System.out.println("Habitat: " + animal.getHabitat());
            System.out.println("Altura: " + animal.getAltura());
            System.out.println("Largo: " + animal.getLargo());
            System.out.println("Peso: " + animal.getPeso());

            if (animal instanceof Canino) {
                System.out.println("Colmillos: " + ((Canino) animal).getTamanoColmillos());
                System.out.println("Color: " + ((Canino) animal).getColor());

                if (animal instanceof Lobo) {
                    System.out.println("Especie Lobo: " + ((Lobo) animal).getEspecieLobo());
                    System.out.println("Número Integrantes: " + ((Lobo) animal).getNumCamada());
                }
                if (animal instanceof Perro) {
                    System.out.println("Fuerza mordida kg: " + ((Perro) animal).getFuerzaMordida());
                }
            }

            if (animal instanceof Felino) {
                System.out.println("Tamaño Garras: " + ((Felino) animal).getTamanoGarras());
                System.out.println("Velocidad: " + ((Felino) animal).getVelocidad());

                if (animal instanceof Leon) {
                    System.out.println("Potencia Rugido: " + ((Leon) animal).getPotenciaRugidoDecibel());
                    System.out.println("Número Integrantes: " + ((Leon) animal).getNumManada());
                }
                if (animal instanceof Tigre) {
                    System.out.println("especie Tigre: " + ((Tigre) animal).getEspecieTigre());
                }
            }

            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
        }
    }
}
