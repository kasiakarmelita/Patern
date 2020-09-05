package Patern.MainBuilder;

import Patern.Builder.Builder;
import Patern.Builder.Solider;

public class Main {
    public static void main(String[] args) {
        Solider solider2 = Builder.builder()
                .withName("Kowalski")
                .withType("sierżant")
                .withItem("bagnet")
                .withItem("Karabin")
                .build();

        System.out.println(solider2);
    }



}