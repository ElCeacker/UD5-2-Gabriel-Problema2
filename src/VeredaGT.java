public class VeredaGT implements Vehicle{

    private String matricula;
    private int maxEnergy;
    private float energy = 2500.5f;
    private int movementaCount = 0;
    private float energyDelta;

    public VeredaGT(String matricula, int maxEnergy, float energyDelta) {
        this.matricula = matricula;
        this.maxEnergy = maxEnergy;
        this.energyDelta = energyDelta;
    }

    @Override
    public float energyLevel() {
        return energy;
    }

    @Override
    public void recharge() {
        energy = maxEnergy;
    }

    @Override
    public void move() {
        if (energy == 0) {
            System.out.println("poff poff... el coche no arranca");
        } else {
            energy -= energyDelta;
            movementaCount++;
        }
    }

    @Override
    public String status() {
        String out;
        out = "El vehículo " + matricula + " tiene un nivel de carga de: " + energy + " y se ha movido " + movementaCount + " veces";
        return out;
    }
}
