package com.example.willstanley_json_volley;

import com.google.gson.annotations.SerializedName;

public class GameCompany
{
    @SerializedName("name")
    public String gameCompanyName;
    @SerializedName("year")
    public int gameCompanyYearFounded;
    @SerializedName("recentConsole")
    public String gameCompanyLatestConsole;

    public String getGameCompanyName() { return gameCompanyName; }

    public int getGameCompanyYearFounded() { return gameCompanyYearFounded; }

    public String getGetGameCompanyLatestConsole() { return gameCompanyLatestConsole; }

    public GameCompany(String name, int year, String console)
    {
        gameCompanyName = name;
        gameCompanyYearFounded = year;
        gameCompanyLatestConsole = console;
    }
}
