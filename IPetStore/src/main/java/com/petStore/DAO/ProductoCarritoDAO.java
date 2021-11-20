package com.petStore.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.petStore.modelo.ProductoCarrito;

/**
 *
 * @author Juan David Castrillón
 */
public class ProductoCarritoDAO {
    
    private Connection conexion;
    
    public ProductoCarritoDAO(Connection conexion){
        this.conexion = conexion;
    }
    
    public List<ProductoCarrito> getProductoCarrito(int id){
        List<ProductoCarrito> productosCarrito = new ArrayList<>();
        try{
            String sql = "SELECT * FROM productocarrito WHERE id = ?";
            PreparedStatement pst = this.conexion.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();            
            while(rs.next()){
                ProductoCarrito pc = new ProductoCarrito();
                pc.setId(rs.getInt("id"));
                pc.setCarrito(rs.getInt("carrito"));
                pc.setProducto(rs.getInt("producto"));
                pc.setCantidad(rs.getInt("cantidad"));
                pc.setPrecio(rs.getDouble("precio"));
                productosCarrito.add(pc);
            }
        }
        catch(SQLException e){
            System.out.println("Error en SQL: "+e.getMessage());
        }
        
        return productosCarrito;
    }
    
}
