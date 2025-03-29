package Q_03;

import java.time.LocalDate;
import java.time.LocalTime;

class RamzanTimeShip extends Vehicle {  // Ensures historical accuracy when delivering food to different timePeriods

    void verify_hist_consistency(int date, int month, int year, int hr, int min) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        int currentDay = currentDate.getDayOfMonth();
        int currentMonth = currentDate.getMonthValue();
        int currentYear = currentDate.getYear();
        int currentHour = currentTime.getHour();
        int currentMinute = currentTime.getMinute();

        if (year < currentYear) {
            System.out.println("Error: The provided year (" + year + ") is in the past. Please enter a valid year.");
        } else if (year == currentYear && month < currentMonth) {
            System.out.println("Error: The provided month (" + month + ") is in the past. Please enter a valid month.");
        } else if (year == currentYear && month == currentMonth && date < currentDay) {
            System.out.println("Error: The provided date (" + date + ") is in the past. Please enter a valid date.");
        } else if (date < 1) {
            System.out.println("Error: The provided date (" + date + ") is invalid. Date cannot be less than 1.");
        } else {
            System.out.println("Success: The provided date and time are valid.");
        }
    }

    @Override
    void movement() {
        verify_hist_consistency(29, 12, 2025, 2, 32);

    }
}
