import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Operadores Aritmeticos
        int a = 5, b = 7;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        float division = (float) a / (float) b;
        int resto = a % b;
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Resto: " + resto);

        //Operadores de Asignacion
        int i = 5;
        int j = i + 2;
        i += 2;
        System.out.println(i);
        i += 5;
        System.out.println(i);
        i += 4;
        System.out.println(i);
        i += 3;
        System.out.println(i);

        //Operadores Unarios
        int c = -2;
        int d = -c;
        System.out.println(d);
        int k = -4;
        int m = +k;
        System.out.println(m);

        //Operadores de Incremeto y decremento
        int e = 5;
        int f = ++e;
        System.out.println(f);

        e = 5;
        int g = e++;
        System.out.println(g);
        System.out.println(e);

        e = 5;
        int h = --e;
        System.out.println(h);

        e = 5;
        int l = e--;
        System.out.println(l);
        System.out.println(e);

        //Operadores Relacionales
        int a1 = 7, b1 = 5;
        boolean mentira =  false;
        boolean r1 = (a1==b1);
        System.out.println(r1);
        boolean r2 = (!r1);
        System.out.println(r2);
        boolean r3 = (a1!=b1);
        System.out.println(r3);
        boolean r4 = (true==mentira);
        System.out.println(r4);
        boolean r5 = (true!=mentira);
        System.out.println(r5);
        boolean r6 = (a1<b1);
        System.out.println(r6);
        boolean r7 = (a1>b1);
        System.out.println(r7);
        boolean r8 = (a1<=b1);
        System.out.println(r8);
        boolean r9 = (a1>=b1);
        System.out.println(r9);

        //Operadores Logicos
        int a2 = 7, b2 = 5;
        boolean mentira2 = false;
        boolean x1 = a2 > b2 || a2==b2;
        boolean x2 = a2 > b2 && mentira2==true;
        System.out.println(x1);
        System.out.println(x2);

        //Ejemplo login
        String usuario = "Abraham";
        String constraseña = "12345";

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre de usuario");
        String u = entrada.nextLine();
        System.out.println("Introduce tu nombre de contraseña");
        String p = entrada.nextLine();

        if (usuario.equalsIgnoreCase(u) && constraseña.equals(p)){
            System.out.println("Datos Autenticados... Bienvenido");
        }else {
            System.out.println("Datos erroneos... Intente de nuevo");
        }

        //Operadores Ternarios
        Scanner numero = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int a3 = entrada.nextInt();
        System.out.println("Introduce el segundo numero");
        int b3 = entrada.nextInt();
        System.out.println("Introduce el tercer numero");
        int c3 = entrada.nextInt();

        int max;
        max = (a3>b3) ? a3:b3;
        max = (max>c3) ? max:c3;
        System.out.println("El maximo entre los 3 numero es " + max);

        //Operador InstanceOf
        String texto = "Hola, ¿Que tal?";
        Number num = 6;

        boolean z = texto instanceof String;
        System.out.println(z);
        z = texto instanceof Object;
        System.out.println(z);
        z = num instanceof Integer;
        System.out.println(z);
        z = num instanceof Object;
        System.out.println(z);
        z = num instanceof Long;
        System.out.println(z);
        z = num instanceof Double;
        System.out.println(z);
        z = num instanceof Float;
        System.out.println(z);
        Number n= 2.56f;
        z = num instanceof Object;
        System.out.println(z);

        //Precedencia de los operadores
        int q1 = 18;
        int q2 = 15;
        int q3 = 5;

        double promedio = (++q1 +--q2 +c)/3d;
        System.out.println(promedio);
    }

}