public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void cumplirAños() {
        this.edad++;
    }

    public void mostrarFicha() {
        System.out.println("Nombre: " + this.nombre + " | Especie: " + this.especie + " | Edad: " + this.edad);
    }
}
