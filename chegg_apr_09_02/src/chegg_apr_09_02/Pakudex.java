package chegg_apr_09_02;

public class Pakudex {

    // Creating default pakuri size to be 0
    private int pakuriSize = 0;
    // pakuriArr to store pakuri species information
    private Pakuri[] pakuriArr;

    public Pakudex() {
    	// initialising default Pakudex size of 20
        pakuriArr = new Pakuri[20];
    }

    public Pakudex(int capacity) {
        pakuriArr = new Pakuri[capacity]; 
    }

    // return size of pakudex
    public int getSize() {

        return this.pakuriSize;
    }

    // Returns capacity of Pakudex
    public int getCapacity() {

        return pakuriArr.length;
    }

    // Returns the Pakudex array
    public String[] getSpeciesArray() {

        String[] speciesArray;
        speciesArray = new String[pakuriSize];
        for (int i = 0; i < pakuriSize; i++) {
            speciesArray[i] = pakuriArr[i].getSpecies();
        }
        if(pakuriSize <= 0){
            return null;
        }
        return speciesArray;
    }
    
    public int[] getStats(String species) { // Returns stats of pakuri

        String[] pakuStringArrayAgain;
        pakuStringArrayAgain = getSpeciesArray();
        for (int i = 0; i < pakuriSize; i++) {
            if (pakuStringArrayAgain[i].equals(species)) {
                int[] statters = {returnPaku(species).getAttack(), returnPaku(species).getDefense(), returnPaku(species).getSpeed()};
                return statters;
            }

        }
        return null;
    }

    // sorting pakuriArr using bubble sort
    public void sortPakuri() {
        
        int j;
        for (j = 0; j < pakuriSize - 1; j++) {
            for (int i = j + 1; i < pakuriSize; i++) {
                if (pakuriArr[i].getSpecies().compareTo(pakuriArr[j].getSpecies()) < 0) {
                    Pakuri temp = pakuriArr[j];
                    pakuriArr[j] = pakuriArr[i];
                    pakuriArr[i] = temp;
                }
            }
        }
    }
    // method to add pakuri to pakudex
    public boolean addPakuri(String species) {
        
        String[] pakuStringArray;
        pakuStringArray = getSpeciesArray();
        for (int i = 0; i < pakuriSize; i++) {
            if (pakuStringArray[i].equals(species)) {
                return false;
            }
        }
       
        pakuriArr[pakuriSize] = new Pakuri(species);
        pakuriSize = pakuriSize + 1;
        return true;
    }
  
    public boolean evolveSpecies(String species) {
        if (returnPaku(species) == null) {
            return false;
        }

        returnPaku(species).evolve();
        return true;
    }

    
    // returning the pakuri by species name
    public Pakuri returnPaku(String species) {
        for (int i = 0; i < pakuriSize; i++) {
            if (pakuriArr[i].getSpecies().equals(species)) {
                return pakuriArr[i];
            }
        }
        return null; // Returns null if it doesn't exist
    }

    
    // Needed to be a separate method to check to see if Pakuri exists in the Pakudex so it didn't have to be redundant
    public int checkIfExist(String species) {
        if (getCapacity() == 0) {
            return -1;
        } else {
            for (int i = 0; i < pakuriSize; i++) {
                if (species.equals(pakuriArr[i].getSpecies())) {
                    return i;
                }
            }
            return -1; // This method saved so much time
        }
    }
}
