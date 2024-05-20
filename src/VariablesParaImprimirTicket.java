/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public class VariablesParaImprimirTicket {
    private static VariablesParaImprimirTicket instancia = null;
    String Linea1, NombreEmpresa, Calle, Telefono, FechaVenta, HoraVenta, Vendedor, 
            Linea2, CantidadProductoTotal, Linea3, ProductosLista, Linea4, TotalVenta, 
            Agradecimiento, TipoPago, codigoVenta, importe, cambio;
    int Total,idVenta;

    public VariablesParaImprimirTicket() {
        Linea1="";
        NombreEmpresa="Facebook @Miscelanea Palacios";
        Calle="Facebook @Miscelanea Palacios";
        Telefono="tel. 7331511345";
        FechaVenta="";
        HoraVenta="";
        Vendedor="";
        Linea2="";
        CantidadProductoTotal="";
        Linea3="";
        ProductosLista="";
        Linea4="";
        TotalVenta="";
        Agradecimiento="Gracias por su Preferencia";
        TipoPago="";
        codigoVenta="";
        importe="";
        cambio="";
    }
 
    public static VariablesParaImprimirTicket getInstancia() {
        if(instancia == null) {
            instancia = new VariablesParaImprimirTicket();
        }
        return instancia;
    }

    public void regresarANullo (){
        Linea1=null;
        NombreEmpresa=null;
        Calle=null;
        Telefono=null;
        FechaVenta=null;
        HoraVenta=null;
        Vendedor=null;
        Linea2=null;
        CantidadProductoTotal=null;
        Linea3=null;
        ProductosLista=null;
        Linea4=null;
        TotalVenta=null;
        Agradecimiento=null;
        TipoPago=null;
        codigoVenta=null;
        importe=null;
        cambio=null;
    }
    
    void setLinea1(String Linea1){
        this.Linea1=Linea1;
    }
    void setNombreEmpresa(String NombreEmpresa){
        this.NombreEmpresa=NombreEmpresa;
    }
    void setCalle(String Calle){
        this.Calle=Calle;
    }
    void setTelefono(String Telefono){
        this.Telefono=Telefono;
    }
    void setFechaVenta(String FechaVenta){
        this.FechaVenta=FechaVenta;
    }
    void setHoraVenta(String HoraVenta){
        this.HoraVenta=HoraVenta;
    }
    void setVendedor(String Vendedor){
        this.Vendedor=Vendedor;
    }
    void setLinea2(String Linea2){
        this.Linea2=Linea2;
    }
    void setCantidadProductos(String CantidadProductos){
        this.CantidadProductoTotal=CantidadProductos;
    }
    void setLinea3(String Linea3){
        this.Linea3=Linea3;
    }
    void setProductosLista(String ProductosLista){
        this.ProductosLista=ProductosLista;
    }
    void setLinea4(String Linea4){
        this.Linea4=Linea4;
    }
    void setTotalVenta(String TotalVenta){
        this.TotalVenta=TotalVenta;
    }
    void setAgradecimientos(String Agradecimientos){
        this.Agradecimiento=Agradecimientos;
    }
    void setTipoPago(String TipoPago){
        this.TipoPago=TipoPago;
    }
    void setCodigoVenta(String CodigoVenta){
        this.codigoVenta=CodigoVenta;
    }
    void setImporte(String importe){
        this.importe=importe;
    }
    void setCambio(String cambio){
        this.cambio=cambio;
    }
   //--------------------------------------------------------------------------- 
    String getLinea1(){
        return Linea1;
    }
    String getNombreEmpresa(){
        return NombreEmpresa;
    }
    String getCalle(){
        return Calle;
    }
    String getTelefono(){
        return Telefono;
    }
    String getFechaVenta(){
        return FechaVenta;
    }
    String getHoraVenta(){
        return HoraVenta;
    }
    String getVendedor(){
        return Vendedor;
    }
    String getLinea2(){
        return Linea2;
    }
    String getCantidadProductosTotal(){
        return CantidadProductoTotal;
    }
    String getLinea3(){
        return Linea3;
    }
    String getProductosLista(){
        return ProductosLista;
    }
    String getLinea4(){
        return Linea4;
    }
    String getTotalVenta(){
        return TotalVenta;
    }
    String getAgradecimiento(){
        return Agradecimiento;
    }
    String getTipoPago(){
        return TipoPago;
    }
    String getCodigoVenta(){
        return codigoVenta;
    }
    String getImporte(){
        return importe;
    }
    String getCambio(){
        return cambio;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }


}
