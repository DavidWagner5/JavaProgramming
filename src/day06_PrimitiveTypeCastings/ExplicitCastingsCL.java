package day06_PrimitiveTypeCastings;

/* double>float>long>int>short>byte

IMPLICIT = smaller primitives can be directly assigned to larger ones.
EXPLICIT = larger ones CANNOT be assigned directly to smaller ones. MUST BE DONE MANUALLY
for explicit castings, you can also shortcut the red mistake line and right click it. pick cast
 */

import java.sql.SQLOutput;

public class ExplicitCastingsCL {

    public static void main(String[] args) {
        
        int p = 45;
        short t = (short)p;
        System.out.println(p + " : " + t);


        int x = 55;
        short y = (short)x;

        System.out.println(x + " : " +y);

        long j = 1000000;
        short k = (short)j;

        System.out.println(j + " : " +k);

        double l = 2.5;
        float m = (float)l;
        System.out.println(l + " : " +m);

        double n = 10.8;
        int s = (int)n;
        System.out.println(n + " : " + s);

        double d1 = 20.5;
        short s1 = (short) d1;

        double o = 7.0;
        float y1 = (float) o;
        System.out.println(o + " : " + y1 );

    }
}
