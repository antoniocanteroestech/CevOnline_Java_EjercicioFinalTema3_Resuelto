package es.estech;

/**
 * Clase principal dónde se ejecuta el programa
 * @author acantero
 */
public class Main {

    /**
     * Método generador de datos
     * Utilizamos el constructor del objeto House para crear tantos objetos como necesitemos
     *
     * Creamos un array inicializandolo con los objetos anteriormente creados
     *
     * @return
     */
    private static House[] generateData(){
        House house1 = new House("dirección 1", "29080", 4, 80);
        House house2 = new House("dirección 2", "29081", 3, 70);
        House house3 = new House("dirección 3", "29082", 2, 55);
        House house4 = new House("dirección 4", "29083", 4, 120);
        House house5 = new House("dirección 5", "29084", 1, 65);
        House house6 = new House("dirección 6", "29085", 3, 75);

        House[] houses = {house1, house2, house3, house4, house5, house6};

        return houses;

    }

    /**
     * Método encargado de listar las Direcciones de las casas contenidas en un array
     * Al pasar el array de casas por parámteros, hacemos que el método sea reutilizable
     *
     * @param houses
     */
    private static void listAddresses(House[] houses){
        System.out.println("Listado de direcciones:");
        for (int i = 0; i <= houses.length-1; i++){
            System.out.println("Casa nº"+(i+1)+": "+houses[i].getAddress());
        }
    }

    /**
     * Método encargado de listar los Códigos Postales de las casas contenidas en un array
     * Al pasar el array de casas por parámteros, hacemos que el método sea reutilizable
     *
     * @param houses
     */
    private static void listPostalCodes(House[] houses){
        System.out.println("Listado de códigos postales:");
        for (int i = 0; i <= houses.length-1; i++){
            System.out.println("Casa nº"+(i+1)+": "+houses[i].getPostalCode());
        }
    }

    /**
     * Método encargado de listar los Números de Habitaciones de las casas contenidas en un array
     * Al pasar el array de casas por parámteros, hacemos que el método sea reutilizable
     *
     * @param houses
     */
    private static void listRoomsNumber(House[] houses){
        System.out.println("Listado de números de habitaciones:");
        for (int i = 0; i <= houses.length-1; i++){
            System.out.println("Casa nº"+(i+1)+": "+houses[i].getRoomNumber());
        }
    }

    /**
     * Método encargado de listar los metros cuadrados de las casas contenidas en un array
     * Al pasar el array de casas por parámteros, hacemos que el método sea reutilizable
     *
     * @param houses
     */
    private static void listSizes(House[] houses){
        System.out.println("Listado de metros cuadrados:");
        for (int i = 0; i <= houses.length-1; i++){
            System.out.println("Casa nº"+(i+1)+": "+houses[i].getAddress()+"m2");
        }
    }

    /**
     * Método encargado de listar todos los datos de las casas contenidas en un array
     *
     * Ya que algunos habéis querido mostrar los datos de todas las cass de forma conjunta, una buena opción es
     * utilizar un método que se encargue de ello. Como en el objeto House sobreescribimos el método toString,
     * solo con imprimir cada objeto House del array que pasamos por parámetro, Java ya saca los datos que se
     * especificaron en el método toString
     *
     * Al pasar el array de casas por parámteros, hacemos que el método sea reutilizable
     *
     * @param houses
     */
    private static void listCompleteHouseDetails(House[] houses){
        System.out.println("Listado completo de detalles por casa");
        for (int i = 0; i <= houses.length-1; i++){
            System.out.println("Casa nº" + (i+1) + ":" + houses[i]);
        }
    }

    public static void blankLine(){
        System.out.println("\n");
    }


    public static void main(String[] args) {

        /*
        Creamos un array de objetos House llamando al método generador de datos
        En una aplicación en entorno real esta entrada de datos se daría por una consulta en bbdd o
        una petición a una API, por ejemplo
         */
        House[] houses = generateData();

        /*
        Listamos las direcciones
         */
        listAddresses(houses);

        blankLine();

        /*
        Listamos los códigos postales
         */
        listPostalCodes(houses);
        blankLine();

        /*
        Listamos los números de habitaciones
         */
        listRoomsNumber(houses);
        blankLine();

        /*
        Listamos los metros cuadrados
         */
        listSizes(houses);
        blankLine();
        blankLine();

        /*
        Listamos la información completa de cada casa
         */
        listCompleteHouseDetails(houses);









    }
}
