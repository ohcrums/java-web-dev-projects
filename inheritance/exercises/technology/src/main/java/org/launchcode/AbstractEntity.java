package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractEntity {
//    each class has one Id property
    private static int identityCounter = 1;
    private static final HashMap<String, Integer> catalogue = new HashMap<>();
    private final int identity;

    // no two objects created from any class may have the same value for Id
    public AbstractEntity() {
        this.identity = identityCounter++;
    }

    // behavior to assign a unique Id for each class that extends it
    public void registerId(String unitName) {
        catalogue.put(unitName, identity);
    }

    // behavior to access a unique Id for each class that extends it
    // no setter as that's handled by constructor and is strictly controlled
    public int getIdentity() {
        return identity;
    }
    // getter to allow printing the whole catalogue
    protected static Map<String, Integer> getCatalogue(){
        return catalogue;
    }

    // extra work: behavior to find unitName with id only
    // yes this is redundant with a getter, but I wanted to try it out
    public String findUnit (Integer unitId) {
        for (Map.Entry<String, Integer> loopVar : catalogue.entrySet()){
            if (loopVar.getValue().equals(unitId)) {
                return loopVar.getKey();
            }
        }
        return  unitId + "Not Found.";
    }
}
