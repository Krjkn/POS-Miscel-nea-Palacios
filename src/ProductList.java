
import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public class ProductList {
    private int ID_producto;
    private String Lote;
    private String Nombre;
    private String Descripcion;  
    private Double Precio_Venta;
    private Double Precio_Compra;
    private int Stock;
    private Date Fecha_cad;
    private String Descuento;

    public ProductList(int ID_producto, String Lote, String Nombre, String Descripcion, double Precio_Venta,double Precio_Compra, int Stock, Date Fecha_cad, String Descuento) {
        this.ID_producto = ID_producto;
        this.Lote = Lote;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Precio_Venta = Precio_Venta;
        this.Precio_Compra = Precio_Compra;
        this.Stock = Stock;
        this.Fecha_cad = Fecha_cad;
        this.Descuento = Descuento;
    }

    ProductList() {
    }

    

    public int getID_producto() {
        return ID_producto;
    }

    public void setID_producto(int ID_producto) {
        this.ID_producto = ID_producto;
    }

    public String getLote() {
        return Lote;
    }

    public void setLote(String Lote) {
        this.Lote = Lote;
    }



    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }


    public Double getPrecio_Venta() {
        return Precio_Venta;
    }

    public void setPrecio_Venta(Double Precio_Venta) {
        this.Precio_Venta = Precio_Venta;
    }

    public Double getPrecio_Compra() {
        return Precio_Compra;
    }

    public void setPrecio_Compra(Double Precio_Compra) {
        this.Precio_Compra = Precio_Compra;
    }
    
    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public Date getFecha_cad() {
        return Fecha_cad;
    }

    public void setFecha_cad(Date Fecha_cad) {
        this.Fecha_cad = Fecha_cad;
    }

    public String getDescuento() {
        return Descuento;
    }

    public void setDescuento(String Descuento) {
        this.Descuento = Descuento;
    }

    
    }
