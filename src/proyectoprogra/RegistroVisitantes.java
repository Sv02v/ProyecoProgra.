/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra;

import javax.swing.JOptionPane;

/**
 *
 * @author sebastian
 */
public class RegistroVisitantes {
      private final Visitantes[] visitantes;
    private int contador;

    public RegistroVisitantes() {
        visitantes = new Visitantes[10]; // Inicia con un arreglo de tamaño 10
        contador = 0;
        agregarVisitantesPrecargados(); // Agregar visitantes precargados al iniciar
    }

    public void agregarVisitante() { // Verificar si hay espacio en el arreglo para un nuevo visitante
        if (contador < visitantes.length) {
            Visitantes visitante = new Visitantes();
            visitante.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del visitante:"));
            visitante.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del visitante:")));
            visitante.setFechaIngreso("25/07/2024 10:00:00"); // Fecha fija
            visitantes[contador] = visitante;
            contador++;
        } else {
            // Si no hay espacio, mostramos un mensaje al usuario
            JOptionPane.showMessageDialog(null, "No se pueden agregar mas habitats,arreglo lleno.");
        }
    }

    public void mostrarVisitantes() {
        String resultado = "";
        for (int i = 0; i < contador; i++) { //Cadena con la información de cada visitante
            resultado += "Nombre: " + visitantes[i].getNombre()
                    + ", Edad: " + visitantes[i].getEdad()
                    + ", Fecha de Ingreso: " + visitantes[i].getFechaIngreso() + "\n";
        }
        // Mostramos todos los hqbitats al usuario
        JOptionPane.showMessageDialog(null, resultado);
    }

    public void mostrarEstadisticas() {
        int totalVisitantes = contador;//total de visitantes agregados
        int totalNinos = 0;// Iniciador del contador de niños
        int totalAdultos = 0;// Iniciador del contador de adultos

        for (int i = 0; i < contador; i++) {
            // Buscamos el habitat con el ID 
            if (visitantes[i].getEdad() < 18) {
                totalNinos++;
            } else {
                totalAdultos++;

            }
        }
        JOptionPane.showMessageDialog(null, "Total de visitantes: " + totalVisitantes
                + "\nTotal de niños: " + totalNinos
                + "\nTotal de adultos: " + totalAdultos);
    }

    private void agregarVisitantesPrecargados() {
        // visitantes precargados
        visitantes[0] = new Visitantes("Juan Perez", 12, "25/07/2024 10:00:00");
        visitantes[1] = new Visitantes("Maria Gomez", 25, "25/07/2024 11:00:00");
        visitantes[2] = new Visitantes("Luis Rodriguez", 35, "25/07/2024 12:00:00");
        contador = 3;
    }

    void mostrarEstadísticas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
