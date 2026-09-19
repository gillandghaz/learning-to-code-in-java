public class printf1 {
    public static void main(String[] args) {

        //printf = print format
        //%[flags][width][.precision][specifier-character]

        String a = "ayam";
        char b = 'b';
        int c = 10;
        double d = 2;
        boolean e = (10 == 10);

        System.out.printf("aaa %s aaa\n", a);
        System.out.printf("bbb %c bbb\n", b);
        System.out.printf("ccc %d ccc\n", c);
        System.out.printf("ddd %f ddd\n", d);
        System.out.printf("eee %b eee\n", e);
        System.out.println();

        System.out.printf("fff %s fff %d\n", a, c);
        System.out.println();

    }
}
