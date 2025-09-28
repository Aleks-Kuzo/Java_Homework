public class Exercise1 {
    public static void main(String[] args) {
        // Упражнение 1
        Double d1 = Double.valueOf(3.14);
        System.out.println("d1 = " + d1); // d1 = 3.14
        //Упражнение 2
        String s1 = "3.14";
        double d2 = Double.parseDouble(s1);
        System.out.println("d2 = " + d2);
        //Упражнение 3
        Double d3 = 3.14;
        int i = d3.intValue();
        Double ch = 65.0;
        char c = (char) ch.intValue();
        System.out.println("int i = " + i);
        System.out.println("char c = " + c);
        //Упражнение 4
        Double d4 = 3.14;
        System.out.println(d4);
        //Упражнение 5
        String d5 = Double.toString(3.14);
        System.out.println("d5 = " + d5);
    }
}
