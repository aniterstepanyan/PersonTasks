public class Dancer extends Person{
    private String groupName;

    /**
     * Constructor for Dancer
     * */
    protected Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    /**
     * Getter for Dancer group name
     * */
    private String getGroupName() {
        return groupName;
    }

    /**
     * Method "dancing" only for Dancer
     * */
    private void dancing() {
        System.out.println(getName() + " is a dancer at " + getGroupName());
    }

    /**
     * General methods extended from Person for Dancer
     * */
    protected void learn(){
        System.out.println(getName() + " has studied at State Dance Ensemble of Armenia");
    }

    protected void walk(int km){
        setKm(km);
        System.out.println(getName() + " walks " + getKm() + "km to get home");
    }

    protected void eat(){
        System.out.println(getName() + " eats twice a day");
    }

    /**
     * All methods
     * */
    protected void all(){
        learn();
        walk(getKm());
        eat();
        dancing();
    }

}
