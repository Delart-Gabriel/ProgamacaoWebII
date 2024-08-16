package exercicio01;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Reflexao {

    public static void main(String args[]) {
        try {
            String filho = "exercicio01.Filho";

            listarAtributos(filho);

            listarMetodos(filho);

        } catch (Throwable e) {
            System.err.println(e);
        }
    }

    public static void listarAtributos(String filho) {
        try {
            Class<?> c = Class.forName(filho);


            Field f[] = c.getDeclaredFields();

            for (int i = 0; i < f.length; i++) {
                System.out.println("Atributo: " + f[i].getName().toString());
                System.out.println("Tipo do Atributo: " + f[i].getType());
                System.out.println("--");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Classe nao encontrada: " + filho);
        }
    }

    public static void listarMetodos(String filho) {
        try {
            Class<?> c = Class.forName(filho);

            Method[] m = c.getMethods();

            for (int i = 0; i < m.length; i++) {
                System.out.println("Metodo: " + m[i].getName().toString());
                System.out.println("Tipo do Metodo: " + m[i].getReturnType());
                for(Parameter x: m[i].getParameters()){
                    System.out.println(x.getName());
                    System.out.println(x.getType());
                }
                System.out.println("--");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Classe nao encontrada: " + filho);
        }
    }
}
