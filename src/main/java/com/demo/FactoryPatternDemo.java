package com.demo;

import com.enumtype.ShapeType;
import com.pattern.ShapeFactory;
import com.service.Shape;

/**
 * 工厂模式Demo
 * Created by nian on 2018/11/18.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();

        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        rectangle.draw();

        Shape square = shapeFactory.getShape(ShapeType.SQUARE);
        square.draw();
    }
}
