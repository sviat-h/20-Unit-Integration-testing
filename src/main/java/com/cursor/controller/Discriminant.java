package com.cursor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/discriminant")
@RestController
public class Discriminant {

    public static long calculatedDiscriminant(long a, long b, long c) {

        return (int) Math.pow(b, 2) - (4 * a * c);
    }
}
