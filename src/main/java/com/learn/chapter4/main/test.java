package com.learn.chapter4.main;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) throws ParseException, InterruptedException {
//        String str = "dad$$$$dasddasaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1831sa";
//        String str2 = "我".repeat(25) + "english";
//        boolean t = str.matches("[a-zA-Z0-9]+");
//        boolean t2 = str2.matches("[\\u4e00-\\u9fa5]+");
//        System.out.println(t2);
//        System.out.println(str2);
//        String str3 = str2.replaceAll("[\\u4e00-\\u9fa5]", "ab");
//        System.out.println(str3);
//        System.out.println(str2);
//        int i = 0;
//        try {
//            for (i = 0; i < 10; i++) {
//                System.out.println("test");
//            }
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println(i);
//            throw new RuntimeException(e);
//        }
//        List<Map<String, String>> list = new ArrayList<>();
//        HashMap<String, String> map = new HashMap<>();
//        map.put("1", "zx");
//        list.add(map);
//        System.out.println(list);
//        System.out.println(list.get(0).get("2")==null);
//        List<Map<String, String>> rows = new ArrayList<>();
//        HashMap<String, String> map = new HashMap<>() {{
//            put("a", "1");
//            put("b", "2");
//        }};
//        rows.add(map);
//        map.put("a", "3");
//        System.out.println(rows);
//        String consignTimeEnd = "20230440";
//        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
//        Date consignTimeEndDate = dateFormat.parse(consignTimeEnd);
//        System.out.println(consignTimeEndDate.toString());
//
//        Date newConsignTimeEndDate = new Date();
//        newConsignTimeEndDate.setTime(consignTimeEndDate.getTime() + 1000*60*60*24);
//        System.out.println(newConsignTimeEndDate);
//
//        String newConsignTime = dateFormat.format(newConsignTimeEndDate);
//        System.out.println(newConsignTime);
//        ArrayList<String> list = new ArrayList<String>(Arrays.asList("00", "10", "15"));
//        if (list.contains("00")) {
//            System.out.println("yes");
//        }
//        List<String> list2 = new ArrayList<String>(Arrays.asList("00", "10"));
//
//        if (list.containsAll(list2)) {
//            System.out.println("no");
//        }
//
//        list.remove("10");
//        System.out.println(list);
//
//        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 0));
//        list3.remove(0);
//        System.out.println(list3);
//        int count = 0;
//        for (int i = 0; i < 10; i++) {
//            System.out.println(count++);
//        }
//        String sg = "QB0000000000";
//        System.out.println(sg.substring(0,2));
//        Long startTime = System.currentTimeMillis();
//        Thread.sleep(1000);
//        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>> RESULTMAP" + (System.currentTimeMillis() - startTime));
//
//        int j = 2;
//        Map<String, Integer> map = new HashMap();
//        map.put("2", 3);
//        map.put("2",map.get("2") * 3);
//        System.out.println(map.get("2"));

//        List<String> resultListMap = new ArrayList<>();
//        resultListMap.addAll(new ArrayList<>(Arrays.asList("a", "b")));
//        System.out.println(resultListMap);

//        for (int i = 0; i < 2500000; i+=500000) {
//            System.out.println("limit: " + i + "," + (i+500000));
//            System.out.println(i + "," + (i+500000));
//        }
//
//        Map<String, String> map = new HashMap<>(){{
//            put("a", "1");
//        }};
//        int lala = 3;
//        testMap(map, lala);
//        Thread.sleep(3000);
//        System.out.println(map);
//        System.out.println(lala);

        String[] words = new String[]{"Hello","World"};

        List<String> a = Arrays.stream(words).map(word -> word.split(""))
                .flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        a.forEach(System.out::print);
        System.out.println();
        String[] split = words[0].split("");
        Arrays.stream(split).findFirst().ifPresent(System.out::println);

        Arrays.asList(100, 99, 1000, 1, -10, 200).stream()
                .reduce((n1, n2) -> n1 > n2 ? n1 : n2)
                .ifPresent(System.out::println);
    }

    public static void testMap(Map<String, String> map, int lala) {
        map.put("a", "2");
        lala += 1;
    }

    public void lala1() {
        lala2();
    }

    public void lala2() {

    }
}
