/*
 * MIT License
 * Copyright (c) 2024 Purohit1999
 */
import java.util.Calendar;

public class CalendarApplication {

    public static void main(String[] args) {
        // Create a Calendar instance representing the current date and time
        Calendar calendar = Calendar.getInstance();

        // Print the current date and time
        System.out.println("📅 The current date is: " + calendar.getTime());

        // Subtract 15 days from the current date
        calendar.add(Calendar.DATE, -15);
        System.out.println("🔙 15 days ago: " + calendar.getTime());

        // Add 4 months to the adjusted date
        calendar.add(Calendar.MONTH, 4);
        System.out.println("🔜 4 months later: " + calendar.getTime());

        // Add 2 years to the adjusted date
        calendar.add(Calendar.YEAR, 2);
        System.out.println("🔜 2 years later: " + calendar.getTime());
    }
}

