package Utils;

import com.github.javafaker.Faker;

public class Randoms {

   public static Faker faker = new Faker();


    public static String ADD_USER_USER_NAME = faker.name().firstName();
    public static String ADD_USER_PASSWORD = faker.internet().password();
}
