package com.petStore.controlador;

import com.petStore.bd.Conexion;
import com.petStore.DAO.ProductoCarritoDAO;
import com.petStore.modelo.ProductoCarrito;
import com.petStore.Utilidades.Respuesta;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Juan David Castrillón
 */

@Path("/productocarrito")
public class ProductoCarritoControlador {
    
    private Connection conexion = Conexion.getInstancia().conectar();
    private ProductoCarritoDAO productocarritoDAO = new ProductoCarritoDAO(conexion);
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta<ProductoCarrito> getProducto(@PathParam("id") int id){
        Respuesta<ProductoCarrito> respuesta = new Respuesta<>();
        List<ProductoCarrito> productocarrito = this.productocarritoDAO.getProductoCarrito(id);
        
        respuesta.setEstado("OK");
        respuesta.setMensaje("OK");
        respuesta.setDatos(productocarrito);
        
        return respuesta;
    }
    
}
