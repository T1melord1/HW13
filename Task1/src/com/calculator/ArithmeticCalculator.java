package com.calculator;

public class ArithmeticCalculator {

    //todo
    // Создайте класс com.calculator.ArithmeticCalculator, который будет выполнять арифметические операции над числами.
    //1.Реализуйте конструктор с двумя параметрами-числами, который сохраняет переданные числа в свойствах класса.
    //2.Реализуйте метод calculate, на вход которого передаётся одна из арифметических операций
    // (объект класса com.calculator.Operation — смотрите следующий пункт задания), которую нужно произвести с двумя числами,
    // переданными в конструктор при создании объекта.
    //3.Создайте Enum com.calculator.Operation с тремя значениями: ADD, SUBTRACT, MULTIPLY. Эти значения будут
    // соответствовать арифметическим операциям — сложению, вычитанию и умножению.
    private int first;
    private int second;

    public ArithmeticCalculator(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int calculate(Operation type) {
        if (type == Operation.ADD) {
            return first + second;
        } else if (type == Operation.SUBTRACT) {
            return first - second;
        } else if (type == Operation.MULTIPLY) {
            return first * second;
        }
          else {
              throw new IllegalArgumentException("Invalid operation");
        }
    }
    }


