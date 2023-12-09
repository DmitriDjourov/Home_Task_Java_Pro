package org.example.taski.dryKissYagni;

public class Calc {
		public double calculateArea(int shapeType, double... params) {
				if (shapeType == 1) { // 1.txt - круг
						double radius = params[0];
						return Math.PI * radius * radius;
				} else if (shapeType == 2) { // 2 - квадрат
						double side = params[0];
						return side * side;
				} else if (shapeType == 3) { // 3 - треугольник
						double a = params[0];
						double b = params[1];
						double c = params[2];
						double s = (a + b + c) / 2;
						return Math.sqrt(s * (s - a) * (s - b) * (s - c));
				}
				return 0.0;
		}
}

class CalculatorAreaOfShapes {
		/**
		 * Вычисляет площадь фигуры на основе заданных параметров.
		 *
		 * @param shapeType Тип фигуры (1 для круга, 2 для квадрата, 3 для треугольника).
		 * @param params    Параметры, необходимые для расчета площади.
		 *                  - Для круга укажите радиус.
		 *                  - Для квадрата укажите длину стороны.
		 *                  - Для треугольника укажите длины всех трех сторон (a, b, c).
		 * @return Площадь указанной фигуры.
		 */
		public double calculateArea(int shapeType, double... params) {

				double radius = params[0];
				double matPiRadius = Math.PI * radius;
				double side = params[0];
				double a = params[0];
				double b = params[1];
				double c = params[2];
				double semiPerimeter = (a + b + c) / 2;

				if (shapeType == 1) { // круг
						return matPiRadius * radius;
				} else if (shapeType == 2) { // квадрат
						return side * side;
				} else if (shapeType == 3) { // треугольник
						return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
				}
				return 0.0;
		}
}

