public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxerMass = 78.2;
        var secondBoxerMass = 82.7;
        var totalMass = firstBoxerMass + secondBoxerMass;
        System.out.println(totalMass);
        var difference = secondBoxerMass - firstBoxerMass;
        System.out.println(difference);
        var remainingMass = secondBoxerMass % firstBoxerMass;
        System.out.println(remainingMass);

        var totalEmployeeAmount = 640/8;
        System.out.println("Всего работников в компании " + totalEmployeeAmount + " человек");
        totalEmployeeAmount = totalEmployeeAmount + 94;
        var totalWorkHours = totalEmployeeAmount * 8;
        System.out.println("Если в компании работает " + totalEmployeeAmount + ", то всего " + totalWorkHours + " часов работы может быть поделено между сотрудниками");
    }
}