import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main ps = new Main();
        ps.j001();
        //ps.j002();
    }

    public void j001() {
        int height, weight;
        double bmi;

        Scanner SC = new Scanner(System.in);
        height = SC.nextInt();
        weight = SC.nextInt();
        bmi = weight / (height*0.01 * height*0.01);
        System.out.printf("%.1f", bmi);
    }
}

