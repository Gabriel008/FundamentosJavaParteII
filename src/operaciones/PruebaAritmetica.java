package operaciones;

/**
 *
 * @author gabri
 */
public class PruebaAritmetica {

    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;

        aritmetica1.sumar();

        int resultado = aritmetica1.sumarConRetorno(); // Punto de roptura, debbug file, seleccionar el metodo, F7 ó stepinto para redireccionar a adentro del metodo
        System.out.println("resultado desde el metodo con retorno = " + resultado);

        resultado = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("resultado desde el metodo con Argumentos = " + resultado);
    }
}
