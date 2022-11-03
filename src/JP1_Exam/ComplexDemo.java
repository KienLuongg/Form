package JP1_Exam;

public class ComplexDemo {
    public static void main(String[] args) {
        Complex a = new Complex(3.7,5.6);
        Complex a2=new Complex(4.8,1.3);

        a.add(a2);
        System.out.println(a);
        a.subtract(a2);
        System.out.println(a);
        a.multiply(a2);
        System.out.println(a);
        a.divide(a2);
        System.out.println(a);

    }
}