public class Singer extends Person{
    private String bandName;

    /**
     * Constructor for Singer
     * */
    protected Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    /**
     * Getter for Singer band name
     * */
    private String getBandName() {
        return bandName;
    }

    /**
     * Methods "singing" and "play guitar" only for Singer
     * */
    private void singing() {
        System.out.println(getName() + " is a singer at " + getBandName());
    }

    private void playGuitar(){
        System.out.println(getName() + " is playing guitar, when he is bored of everyone");
    }

    /**
     * General methods extended from Person for Dancer
     * */
    protected void learn(){
        System.out.println(getName() + " studies at Jazz College");
    }

    protected void walk(int km){
        setKm(km);
        System.out.println(getName() + " walks " + getKm() + "km to get home");
    }

    protected void eat(){
        System.out.println(getName() + " eats four times a day");
    }

    /**
     * All methods
     * */
    protected void all(){
        learn();
        walk(getKm());
        eat();
        singing();
        playGuitar();
    }
}
