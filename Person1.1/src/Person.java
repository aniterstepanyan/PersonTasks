public class Person {
    private String name;
    private String designation;
    private int km;

    /**
     * General methods
     * */
    protected void learn() {
    }

    protected void walk(int km) {

    }

    protected void eat() {

    }

    protected void all() {

    }

    /**
     * Constructor for Person
     * */
    protected Person(String name, String designation){
        setName(name);
        setDesignation(designation);
    }

    /**
     * All getters and setters for Person
     * */
    protected String getName(){
        return name;
    }
    protected void setName(String name){
        this.name = name;
    }

    protected String getDesignation(){
        return designation;
    }
    protected void setDesignation(String designation){

    }

    protected int getKm(){
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
