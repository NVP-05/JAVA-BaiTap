package Bai3;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Phúc", Optional.of("0962854080")),
                new User("Minh", Optional.of("0963820086")),
                new User("Lương", Optional.empty()),
                new User("Quân", Optional.empty())
        );

        users.forEach(User::printInfo);
    }
}
