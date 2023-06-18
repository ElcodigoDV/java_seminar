import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;


public class Request {

//    public static String sqlRequest(String json){
//        //{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//        String jsonObject = json;
//        StringBuilder request = new StringBuilder("select * from students where ");
//        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
//        String name = jsonObject(json).get("name").getAsString();
//        //String
//        return name;


//    }

    public static void main(String[] args) {
        static String json = {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"};
        JsonElement jelement = new JsonParser().parse(str);
//        String name = sqlRequest(str);
        System.out.println(jelement);
    }
}