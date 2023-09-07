package xxx;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HK8 {

    public static void main(String[] args) {

        // 1.
        // 建立一個Collection物件並將以下資料Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
        // Object物件、“Snoopy”、BigInteger(“1000”)
        List<Object> list = new ArrayList<>();
        list.add(Integer.valueOf(100));
        list.add(Double.valueOf(3.14));
        list.add(Long.valueOf(21L));
        list.add(Short.valueOf("100"));
        list.add(Double.valueOf(5.1));
        list.add("Kitty");
        list.add(Integer.valueOf(100));
        list.add(new Object());
        list.add("Snoopy");
        list.add(new BigInteger("1000"));

        // 1.1 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
        // Iterator
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        // 傳統for
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for (Object e : list) {
            System.out.print(e + " ");
        }
        System.out.println();
        // 1.2 移除不是java.lang.Number相關的物件,再次印出這個集合物件的所有元素
        list.removeIf(e -> !(e instanceof Number));
        for (Object e : list) {
            System.out.print(e + " ");
        }
        System.out.println();

        // 2. 透過建構子產生以下7個Train的物件，放到每小題需使用的集合裡
        Train[] trainData = new Train[7];
        trainData[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
        trainData[1] = new Train(1254, "區間", "屏東", "基隆", 700);
        trainData[2] = new Train(118, "自強", "高雄", "台北", 500);
        trainData[3] = new Train(1288, "區間", "新竹", "基隆", 400);
        trainData[4] = new Train(122, "自強", "台中", "花蓮", 600);
        trainData[5] = new Train(1222, "區間", "樹林", "七堵", 300);
        trainData[6] = new Train(1254, "區間", "屏東", "基隆", 700);

        // 印出不重複的Train物件 HashSet
        System.out.println("===========印出不重複的Train物件=================");
        Set<Train> trains = new HashSet<>();
        for (int i = 0; i < trainData.length; i++) {
            trains.add(trainData[i]);
        }
        System.out.println("====================Iterator=================");
        Iterator<Train> iterator2 = trains.iterator();
        while (iterator2.hasNext())
            System.out.println(iterator2.next());

        System.out.println("====================foreach=================");
        for (Train e : trains) {
            System.out.println(e);
        }
        System.out.println();

        System.out.println("=======Train物件印出時，能以班次編號由大到小印出========");
        // 讓Train物件印出時，能以班次編號由大到小印出
        List<Train> trains2 = new ArrayList<>();
        for (int i = 0; i < trainData.length; i++) {
            trains2.add(trainData[i]);
        }
        Collections.sort(trains2);
        System.out.println("=====================for===================");
        for (int i = 0; i < trains2.size(); i++) {
            System.out.println(trains2.get(i));
        }
        System.out.println("====================Iterator=================");
        Iterator<Train> iterator3 = trains2.iterator();
        while (iterator3.hasNext())
            System.out.println(iterator3.next());
        System.out.println("====================foreach=================");
        for (Train e : trains2) {
            System.out.println(e);
        }
        System.out.println();

        System.out.println("=====班次編號由大排到小印出， 還可以不重複印出Train物件=====");
        // 讓班次編號由大排到小印出， 還可以不重複印出Train物件 TreeSet
        Set<Train> trains3 = new TreeSet<Train>();
        for (int i = 0; i < trainData.length; i++) {
            trains3.add((Train) trainData[i]);
        }
        System.out.println("====================Iterator=================");
        Iterator<Train> iterator4 = trains3.iterator();
        while (iterator4.hasNext())
            System.out.println(iterator4.next());
        System.out.println("====================foreach=================");
        for (Train e : trains3) {
            System.out.println(e);
        }

    }

}