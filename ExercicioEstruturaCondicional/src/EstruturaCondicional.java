public class EstruturaCondicional {
    public static void main(String[] args) {
        // 1
        System.out.println("1) " + (10 >= 9));

        // 2
        System.out.println("2) " + (10 - 21 / 7 >= 7));

        // 3
        System.out.println("3) " + ((1 > 2) && 17 > 10 - 2 * (3 - 1)));

        // 4
        System.out.println("4) " + (2 + 4 > 1 + 2 * 2));

        // 5
        System.out.println("5) " + ((10 * 2 - 1) > 10 && 10 >= 4 + 1 * 2));

        // 6
        System.out.println("6) " + (10 > 2 || (5 * 2) + 10 / 2 + (10 * 3 / 2 + 1) > 20 * 3 - 1));

        // 7
        System.out.println("7) " + ((10 >= 2) || (10 - 2 <= 5 - 2 / 1)));

        // 8
        System.out.println("8) " + (10 + 2 + 4 / 4 >= 3 * 3 - 60 / 3 && 10 >= 60 / 6));

        // 9
        System.out.println("9) " + (60 / 20 * 2 >= 7 - 1));

        // 10
        System.out.println("10) " + !(60 / 20 * 2 >= 7 - 1));

        // 11
        System.out.println("11) " + (10 > 2 || 60 > 20 * 3 - 1));

        // 12
        System.out.println("12) " + (11 + 5 / 10 - 10 <= 10));

        // 13
        System.out.println("13) " + (true && true && false));

        // 14
        System.out.println("14) " + (true || false || false));

        // 15
        System.out.println("15) " + (true || !false || false));
        // 16
        System.out.println("16) " + (false && false || true));

        // 17
        System.out.println("17) " + (!false));

        // 18
        System.out.println("18) " + (!true));

        // 19
        System.out.println("19) " + (!true && true && !false));

        // 20
        System.out.println("20) " + (!(false && false || !true)));

        // 21
        System.out.println("21) " + (2 == 4 - 2 && true == true && 10 * 2 - 1 > 20));

        // 22
        System.out.println("22) " + (10 >= 9 && 15 * 2 + 1 >= 31 && true));

        // 23
        System.out.println("23) " + ((2 >= 5) && (1 != 0) && !(6 <= 2 * 3) || (10 != 10)));

        // 24
        System.out.println("24) " + ((5 != 2) || !(7 > 4) && (4 <= 1.344)));

        // 25
        System.out.println("25) " + ((7 <= 8) == (3 / 2 == 1)));

        // 26
        System.out.println("26) " + (17.5 > 1 && (3.3 > 2)));

        // 27
        System.out.println("27) " + (6 > 3 + 8));

        // 28
        System.out.println("28) " + (6 + 3 > 8));

        // 29
        System.out.println("29) " + (4 > (2 + 9)));

        // 30
        System.out.println("30) " + (4 < 7 + 3));

        // 31
        System.out.println("31) " + (4 < (7 * 5)));

        // 32
        System.out.println("32) " + (1 >= 2.5));

        // 33
        System.out.println("33) " + ((2 >= 5) && (1 != 0) && !(6 <= 2 * 3) || (10 == 10)));

    }
}
