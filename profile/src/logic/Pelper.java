package logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by anton on 09.04.2020.
 */
public class Pelper {
    private final String firstName = "firstName";
    private String lastName = "lastName";
    private String ageYes = "ageYes";
    private String learnYes = "learnYes";
    private String ageNo = "ageNo";
    private String learnNo = "learnNo";


    public String feedback(String field, boolean marker){

        String result = "";
        int res = 0;
        File file;
        if(marker){
            file = new File("C:\\Users\\anton\\Desktop\\test.txt");
        }else {
            file = new File("C:\\Users\\anton\\Desktop\\tempTest.txt");
        }

        try {
            try(Scanner scanner = new Scanner(file);) {
                for(;scanner.hasNext();) {
                    String time = scanner.nextLine();
                    String[] arrayTime = time.split(";");
                    for (int i = 0 ; i < arrayTime.length ; i++){
                        if(field.equals(firstName) && i == 0){
                            result += "<p>" + arrayTime[i] + "</p>";
                        }else if(field.equals(lastName) && i == 1) {
                            result += "<p>" + arrayTime[i] + "</p>";
                        }else if(field.equals(ageYes) && i == 2) {
                            res += Integer.parseInt(arrayTime[i]);
                        }else if(field.equals(ageNo) && i == 3) {
                            res += Integer.parseInt(arrayTime[i]);
                        }else if(field.equals(learnYes) && i == 4) {
                            res += Integer.parseInt(arrayTime[i]);
                        }else if(field.equals(learnNo) && i == 5) {
                            res += Integer.parseInt(arrayTime[i]);
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(res > 0){
            result = Integer.toString(res);
        }
        return result;
    }

}

