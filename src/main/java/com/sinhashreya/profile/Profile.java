package com.sinhashreya.profile;
import static spark.Spark.*;

public class Profile {
    public static void main(String[] args) {
        String portString = System.getenv("PORT");
        
        if(portString == null || portString.isEmpty()){
            portString = "8080";
        }
        
        port(Integer.valueOf(portString));
        
        staticFileLocation("/webapp");
        
        get("/", (request, response) -> {
            response.redirect("homepage.html");
            return "should never get printed";
        });
    }
}