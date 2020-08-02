public class Programmer extends Person {
    public String companyName;

    /**
     * Constructor for Programmer
     * */
    protected Programmer(String name, String designation, String companyName){
        super(name, designation);
        this.companyName = companyName;

    }

    /**
     * Getter for Programmer company name
     * */
    private String getCompanyName(){
        return companyName;
    }

    /**
     * Method "coding" only for Programmer
     * */
    private void coding(){
        System.out.println(getName() + " is a junior programmer at " + getCompanyName());
    }

    /**
     * General methods extended from Person for Programmer
     * */
    protected void learn(){
        System.out.println(getName() + " studies at Beyond Learning Hub");
    }

    protected void walk(int km){
        setKm(km);
        System.out.println(getName() + " walks " + getKm() + "km everyday to get home");
    }

    protected void eat(){
        System.out.println(getName() + " eats once a day, because she is a programmer she has no life");
    }

    /**
     * All methods
     * */
    protected void all(){
        learn();
        walk(getKm());
        eat();
        coding();

    }
}
