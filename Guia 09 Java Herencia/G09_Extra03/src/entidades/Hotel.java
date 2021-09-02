/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas,
Cantidad de Pisos, Precio de Habitaciones.

El precio de una habitación debe calcularse de acuerdo a la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel)

 */
package entidades;

/**
 *
 * @author Adrian E. Camus
 */
public abstract class Hotel extends Alojamiento {

    protected Integer cantHabitaciones, nroCamas, cantPisos;
    protected Double precioHabitacion;

    public Hotel() {
    }

    public Hotel(Integer cantHabitaciones, Integer nroCamas, Integer cantPisos, String nombre, String direccion, String localidad, Persona gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.nroCamas = nroCamas;
        this.cantPisos = cantPisos;
    }

    public void precioHabitacion(){
        this.precioHabitacion = (double) this.nroCamas+50;
    }

}
