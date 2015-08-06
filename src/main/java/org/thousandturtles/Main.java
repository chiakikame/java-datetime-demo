package org.thousandturtles;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatterBuilder;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

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

        // There's also a builder in java.time.format package
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");

        ZonedDateTime zdt_default = ZonedDateTime.now();
        System.out.printf("Using default timezone (%s)%n", zdt_default.getZone().getId());
        System.out.printf("Seconds from epoch: %d%n", zdt_default.toEpochSecond());
        System.out.println(zdt_default.toString());
        System.out.println(zdt_default.format(formatter));

        System.out.println("=======");

        ZonedDateTime zdt = ZonedDateTime.now(ZoneOffset.UTC);
        System.out.printf("Using UTC timezone (%s)%n", zdt.getZone().getId());
        System.out.printf("Seconds from epoch: %d%n", zdt.toEpochSecond());
        System.out.println(zdt.toString());
        System.out.println(zdt.format(formatter));

        System.out.println();
        System.out.println("=== Joda-time ===");

        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder()
                .appendYear(4, 4)
                .appendMonthOfYear(2)
                .appendDayOfMonth(2)
                .appendHourOfDay(2)
                .appendMinuteOfHour(2)
                .appendSecondOfMinute(2)
                .appendMillisOfSecond(3);

        DateTime dt_default = DateTime.now();
        System.out.printf("Using default timezone (%s)%n", dt_default.getZone().getID());
        System.out.printf("Milliseconds from epoch: %d%n", dt_default.getMillis());
        System.out.println(dt_default.toString());
        System.out.println(dt_default.toString(builder.toFormatter()));

        System.out.println("=======");

        DateTime dt = DateTime.now(DateTimeZone.UTC);
        System.out.printf("Using UTC timezone (%s)%n", dt.getZone().getID());
        System.out.printf("Milliseconds from epoch: %d%n", dt.getMillis());
        System.out.println(dt.toString());
        System.out.println(dt.toString(builder.toFormatter()));
    }
}
