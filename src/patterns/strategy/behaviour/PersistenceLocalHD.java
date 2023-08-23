package src.patterns.strategy.behaviour;

public class PersistenceLocalHD implements PersistenceStrategy{


    @Override
    public void save() {
        System.out.println("Saving in Hard Disk");
    }
}
