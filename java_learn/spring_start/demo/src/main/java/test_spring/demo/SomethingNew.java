package test_spring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;

@RestController
public class SomethingNew {

    @GetMapping("/hi")
    public Map<String, String> sayHello() {
        Map<String, String> map = new HashMap<>();
        map.put("hi", "there");
        return map;
    }
    
}
