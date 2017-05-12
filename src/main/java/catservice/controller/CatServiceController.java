package catservice.controller;

import catservice.model.Cat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CatServiceController {

    private AtomicLong atomicLong = new AtomicLong();

    @RequestMapping("/cat")
    public Cat getCat(@RequestParam(value = "name", defaultValue = "nameless") String name, @RequestParam(value = "age", defaultValue = "0") int age ){
        return new Cat(atomicLong.incrementAndGet() ,name, age);
    }
}
