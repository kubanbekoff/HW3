package Lesson_3;

public class chebur {
    public static void main(String[] args) {
        int totalOrange = 10;
        int forCheburashka = 6;

int forGena = totalOrange - forCheburashka;
        if (forCheburashka > forGena){
            System.out.println("Какой жадный чебурашка!");
        }else if (forGena > forCheburashka){
            System.out.println("Гена жмот!");
        }else
        System.out.println("Все молодцы!");
    }
}
