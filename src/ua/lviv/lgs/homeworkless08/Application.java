package ua.lviv.lgs.homeworkless08;

import java.util.Scanner;

public class Application {

    static void menu() {
        System.out.println();
        System.out.println("Щоб перевірити, чи є такий місяць, натисніть 1");
        System.out.println("Щоб вивести всі місяці пори року, натисніть 2");
        System.out.println("Щоб вивести всі місяці з певною кількістю днів, натисніть 3");
        System.out.println("Щоб вивести всі місяці з меншою кількістю днів, натисніть 4");
        System.out.println("Щоб вивести всі місяці з більшою кількістю днів, натисніть 5");
        System.out.println("Щоб вивести наступну пору року до вказаної, натисніть 6");
        System.out.println("Щоб вивести попередню пору року до вказаної, натисніть 7");
        System.out.println("Щоб вивести всі місяці із парною кількістю днів, натисніть 8");
        System.out.println("Щоб вивести всі місяці із непарною кількістю днів, натисніть 9");
        System.out.println("Щоб перевірити введений місяць на парність днів, натисніть 10");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Months months[] = Months.values();//заповнили масив місяцями
        Sesons sesons[] = Sesons.values();
        String data;
        int data2;


        while (true) {
            menu();
            boolean isExist = false;
            int num = -1;
            switch (sc.next()) {
                case "1":
                    System.out.println("Введіть назву місяця");
                    sc = new Scanner(System.in);//прочитали
                    data = sc.next().toUpperCase();//записали рядок і перевели в верхній регістр

                    num = getNumMonth(months, data, num);

                    if (num >= 0) System.out.println("Є такий місяць  " + data);

                    break;
                case "2":
                    System.out.println("Введіть назву пори року: ");
                    sc = new Scanner(System.in);//прочитали
                    data = sc.next().toUpperCase();//записали рядок і перевели в верхній регістр

                    num = getNumSesons(sesons, data, num);//перевірка, чи є


                    if (num != -1) {
                        System.out.println("Місяці пори року " + data.toString() + " :");
                        for (Months m : months) {
                            if (m.seson.name().equals(data)) {
                                System.out.println(m.name());
                            }

                        }
                    }

                    break;
                case "3":
                    System.out.println("Введіть кількість днів: ");
                    sc = new Scanner(System.in);//прочитали
                    data2 = sc.nextInt();

                    num = getNumDay(months, data2, num);


                    if (num > -1) {
                        for (Months m : months) {
                            if (m.getDay() == data2) {
                                System.out.println("Місяць " + m.name() + " має " + data2 + " днів");
                            }


                        }
                    }


                    break;
                case "4":
                    System.out.println("Введіть кількість днів: ");
                    sc = new Scanner(System.in);//прочитали
                    data2 = sc.nextInt();
                    int count = 0;


                    for (Months m : months) {
                        if (m.getDay() < data2) {
                            System.out.println(m.name());
                            count++;
                        }

                    }
                    if (count != 0) System.out.println("Mенше,ніж " + data2 + " днів, мають " + count + " місяців");
                    else System.out.println("Немає місяця з меншою, ніж " + data2 + " днів");

                    break;
                case "5":
                    System.out.println("Введіть кількість днів: ");
                    sc = new Scanner(System.in);//прочитали
                    data2 = sc.nextInt();
                    count = 0;


                    for (Months m : months) {
                        if (m.getDay() > data2) {
                            System.out.println(m.name());
                            count++;
                        }
                    }
                    if (count != 0) System.out.println("Більше,ніж " + data2 + " днів, мають " + count + " місяців");
                    else System.out.println("Немає місяця з більшою, ніж " + data2 + " днів");

                    break;
                case "6":
                    System.out.println("Введіть назву пори року: ");
                    sc = new Scanner(System.in);//прочитали
                    data = sc.next().toUpperCase();//записали рядок і перевели в верхній регістр
                    num = getNumSesons(sesons, data, num);//перевірка, чи є


                    if (num != -1) {
                        if (num == 3) num = -1;
                        System.out.println("Наступною порою року за  " + data + " буде " + sesons[num + 1].name());

                    }

                    break;
                case "7":
                    System.out.println("Введіть назву пори року: ");
                    sc = new Scanner(System.in);//прочитали
                    data = sc.next().toUpperCase();//записали рядок і перевели в верхній регістр
                    num = getNumSesons(sesons, data, num);//перевірка, чи є


                    if (num != -1) {
                        if (num == 0) num = 4;
                        System.out.println("Попередньою порою року до  " + data + " була " + sesons[num - 1].name());

                    }

                    break;
                case "8":
                    System.out.println("Парну кількість днів мають такі місяці: ");
                    for (Months m : months) {
                        if (m.day % 2 == 0) {
                            System.out.println(m.name());
                        }
                    }
                    break;
                case "9":
                    System.out.println("Непарну кількість днів мають такі місяці: ");
                    for (Months m : months) {
                        if (m.day % 2 != 0) {
                            System.out.println(m.name());
                        }
                    }
                    break;
                case "10":
                    System.out.println("Введіть назву місяця: ");
                    sc = new Scanner(System.in);//прочитали
                    data = sc.next().toUpperCase();//записали рядок і перевели в верхній регістр

                    num = getNumMonth(months, data, num);

                    if (num != -1) {
                        if (months[num].day % 2 == 0)
                            System.out.println("Місяць " + data + " має парну кількість днів");

                        else System.out.println("Місяць " + data + " має непарну кількість днів");
                    }
                    break;


            }
            System.out.println();
        }

    }

    private static int getNumDay(Months[] months, int data2, int num) {
        for (Months m : months) {
            if (m.getDay() == data2) {
                num = m.ordinal();
            }

        }
        if (num < 0) System.out.println("Немає місяця з " + data2 + " днями");
        return num;
    }

    private static int getNumSesons(Sesons[] sesons, String data, int num) {
        for (Sesons m : sesons) {
            if (m.name().equals(data)) {
                num = m.ordinal();
            }

        }
        if (num < 0) System.out.println("Немає такої пори року ");
        return num;
    }

    private static int getNumMonth(Months[] months, String data, int num) {
        for (Months m : months) {
            if (m.name().equals(data)) {
                num = m.ordinal();
            }
        }
        if (num < 0) System.out.println("Немає такого місяця");
        return num;
    }
}
