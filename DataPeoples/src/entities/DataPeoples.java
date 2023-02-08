package entities;

public class DataPeoples {
    private double height;
    private char gender;


    public DataPeoples(double height, char gender){
        this.height = height;
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
