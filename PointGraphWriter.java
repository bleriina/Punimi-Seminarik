import javax.swing.*;
import java.awt.*;

public class PointGraphWriter extends JPanel
{
    // Madhesia e dritares
    public int width = 400;
    public int height = 400;
    
    public int xPos; // Fillimi i pikes x ne graf
    public int yPos; // Fillimi i pikes y ne graf
    
    public int axisLength; // Gjatesia e boshteve x dhe y(ne pixel unit)
    public String xLabel; // Pika maksimale e paraqitur ne boshtin x
    public String yLabel; // Pika max e paraqitur ne boshtin y
    
    // Hyrja grafike e vleres se x1-6 permes metodes showInputDialog te JOptionPane
    public String x_1=JOptionPane.showInputDialog("Vlera e x1 siq eshte dhene ne detyre :");
    public String x_2=JOptionPane.showInputDialog("Vlera e x2 siq eshte dhene ne detyre :");
    public String x_3=JOptionPane.showInputDialog("Vlera e x3 siq eshte dhene ne detyre :");
    public String x_4=JOptionPane.showInputDialog("Vlera e x4 siq eshte dhene ne detyre :");
    public String x_5=JOptionPane.showInputDialog("Vlera e x5 siq eshte dhene ne detyre :");
    public String x_6=JOptionPane.showInputDialog("Vlera e x6 siq eshte dhene ne detyre :");

    // Konvertimi i x1-6 nga String ne int
    public int x1=Integer.parseInt(x_1);
    public int x2=Integer.parseInt(x_2);
    public int x3=Integer.parseInt(x_3);
    public int x4=Integer.parseInt(x_4);
    public int x5=Integer.parseInt(x_5);
    public int x6=Integer.parseInt(x_6);

    public int propY1;
    public int propY2;
    public int propY3;
    public int propY4;
    public int propY5;
    public int propY6;

    // Krijimi i kornizes
    JFrame obj = new JFrame();

    public PointGraphWriter()
    {
        obj.getContentPane().add(this);
        obj.setSize(width,height);
        obj.setVisible(true);
    }

    public void setTitle(String s)
    {
        obj.setTitle(s);
    }
    // Caktimi i pikave startuese dhe mbaruese te x dhe y(ne pixel unit)
    public void setAxes(int xPos, int yPos, int axisLength, String xLabel, String yLabel)
    {
        this.xPos= xPos;
        this.yPos= yPos;
        this.xLabel= xLabel;
        this.yLabel= yLabel;
        this.axisLength=axisLength;
    }

    public void paintComponent(Graphics g)
    { 
        // Kthimi i xLabel nga String ne int per llogaritjen e vleres se x ne proporcion me gjatesine e boshtit x
        int xRange = Integer.parseInt(xLabel);
        
        // Udhezimi per kthimin e vleres se variablave x1-6 ne proporcion me gjatsine e boshtit x te shprehur ne pixela
        int propX1 = ((x1*axisLength)/xRange)+xPos;
        int propX2 = ((x2*axisLength)/xRange)+xPos;
        int propX3 = ((x3*axisLength)/xRange)+xPos;
        int propX4 = ((x4*axisLength)/xRange)+xPos;
        int propX5 = ((x5*axisLength)/xRange)+xPos;
        int propX6 = ((x6*axisLength)/xRange)+xPos;
        
        g.setColor(Color.white);
        g.fillRect(0,0,width,height);
        g.setColor(Color.black);
        
        // Boshti x dhe y me gjatesi prej axisLength
        g.drawLine(xPos+2, yPos, xPos+axisLength, yPos);
        g.drawLine(xPos, yPos, xPos, yPos-axisLength);
        
        // Paraqitja e pikes max te boshtit x(xLabel) dhe boshtit y(yLabel)
        g.drawString(xLabel, xPos+axisLength, yPos+20);
        g.drawString(yLabel, xPos-20, yPos-axisLength);
        g.drawString("0", xPos+5,yPos+20);
        g.drawString("0", xPos-15,yPos-5);
        
        // Udhezimi per paraqitjen grafike te pikave ne panel
        g.fillOval(propX1,propY1-3,4,4);
        g.fillOval(propX2,propY2-3,4,4);
        g.fillOval(propX3,propY3-3,4,4);
        g.fillOval(propX4,propY4-3,4,4);
        g.fillOval(propX5,propY5-3,4,4);
        g.fillOval(propX6,propY6-3,4,4);
        
        // Udhezimi per paraqitjen e drejtezave te cilat lidhin pikat x1-5
        g.drawLine(propX1, propY1, propX2 ,propY2);
        g.drawLine(propX2, propY2, propX3, propY3);
        g.drawLine(propX3, propY3, propX4, propY4);
        g.drawLine(propX4, propY4, propX5, propY5);
        g.drawLine(propX5, propY5, propX6, propY6);
    }
    
    // Metodat setPoint1-6 jane metoda te cilat i caktojne pikat 1-6 ne grafin e ekuacionit y
    // me lartesine te cilen e marrin si argument te tipit int
    public void setPoint1(int height)
    {
        // Konvertimi i yLabel nga String ne int per llogaritjen e vleres se y ne proporcion me gjatesine e boshtit y
        int yRange = Integer.parseInt(yLabel);
        // Udhezimi per kthimin e vleres se argumentit height ne proporcion me gjatsine e boshtit y te shprehur ne pixela
        propY1=yPos-(height*axisLength)/yRange;
    }
    
    public void setPoint2(int height)
    {
        int yRange = Integer.parseInt(yLabel);
        propY2=yPos-(height*axisLength)/yRange;
    }

    public void setPoint3(int height)
    {
        int yRange = Integer.parseInt(yLabel);
        propY3=yPos-(height*axisLength)/yRange;
    }
    public void setPoint4(int height)
    {
        int yRange = Integer.parseInt(yLabel);
        propY4=yPos-(height*axisLength)/yRange;
    }

    public void setPoint5(int height)
    {
        int yRange = Integer.parseInt(yLabel);
        propY5=yPos-(height*axisLength)/yRange;
    }

    public void setPoint6(int height)
    {
        int yRange = Integer.parseInt(yLabel);
        propY6=yPos-(height*axisLength)/yRange;
    }

}