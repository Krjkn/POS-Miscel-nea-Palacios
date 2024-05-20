import java.awt.HeadlessException;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConexionDB {
Connection con=null;

    public static Connection conexion( ){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.getConnection("jdbc:mysql://localhost/miscelanea_palacios","root","");
            
        } catch (ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    public static boolean signer(String Nombre, String Password){
        try {
            // Configurar la conexión con la base de datos
            String url = "jdbc:mysql://localhost/miscelanea_palacios";
            String user = "root";
            String password_db = "";
            Connection connection = DriverManager.getConnection(url, user, password_db);

            // Crear la consulta SQL para obtener el nombre de usuario y contraseña
            String query = "SELECT Nombre, Password FROM usuarios WHERE Nombre = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, Nombre);

            // Ejecutar la consulta SQL y obtener el resultado
            ResultSet resultSet = statement.executeQuery();

            // Verificar si se encontró el usuario
            if (resultSet.next()) {
                // Obtener la contraseña de la base de datos
                String dbPassword = resultSet.getString("password");

                // Comparar la contraseña ingresada con la contraseña de la base de datos
                if (Password.equals(dbPassword)) {
                    // La contraseña es correcta, se puede permitir el acceso
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Si se llega aquí, es porque no se encontró el usuario o la contraseña no es correcta
        return false;
    }
    public static int insertToUser(String Nombre, String correoElectronico, String Password, String respuesta1) {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/miscelanea_palacios","root","");

        String sql = "INSERT INTO usuarios (Nombre, correoElectronico,Password,respuesta1) Values (?,?,?,?)";
        
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setString(1, Nombre);
        ps.setString(2, correoElectronico);
        ps.setString(3, Password);
        ps.setString(4, respuesta1);
        ps.executeUpdate();
        

        
        
    } catch (SQLException e) {
        System.out.println(e);
        if(e.getErrorCode() == 19) { //Duplicate username
            return 19;
        } else {
            // Handle other SQL exceptions here
        }
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);    
    }
    return 0;
}
     public static void actualizarUsuario(String Nombre, String correoElectronico, String Password, String pregunta1, int ID_Usuario) throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/miscelanea_palacios","root","");
        
        try {

            PreparedStatement pst = con.prepareStatement("UPDATE usuarios SET Nombre= ?, correoElectronico = ?, Password= ?, respuesta1=? Where ID_Usuario=?");
            pst.setString(1, Nombre);
            pst.setString(2, correoElectronico);
            pst.setString(3, Password);
            pst.setString(4, pregunta1);
            pst.setInt(5, ID_Usuario);

            


            if (pst.executeUpdate() > 0) {

                JOptionPane.showMessageDialog(null,"Usuario Actualizado");
            }
            con.close();
        } catch (HeadlessException | SQLException e) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, e);
        }       
    }
}
