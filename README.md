# PPKWU-zad2
## API DOCUMENTATION
Created by Julia Trajdos


### Controller: 
`GET /CapitalLetters?text=` - finds amount of capital letters

`GET /lowercaseLetters?text=` - finds amount of lowercase letters

`GET /digits?text=` - finds amount of digits 

`GET /specialCharacters?text=` - finds amount of special characters

## Returned values

All of endpoints return String with value of found characters.

## Examples:

Input data: http://localhost:8080/CapitalLetters?text=Ala Ma KotA

Output data: Capital letters: 4


Input data: http://localhost:8080/CapitalLetters?text=Ala Ma KotA

Output data: Lowercase letters: 5


Input data: http://localhost:8080/CapitalLetters?text=Ala ma 3 koty i 2 psy

Output data: Digits: 2


Input data: http://localhost:8080/CapitalLetters?text=5-2*(4:1)=x

Output data: Special characters: 6
