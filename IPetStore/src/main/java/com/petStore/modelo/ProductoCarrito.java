package com.petStore.modelo;

/**
 *
 * @author Juan David Castrillón
 */
public class ProductoCarrito {
    
    private int id;
    private int carrito;
    private int producto;
    private int cantidad;
    private double precio;

    public ProductoCarrito() {
    }

    public ProductoCarrito(int id, int carrito, int producto, int cantidad, double precio) {
        this.id = id;
        this.carrito = carrito;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarrito() {
        return carrito;
    }

    public void setCarrito(int carrito) {
        this.carrito = carrito;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
    
    
}
