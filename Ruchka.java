import java.util.Scanner;

public class Ruchka {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Ruchka2 ruchka2 = new Ruchka2("Pen is off;");
        ruchka2.show();
        Ruchka2 ruchka3 = new Ruchka2("Pen is on-->1");
        ruchka3.show();
        Ruchka2 ruchka21 = new Ruchka2("Write a text: ");

        int n = scanner.nextInt();
        int res = 0;
        while (true)
            switch (n) {
                case 1 -> {
                    System.out.println("You have 15 inks");
                    ruchka21.show();
                    String text = scanner.next();

                    if (text.length() < 15) {
                        res = 15 - text.length();
                        System.out.println("Continue..." + res + "inks left");
                        Ruchka2 ruchka4 = new Ruchka2(text);
                        ruchka4.show();
                        ruchka21.show();
                        String cast = scanner.next();
                        if (cast.length() == res) {
                            System.out.println("You don't have more inks");
                            Ruchka2 ruchka5 = new Ruchka2(cast);
                            ruchka4.show();
                            ruchka5.show();
                        } else if (cast.length() > res) {
                            Ruchka2 ruchka7 = new Ruchka2(text+cast);
                            ruchka7.show1();
                        }else {
                            Ruchka2 ruchka22=new Ruchka2(text+cast);
                            ruchka22.show();
                        }

                    } else if (text.length() == 15) {
                        System.out.println("You don't have more inks");
                        Ruchka2 ruchka5 = new Ruchka2(text);
                        ruchka5.show();
                    } else {
                        res = 15 - text.length();
                        System.out.println();
                        System.out.println("Error, you write " + (res * (-1)) + " " + " more symbol");
                        Ruchka2 ruchka6 = new Ruchka2(text);
                        ruchka6.show1();
                    }
                }
            }


    }




    }

