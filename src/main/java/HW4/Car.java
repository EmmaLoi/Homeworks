package HW4;

public class Car {
    private double gasVolume;
    private double gasBalance;
    private double gasConsumption;

    public Car(double gasVolume, double gasConsumption) {
        this.gasVolume = gasVolume;
        this.gasConsumption = gasConsumption;
    }

    public void drive() {
        this.gasBalance = getGasBalance() - calculateGasConsumption(1);
    }

    public void updateBalance() {
        this.gasBalance += getToUpdateBalance();
    }

    public double getToUpdateBalance() {
        return this.gasVolume - getGasBalance();
    }

    public double getGasBalance() {
        return gasBalance;
    }

    private double gasConsumption(double kilometers) {
        return this.gasBalance - calculateGasConsumption(kilometers);
    }

    private double checkBalance(double kilometers) {
        return (this.gasConsumption / 100 * kilometers);
    }

    private double calculateGasConsumption(double kilometers) {
        return (this.gasConsumption / 100 * kilometers);
    }
}