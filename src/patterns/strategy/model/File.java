package src.patterns.strategy.model;

import src.patterns.strategy.behaviour.PersistenceStrategy;

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
