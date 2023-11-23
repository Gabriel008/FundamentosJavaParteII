package operaciones;

/**
 *
 * @author gabri
 */
public class PruebaAritmetica {
/* constructores en java
    Creacion objeto tipo Aritmetica sin inicializar valores (uso del constructor vacio)
    a=0;
    b=0;
    Aritmetica var1 = new Aritmetica(); // constructor vacio para poder crear este tipo de objetos 
        
     Creacion objeto tipo Aritmetica inicializando valores (uso de constructor NO vacio)
    a=5;
    b=10;
     Aritmetica var1 = new Aritmetica(5, 10); //Constructor que puede recibir argumentos
    
    El constructor nos sirve para crear los objetos con diferentes valores desde el momento de la cxreacion del objeto, por lo que podemos twener 1 o mas objetos en nuestra clace
    a este concepto se le llama sobrecarga de constructores
    
    <>El rombo amarillo de la parte izquierda seria nuestro constructor el cual adopta el mismo nombre que la clase
    este constructor lo agrego en automatico el compilador de java. si las claces no tienen definido un constructor el IDE agrega el construtor por default
    para poder crear objetos de esta clase de lo contrario no se podria instaciar la clase
    */
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
