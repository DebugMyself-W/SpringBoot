package com.example.modules.service.impl;

import com.example.modules.entity.Student;
import com.example.modules.service.IlambdaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service
public class LambdaServiceImpl implements IlambdaService {

    //计算机俱乐部
    private static List<Student> computerClub = Arrays.asList(
            new Student("2015134001", "小明", 15, "1501"),
            new Student("2015134003", "小王", 14, "1503"),
            new Student("2015134006", "小张", 15, "1501"),
            new Student("2015134008", "小梁", 17, "1505")
    );
    //篮球俱乐部
    private static List<Student> basketballClub = Arrays.asList(
            new Student("2015134012", "小c", 13, "1503"),
            new Student("2015134013", "小s", 14, "1503"),
            new Student("2015134015", "小d", 15, "1504"),
            new Student("2015134018", "小y", 16, "1505")
    );
    //乒乓球俱乐部
    private static List<Student> pingpongClub = Arrays.asList(
            new Student("2015134022", "小u", 16, "1502"),
            new Student("2015134021", "小i", 14, "1502"),
            new Student("2015134026", "小m", 17, "1504"),
            new Student("2015134027", "小n", 16, "1504")
    );

    @Override
    public List<List<Student>> getAllClub() {
        List<List<Student>> allClubStu = new ArrayList<>();
        allClubStu.add(computerClub);
        allClubStu.add(basketballClub);
        allClubStu.add(pingpongClub);
        return allClubStu;
    }

    @Override
    public void test() {
        List<List<Student>> allClub=getAllClub();
        //1.集合
        Stream<Student> stream = basketballClub.stream();
        //2.静态方法
        Stream<String> stream2 = Stream.of("a", "b", "c");
        //3.数组
        String[] arr = {"a","b","c"};
        Stream<String> stream3 = Arrays.stream(arr);
    }


}
