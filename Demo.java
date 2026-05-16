public class Demo{
    public static void main(String[] args) {
        System.out.println("Integers in Java:");
        byte a = 127; // byte can only hold values from -128 to 127, so this will cause an overflow
        short b = 32767; // short can only hold values from -32768 to 32767, so this will cause an overflow
        int c = 2147483647; // int can only hold values from -2147483648 to 2147483647, so this will cause an overflow
        long d = 9223372036854775807L; // long can hold values from -9223372036854775808 to 9223372036854775807, so this will cause an overflow
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("Hello World after data type!");
        System.out.println("Floating-point numbers in Java:");
        float e = 3.4028235E38f; // float can hold values from 1.4E-45 to 3.4028235E38, so this will cause an overflow
        double f = 1.7976931348623157E308; // double can hold values from 4.9E-324 to 1.7976931348623157E308, so this will cause an overflow
        System.out.println(e);
        System.out.println(f);
        System.out.println("Characters in Java:");
        char g = 'A'; // char can hold a single character, so this will not cause an overflow
        System.out.println(g); 
        System.out.println("Booleans in Java:");
        boolean h = true; // boolean can hold either true or false
        System.out.println(h);
        System.out.println("Number systems in Java:");
        int binary = 0b1010; // binary number system (prefix 0b)
        int decimal = 10; // decimal number system
        int octal = 012; // octal number system (prefix 0)
        int hexadecimal = 0xA; // hexadecimal number system (prefix 0x)
        System.err.println("Binary: " + binary);
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);

        double ds = 6.022e23; // scientific notation (6.022 x 10^23)
        System.out.println("Scientific notation: " + d);

        long ln = 12_26_12;
        System.out.println("Underscores in numeric literals: " + ln);

        float fl = 0.0f;
        System.out.println("Float: " + fl );
    }
} 