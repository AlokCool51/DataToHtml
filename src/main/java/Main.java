import java.io.*;
import org.apache.commons.io.FileUtils;

class Invoice {
    public static void main(String[] args) throws IOException {
        File htmlTemplateFile = new File("./src/main/resources/template.html");
        String htmlString = FileUtils.readFileToString(htmlTemplateFile, "UTF-8");

        String school = "ABC Public School";
        String schoolAddress = "Near PMC Bank Tagore Nagar, Vikhroli(E),- 400083";
        String schoolPhone = "25746955";
        String date = "2020-12-11";
        String receipt = "ddd";
        String admission = "123455";
        String className = "I A";
        String name = "kajol";
        String batch = "2019-2020";
        String fatherName = "Shri Arunhesh Kumar";
        String motherName = "Manoranjan Varshney";

        htmlString = htmlString.replace("$school", school);
        htmlString = htmlString.replace("$schoolAddress", schoolAddress);
        htmlString = htmlString.replace("$schoolPhone", schoolPhone);
        htmlString = htmlString.replace("$date", date);
        htmlString = htmlString.replace("$receipt", receipt);
        htmlString = htmlString.replace("$admission", admission);
        htmlString = htmlString.replace("$class", className);
        htmlString = htmlString.replace("$name", name);
        htmlString = htmlString.replace("$fatherName", fatherName);
        htmlString = htmlString.replace("$motherName", motherName);



        File newHtmlFile = new File("./src/main/resources/new.html");
        FileUtils.writeStringToFile(newHtmlFile, htmlString, "UTF-8");
    }
}


