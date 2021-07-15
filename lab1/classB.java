/**
 * classB "type"
 */
class B {
    private short s;
    private int i;
    private float f;
    private double d;
    private char c;
    private String str;
    private boolean b;

    public static void main(String[] args) throws Exception {
        B df = new B();
        System.out.println("\n short s = " +df.s);
        System.out.println("\n int i = "+df.i);
        System.out.println("\n float f = "+df.f);
        System.out.println("\n float d = "+df.d);
        System.out.println("\n float c = "+df.c);
        System.out.println("\n string str = "+df.str);
        System.out.println("\n boolean b = "+df.b);
    }
}
