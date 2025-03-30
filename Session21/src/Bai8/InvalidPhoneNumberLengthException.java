package Bai8;

public class InvalidPhoneNumberLengthException extends Exception {
    public InvalidPhoneNumberLengthException(String message) {
        super(message);
    }

    public static void validatePhoneNumber(String phone) throws InvalidPhoneNumberLengthException {
        if (phone.length() != 10 || phone == null) {
            throw new InvalidPhoneNumberLengthException("Số điện thoại phải có đúng 10 chữ số.");
        }

        if (!phone.matches("[0-9]{10}")) {
            throw new InvalidPhoneNumberLengthException("Số điện thoại chứa ký tự không hợp lệ.");
        }
    }
}