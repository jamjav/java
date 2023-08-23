package src.patterns.behavior.strategy;

import src.patterns.behavior.strategy.behaviour.PersistenceCloudDrive;
import src.patterns.behavior.strategy.behaviour.PersistenceLocalHD;
import src.patterns.behavior.strategy.behaviour.PersistenceStrategy;
import src.patterns.behavior.strategy.model.File;

public class strategyMain {

    public static void main (String [] args){

        System.out.println("Strategy Pattern");
        //Implement File with Local HD
        PersistenceStrategy strategy = new PersistenceLocalHD();
        File newFile = new File(strategy);
        newFile.save();

        //Implement File with Cloud HD
        PersistenceStrategy cloudStrategy = new PersistenceCloudDrive();
        newFile.setPersistence(cloudStrategy);
        newFile.save();
    }
}
