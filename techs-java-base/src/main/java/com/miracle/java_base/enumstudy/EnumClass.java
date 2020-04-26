package com.miracle.java_base.enumstudy;

import java.util.Arrays;

/**
 * @author AresPong
 * @email arespong@163.com
 * @createTime 2020-04-11 12:05
 */
public class EnumClass {
    enum Shrubbery{
        GROUND,CRAWLING,HANGING,XXXX;
        Shrubbery() {
        }
        public static void say(){
            System.out.println("Hello Miss!!!");
        }
    }

    public static void main(String[] args) {
        Arrays.stream(Shrubbery.values()).forEach(s->{
            System.out.println(s+" ordinal: "+s.ordinal());
            System.out.println(s.compareTo(Shrubbery.CRAWLING));
            System.out.println(s.equals(Shrubbery.CRAWLING));
            System.out.println(s==Shrubbery.CRAWLING);
            System.out.println(s.getDeclaringClass());
            System.out.println(s.name());
            System.out.println("***********");
        });
        Shrubbery.say();
    }
}
