package Lab5ex1_7;

public class MyComplex {
    private double real, imag;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double argument() {
        return Math.atan2(this.imag, this.real);
    }

    public void setValue(double real, double imag) {
        setReal(real);
        setImag(imag);
    }

    public boolean isReal() {
        return (imag == 0 && real != 0);
    }

    public boolean isImaginary() {
        return (imag != 0 && real == 0);
    }

    public boolean equals(double real, double imag) {
        if (this.real == real && this.imag == imag) {
            return true;
        }
        return false;
    }

    public boolean equals(MyComplex another) {
        if (real == another.real && imag == another.imag) {
            return true;
        }
        return false;
    }

    public double magnitude(MyComplex right) {
        return Math.sqrt(right.real * right.real + right.imag * right.imag);
    }

    public MyComplex add(MyComplex right) {
        setReal(real + right.real);
        setImag(imag + right.imag);
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(real + right.real, imag + right.imag);
    }

    public MyComplex subtract(MyComplex right) {
        setReal(real - right.real);
        setImag(imag - right.imag);
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(real - right.real, imag - right.imag);
    }

    public MyComplex multify(MyComplex right) {
        setReal(real * right.real);
        setImag(imag * right.imag);
        return this;
    }

    public MyComplex divide(MyComplex right) {
        setReal((real * right.real + imag * right.imag) / (right.real * right.real + right.imag * right.imag));
        setImag((right.real * imag - right.imag * real) / (right.real * right.real + right.imag * right.imag));
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }

    @Override
    public String toString() {
        return real + "+" + imag + "i";
    }
}
