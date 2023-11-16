package ClasesYObjetos;

public class carro {
    String color;
    String marca;
    int km;


    public static void main(String[] args) {
        carro Carro1 = new carro();
        Carro1.color = "Verde";
        Carro1.marca = "Bmw";
        Carro1.km = 200;
        System.out.println("el color de la moto es: " + Carro1.color);
        System.out.println("la marca de la moto es: " + Carro1.marca);
        System.out.println ("el kilometraje de la moto es: " + Carro1.km);




        carro Carro2 = new carro();
        Carro2.color = "Amarillo";
        Carro2.marca = "Mercedes";
        Carro2.km = 220;
        System.out.println("el color de la moto es: " + Carro2.color);
        System.out.println("la marca de la moto es: " + Carro2.marca);
        System.out.println ("el kilometraje de la moto es: " + Carro2.km);



        carro Carro3 = new carro();
        Carro3.color = "morada";
        Carro3.marca = "Mazda";
        Carro3.km = 250;
        System.out.println("el color de la moto es: " + Carro3.color);
        System.out.println("la marca de la moto es: " + Carro3.marca);
        System.out.println ("el kilometraje de la moto es: " + Carro3.km);

    }
}
