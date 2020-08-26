import Week3.Task1.Week3Task1;
import Week3.Task2.Fraction;
import Week4.Week4;
import Week7.Task1.SortGeneric;
import bean.HelloWorldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat();
        cat.call();
        SortGeneric sortGeneric = new SortGeneric();
        List list = new ArrayList();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(9);
        List minmax  =  sortGeneric.getMinMax(list);
        System.out.println(minmax.get(0));
        System.out.println(minmax.get(1));
    }
}
