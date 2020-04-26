##JDK8 IN ACTION
 ####function包：
   1、Function<T, R>
    
     R apply(T t);
     
    函数接口可以通过lamda进行匿名实现
           Function<String,Integer> function = (x)->Integer.parseInt(x);
            Integer num = 3+function.apply("4");
            System.out.println(num);//7
 2、Predicate<T>
     boolean test(T t);
     
 3、Supplier<T>
     T get();
     
 4、Consumer<T>
     void accept(T t);
     
 5、BiFunction<T, U, R>
     R apply(T t, U u);
     
 6、BiPredicate<T, U>
     boolean test(T t, U u);
     
 7.
 ####stream包        ：
 filter
 limit
 skip
 map
 flaymap
 distinct
 
 match [allmatch,anymatch,nonematch]
 find 
 reduce
 
 ####DATE
 LocalDate
 LocalTime
 LocalDateTime
 Instant
 Duration
 Period
 
 formater