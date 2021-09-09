/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package principal;

/**
 *
 * @author Adrian E. Camus
 */
public class ClaseTres {

     private static int metodo() {
        int valor = 0;
        try
        {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("Valor final del try: " + valor);
        } catch (NumberFormatException e)
        {
            valor = valor + Integer.parseInt("W");
            System.out.println("Valor final del catch: " + valor);
        } finally
        {
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);

        return valor;

    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         try
        {
            System.out.println(metodo());
        } catch (Exception e)
        {
            System.err.println("Excepcion en metodo()");
            e.printStackTrace();
        }
        
    }
    
}

//********************************************************
//  Respuesta:
//  Valor final del finally: 2
//  Excepcion en metodo()
//  java.lang.NumberFormatException: For input string: "W"

