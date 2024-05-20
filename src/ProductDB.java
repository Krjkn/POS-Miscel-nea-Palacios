
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public class ProductDB {
    public static boolean flag = false;
    
    public static void insertIntoProductDB(String lote, String Nombre, String Descripcion, double precio_venta,double precio_compra, int Stock, String Fecha_Cad, int Descuento){
        try {
         
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/miscelanea_palacios","root","");
         
            PreparedStatement ps = con.prepareStatement("INSERT INTO productos(Lote, Nombre, Descripcion, Precio_Venta, Precio_Compra, Stock, Fecha_Cad, Descuento)"
                    + " VALUES (?,?,?,?,?,?,?,?)");
            
            ps.setString(1, lote);
            ps.setString(2, Nombre);
            ps.setString(3, Descripcion);
            ps.setDouble(4, precio_venta);
            ps.setDouble(5, precio_compra);
            ps.setInt(6, Stock);
            ps.setString(7, Fecha_Cad);
            ps.setInt(8, Descuento);
            
            if(ps.executeUpdate()==1)
                JOptionPane.showMessageDialog(null, "Añadido exitosamente!");
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDB.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    
    public static void updateProductDB(int ID_Prod, int Stock){
         try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/miscelanea_palacios","root","");
            
            PreparedStatement ps = con.prepareStatement("UPDATE productos SET Stock=? WHERE ID_Prod=?");
            
            ps.setInt(1, ID_Prod);
            ps.setInt(2, Stock);
            if(ps.executeUpdate()==0)
                JOptionPane.showMessageDialog(null, "Articulo no encontrado!");
            else if(ps.executeUpdate()==1 && flag){
                JOptionPane.showMessageDialog(null, "Stock actualizado!");
                flag = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductDB.class.getName()).log(Level.SEVERE, null, ex);

    }
         
    }
    
    public static ArrayList<ProductList> TableGenerator(){
    ArrayList<ProductList> list = new ArrayList<>();
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/miscelanea_palacios","root","");
        Statement ps = con.createStatement();
        ResultSet rs = ps.executeQuery("SELECT ID_Prod, Lote, Nombre, Descripcion, Precio_Venta,Precio_Compra, Stock, Fecha_Cad, Descuento FROM productos");

        ProductList pl;

        while(rs.next()){
            pl = new ProductList(rs.getInt("ID_Prod"), rs.getString("Lote"), rs.getString("Nombre"),
                    rs.getString("Descripcion"), rs.getDouble("Precio_Compra"),rs.getDouble("Precio_Venta"), rs.getInt("Stock"),
                    rs.getDate("Fecha_Cad"), rs.getString("Descuento"));

            list.add(pl);
        }

    } catch (SQLException ex) {
        Logger.getLogger(ProductDB.class.getName()).log(Level.SEVERE, null, ex);
    }
    return list;
}

    /* public static ArrayList<ProductList> homePageContent(){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/gadgets","root","root");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT mbrand, mmodel, mprice, mquantity, mdescription, mphoto FROM mobiles");
            
            ProductList pl;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("mbrand"),rs.getString("mmodel"),
                        rs.getInt("mprice"),rs.getInt("mquantity"),rs.getString("mdescription"),
                        rs.getString("mphoto"));
                
                list.add(pl);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MobileDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
    */
    
    public static ArrayList<ProductList> checkStock(){
    ArrayList<ProductList> list = new ArrayList<>();
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/miscelanea_palacios","root","");
        Statement ps = con.createStatement();
        ResultSet rs = ps.executeQuery("SELECT ID_Prod, Lote, Nombre, Descripcion, Stock, Precio_Venta,Precio_Compra, Fecha_Cad, Descuento FROM productos");

        ProductList pl;

        while(rs.next()){
            pl = new ProductList(rs.getInt("ID_Prod"), rs.getString("Lote"), rs.getString("Nombre"),
                    rs.getString("Descripcion"), rs.getDouble("Precio_Compra"),rs.getDouble("Precio_Venta"), rs.getInt("Stock"),
                    rs.getDate("Fecha_Cad"), rs.getString("Descuento"));

            list.add(pl);
        }

    } catch (SQLException ex) {
        Logger.getLogger(ProductDB.class.getName()).log(Level.SEVERE, null, ex);
    }
    return list;
}

    
       public static void delete(int ID_Prod){
        int confirm = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres borrar el artículo?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/miscelanea_palacios","root","");
        PreparedStatement ps = con.prepareStatement("DELETE FROM productos WHERE ID_Prod=?");
        ps.setInt(1, ID_Prod);
        if(ps.executeUpdate()==0)
            JOptionPane.showMessageDialog(null, "Artículo no encontrado!");
        else
            JOptionPane.showMessageDialog(null, "Artículo eliminado!");
    } catch (SQLException ex) {
        Logger.getLogger(ProductDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}



    public static void sellProductDB(int ID_Prod, int Stock){
         try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/miscelanea_palacios","root","");
            
            PreparedStatement ps = con.prepareStatement("UPDATE productos SET Stock=? WHERE ID_Prod=?");

            ps.setInt(1, Stock); // Cambiar el orden de los parámetros
            ps.setInt(2, ID_Prod);

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated == 0) {
                JOptionPane.showMessageDialog(null, "Articulo no encontrado!");
            } else if (rowsUpdated == 1 && flag) {
                JOptionPane.showMessageDialog(null, "Reducido del stock");
                flag = false;
            }


        } catch (SQLException ex) {
            Logger.getLogger(ProductDB.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    public static void actualizarProducto(String lote, String Nombre, String Descripcion, double precio_venta,
            double precio_compra, int Stock, String Fecha_Cad, int Descuento, int ID_Prod) throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/miscelanea_palacios","root","");
        
        try {

            PreparedStatement pst = con.prepareStatement("UPDATE productos SET Lote= ?, Nombre = ?, Descripcion= ?, Precio_Venta=?, Precio_Compra=?, Stock=?, Fecha_Cad=?, Descuento=? Where ID_Prod=?");
            pst.setString(1, lote);
            pst.setString(2, Nombre);
            pst.setString(3, Descripcion);
            pst.setDouble(4, precio_venta);
            pst.setDouble(5, precio_compra);
            pst.setInt(6, Stock);
            pst.setString(7, Fecha_Cad);
            pst.setInt(8, Descuento);
            pst.setInt(9, ID_Prod);

            if (pst.executeUpdate() > 0) {

                JOptionPane.showMessageDialog(null,"Producto Actualizado");
            }
            con.close();
        } catch (HeadlessException | SQLException e) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, e);
        }       
    }
}



