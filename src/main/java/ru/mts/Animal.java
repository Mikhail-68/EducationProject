package ru.mts;

import java.math.BigDecimal;

public interface Animal {
    /**
     *
     * @return получение породы животного
     */
    String getBreed();

    /**
     *
     * @return получение имени животного
     */
    String getName();

    /**
     *
     * @return получение цены животного в магазине
     */
    BigDecimal getCost();

    /**
     *
     * @return получение характера животного
     */
    String getCharacter();
}
