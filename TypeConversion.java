class AlphabetAscii{
    public void displayAsciiValues()
    {
        char ch = 'a';
        for(int i=0;i<26;++i){
            int alphAscii = ch;
            System.out.println("ch-"+ch+" and the ascii value is - "+ alphAscii);
            alphAscii++;
            ch=(char)alphAscii;
        }

        char cha = 'A';
        for(int i=0;i<26;++i){
            int alphAscii = cha;
            System.out.println("cha-"+cha+" and the ascii value is - "+ alphAscii);
            alphAscii++;
            cha=(char)alphAscii;
        }
    }
}
public class TypeConversion {

    public static void main(String[] args) {
        AlphabetAscii alphabetAscii = new AlphabetAscii();
        alphabetAscii.displayAsciiValues();
        byte b = 10;
        System.out.println(b);
        int i = b;
        System.out.println(i);
        int l = 300;
        byte bc = (byte)l;
        System.out.println(bc);
        char c ='a';
        int ch = c;
        System.out.println(ch);
        float f = 251.6f;
        int ifd = (int) f;
        System.out.println(ifd);
        int i1 = 'a'*2  ;
        System.out.println(i1);
        System.out.println("Type promotion in Java:");
        byte b1 = 10;
        byte b2 = 20;
        int sum = b1 + b2; // byte values are promoted to int before addition
        System.out.println("Sum of b1 and b2: " + sum);
        byte be = 42;
        char cd = 'a';
        short sh = 1024;
        int it = 50000;
        float fl = 5.67f;
        double db = 0.1234;
        double result = (fl * be) + (it / cd) - (db * sh); // mixed data types are promoted to the largest type (double in this case)
        System.out.println("Result of mixed type expression: " + result);
    }
}
