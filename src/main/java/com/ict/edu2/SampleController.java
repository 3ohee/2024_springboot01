package com.ict.edu2;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SampleController {

    // 반환형이 String
    @GetMapping("/hello")
    public String getHello() {
        return "Hello, world";
    }

    // 반환형이 String[] => 자동으로 json 형식을 가지고 출력
    @GetMapping("/hello2")
    public String[] getHello2() {
        return new String[]{"Hello" , "World"};

    }

    // 반환형이 객체 일 때
    @GetMapping("/hello3")
    public SampleVO getHello3() {
        SampleVO svo = new SampleVO();
        svo.setName("고길동");
        svo.setAge("24");

        return svo;
    }

    @GetMapping("/hello4")
    public List<SampleVO> getHello4() {
        List<SampleVO> list = new ArrayList<>();

        SampleVO svo = new SampleVO();
        svo.setName("고길동");
        svo.setAge("24");
        list.add(svo);

        SampleVO svo2 = new SampleVO();
        svo.setName("희동이");
        svo.setAge("3");
        list.add(svo2);

        SampleVO svo3 = new SampleVO();
        svo.setName("도우너");
        svo.setAge("17");
        list.add(svo3);

        return list;
    }
    
    
    // 반환형이 객체 일 때
    @ @GetMapping("/hello5")
    public DataVO getHello5(String number) {
        DataVO dataVO = new DataVO();

        List<SampleVO> list = new ArrayList<>();


        SampleVO svo = new SampleVO("세리호", "15");
        SampleVO svo2 = new SampleVO("달하니", "24");
        SampleVO svo3 = new SampleVO("하헹호", "35");
 
        list.add(svo);
        list.add(svo2);
        list.add(svo3);

        if (number.equals("1")) {
            // dataVO.setResultCode(1);
            // dataVO.setMessage("성공");
            // dataVO.setData(list);

            return DataVO.success(list, "성공");
        } else {
           // dataVO.setResultCode(0);
            //dataVO.setMessage("실패");
           // dataVO.setData(null);
        }
        return DataVO.fail(0, "실패");
    }
    
    
}
