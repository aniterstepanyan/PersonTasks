public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Maria", "programmer", "DISQO");
        Dancer dancer = new Dancer("Leonard", "dancer", "Todes");
        Singer singer = new Singer("T-Fest", "singer", "Gazgolder");

        /**
         * Calling all methods
         * */
        programmer.setKm(8);
        programmer.all();
        System.out.println();

        dancer.setKm(3);
        dancer.all();
        System.out.println();

        singer.setKm(6);
        singer.all();
        System.out.println();
    }
}
