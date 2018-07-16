package com.example.android.quakereport;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSON {


    String practiceJSON=" "+
            "{"+
                "\"VideoGames\" :[" +
                    "{"+
                        " \"name\":\"Five Freddy\""+
                        "\"system\":\"PC\"" +
                        "\"price\":\"10\""+
                        "\"esrp\" :\"t\""+
                        "\"genre\" :\"horror\""+
                    "}"+
                    "]"+
                    "}";

    public void tryJSON() {
        try {
            JSONObject root= new JSONObject(practiceJSON);
            JSONArray gamesArray = root.getJSONArray("VideoGames");
            JSONObject firstGame = gamesArray.getJSONObject(0);
            String name = firstGame.getString("name");
            System.out.println(name);

        } catch(Exception E) {

        }
    }


}
