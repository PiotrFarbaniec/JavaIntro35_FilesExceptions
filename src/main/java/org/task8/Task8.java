package org.task8;

public class Task8 {

    static DataValidation validation = new DataValidation();

    public static void main(String[] args) {
        try {
            System.out.println(validation.isIdNumberEnteredCorrectly("87082423446"));
            System.out.println(validation.isIdNumberEnteredCorrectly("8708242346"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(validation.isIdNumberEnteredCorrectly("87082/23446"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}