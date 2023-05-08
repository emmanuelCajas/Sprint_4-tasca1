package cat.itacademy.barcelonactiva.apellidos.nom.s04.t01.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @RequestMapping(value = "HelloWorld")
    public  String saludo(@RequestParam(defaultValue = "UNKNOWN") String nom){
        return "Hola " + nom +". Estas ejecutando un proyecto maven";
    }

    @RequestMapping({"/HelloWorld2","/HelloWorld2/{nom}"})
    public String saludo2(@PathVariable(required = false) String nom){
        return "Hola " + nom +". Estas ejecutando un proyecto maven";
    }

}
