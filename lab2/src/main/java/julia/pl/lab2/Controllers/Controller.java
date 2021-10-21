package julia.pl.lab2.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @GetMapping("/CapitalLetters")
    public String findCapitalLetters(@RequestParam ("text") String text){
        int counter = 0;
        char sign;

        for(int i = 0; i < text.length(); i++){
            sign = text.charAt(i);
            if( Character.isUpperCase(sign) )
                counter++;
        }

        return "Capital letters: " + counter;
    }

    @GetMapping("/lowercaseLetters")
    public String findLowercaseLetters(@RequestParam ("text") String text){
        int counter = 0;
        char sign;

        for(int i = 0; i < text.length(); i++){
            sign = text.charAt(i);
            if( Character.isLowerCase(sign) )
                counter++;
        }

        return "Lowercase letters: " + counter;
    }

    @GetMapping("/digits")
    public String findDigits(@RequestParam ("text") String text){
        int counter = 0;
        char sign;

        for(int i = 0; i < text.length(); i++){
            sign = text.charAt(i);
            if( Character.isDigit(sign) )
                counter++;
        }

        return "Digits: " + counter;
    }

    @GetMapping("/specialCharacters")
    public String findSpecialCharacters(@RequestParam ("text") String text){
        int counter = 0;
        char sign;

        for(int i = 0; i < text.length(); i++){
            sign = text.charAt(i);
            if( !Character.isDigit(sign)  && !Character.isLetter(sign) && !Character.isWhitespace(sign) )
                counter++;
        }

        return "Special characters: " + counter;
    }

}
