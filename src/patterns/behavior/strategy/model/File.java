package src.patterns.behavior.strategy.model;

import src.patterns.behavior.strategy.behaviour.PersistenceStrategy;

public class File {

    String name = "";
    String format = "";
    PersistenceStrategy persistence;

    public File(PersistenceStrategy strategy){
        this.persistence = strategy;
    }

    public void setPersistence(PersistenceStrategy strategy){
        this.persistence = strategy;
    }

    public void save(){
        persistence.save();
    }

}
