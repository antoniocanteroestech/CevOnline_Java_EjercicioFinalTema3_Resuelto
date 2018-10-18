package es.estech;

/**
 * Clase House que define la entidad House.
 *
 * Una entidad se refiere a un objeto casa, por tanto se nombra en singular
 *
 * @author acantero
 */
public class House {

    /**
     * Definimos los atributos de clase
     */
    private String address;
    private String postalCode;
    private int roomNumber;
    private double size;

    /**
     * Método constructor que requiere que se pase valor para los cuatro atributos por parámetro
     * @param address
     * @param postalCode
     * @param roomNumber
     * @param size
     */
    public House(String address, String postalCode, int roomNumber, double size) {
        this.address = address;
        this.postalCode = postalCode;
        this.roomNumber = roomNumber;
        this.size = size;
    }

    /**
     * Una de las características de la POO es el encapsulamiento, los atributos de clase no son accesibles
     * desde el exterior (para evitar problemas de seguridad)
     *
     * Es una buena práctica definir los atributos de clase como "private", y definir getters y setters para acceder a ellos
     *
     */

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }


    /**
     * Al sobreescribir el método toString especificamos que información se mostrará cuando queramos imprimir
     * directamente cualquier objeto de la clase House
     *
     */
    @Override
    public String toString() {
        return "{" +
                "address='" + address + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", roomNumber=" + roomNumber +
                ", size=" + size + "m2" +
                '}';
    }
}
