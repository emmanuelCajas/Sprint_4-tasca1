package cat.itacademy.barcelonactiva.cajas.emmanuel.s04.t01.n02.S04T01N02CajasEmmanuel.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(value = "HelloWorld")
    public  String saludo(@RequestParam(defaultValue = "UNKNOWN") String nom){
        return "Hola " + nom +". Estas ejecutando un proyecto Gradle";
    }

    @RequestMapping({"/HelloWorld2","/HelloWorld2/{nom}"})
    public String saludo2(@PathVariable(required = false) String nom){
        return "Hola " + nom +". Estas ejecutando un proyecto Gradle";
    }

}
