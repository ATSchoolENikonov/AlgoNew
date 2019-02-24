import java.util.Random;

public class Main {
    public static void main(String[] args) {
        arrNew arr= new arrNew(1000);
        //System.out.println("Начальный массив");
        //arr.check(); -Выводит массив
        //System.out.println(arr.binaryFind(4)); -ищет элемент по значению
        //arr.add(1); -добавляет элемент со значением 1
        //arr.delete(1); -удаляет элемент с индексом 1
        //System.out.println("Итоговый массив");
        //arr.check();
        long a = System.currentTimeMillis();
        arr.sortBubble();
        long bubble = (System.currentTimeMillis()-a);
        System.out.println(bubble);
        long b = System.currentTimeMillis();
        arr.sortSelect();
        long select = (System.currentTimeMillis()-b);
        System.out.println(select);
        long c = System.currentTimeMillis();
        arr.sortInsert();
        long insert = (System.currentTimeMillis()-c);
        System.out.println(insert);
    }

}
