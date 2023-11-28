public class Main {
    public static void main(String[] args) {


        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        var friend = 19;
        System.out.println (friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 3;
        System.out.println (friend);

        var frog = 3.5;
        System.out.println (frog);
        frog = frog * 10;
        System.out.println (frog);
        frog = frog / 3.5;
        System.out.println (frog);
        frog = frog + 4;
        System.out.println (frog);

        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        System.out.println(weightBoxer1 + weightBoxer2);
        System.out.println(weightBoxer2 - weightBoxer1);

        System.out.println(weightBoxer2 - weightBoxer1);
        System.out.println(weightBoxer2 % weightBoxer1);

        var totalWorkHours = 640;
        var workHoursForPerson = 8;
        var workers = totalWorkHours / workHoursForPerson;
        System.out.println ("Всего работников в компании " + workers + " человек" );

        workers = workers + 90;
        totalWorkHours = workers * 8;
        System.out.println ("Если в компании работает " + workers + " человек, то всего " + totalWorkHours + " часов работы может быть поделено между сотрудниками.");



    }
}