/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras 
encontradas y la cantidad jugadas máximas que puede realizar el usuario. 
Definir los siguientes métodos con los parámetros que sean necesarios:

 */

package ej06.entidades;

/**
 * 
 * @author Adrian E. Camus
 */
public class Ahorcado {
    
    private String palabra[];
    private int letrasEncontradas;
    private int jugadas;

//= {"electroencefalograma","psicofarmaco","prohibido","atencion","","credencial","coronavirus","vacuna","abogado","cirujano","noviembre","abril"};
    

    public Ahorcado() {
        
    }

    public Ahorcado(String[] palabra, int letrasEncontradas, int jugadas) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadas = jugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", letrasEncontradas=" + letrasEncontradas + ", jugadas=" + jugadas + '}';
    }


}