/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadetrabajospracicos;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class GuiaDeTrabajosPracicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio1 ();
    }
    public static void Ejercicio1 (){
        String a = "Hola";
        int b = 10;
        boolean c = true;
        System.out.println("a: " + a + " b: " + b + " c: " + c);
    }
    public static void Ejercicio2(){
        int  a = 100, exp1;
        double b = 2.3, exp2;
        exp1 = a/ (int)b;
        exp2 = (double)a/b;
        
    }
    public static void Ejercicio3(){
        int a = 10, b = -8, c = 36;
        System.out.println("El contenido de\n a: " + a + " b:" + b + " c:" + c);
        a = b;
        b = c;
        c = a;
        System.out.println("El contenido de\n a: " + a + " b:" + b + " c:" + c);
    }
    
    public static void Ejercicio4(){
        int a = 5, b = 26;
        if(a > b)
           System.out.println("Numero mayor es: " + a);
        else{
            if(b > a)
                System.out.println("Numero mayor es: " + b);
            else
                System.out.println("Los numeros son Iguales.");
        }
    }
    
    public static void Ejercicio5(){
        String nombre = "Marcos";
        System.out.println("Bienvenido " + nombre);
    }
    
    public static void Ejercicio6(){
        Scanner teclado = new Scanner (System.in);
        String nombre;
        System.out.println("Ingrese su nombre: ");
        nombre= teclado.next();
        System.out.println("Bienvenido " + nombre);
    }
    
    public static void Ejercicio7(){
        Scanner teclado = new Scanner (System.in);
        double area;
        System.out.println("Ingrese el radio: ");
        double nro = teclado.nextDouble();
        area = (Math.pow(nro, 2)) * 3.14;
        System.out.println("La area de circunferencia es: " + area);
    }
    
    public static void Ejercicio8 (){
        Scanner teclado = new Scanner (System.in);
        System.out.println("ingrese un numero Entero: ");
        int nro = teclado.nextInt();
        if((nro % 2) == 0)
            System.out.println("El numero ingresado es Divisible entre 2");
        else
            System.out.println("El numero ingresado es NO divisible entre 2");
    }
    
    public static void Ejercicio9(){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese un numero entero: ");
        int nro = teclado.nextInt();
        System.out.println((char)nro);
    }
    public static void Ejercicio10(){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese un numero entero: ");
        String nro = teclado.next();
        System.out.println("EL caracter es igual al numero:" + (int)(nro.charAt(0)));
    }
   
    public static void Ejercicio11 (){
        double porcentaje, precio;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el precio del producto: ");
        precio = teclado.nextDouble ();
        porcentaje = (21 * precio) / 100;
        System.out.println("Precio final de lista: " + (precio + porcentaje));
    }
    
    public static void Ejercicio12 (){
        int i = 1;
        while(i<101){
            System.out.println(i);
            i++;
        }
    }
    
    public static void Ejercicio13 (){
        int i;
        for(i=1;i<101;i++){
            System.out.println(i);
        }
    }
    
    public static void Ejercicio14(){
        int i;
        for(i=6;i<=100;i+=6){
            if((i % 3) == 0)
                System.out.println(i);
        }
    }
    
    public static void Ejercicio15 (){
        Scanner teclado = new Scanner (System.in);
        int i, cantidadVentas;
        double sumaTotal = 0;
        
        System.out.print("Ingrese la cantidad de veces que va a cargar las ventas: ");
        cantidadVentas = teclado.nextInt();
        for(i=1;i<=cantidadVentas;i++){
             sumaTotal = teclado.nextDouble() + sumaTotal;
        }       
        System.out.println("La ventas Total es: " + sumaTotal);
    }
    
    public static void Ejercicio16 (){
        Scanner teclado = new Scanner (System.in);
        int a, b, c;
        double determinante, raiz, raizEcuacion, raiz2Ecuacion;
        System.out.println("Ingrese el numero de segundo grado, de primer grado, y por ultimo el termino independiente: ");
        c = teclado.nextInt ();
        b = teclado.nextInt ();
        a = teclado.nextInt ();
        determinante = (Math.pow(b,2) - 4) * a * c;
        if(determinante != 0){
        raiz = Math.sqrt(determinante);
        raizEcuacion= ((-b + raiz) / (2 * a));
        raiz2Ecuacion= ((-b - raiz) / (2 * a));
        System.out.println("El resultado de las raices son: " + raizEcuacion + " " + raiz2Ecuacion);
        }else
            System.out.println("La exuacion no tiene solucion.");
        
    }  //probar
    
    public static void Ejercicio17 (){
        Scanner teclado = new Scanner (System.in);
        double nro;
        System.out.println("Ingrese un numero para comprovar si es mayor o igual a 0: ");
        do{
            nro = teclado.nextDouble();
            if(nro > 0 )
                 System.out.println(nro + " es Mayor que 0.");
            else{
                if (nro == 0)
                    System.out.println("EL numero ingresado es Igual a que 0.");
                else
                    System.out.println("EL numero ingresado no es igual ni mayor a 0 intente de nuevo.");
            }
                
        }while(nro < 0);
    }
    
    public static void Ejercicio19 (){  
        String dia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana");
        dia = teclado.next();
        if((dia.equalsIgnoreCase("Sabado")) || (dia.equalsIgnoreCase("domingo")))   //compara dos string sin importar las Mayusculas
            System.out.println("No es un dia laboral");
     else
            System.out.println("Es un dia laboral");
        
            
        }
    
    public static void Ejercicio20 (){         
        Scanner teclado = new Scanner(System.in);
        int maximo;
        int minimo;
        System.out.print("Ingrese numero Maximo: ");
        maximo = teclado.nextInt ();
        System.out.print("Minimo: ");
        minimo = teclado.nextInt ();
        double aux = Math.floor(Math.random()*(maximo - minimo + 1) + minimo);
        System.out.println("Numero: " + aux);
    }
        
    public static void Ejercicio21(){
        Scanner teclado = new Scanner(System.in);
        String entero;
        int i;
        boolean nroEntero = true;
        System.out.println("Ingrese un dato para ver si es entero: ");
        entero = teclado.next();
        for (i=0;i<entero.length();i++){    //length sacas la canditad de char que tiene
            if(!(Character.isDigit(entero.charAt(i)))){ //charAr(i) obtewnes la posición del string 
            nroEntero = false;           //character.isDigit nos dira si el char que pasa por parametro es dijito del 0 al 9
            }
        }
        if(nroEntero){
         System.out.println("Es un Numero Entero.");
        System.out.println("La cantidad de cifras que contiene son: "+ entero.length());
        }else
            System.out.println("Es un numero NO entero.");
    }
    
    public static void Ejercicio22 (){
        Scanner teclado = new Scanner(System.in);
        boolean primo = true;
        int contador = 2;
        System.out.printf("Ingrese un numero Entero: ");
        int nro = teclado.nextInt();
        while ((primo) && (contador != nro)){   //no tiene que dar cero el resto de la divición
          if(nro % contador == 0)   
              primo = false;
          contador++;
        }
        if(primo)
            System.out.println("Es un Numero Primo");
        else
            System.out.println("NO es un numero primo");
    }
    
    public static void Ejercicio23 (){
        int i;
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
       System.out.println("5");
        System.out.println("7");
        for(i=2;i<100;i++){
            if(!((i % 2) == 0)){
                if(!((i % 3) == 0)){
                    if (!((i % 5) == 0)){
                        if (!((i % 7) == 0))
                            System.out.println(i);
                    }
                }
            }
        }
    }
    
    public static void Ejercicio24(){
        int i;
        String frase = "La lluvia en Corrientes fue una pesadilla durante los meses de abril y mayo";
        char letra;
        int cont = 0;
        for(i = 0; i < frase.length(); i++){
            letra = (frase.charAt(i));
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
             cont++;
            }
        System.out.println("La cantidad de vocales que tiene es: "+ cont);
    }
    
    public static void Ejercicio25(){
        String frase = "La lluvia en Corrientes fue una pesadilla durante los meses de abril y mayo";
        frase = frase.replace('a' ,'e');
        System.out.println(frase);
    }
    
    public static void Ejercicio26(){
        int i;
        String frase = "La lluvia en Corrientes fue una pesadilla durante los meses de abril y mayo";
        char letra;
        for(i = 0; i < frase.length(); i++){
            letra = (frase.charAt(i));
        System.out.println(letra+ "=" +(int)letra + "\n");    
            }
        
    }
    
    public static void Ejercicio27 (){
        Scanner teclado = new Scanner (System.in);
        int operando1, operando2;
        double resultado;
        String operacion;
        String respuesta;
        do{
        System.out.println("Ingrese el primer numero: ");
        operando1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        operando2 = teclado.nextInt();
        System.out.println("Ingrese la operacion: ");
        operacion = teclado.next();
        switch(operacion.charAt(0)){
            case '+':
                resultado = operando1 + operando2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = operando1 - operando2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = operando1 * operando2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                resultado = operando1 / operando2;
                System.out.println("Resultado: " + resultado);
                break;
            case 'p':
                resultado = Math.pow(operando1, operando2);
                System.out.println("Resultado: " + resultado);
                break;
            case '%':
                resultado = operando1 % operando2;
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Ingreso mal el codido de Operacion.");
        }
        System.out.println("Dese seguir haciendo operaciones?(S/N)");
        respuesta = teclado.next();
    }while( respuesta.charAt(0) == 'S' || respuesta.charAt(0) == 's'); 
        
    }
}


       
