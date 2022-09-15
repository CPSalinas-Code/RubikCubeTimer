package Logica;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
public class Graficas {
    JFreeChart grafica;
    XYSeriesCollection datos = new XYSeriesCollection();
    
    String titulo;
    String tx = "SOLVES";
    String ty = "TIEMPOS";
    
    public final static int LINEAL = 1;
    //final static int POLAR = 2;
    //final static int DISPERCION = 3;
    public final static int AREA = 2;
    //final static int LOGARITMICA =5;
    //final static int SRIETIEMPO = 6;
    //final static int PASO = 7;
    //final static int PASOAREA = 8;
    
    public Graficas (int tipo, String titulo){
        this.titulo = titulo;
        tipoGrafica(tipo);
    }
    
    public void tipoGrafica(int tipo){
        switch (tipo){
            case LINEAL:
                grafica = ChartFactory.createXYLineChart(null, tx, ty, datos, PlotOrientation.VERTICAL, true, true, true);
                break;
            case AREA:
                grafica = ChartFactory.createXYAreaChart(null, tx, ty, datos, PlotOrientation.VERTICAL, true, true, true);
                break;
        }
    }
    public void agragarGrafica(String id,double[]x,double[]y){
        XYSeries s = new XYSeries(id);
        int n = x.length;
        for(int i = 0 ; i <n ; i++){
            s.add(x[i],y[i]);
        }
        datos.addSeries(s);
    }
    public JPanel otienePanel(){
        return new ChartPanel(grafica);
    }
    public JFreeChart obtener(){
        return grafica;
    }
}

