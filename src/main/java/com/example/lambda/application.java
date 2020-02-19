package com.example.lambda;

import com.example.iface.User;
import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

@Slf4j
public class application {

    public static void main(String args[]){

        User user  = new User() {
            @Override
            public String verityUser(String username) {
                return null;
            }
        };
        System.out.println(user.verityUser("qqqq"));

        Predicate<String> predicate = (String name)->{
             return name.equals("admin")?true:false;
        };
        System.out.println(predicate.test("admin"));


        List<Integer> persionList = new ArrayList();
        persionList.add(1);
        persionList.add(7);
        persionList.add(5);
        persionList.add(2);
        persionList.add(8);

        Collections.sort(persionList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println(persionList);

        Collections.sort(persionList,(o1,o2) ->  o2-o1);
        System.out.println(persionList);
//
    }

    //输入带#字符串 截取#好中间内容
    public static String subStr(String str){

        String[] arr  = str.split("#");
        String resultStr = String.join(" ",arr).trim();
        return resultStr;
    }


}