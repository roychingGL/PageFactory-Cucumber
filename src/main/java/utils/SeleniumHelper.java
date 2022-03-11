package utils;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SeleniumHelper {

    public static Map getProperties() throws IOException {
        Map<String, String> mapValues = new HashMap<String, String>();

        FileReader reader = new FileReader("src/test/resources/config.properties");

        Properties properties = new Properties();
        properties.load(reader);

        mapValues.put("server", properties.getProperty("server"));
        mapValues.put("browser", properties.getProperty("browser"));
        mapValues.put("password", properties.getProperty("password"));

        return mapValues;
    }

    public int getRandomNumber() {
        Random rand = new Random();
        int upperbound = 1000000;
        int int_random = rand.nextInt(upperbound);
        return int_random;
    }


    public String generateRandomStringNumber() {
        int random = (int) (Math.random() * 100000 + 1000); /* Random number between 1 and 100*/
        String result = "Auto" + random;
        return result;
    }


    public String generateRandomString() {
        // create a string of all characters
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // create random string builder
        StringBuilder sb = new StringBuilder();
        // create an object of Random class
        Random random = new Random();
        String randomString = "";

        int length = 7;
        for (int i = 0; i < length; i++) {
            // generate random index number
            int index = random.nextInt(alphabet.length());

            // get character specified by index
            // from the string
            char randomChar = alphabet.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
            randomString = sb.toString();
        }
        return randomString;
    }

    public String generateEmail() {
        String randomEmail = generateRandomString();
        return randomEmail += "@mailinator.com";
    }

    public LocalDate getRandomDOB(int minYear, int maxYear) {
        Random random = new Random();
        int minDay = (int) LocalDate.of(minYear, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(maxYear, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);

        return randomBirthDate;
    }

    public String getAdultRandomDOB() {
        String formattedDate = getRandomDOB(1950, 2002).format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        return formattedDate;
    }


    public Map getRandomDOBMap(int minYear, int maxYear) {
        LocalDate date = getRandomDOB(minYear, maxYear);
        int day = date.getDayOfMonth();

        if (day >= 29) {
            day = day - 3;
        }

        String dayStr = String.valueOf(day);
        String month = date.getMonth().toString().toLowerCase(Locale.ROOT);
        Map<String, String> userInfo = new HashMap<>();
        userInfo.put("Day", dayStr);
        month = StringUtils.capitalize(month);
        userInfo.put("Month", month);
        return userInfo;
    }

    public String getTodayDate(String pattern) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime now = LocalDateTime.now();
        return (dtf.format(now));
    }

}