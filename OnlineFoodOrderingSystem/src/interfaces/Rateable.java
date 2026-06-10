package interfaces;

public interface Rateable {
    void rate(int stars, String comment);
    double getRating();
}