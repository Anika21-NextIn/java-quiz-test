import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SystemLogin{
    public static void main(String[] args) throws IOException, ParseException {
        //user and admin login credentials

        String filePath = "./src/main/resources/user.json";

        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader(filePath));

        JSONObject userObj = new JSONObject();
        userObj.put("username", "anika");
        userObj.put("password", "1234");
        userObj.put("role", "student");

        jsonArray.add(userObj);
        System.out.println(userObj);

        FileWriter writer = new FileWriter(filePath);
        writer.write(String.valueOf(jsonArray));
        writer.flush();
        writer.close();
    }
}