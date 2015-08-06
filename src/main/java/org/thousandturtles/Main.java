package org.thousandturtles;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * Created by Chiaki Chikame on 8/6/15.
 * <p>
 * This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://www.wtfpl.net/txt/copying/ or COPYING.txt for more details.
 */
class Main {
    public static void main(String[] args) {
        System.out.println("=== Java 8 ===");
        ZonedDateTime zdt_default = ZonedDateTime.now();
        System.out.printf("Using default timezone (%s)%n", zdt_default.getZone().getId());
        System.out.printf("Seconds from epoch: %d%n", zdt_default.toEpochSecond());
        System.out.println(zdt_default.toString());

        System.out.println("=======");

        ZonedDateTime zdt = ZonedDateTime.now(ZoneOffset.UTC);
        System.out.printf("Using UTC timezone (%s)%n", zdt.getZone().getId());
        System.out.printf("Seconds from epoch: %d%n", zdt.toEpochSecond());
        System.out.println(zdt.toString());

        System.out.println();
        System.out.println("=== Joda-time ===");

        DateTime dt_default = DateTime.now();
        System.out.printf("Using default timezone (%s)%n", dt_default.getZone().getID());
        System.out.printf("Milliseconds from epoch: %d%n", dt_default.getMillis());
        System.out.println(dt_default.toString());

        System.out.println("=======");

        DateTime dt = DateTime.now(DateTimeZone.UTC);
        System.out.printf("Using UTC timezone (%s)%n", dt.getZone().getID());
        System.out.printf("Milliseconds from epoch: %d%n", dt.getMillis());
        System.out.println(dt.toString());
    }
}
