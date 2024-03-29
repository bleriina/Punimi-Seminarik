// Grafi i funksionit y = 20*x - (0.5*x)^3 per vlerat e x 0, 2, 4, 6, 8, 10
public class Punimi2_3
{
    public static void main (String [] args)
    {
        PointGraphWriter e = new PointGraphWriter();
        e.setTitle("Graph of y = 20*x - (0.5*x)^3 ");
        e.setAxes(50, 110, 90, "10", "100");

        double y4x1 = 20 * 0 - Math.pow((0.5*0),3);// y per vlerat e x1=0
        double y4x2 = 20 * 2 - Math.pow((0.5*2),3);// y per vlerat e x2=2
        double y4x3 = 20 * 4 - Math.pow((0.5*4),3);// y per vlerat e x3=4
        double y4x4 = 20 * 6 - Math.pow((0.5*6),3);// y per vlerat e x4=6
        double y4x5 = 20 * 8 - Math.pow((0.5*8),3);// y per vlerat e x5=8
        double y4x6 = 20 * 10 - Math.pow((0.5*10),3);// y per vlerat e x6=10

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