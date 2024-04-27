package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CemeteryService extends Service {
    public static void exhumation() {
        System.out.println("Вскрытие могилы (дополнительная услуга).");
        System.out.println("Укажите номер могилы которую вы хотите вскрыть");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("Укажите адресс , куда доставить вашего деда ");
        String adress = scanner.nextLine();
        System.out.println("Труп из могилы " + choice + " будет доставлен по адресу " + adress + " завтра");
    }
}


