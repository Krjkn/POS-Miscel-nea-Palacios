
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
class VentaDB {
    public static ArrayList<VentaObject> ventas(){
        ArrayList<VentaObject> customers = new ArrayList<>();
      
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/miscelanea_palacios","root","");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT ID_Venta, FechaVenta, Total, Vendedor, Efectivo FROM ventas");
            
            VentaObject pl;
            
            while(rs.next()){
                pl = new VentaObject(rs.getInt("ID_Venta"),rs.getString("FechaVenta"),
                        rs.getInt("Total"),rs.getString("Vendedor"),rs.getString("Efectivo"));
                customers.add(pl);

            }
        } catch (SQLException ex) {
            Logger.getLogger(VentaDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers;
    }
    public static ArrayList<detVentaObject> obtenerDetallesVenta(int idVenta) {
    Connection conexion = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    ArrayList<detVentaObject> detallesVenta = new ArrayList<>();

    try {
        // Establecer conexión con la base de datos
        conexion = DriverManager.getConnection("jdbc:mysql://localhost/miscelanea_palacios","root","");

        // Crear la consulta SQL para obtener los detalles de venta
        String consulta = "SELECT dv.ID_DetalleVenta, dv.ID_Venta, dv.ID_Prod, p.Nombre, p.Descripcion, dv.Cantidad, dv.PrecioUnitario, dv.Descuento, dv.SubTotal, v.Vendedor " +
                  "FROM detallesventa dv " +
                  "INNER JOIN productos p ON dv.ID_Prod = p.ID_Prod " +
                  "INNER JOIN ventas v ON dv.ID_Venta = v.ID_Venta " +
                  "WHERE dv.ID_Venta = ?";


        // Crear el PreparedStatement con la consulta
        statement = conexion.prepareStatement(consulta);
        statement.setInt(1, idVenta);

        // Ejecutar la consulta y obtener el resultado
        resultSet = statement.executeQuery();

        // Recorrer el resultado y crear los objetos DetalleVenta
        while (resultSet.next()) {
            //int idDetalleVenta = resultSet.getInt("ID_DetalleVenta");
            int idProducto = resultSet.getInt("ID_Prod");
            String nombreProducto = resultSet.getString("Nombre");
            String descripcion = resultSet.getString("Descripcion");
            int cantidad = resultSet.getInt("Cantidad");
            double precioUnitario = resultSet.getDouble("PrecioUnitario");
            double SubTotal = resultSet.getDouble("SubTotal");
            double descuento = resultSet.getDouble("Descuento");
            String vendedor = resultSet.getString("Vendedor");

            // Crear un objeto DetalleVenta y agregarlo a la lista
            detVentaObject detalleVenta = new detVentaObject(idVenta, idProducto, nombreProducto, descripcion, cantidad, precioUnitario, SubTotal,descuento,vendedor);
            detallesVenta.add(detalleVenta);
        }
    } catch (SQLException e) {
        System.out.println("Error al obtener los detalles de venta: " + e.getMessage());
    } finally {
        // Cerrar el resultSet, el statement y la conexión
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    return detallesVenta;
}

  
    public static int obtenerVentasAPrecioVentaPorFechas(String fechaInicio, String fechaFin) {
        int totalVentas = 0;
      
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/miscelanea_palacios","root","");
            Statement ps = con.createStatement();
            String query = "SELECT SUM(Total) AS TotalVentas FROM ventas WHERE FechaVenta BETWEEN '" + fechaInicio + "' AND '" + fechaFin + "'";
            ResultSet rs = ps.executeQuery(query);
            
            if (rs.next()) {
                totalVentas = rs.getInt("TotalVentas");
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentaDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return totalVentas;
    }

public static int obtenerTotalVentasPorFechas(String fechaInicio, String fechaFin) {
    int totalVentas = 0;

    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/miscelanea_palacios","root","");
        Statement ps = con.createStatement();
        String query = "SELECT SUM(Total) AS TotalVentas FROM ventas WHERE FechaVenta BETWEEN '" + fechaInicio + "' AND '" + fechaFin + "'";;
        ResultSet rs = ps.executeQuery(query);

        if (rs.next()) {
            totalVentas = rs.getInt("TotalVentas");
        }
    } catch (SQLException ex) {
        Logger.getLogger(VentaDB.class.getName()).log(Level.SEVERE, null, ex);
    }

    return totalVentas;
}

        public static int obtenerGananciasPorFechas(String fechaInicio, String fechaFin) {
            int ganancias = 0;

            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/miscelanea_palacios","root","");
                Statement ps = con.createStatement();
               String query = "SELECT v.ID_Venta, SUM((dv.Cantidad * (dv.PrecioUnitario - p.Precio_Compra)) - dv.Descuento) AS Ganancias " +
               "FROM ventas v " +
               "INNER JOIN detallesventa dv ON v.ID_Venta = dv.ID_Venta " +
               "INNER JOIN productos p ON dv.ID_Prod = p.ID_Prod " +
               "WHERE v.FechaVenta BETWEEN '" + fechaInicio + "' AND '" + fechaFin + "'";


                ResultSet rs = ps.executeQuery(query);

                if (rs.next()) {
                    ganancias = rs.getInt("Ganancias");
                }
            } catch (SQLException ex) {
                Logger.getLogger(VentaDB.class.getName()).log(Level.SEVERE, null, ex);
            }

            return ganancias;
        }

    public static void insertIntoVentaDB(double Total, String ID_Usuario, String Efectivo) {
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/miscelanea_palacios","root","");
        PreparedStatement ps = con.prepareStatement("INSERT INTO ventas(FechaVenta, Total, Vendedor, Efectivo) VALUES(NOW(), ?, ?,?)");
        ps.setDouble(1, Total);
        ps.setString(2, ID_Usuario);
        ps.setString(3, Efectivo);
        ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(VentaDB.class.getName()).log(Level.SEVERE, null, ex);
    }

    }
    public static void registrarDetallesVenta(int idVenta, int idProducto, int cantidad, double precioUnitario,double SubTotal, double Descuento) {
        try {
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/miscelanea_palacios","root","");
            
            PreparedStatement ps = con.prepareStatement("INSERT INTO detallesventa (ID_Venta, ID_Prod, Cantidad, PrecioUnitario, SubTotal, Descuento) values (?,?,?,?,?,?)");
            
            ps.setInt(1, idVenta);
            ps.setInt(2, idProducto);
            ps.setInt(3, cantidad);
            ps.setDouble(4, precioUnitario);
            ps.setDouble(5, SubTotal);
            ps.setDouble(6, Descuento);
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VentaDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al registrar los detalles de venta: " + ex.getMessage());
    }
       
    }

   
    public static int obtenerNumeroVentaActual() {
        Connection conexion = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        int numeroVentaActual = 0;

        try {
            // Establecer conexión con la base de datos
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/miscelanea_palacios","root","");

            // Crear la consulta SQL para obtener el último ID de venta registrado
            String consulta = "SELECT MAX(ID_Venta) FROM ventas";

            // Crear el PreparedStatement con la consulta
            statement = conexion.prepareStatement(consulta);

            // Ejecutar la consulta y obtener el resultado
            resultSet = statement.executeQuery();

            // Verificar si se obtuvo un resultado
            if (resultSet.next()) {
                // Obtener el último ID de venta registrado
                int ultimoIdVenta = resultSet.getInt(1);

                // Incrementar en 1 para obtener el número de venta actual
                numeroVentaActual = ultimoIdVenta + 1;
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener el número de venta actual: " + e.getMessage());
        } finally {
            // Cerrar el resultSet, el statement y la conexión
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return numeroVentaActual;
        
    
}
public static int ingresarVentaActual() {
        Connection conexion = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        int numeroVentaActual = 0;

        try {
            // Establecer conexión con la base de datos
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/miscelanea_palacios","root","");

            // Crear la consulta SQL para obtener el último ID de venta registrado
            String consulta = "SELECT MAX(ID_Venta) FROM ventas";

            // Crear el PreparedStatement con la consulta
            statement = conexion.prepareStatement(consulta);

            // Ejecutar la consulta y obtener el resultado
            resultSet = statement.executeQuery();

            // Verificar si se obtuvo un resultado
            if (resultSet.next()) {
                // Obtener el último ID de venta registrado
                int ultimoIdVenta = resultSet.getInt(1);

                // Incrementar en 1 para obtener el número de venta actual
                numeroVentaActual = ultimoIdVenta + 0;
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener el número de venta actual: " + e.getMessage());
        } finally {
            // Cerrar el resultSet, el statement y la conexión
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return numeroVentaActual;

}
}

