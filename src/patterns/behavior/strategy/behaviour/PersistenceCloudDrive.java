package src.patterns.behavior.strategy.behaviour;

public class PersistenceCloudDrive implements PersistenceStrategy{
    @Override
    public void save() {
        System.out.println("Saving File in Cloud Drive");
    }
}
