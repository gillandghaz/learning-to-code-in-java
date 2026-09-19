public class printf2 {
    public static void main(String[] args) {

        //printf = print format
        //%[flags][width][.precision][specifier-character]
        //full printf
        /*
        flags:
        "+"= mengalikan positif/menambah tanda +
        ","= membagi tiap tiga 000
        "("= negatif akan ditutup kurung -10 --> (10)
        "space"= setiap positif ditambahkan dengan spasi
         */
        /*
        width:
        "0.."= nambahin 0 sesuai jumlah, contoh 4 dengan %04d menjadi 0004
        "number"= right-justified
        "negative"= left-justified
         */
        double number1 = 99.99;
        double number2 = 99999.99999;
        double number3 = 100000000;
        int number4 = 100;
        double number5 = 100.00;
        System.out.println("Eksperimen gabungan");
        System.out.println(number1);
        System.out.printf("%f\n", number1);
        System.out.printf("%2.2f\n", number1);
        System.out.printf("%5.5f\n", number2);
        System.out.printf("%4.4f\n", number2);
        System.out.printf("%1.5f\n", number2);
        System.out.printf("%,f\n", number3);
        System.out.printf("%5d\n", number4);
        System.out.printf("%5.2f\n", number5); //width untuk justified hanya bisa untuk int
        System.out.printf("%5f.2\n", number5);
        System.out.println();

        int id1 = 1;
        int id2 = 11;
        int id3 = 111;
        System.out.println("width 1");
        System.out.printf("%03d\n", id1);
        System.out.printf("%03d\n", id2);
        System.out.printf("%03d\n", id3);
        System.out.println("width 2");
        System.out.printf("%3d\n", id1);
        System.out.printf("%3d\n", id2);
        System.out.printf("%3d\n", id3);
        System.out.println("width 3");
        System.out.printf("%-3d\n", id1);
        System.out.printf("%-3d\n", id2);
        System.out.printf("%-3d\n", id3);
    }
}
