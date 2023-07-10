package cn.itheima.stream;

import cn.itheima.enumt.EnumTest;
import cn.itheima.pojo.Actor;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApplication {
    public static void main(String[] args) {

        ArrayList<String> manList = new ArrayList<String>();
        manList.add("周润发");
        manList.add("成龙");
        manList.add("刘德华");
        manList.add("吴京");
        manList.add("周星驰");
        manList.add("李连杰");
        ArrayList<String> womanList = new ArrayList<String>();
        womanList.add("林心如");
        womanList.add("张曼玉");
        womanList.add("林青霞");
        womanList.add("柳岩");
        womanList.add("林志玲");
        womanList.add("王祖贤");

        Stream<String> ms = manList.stream().filter(s -> s.length() == 3).limit(3);
        Stream<String> ws = womanList.stream().filter(s -> s.startsWith("林")).skip(1);
        Stream.concat(ms, ws).map(Actor::new).forEach(System.out::println);


        EnumTest red = EnumTest.RED;
        System.out.println(red);


        RoundingMode[] values = RoundingMode.values();
        Stream.of(values).forEach(System.out::println);

        System.out.println("------------");
        RoundingMode up = RoundingMode.valueOf("UP");
        System.out.println(up);

    }
}

