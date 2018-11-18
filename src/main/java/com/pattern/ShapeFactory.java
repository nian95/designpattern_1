package com.pattern;

import com.enumtype.ShapeType;
import com.service.Shape;
import com.service.impl.Circle;
import com.service.impl.Rectangle;
import com.service.impl.Square;

/**
 * Created by nian on 2018/11/18.
 */
public class ShapeFactory {

    public Shape getShape(ShapeType shapeType) {

        if (shapeType == null) {
            return null;
        } else if (ShapeType.CIRCLE.equals(shapeType)) {
            return new Circle();
        } else if (ShapeType.RECTANGLE.equals(shapeType)) {
            return new Rectangle();
        } else if (ShapeType.SQUARE.equals(shapeType)) {
            return new Square();
        }
        return null;
    }


}
