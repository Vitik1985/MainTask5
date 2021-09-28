import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MainTask5 { //Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
    public static void main(String[] args) throws Exception {
        HashMap<Integer, String> number_month = new HashMap<>();  // ключ - значение
        number_month.put(1, "Январь");
        number_month.put(2, "Февраль");
        number_month.put(3, "Март");
        number_month.put(4, "Апрель");
        number_month.put(5, "Май");
        number_month.put(6, "Июнь");
        number_month.put(7, "Июль");
        number_month.put(8, "Август");
        number_month.put(9, "Сентябрь");
        number_month.put(10, "Октябрь");
        number_month.put(11, "Ноябрь");
        number_month.put(12, "Декабрь");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a;
        System.out.print("enter the number from 1 to 12 or stop: ");
        boolean i = true;
        while (i) {
            String count = br.readLine();
            if (count.equals("stop")) {
                System.out.println("The programm has been stopped. ");
                i = false;
            } else {
                a = Integer.parseInt(count);
                if (number_month.containsKey(a)) {

                    System.out.println("The name of month is: " + number_month.get(a));
                }
                else {
                    System.out.println("There is no such month.");
                    i = false;
                }
            }
        }
    }
}
