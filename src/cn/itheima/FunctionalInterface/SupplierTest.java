package cn.itheima.FunctionalInterface;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {

        String[] str = {"林青霞，30","张曼玉，35","柳岩，31"};
        ArrayList<String> res = new ArrayList<>();
        for (String s : str) {
            boolean b = operatorString(
                    s,
                    s1 -> s1.split("，")[0].length() > 2,
                    s1 -> Integer.parseInt(s1.split("，")[1]) > 33
            );
            if (b){
                res.add(s);
            }
        }
        System.out.println(res);
    }
    public  static boolean operatorString(String nameandAge,
                                          Predicate<String> predicate,
                                          Predicate<String> after){
        return predicate.and(after).test(nameandAge);
    }
}
