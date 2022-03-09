package calcule;

public class Monome implements Comparable {
    public int numaratorCoeficient;
    public int numitorCoeficient;
    public int exponent;

    public Monome(int numaratorCoeficient, int numitorCoeficient, int exponent) {
        this.numaratorCoeficient = numaratorCoeficient;
        this.numitorCoeficient = numitorCoeficient;
        this.exponent = exponent;
    }

    public int getNumaratorCoeficient() {
        return numaratorCoeficient;
    }

    public void setNumaratorCoeficient(int numaratorCoeficient) {
        this.numaratorCoeficient = numaratorCoeficient;
    }

    public int getNumitorCoeficient() {
        return numitorCoeficient;
    }

    public void setNumitorCoeficient(int numitorCoeficient) {
        this.numitorCoeficient = numitorCoeficient;
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    @Override
    public String toString() {
        return "Monome{" +
                "numaratorCoeficient=" + numaratorCoeficient +
                ", numitorCoeficient=" + numitorCoeficient +
                ", exponent=" + exponent +
                '}';
    }

    public void Derrivate() {
        this.numaratorCoeficient = this.numaratorCoeficient * this.exponent;
        this.exponent--;
    }

    public void Integrate() {
        this.numitorCoeficient = this.numitorCoeficient * (this.exponent + 1);
        this.exponent++;
    }


    @Override
    public int compareTo(Object comparestu) {
        int compareage = (((Monome) comparestu).getExponent());
        return (compareage - this.getExponent());

    }
}
