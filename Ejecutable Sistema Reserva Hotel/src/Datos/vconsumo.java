/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;


public class vconsumo {
    private int idconsumo;
    private int idreserva;
    private int iproducto;
    private Double cantidad;
    private Double precio_venta;
    private String estado;

    public vconsumo() {
    }

    public vconsumo(int idconsumo, int idreserva, int iproducto, Double cantidad, Double precio_venta, String estado) {
        this.idconsumo = idconsumo;
        this.idreserva = idreserva;
        this.iproducto = iproducto;
        this.cantidad = cantidad;
        this.precio_venta = precio_venta;
        this.estado = estado;
    }

    public int getIdconsumo() {
        return idconsumo;
    }

    public void setIdconsumo(int idconsumo) {
        this.idconsumo = idconsumo;
    }

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public int getIproducto() {
        return iproducto;
    }

    public void setIproducto(int iproducto) {
        this.iproducto = iproducto;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(Double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
    
    
    
    
    
    
    
    
    
    
}
