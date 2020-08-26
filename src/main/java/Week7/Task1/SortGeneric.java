package Week7.Task1;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortGeneric {
    public <T extends Comparable> List<T> getMinMax(List<T> arr) throws Exception {

        if (arr.size() == 0) throw new  Exception("Không hợp lệ");
        else {
            T min = arr.get(0);
            T max = arr.get(0);
            for (int i = 0; i < arr.size(); i++) {
                if (min.compareTo(arr.get(i)) < 0) {
                    min = arr.get(i);
                }
                if (max.compareTo(arr.get(i)) > 0) {
                    max = arr.get(i);
                }

            }
            List<T> list = new ArrayList<T>();
            list.add(min);
            list.add(max);
            return list;
        }
    }
}

