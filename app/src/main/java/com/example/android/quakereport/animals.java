package com.example.android.quakereport;

public class animals {

    public String skinColor;
    public boolean hasfur;
    public int numlegs;
    public boolean isPredator;
    public String foodType;

         public animals(String skinColor, boolean fur, int numlegs, boolean isPredator, String foodType){

        skinColor= "skin";
        hasfur=fur;
        this.numlegs= numlegs;
        this.isPredator = isPredator;
        foodType= "omnivore";
    }

        public String getSkinColor(){
             return skinColor;
        }
             public void setSkinColor(String Skin) {
        this.skinColor = skinColor;
    }

        public boolean gethasfur(){
             return hasfur;
        }
             public void sethasfur(boolean fur){this.hasfur=fur;}

        public int getNumlegs(){
             return getNumlegs();
        }
            public void setNumlegs(int numlegs){this.numlegs=numlegs;}

        public boolean getisPredator() {return isPredator;}

}


