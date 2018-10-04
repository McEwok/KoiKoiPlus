package com.example.becky.koikoiplus;

public class Card {
    private String cSeason;
    private String cType;
    private String cName;

    public void Card(String _cSeason, String _cType, String _cName){
        cSeason = _cSeason;
        cType = _cType;
        cName = _cName;
    }

    public void setCSeason(String _cSeason){
        cSeason = _cSeason;
    }

    public void setCType(String _cType){
        cType = _cType;
    }

    public void setCName(String _cName){
        cName = _cName;
    }

    public String getcNSeason(){
        return cSeason;
    }

    public String getCType(){
        return cType;
    }

    public String getCName(){
        return cName;
    }
}
