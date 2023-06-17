import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonArray;
import java.io.BufferedReader;


public class Request {

    public static String sqlRequest(String json){
        //{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        String jsonObject = json;
        StringBuilder request = new StringBuilder("select * from students where ");
        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
        String name = jsonObject(json).get("name").getAsString();
        //String
        return name;


    }
    public static void main(String[] args) {
        String str = {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"};
        String name = sqlRequest(str);
        System.out.println(name);
    }
}