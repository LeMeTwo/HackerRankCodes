import java.util.Scanner;
import java.util.regex.Pattern;

//Checks if IP from input is correct

class MyRegex{

    MyRegex(String id){
        // "pattern" variable was neccesary to fulfill the task`s requirements
        String pattern = id;
        System.out.println(isCorrect(pattern));
    }

    static boolean isCorrect(String id){
        //String patternDot = (("^[\\.]"));
        try {
            String[] pattern = (id.split("\\."));
            if (pattern.length != 4){
                return false;
            }

            for (int i = 0; i < pattern.length; i++){

                int length = pattern[i].length();

                if(length >= 4){
                    return false;
                }

                switch (length){

                    case (3):{
                    if(Pattern.compile("^([0-1][0-9][0-9]|2[0-4][0-9]|25[0-5])$").matcher(pattern[i]).find()){
                        continue;
                    }

                    else{
                        return false;
                    }}

                    case(2):{
                        if(Pattern.compile("^([0-9][0-9])$").matcher(pattern[i]).find()){
                            continue;
                        }

                        else{
                            return false;
                        }
                    }

                    case(1):{
                        if(Pattern.compile("^([0-9])$").matcher(pattern[i]).find()){
                            continue;
                        }

                        else{
                            return false;
                        }
                    }

                }

            }
            return true;
        }
        catch(RuntimeException error){
            return false;
        }
    }

}

public class IPChecker {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
        while (true){
            String myString = scanner.next();

            MyRegex myRegex = new MyRegex(myString);
            }
        }
        catch(Exception runtimeErrorException){
            scanner.close();
        }
    }

}
