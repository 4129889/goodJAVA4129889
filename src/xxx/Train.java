package xxx;

import java.util.Objects;

public class Train implements Comparable<Train> {

    private int number;
    private String type;
    private String start;
    private String dest;
    private double price;

    public Train() {}

    public Train(int number, String type, String start, String dest, double price) {
        super();
        this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Train [number=" + number + ", type=" + type + ", start=" + start + ", dest=" + dest
                + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(dest, number, price, start, type);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Train other = (Train) obj;
        return Objects.equals(dest, other.dest) && number == other.number
                && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
                && Objects.equals(start, other.start) && Objects.equals(type, other.type);
    }

    @Override
    public int compareTo(Train train) {

        if (this.number > train.number) {
            return -1;
        } else if (this.number == train.number) {
            return 0;
        } else {
            return 1;
        }
    };



}