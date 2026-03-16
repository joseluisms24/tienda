package com.miempresa.entidad;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Tienda representa una tienda que contiene una lista de productos.
 * Proporciona métodos para agregar productos, obtener la lista de productos
 * y calcular el precio total de todos los productos en la tienda.
 */
public class Tienda {
    
    private List<Producto> productos;

    /**
     * Constructor de la clase Tienda.
     * Inicializa la lista de productos vacía.
     */
    public Tienda() {
        this.productos = new ArrayList<>();
    }

    /**
     * Agrega un producto a la tienda.
     *
     * @param p El producto que se desea registrar en la tienda.
     */
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    /**
     * Devuelve la lista de productos de la tienda.
     *
     * @return Una nueva lista con todos los productos agregados.
     *         Se devuelve una copia para proteger la lista interna.
     */
    public List<Producto> obtenerProductos() {
        return new ArrayList<>(productos);
    }

    /**
     * Calcula el precio total de todos los productos de la tienda.
     *
     * @return La suma de los precios de todos los productos.
     */
    public double calcularPrecioTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }
}