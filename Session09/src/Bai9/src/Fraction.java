public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        if(denominator == 0){
            System.out.println("Mẫu số không được bằng 0. Phân số không hợp lệ");
        }else {
            this.numerator = numerator;
            this.denominator = denominator;
            this.simplify();
        }
    }

    public int gcd_euclid(int a, int b){
        if(b == 0){
            return Math.abs(a);
        }
        return gcd_euclid(b, a % b);
    }

    public Fraction add(Fraction f){
        int newNumerator = this.numerator * f.denominator + f.numerator * this.denominator;
        int newDenominator = this.denominator * f.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction sub(Fraction f){
        int newNumerator = (this.numerator * f.denominator) - (f.numerator * this.denominator);
        int newDenominator = this.denominator * f.denominator;
        return new Fraction(newNumerator, newDenominator);

    }

    public Fraction mul(Fraction f){
        return new Fraction(this.numerator * f.numerator, this.denominator * f.denominator);
    }

    public Fraction div(Fraction f){
        return new Fraction(this.numerator * f.denominator, this.denominator * f.numerator);
    }

    public void simplify() {
        this.numerator /= gcd_euclid(this.numerator, this.denominator);
        this.denominator /= gcd_euclid(this.numerator, this.denominator);
        if(denominator < 0){
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
    }

    public String toString(){
        return (numerator + "/" + denominator).toString();
    }
}
