import javax.swing.plaf.synth.SynthScrollBarUI;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Menu{
    private static final Scanner scanner = new Scanner(System.in);
    private String name;
    private int price;
    private int volume;
    private int time ;

    public Menu(String name, int price, int volume, int time) {
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.time = time;

    }
    public Menu(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    void crea(List<Menu>menus){
        System.out.println("Wrie food name: ");
        String name = scanner.nextLine();
        for (Menu menu:menus) {
            if(name.equals(menu.name)){
                System.out.println(menu);
                System.out.println("Summa: ");
                double summa = scanner.nextDouble();
                if(summa > menu.price){
                    double resul = summa - menu.price;
                    System.out.println("sdacha: "+resul);
                }else if(summa < menu.price){
                    System.out.println("Ne hvakak money!");
                }
            }
        }


    }

    void poluchiVse(List<Menu>menus){
        for (Menu menu:menus) {
            System.out.println(menu);
        }

    }
    void sorkPrice(List<Menu>menus){
        menus.sort(menuComparator);
        for(Menu menu:menus) {
            System.out.println(menu);
        }

    }

    public  void GetBayName(List<Menu>menus){


    }
    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                ", time=" + time +
                '}';
    }
    public Comparator<Menu>menuComparator = new Comparator<Menu>() {
        @Override
        public int compare(Menu o1, Menu o2) {
            return o1.getPrice() - o2.getPrice();
        }
    };
}
