package Lab5ex1_8;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    public void setCoeffs(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        int count = coeffs.length - 1;
        for (double coeff : coeffs) {
            if (count != 0) {
                description.append(coeff).append("x^").append(count).append(" + ");
                count--;
            } else {
                description.append(coeff);
            }
        }

        return description.toString();
    }

    public double evaluate(double x) {
        double outCome = 0;
        int count = coeffs.length - 1;
        for (double coeff : coeffs) {
            outCome += (coeff * Math.pow(x, count));
            count--;
        }
        return outCome;
    }

    public MyPolynomial add(MyPolynomial right) {
        double[] thisCoeffs = this.getCoeffs();
        double[] rightCoeffs = right.getCoeffs();
        if (this.getCoeffs().length <= right.getCoeffs().length) {
            double[] result = new double[right.getCoeffs().length];
            int c = 0;
            for (int i = 0; i < right.getCoeffs().length; i++) {
                if (c < this.getCoeffs().length) {
                    result[i] = thisCoeffs[c] + rightCoeffs[i];
                    c++;
                } else {
                    result[i] = rightCoeffs[i];
                }
            }
            this.setCoeffs(result);
        } else {
            double[] result2 = new double[this.getCoeffs().length];
            int count = 0;
            for (int i = 0; i < this.getCoeffs().length; i++) {
                if (count < this.getCoeffs().length) {
                    result2[i] = thisCoeffs[i] + rightCoeffs[count];
                    count++;
                } else {
                    result2[i] = thisCoeffs[i];
                }
            }
            this.setCoeffs(result2);
        }
        return this;
    }

    public MyPolynomial multi(MyPolynomial right) {
        if (right == null) {
            System.out.println("The polynomial is null");
            return null;
        }
        double[] thisCoeffs = this.getCoeffs();
        double[] rightCoeffs = right.getCoeffs();
        double[] multiCoeff = new double[right.getDegree() + this.getDegree() + 1];
        for (int i = 0; i <= this.getDegree(); ++i) {
            for (int j = 0; j <= right.getDegree(); ++j) {
                multiCoeff[i + j] += rightCoeffs[j] * thisCoeffs[i];
            }
        }
        this.setCoeffs(multiCoeff);
        return this;
    }
}

