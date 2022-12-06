import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        ArrayList<Menu>menus = new ArrayList<>(Arrays.asList(
        new Salad("sezari", 120, 200, 12),
        new Salad("mimoza",300,500,25),
        new Dessert("medovik",100,120,5),
        new Dessert("napoleon",135,1,10),
        new Drinks("limonad",70,3,5),
        new Drinks("mohito",90,1,3)
        ));

        Salad salad = new Salad();
        salad.crea(menus);
        salad.poluchiVse(menus);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        salad.sorkPrice(menus);
        salad.GetBayName(menus);



    }
}