package generics;

import java.io.IOException;
import java.util.ArrayList;

public class Examples4 {

    public static void main(String[] args) throws IOException
    {
        //статическая инициализация массива
        int[] data = {1, 5, 6, 11, 3, 15, 7, 8, 10};

        //создание списка, где все элементы должны быть типа Integer
        ArrayList<Integer> list = new ArrayList<Integer> ();

        //заполнение списка из массива
        for (int i = 0; i < data.length; i++)
            list.add(data[i]);

        ArrayList<Integer> even = new ArrayList<Integer>();  //чётные
        ArrayList<Integer> odd = new ArrayList<Integer>();    //нечётные

        for (int i = 0; i < list.size(); i++)
        {
            Integer x = list.get(i);
            if (x % 2 == 0)    //если x - чётное
                even.add(x);   // добавляем x в коллекцию четных чисел
            else
                odd.add(x);    // добавляем x в коллекцию нечетных чисел
        }

        for (int i = 0; i<even.size(); i++) {
            System.out.println(even.get(i));
        }

        for (int i = 0; i<odd.size(); i++) {
            System.out.println(odd.get(i));
        }
    }
}
