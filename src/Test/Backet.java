package Test;

public class Backet{

    private int number;
    private String material;
    private String color;
    private Instrument instrument;

    public Backet(Instrument instrument, int number, String material, String color) {

        this.instrument = instrument;
        this.number = number;
        this.material = material;
        this.color = color;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }


    @Override
    public String toString() {
        return "<Product_" +
                "number:" + number +
                ", Material:'" + material + '\'' +
                ", Color:'" + color + '\'' +
                ", Weight:" + instrument +
                ">  ";
    }

}
