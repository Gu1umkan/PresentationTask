
public class Main {
    public static void main(String[] args) {
        for (Regions region :Regions.values()) {
            System.out.println(region.name()+": "+region.getWonder());
        }
    }
}