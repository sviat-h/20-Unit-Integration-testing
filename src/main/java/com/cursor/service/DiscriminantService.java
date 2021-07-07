package com.cursor.service;

import com.cursor.controller.Discriminant;
import com.cursor.dto.DiscriminantVariables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DiscriminantService {

    @GetMapping("/method")
    @Autowired
    public static void showSolution(@RequestBody DiscriminantVariables variable) {

        long discriminant = Discriminant.calculatedDiscriminant(variable.a, variable.b, variable.c);

        if (discriminant > 0) {

            System.out.println("Discriminant is " + discriminant + " which is Positive");
            System.out.println("Hence Two Solutions");

        } else if (discriminant == 0) {

            System.out.println("Discriminant is " + discriminant + " which is Zero");
            System.out.println("Hence One Solution");

        } else {

            System.out.println("Discriminant is " + discriminant + " which is Negative");
            System.out.println("Hence No Real Solutions");
        }
    }
}
