// Grafi i funksionit y = x * x + 2 * x + 1 per vlerat e x 0, 2, 4, 6, 8, 10
public class Punimi2_1
{
    public static void main (String [] args)
    {
        PointGraphWriter e = new PointGraphWriter();
        e.setTitle("Graph of y = x*x+2*x+1");
        e.setAxes(50, 110, 90, "10", "100");

        e.setPoint1(0*0+2*0+1);    // per x = 0
        e.setPoint2(2*2+2*2+1);    // per x = 2
        e.setPoint3(4*4+2*4+1);    // per x = 4
        e.setPoint4(6*6+2*6+1);    // per x = 6
        e.setPoint5(8*8+2*8+1);    // per x = 8
        e.setPoint6(10*10+2*10+1); // per x = 10
    }
}