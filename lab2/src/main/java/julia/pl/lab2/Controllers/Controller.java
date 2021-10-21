package julia.pl.lab2.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/CapitalLetters")
    public int findCapitalLetters(@RequestParam ("text") String text){
        int counter = 0;
        char sign;

        for(int i = 0; i < text.length(); i++){
            sign = text.charAt(i);
            if( Character.isUpperCase(sign) )
                counter++;
        }

        return counter;
    }

    @GetMapping("/lowercaseLetters")
    public int findLowercaseLetters(@RequestParam ("text") String text){
        int counter = 0;
        char sign;

        for(int i = 0; i < text.length(); i++){
            sign = text.charAt(i);
            if( Character.isLowerCase(sign) )
                counter++;
        }

        return counter;
    }


}
