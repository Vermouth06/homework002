public class Main {
    public static void main(String[] args) {
        byte b = 23;
        short sh = 453;
        int integer = 3432;
        long l = 12312L;
        float f = 34.6f;
        double d = 3242.342;
        char bar = 35;
        boolean bool = true;

        double boxer1 = 78.2;
        double boxer2 = 82.7;
        System.out.println("вес двух боксеров = " + (boxer1 + boxer2));
        System.out.println("разница в весе = " + (boxer2 - boxer1));

        int banana = 80;
        int milk = 105;
        int iseCream = 100;
        int egg = 70;
        int weightGram = banana * 5 + milk * 2 + iseCream * 2 + egg * 4;
        System.out.println("вес в граммах = " + weightGram);
        System.out.println("вес в килограммах = " + (double) weightGram / 1000);

        int weighDeal = 7000;
        int diet1 = 250;
        int diet2 = 500;
        double result1 = Math.ceil((double) weighDeal / diet1);
        System.out.println("спортсмен сбросит по первой диете через =" + (int)result1 + " дней" );
        double result2 = Math.ceil((double) weighDeal / diet2);
        System.out.println("спортсмен сбросит по второй диете через =" + (int)result2 + " дней" );

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;

        double increaseMasha = (double) masha / 100 * 10 + masha;
        double increaseDenis = (double) denis / 100 * 10 + denis;
        double increaseKristina =(double) kristina / 100 * 10 + kristina;
        System.out.println("разница в годовом доходе Маши составляет = " + (increaseMasha - masha)*12);
        System.out.println("разница в годовом доходе Дениса составляет = " + (increaseDenis - denis)*12);
        System.out.println("разница в годовом доходе Кристины составляет = " + (increaseKristina - kristina)*12);







    }







}