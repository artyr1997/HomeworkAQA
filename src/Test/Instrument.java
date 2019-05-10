package Test;

public enum Instrument {

    GUITAR,PIANO,VIOLET;

    public static Instrument getInstrument(String type){
        switch (type){
            case "GUITAR":{
                return GUITAR;
            }
            case "PIANO":{
                return PIANO;
            }
            case "VIOLET":{
                return VIOLET;
            }
            default:{
                throw new RuntimeException("Incorrect instrument");
            }
        }
    }

}
