package JP1_Exam;

public class Complex {
    public double realPart;
    public double imaginaryPart;

    public Complex() {
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }



    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "realPart=" +this.realPart +
                ", imaginaryPart=" +this.imaginaryPart +
                '}';
    }

    public Complex add(Complex otherNumber){

        this.realPart += otherNumber.realPart;
        this.imaginaryPart += otherNumber.imaginaryPart ;
        return this;

    }
    public Complex subtract(Complex otherNumber){
        this.realPart =this.realPart - otherNumber.realPart;
        this.imaginaryPart = this.imaginaryPart - otherNumber.imaginaryPart ;
        return this;
    }
    public Complex multiply(Complex otherNumber){
        this.realPart =this.realPart * otherNumber.realPart - this.imaginaryPart * otherNumber.imaginaryPart;
        this.imaginaryPart =this.realPart * otherNumber.imaginaryPart + this.imaginaryPart * otherNumber.realPart;
        return this;

    }
    public Complex divide(Complex otherNumber){
        double demo;
        demo = Math.pow(otherNumber.realPart,2) + Math.pow(otherNumber.imaginaryPart,2);
        this.realPart =(this.realPart * otherNumber.realPart + this.imaginaryPart * otherNumber.imaginaryPart)/demo;
        this.imaginaryPart =(otherNumber.realPart * this.imaginaryPart - this.realPart * otherNumber.imaginaryPart)/demo;

        return this;

    }
}
