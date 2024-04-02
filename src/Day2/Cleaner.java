package Day2;

public class Cleaner extends Person {

    private boolean canSweep;
    private int NumberOfBrooms;

    public Cleaner() {
    }

    public Cleaner(boolean canSweep, int numberOfBrooms) {
        this.canSweep = canSweep;
        NumberOfBrooms = numberOfBrooms;
    }

    public boolean isCanSweep() {
        return canSweep;
    }

    public void setCanSweep(boolean canSweep) {
        this.canSweep = canSweep;
    }

    public int getNumberOfBrooms() {
        return NumberOfBrooms;
    }

    public void setNumberOfBrooms(int numberOfBrooms) {
        NumberOfBrooms = numberOfBrooms;
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "canSweep=" + canSweep +
                ", NumberOfBrooms=" + NumberOfBrooms +
                '}';
    }
}
