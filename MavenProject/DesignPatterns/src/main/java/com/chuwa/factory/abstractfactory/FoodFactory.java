package com.chuwa.factory.abstractfactory;

import com.chuwa.factory.Coffee;
import com.chuwa.factory.Dessert;

public abstract class FoodFactory {
   public abstract Coffee getCoffee();
   public abstract Dessert getDessert();
}
