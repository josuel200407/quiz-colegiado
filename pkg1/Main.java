/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1;

/**
 *
 * @author Rodrigo Rodriguez
 */
import java.util.Date;

class Cliente {
    private String nombre;
    private String cedula;
    private double montoTotalPagado;

    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.montoTotalPagado = 0;
    }

    public String getzNombre() {
        return nombre;
    }

    public String getzCedula() {
        return cedula;
    }

    public double getMontoTotalPagado() {
        return montoTotalPagado;
    }

    public void setMontoTotalPagado(double montoTotalPagado) {
        this.montoTotalPagado = montoTotalPagado;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + " - Cédula: " + cedula + " - Monto Total Pagado: $" + montoTotalPagado;
    }
}

class Factura {
    private String nombreCliente;
    private String cedulaCliente;
    private String codigoFactura;
    private double monto;
    private int mes;
    private int anio;
    private int estado;

    public Factura(String nombreCliente, String cedulaCliente, String codigoFactura, double monto, int mes, int anio, int estado) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.monto = monto;
        this.mes = mes;
        this.anio = anio;
        this.estado = estado;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public double getMonto() {
        return monto;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Factura: " + nombreCliente + " - Cédula: " + cedulaCliente + " - Código: " + codigoFactura
                + " - Monto: $" + monto + " - Mes: " + mes + " - Año: " + anio + " - Estado: " + estado;
    }
}

