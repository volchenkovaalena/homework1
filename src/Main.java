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

        var WeightBoxer1 = 78.2;
        var WeightBoxer2 = 82.7;
        System.out.println(WeightBoxer1 + WeightBoxer2);
        System.out.println(WeightBoxer2 - WeightBoxer1);

        System.out.println(WeightBoxer2 - WeightBoxer1);
        System.out.println(WeightBoxer2 % WeightBoxer1);

        var TotalWorkHours = 640;
        var WorkHoursForPerson = 8;
        var workers = TotalWorkHours / WorkHoursForPerson;
        System.out.println ("Всего работников в компании " + workers + " человек" );

        workers = workers + 90;
        TotalWorkHours = workers * 8;
        System.out.println ("Если в компании работает " + workers + " человек, то всего " + TotalWorkHours + " часов работы может быть поделено между сотрудниками.");



    }
}