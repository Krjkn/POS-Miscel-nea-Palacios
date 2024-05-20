/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
class VentaObject {
    private int ID;
    private String Fecha;
    private int Total;
    private String Vendedor;
    private String Efectivo;

    public VentaObject(int ID, String Fecha, int Total, String Vendedor, String Efectivo) {
        this.ID = ID;
        this.Fecha = Fecha;
        this.Total = Total;
        this.Vendedor = Vendedor;
        this.Efectivo = Efectivo;
    }

    public VentaObject(int ID, String Fecha, int Total, String Vendedor) {
        this.ID = ID;
        this.Fecha = Fecha;
        this.Total = Total;
        this.Vendedor = Vendedor;
        
    }

    VentaObject() {
       
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public String getEfectivo() {
        return Efectivo;
    }

    public void setEfectivo(String Efectivo) {
        this.Efectivo = Efectivo;
    }

    
}
