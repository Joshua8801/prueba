package ejercicio1;

public class Main {
    public static void main(String[] args) {
 
        Par<String, Integer> par1 = new Par<>("Impar", 17);
        System.out.println(par1);

        Par<Double, String> par2 = new Par<>(7.0, "Suerte");
        System.out.println(par2);

        par1.setSegundo(26);
        System.out.println("Después de modificar: " + par1);

        System.out.println("Primero de par2: " + par2.getPrimero());
        System.out.println("Segundo de par2: " + par2.getSegundo());
    }
}


