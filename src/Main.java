public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;

        Human Maxim = new Human("Максим", "Минск", currentYear - 35, "бренд-менеджера.");
        Human Anya = new Human("Аня", "Москва", currentYear - 29, "методиста образовательных программ.");
        Human Katya = new Human("Катя", "Калининград", currentYear - 28, "продакт-менеджера.");
        Human Artem = new Human("Артем", "Москва", currentYear - 27, "директора по развитию бизнеса.");
        Human Vladimir = new Human("Владимир", "Казань", currentYear - 21, null);

        printInfo(Maxim);
        printInfo(Anya);
        printInfo(Katya);
        printInfo(Artem);
        printInfo(Vladimir);
    }
    public static void printInfo (Human human) {
        System.out.println("Привет! Меня зовут " + human.name + ". Я из города " + human.getTown() + ". Я родился в " + human.getYearOfBirth() + ". Я работаю на должности - " + human.job + ". Будем знакомы!");
    }
}