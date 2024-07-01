import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {

// input "10:22:35 AM", "10:22:35PM" -> 10:22:35, 22:22:35

        Scanner scMeu = new Scanner(System.in);
        ;

        System.out.println("Introdu ora in forma de 12 ore (AM/PM): ");
        String ora = scMeu.next();

        if (ora.contains("AM")) {
            System.out.println(ora.substring(0, ora.indexOf("A")));
        } else {
            ora = ora.replace("PM","");
            String oraText = ora.substring(0,2);
            int oraNumar = Integer.parseInt(oraText);
            oraNumar += 12;
            System.out.println(oraNumar);
            StringBuilder sb = new StringBuilder();
            sb.append(oraNumar).append(ora.substring(2));
            System.out.println(sb);
        }


    }
}
