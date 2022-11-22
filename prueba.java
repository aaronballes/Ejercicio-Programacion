
import java.lang.Number;
public class Prueba {
    public static void main(String [] args){
        int var1 = 5;
        int var2 = 7;
        System.out.println("Antes var1= "+var1+" y var2= "+var2);
        intercambiar(var1,var2);
        System.out.println("Despues var1= "+var1+" y var2= "+var2);

    }
    public static void intercambiar(int a, int b){
        int aux;
        aunx = a;
        a = b;
        b = aux;
    }
}
