package org.example;
import org.apache.commons.lang3.RandomStringUtils;
public class Main {
    public static String generateEmail(int length) {
        String allowerChars = "abcdefghijklmnopqrstuvwxyz"+"1234567890";
        String email;
        String temp =RandomStringUtils.random(length,allowerChars);
        email = temp +"test.org";
        System.out.println("Email is : " +email);
        return email;
    }
    public static String generaterandomstring(int length){
        String randomString = RandomStringUtils.randomAlphabetic(length);
        System.out.println("random string is : "+ randomString);
        return randomString;
    }
    public static void main(String[] args) {
        generateEmail(6);
        generaterandomstring(10);
    }
}
//ex2
//import java.util.Random;
//
//public class EmailGenerator {
//    private static final String[] DOMAINS = {"gmail.com", "yahoo.com", "hotmail.com", "example.com", "domain.com"};
//    private static final int MAX_LENGTH = 10;
//
//    public static void main(String[] args) {
//        String randomEmail = generateRandomEmail();
//        System.out.println("Random Email: " + randomEmail);
//    }
//
//    public static String generateRandomEmail() {
//        Random random = new Random();
//        StringBuilder sb = new
//        public static String generateRandomEmail() {
//            Random random = new Random();
//            StringBuilder sb = new StringBuilder();
//
//            // Generate random username
//            for (int i = 0; i < MAX_LENGTH; i++) {
//                char randomChar = (char) (random.nextInt(26) + 'a');
//                sb.append(randomChar);
//            }
//
//            // Append domain randomly from the DOMAINS array
//            String domain = DOMAINS[random.nextInt(DOMAINS.length)];
//
//            return sb.toString() + "@" + domain;
//        }