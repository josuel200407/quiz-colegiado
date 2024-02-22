/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Rodriguez
 */
public class CalculoImpuestos {

    private int cantidadCursos;
    private String[] nombresCursos;
    private double[][] cursos;

    public CalculoImpuestos() {
        cantidadCursos = 0;
        nombresCursos = null;
        cursos = null;
    }

    public int getCantidadCursos() {
        return cantidadCursos;
    }

    public void setCantidadCursos(int cantidadCursos) {
        this.cantidadCursos = cantidadCursos;
        nombresCursos = new String[cantidadCursos];
        cursos = new double[cantidadCursos][2];
    }

    public void ingresarDatosCursos() {
        for (int i = 0; i < cantidadCursos; i++) {
            nombresCursos[i] = JOptionPane.showInputDialog("Ingrese el nombre del curso " + (i + 1));
            String montoInput = JOptionPane.showInputDialog("Ingrese el monto del curso " + (i + 1));
            double montoCurso = Double.parseDouble(montoInput);
            cursos[i][0] = montoCurso;
            cursos[i][1] = montoCurso * 0.02;
        }
    }

    public void mostrarDatosCursos() {
        StringBuilder mensaje = new StringBuilder("Detalles de los cursos:\n");

        for (int i = 0; i < cantidadCursos; i++) {
            mensaje.append("Curso ").append(i + 1).append(": \n");
            mensaje.append("Nombre: ").append(nombresCursos[i]).append("\n");
            mensaje.append("Monto: $").append(cursos[i][0]).append("\n");
            mensaje.append("Impuesto (2%): $").append(cursos[i][1]).append("\n\n");
        }

        mensaje.append("Total Montos: $").append(calcularTotalMontos()).append("\n");
        mensaje.append("Total Impuestos: $").append(calcularTotalImpuestos()).append("\n");

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

    public double calcularTotalMontos() {
        double totalMontos = 0.0;
        for (int i = 0; i < cantidadCursos; i++) {
            totalMontos += cursos[i][0];
        }
        return totalMontos;
    }

    public double calcularTotalImpuestos() {
        double totalImpuestos = 0.0;
        for (int i = 0; i < cantidadCursos; i++) {
            totalImpuestos += cursos[i][1];
        }
        return totalImpuestos;
    }
}