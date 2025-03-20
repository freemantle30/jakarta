package cours_03.Ex03.controllers;

import cours_03.Ex03.domain.Hospital;
import cours_03.Ex03.managers.HospitalManager;
import cours_03.Ex03.view.UserInterface;

public class DisplayController {
    public static void display(Hospital h1, Hospital h2){
        if (h1!= null && h2 != null){
            UserInterface.show(h1,h2);
        }

    }









}
