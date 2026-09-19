public class stringMethod1 {
    public static void main(String[] args) {

        String name = "Latihan Name Method";
        //buat length, charAt, indexOf, lastIndexOf, toUpperCase, trim, replace, isEmpty, contains, equals, equalsIgnoreCase

        int length = name.length();
        char letter = name.charAt(2);
        int index = name.indexOf("a");
        int lastIndex = name.lastIndexOf("Name"); //indeks tidak berubah, yang berubah cara mencarinya
        //trim = untuk menghilangkan spasi
        //.replace("a", "b");

        System.out.println(lastIndex);

        if(name.contains("a")){
            System.out.println("contains");
        }
        if(name.equals("Latihan Name Method")){
            System.out.println("equals");
        }
        if(name.equalsIgnoreCase("latihan name method")){
            System.out.println(".IgnoreCase");
        }

    }
}
