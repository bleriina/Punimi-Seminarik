// Grafi i funksionit y = 90 - (0.8*x)^2 per vlerat e x 0, 2, 4, 6, 8, 10
public class Punimi2_2
{
    public static void main (String [] args)
    {
        PointGraphWriter e = new PointGraphWriter();
        e.setTitle("Graph of y = 90-(0.8*x)^2");
        e.setAxes(50, 110, 90, "10", "100");

        double y4x1 = 90 - Math.pow((0.8*0),2);// y per vlerat e x1=0
        double y4x2 = 90 - Math.pow((0.8*2),2);// y per vlerat e x2=2
        double y4x3 = 90 - Math.pow((0.8*4),2);// y per vlerat e x3=4
        double y4x4 = 90 - Math.pow((0.8*6),2);// y per vlerat e x4=6
        double y4x5 = 90 - Math.pow((0.8*8),2);// y per vlerat e x5=8
        double y4x6 = 90 - Math.pow((0.8*10),2);// y per vlerat e x6=10

        int y1 = (int)y4x1;
        int y2 = (int)y4x2;
        int y3 = (int)y4x3;
        int y4 = (int)y4x4;
        int y5 = (int)y4x5;
        int y6 = (int)y4x6;

        e.setPoint1(y1);
        e.setPoint2(y2);
        e.setPoint3(y3);
        e.setPoint4(y4);
        e.setPoint5(y5);
        e.setPoint6(y6);
    }
}