import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Beeline {
    public static void main(String[] args) {

        int cash = 500;                  // исходное состояние счета
        int upload = 1500;                // сумма зачисления
        int x = 1000;                    // сумма зачисления, при которой начинаются зачисляться бонусы
        int bonus = upload / 100;        // рассчет бонуса от суммы зачисления
        int summary = cash + bonus;      // итоговое состояние кошелька с бонусами



        if (upload >= x) {
            System.out.println("Кол-во бонусов: " + bonus);
            System.out.println("Итоговое состояние счета включая бонусы: " + (summary + upload));
        } else {
            System.out.println("Итоговое состояние счета без бонусов: " + (cash + upload));
        }
    }
}
