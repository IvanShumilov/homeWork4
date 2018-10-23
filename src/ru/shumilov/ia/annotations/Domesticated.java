package ru.shumilov.ia.annotations;


import java.lang.annotation.*;

/**
 * Аннотация указывает на одомашнивание животного.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Inherited
public @interface Domesticated {

    String domesticated() default "домашнее";
}

