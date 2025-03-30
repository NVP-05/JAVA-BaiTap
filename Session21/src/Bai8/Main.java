package Bai8;

public class Main {
    public static void main(String[] args) {
        String[] listPhoneNumber = {"0962854080", "098sdas6abc10", "123456789", "0349227477"};

        for (String phoneNumber : listPhoneNumber) {
            try {
                Bai8.InvalidPhoneNumberLengthException.validatePhoneNumber(phoneNumber);
                System.out.println("Hợp lệ: " + phoneNumber);
            } catch (InvalidPhoneNumberLengthException e) {
                System.out.println("Không hợp lệ: " + phoneNumber + " -> " + e.getMessage());
            }
        }
    }
}