/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.MediaPrintableArea;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.OrientationRequested;

public class TicketPrinter implements Printable {

     private String ticketContent;
    VariablesParaImprimirTicket instanciaTicket = VariablesParaImprimirTicket.getInstancia();
    
    // definir los márgenes del ticket (en pulgadas)
    private final double LEFT_MARGIN = 0.25;
    private final double TOP_MARGIN = 0.25;
    private final double RIGHT_MARGIN = 0.1;
    private final double BOTTOM_MARGIN = 0.25;

    public TicketPrinter(String ticketContent) {
        this.ticketContent = ticketContent;
    }

    public void print() {
        // obtener el servicio de impresión predeterminado
        PrintService printService = PrintServiceLookup.lookupDefaultPrintService();

        // crear un trabajo de impresión
        PrinterJob job = PrinterJob.getPrinterJob();
        try {
            job.setPrintService(printService);
        } catch (PrinterException ex) {
            Logger.getLogger(TicketPrinter.class.getName()).log(Level.SEVERE, null, ex);
        }
        job.setPrintable(this);
        
        // establecer los atributos de impresión
        PrintRequestAttributeSet printAttributes = new HashPrintRequestAttributeSet();
        printAttributes.add(OrientationRequested.PORTRAIT);
        printAttributes.add(MediaSizeName.ISO_A5);
        printAttributes.add(new MediaPrintableArea(0, 0, 100, 5000, MediaPrintableArea.MM));
        
        // mostrar el diálogo de impresión
        if (job.printDialog(printAttributes)) {
            try {
                job.print(printAttributes);
            } catch (PrinterException e) {
                e.printStackTrace();
            }
        }

        
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex != 0) {
            return NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D) graphics;

        // calcular el ancho y la altura del área imprimible de la página
        double printableWidth = pageFormat.getImageableWidth();
        double printableHeight = pageFormat.getImageableHeight();

        // calcular las coordenadas iniciales para dibujar el ticket
        double x = pageFormat.getImageableX() + LEFT_MARGIN * 0;
        double y = pageFormat.getImageableY() + TOP_MARGIN * 100;
        try {
            BufferedImage logoImage = ImageIO.read(new File("src/Imagenes/Logo_Mc.png"));

            // Dibujar la imagen en el contexto gráfico
            g2d.drawImage(logoImage, (int) 45, (int) -10, null);

            // Ajustar la posición vertical para continuar con el contenido del ticket
           y += logoImage.getHeight() - 35; // Ajusta el valor de espaciado según tus necesidades
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Dibuja el título "Ticket de venta" en el centro del ticket
        Font font = new Font("Arial", Font.BOLD, 8);
        FontMetrics metrics = g2d.getFontMetrics(font);
        double titleWidth = metrics.stringWidth("Ticket de venta");
        g2d.setFont(font);
        g2d.drawString("Ticket de venta", (float) (x + (printableWidth - titleWidth) / 2), (float) y);
        y += 10;
        
        // Obtener todas las líneas del texto
        String[] lineas = instanciaTicket.getProductosLista().split("\r?\n");
        String ImporteCambio=instanciaTicket.getImporte() + instanciaTicket.getTotalVenta();
        
        // Dibuja la fecha y los detalles de la venta en el ticket
        font = new Font("Arial", Font.PLAIN, 8);
        g2d.setFont(font);
        
        g2d.drawString(instanciaTicket.getLinea1(), (float) x, (float) y);
        y += 5;
        g2d.drawString(instanciaTicket.getCalle(), (float) x, (float) y);
        y += 10;
        g2d.drawString(instanciaTicket.getTelefono(), (float) x, (float) y);
        y += 10;
        g2d.drawString("Numero de Factura: "+instanciaTicket.getCodigoVenta(), (float) x, (float) y);
        y += 10;
        g2d.drawString("Fecha y Hora Venta:", (float) x, (float) y);
        y += 10;
        g2d.drawString(instanciaTicket.getFechaVenta(), (float) x, (float) y);
        y += 10;

        g2d.drawString("Atendido por: "+instanciaTicket.getVendedor(), (float) x, (float) y);
        y += 5;
//        g2d.drawString(instanciaTicket.getLinea2(), (float) x, (float) y);
//        y += 10;
        
//        g2d.drawString("Cantidad Productos: "+instanciaTicket.getCantidadProductosTotal(), (float) x, (float) y);
//        y += 10;
        
        g2d.drawString(instanciaTicket.getLinea3(), (float) x, (float) y);
        y += 10;
        g2d.drawString("Cantidad|Nombre|Descripcion", (float) x, (float) y);
        y += 10;
        g2d.drawString("Precio Unitario|Subtotal", (float) x, (float) y);
        y += 3;
        g2d.drawString("_____________________________", (float) x, (float) y);
        y += 10;
        // Imprimir cada línea del texto
        
        boolean primerProducto = true;  // Indica si es el primer producto
for (String linea : lineas) {
    if (!primerProducto) {
        // Si no es el primer producto, realiza un salto de línea
        y += 15;
    } else {
        primerProducto = false;
    }

    if (g2d.getFontMetrics().stringWidth(linea) > printableWidth) {
        // Si la línea excede el ancho imprimible, dividir en múltiples líneas
        String[] palabras = linea.split(" ");

        StringBuilder lineaActual = new StringBuilder();
        for (String palabra : palabras) {
            String tempLinea = lineaActual.toString() + palabra + " ";
            if (g2d.getFontMetrics().stringWidth(tempLinea) > printableWidth) {
                // La palabra actual excede el ancho de la hoja, dibujar la línea actual y reiniciarla
                g2d.drawString(lineaActual.toString().trim(), (float) x, (float) y);
                y += 15;
                lineaActual = new StringBuilder(palabra + " ");
            } else {
                // La palabra actual no excede el ancho de la hoja, agregarla a la línea actual
                lineaActual.append(palabra).append(" ");
            }
        }

        // Dibujar la última línea actual
        g2d.drawString(lineaActual.toString().trim(),(float) x, (float) y);
    } else {
        // La línea no excede el ancho de la hoja, dibujarla directamente
        g2d.drawString(linea,(float) x, (float) y);
    }
}
        y += 3;
        g2d.drawString("_____________________________", (float) x, (float) y);
        y += 20;
        g2d.drawString("Total a Pagar: $"+instanciaTicket.getTotalVenta(), (float) x, (float) y);
        y += 10;
        g2d.drawString("Efectivo: $"+instanciaTicket.getImporte(), (float) x, (float) y);
        y += 10;
        double total = Double.parseDouble(instanciaTicket.getTotalVenta());
        double efectivo = Double.parseDouble(instanciaTicket.getImporte());
        double cambio = efectivo - total;
        g2d.drawString("Cambio: $"+cambio,(float) x, (float) y);
        y += 15;
        g2d.drawString("Gracias Por Su Preferencia", (float) x, (float) y);
        y += 10;

        return PAGE_EXISTS; // La página ha sido impresa correctamente
    }
}
