package com.example.exerciserecyclerview;

import java.util.ArrayList;

public class Logos {
    String name;
    String des;
    int icon;

    public Logos(String name, String des, int icon) {
        this.name = name;
        this.des = des;
        this.icon = icon;
    }

    public static ArrayList<Logos> init() {

        ArrayList<Logos> logo = new ArrayList<>();

        logo.add(new Logos("AI", "Adobe Ai", R.drawable.icon_ai));
        logo.add(new Logos("ID", "Adobe InDesign", R.drawable.icon_indesign));
        logo.add(new Logos("PS", "Adobe Photoshop", R.drawable.icon_photoshop));
        logo.add(new Logos("PR", "Adobe Preimere", R.drawable.icon_premiere));
        logo.add(new Logos("PDF", "Adobe Reader", R.drawable.icon_acrobat));
        logo.add(new Logos("BEER", "A cup of beer", R.drawable.icon_bere));
        logo.add(new Logos("BELL", "A bell", R.drawable.icon_bell));
        logo.add(new Logos("CARD", "A tag card", R.drawable.icon_card));
        logo.add(new Logos("AI", "Adobe Ai", R.drawable.icon_ai));
        logo.add(new Logos("ID", "Adobe InDesign", R.drawable.icon_indesign));
        logo.add(new Logos("PS", "Adobe Photoshop", R.drawable.icon_photoshop));
        logo.add(new Logos("PR", "Adobe Preimere", R.drawable.icon_premiere));
        logo.add(new Logos("PDF", "Adobe Reader", R.drawable.icon_acrobat));
        logo.add(new Logos("BEER", "A cup of beer", R.drawable.icon_bere));
        logo.add(new Logos("BELL", "A bell", R.drawable.icon_bell));
        logo.add(new Logos("CARD", "A tag card", R.drawable.icon_card));

        return logo;
    }
}
