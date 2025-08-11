import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //  System.out.print("\tHello\n\tWorld!");


           /*
           \n делает system.out.println в одной строке
           \t делает отступ перед словом
           чтобы выводить специальные символы нужно ставить перед ними \ например \\ или \"
            */

     //   byte age;
     //   age = 18;
      //  System.out.println("Your age is: " + age);
        /*
        Типы данных:
        byte - целые числа от -128 до 127 занимает 1 байт
        short - целые числа от -32768 до 32767 занимает 2 байта
        int - целые числа от -2 триллионов до 2 триллионов занимает 4 байта
        long - целые числа от -9 квинтиллионов до 9 квинтиллионов занимает 8 байт

        float - можно писать не целые числа НУЖНО ПИСАТЬ С f в конце
        double - можно писать не целые числа можно поместить больше цифр после точки чем в float НУЖНО ПИСАТЬ С d в конце

        char - хранить символ НУЖНО ПИСАТЬ С '
        String - можно хранить целые слова или предложения НУЖНО ПИСАТЬ С "

        boolean - может быть либо True либо False

         */
    //    float num = 421.1231f;
      //  double num1 = 421.3214216121d;

      //  char sym = '$';
     //   String op = "BOB";

        // Получить строку от пользователя: Комманда Scanner
     //   Scanner output = new Scanner(System.in);
        /*
        System.out.println("Введите ваше имя: ");
        String username = output.nextLine();
        System.out.println("Здравствуйте, " + username);
*/
        /*
        System.out.println("Введите число: ");
        int num2 = output.nextInt();
        System.out.println("Ваше число это: " + num2);
*/
       // float num0 = 50, num01 = 11;
       // float num02 = num0 / num01;

     //   num02 += 10;  // тоже самое что num02 = num02 + 10; Если хотим добавить один то нужно написать num02++;


     //   System.out.println("Результат: " + num02);

        /*
        Scanner scan = new Scanner (System.in);
        System.out.println("Введите первое число: ");
        double num1 = scan.nextDouble();
        System.out.println("Введите второе число: ");
        double num2 = scan.nextDouble();
        double res1 = num1 + num2;
        double res2 = num1 - num2;
        double res3 = num1 * num2;
        double res4 = num1 / num2;
        System.out.println("Результат сложения: " + res1 + "\nРезультат вычитания: " + res2 + "\nРезультат умножения: " + res3 + "\nРезультат деления: " + res4 );

*/

        //if(a>b || a<b) - один из них   if(a>b && a<b) - оба должны быть правильными
        //Если нужно проверить строки то мы пишем: if(role.equals("Admin")) { }
      /*  Scanner scan = new Scanner (System.in);
        System.out.print("Введите первое число: ");
        int a = scan.nextInt();
        System.out.print("\nВведите второе число: ");
        int b = scan.nextInt();
        if(a > b) {
            System.out.printf("Число " + a + " больше чем число " + b);

        }

        else if (a < b) {
            System.out.println("Число " + b + " больше чем число " + a);

        }

        else {
            System.out.println("Числа " + a + " и " + b + " равны");
        }

       */
/*
           Условный оператор switch-case что бы проверить одну переменную во многих случаях
           int num = 1;
           switch (num) {
           case 1:
           System.out.print("Number is 1");
           break;
           case 2:
           System.out.print("Number is 2");
           break;
           default:    (default=else)
 */
        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scan.nextLong();
        System.out.print("\nВведите второе число: ");
        double num2 = scan.nextLong();
        double result;
        System.out.print("\nДействие: ");
        String action = scan.nextLine();
        action = scan.nextLine();
        switch (action) {
            case "+":
                result = num1 + num2;
                System.out.println("Ответ: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Ответ: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Ответ: " + result);
                break;
            case "/":
                if(num2 == 0) {
                    System.out.println("Ошибка");
                }
                else {
                    result = num1 / num2;
                    System.out.println("Ответ: " + result);
                    break;
                }

        }
*/
        // ЦИКЛЫ for(int i = 0; i > 10; i++) {}   while(i>10) {i>10}   do {} while{}

        //Массивы данных array
        /*
        int[] numbers = new int[9];
        numbers[0] = 45;
        numbers[1] = 55;
        System.out.println(numbers[0]);

        float[] nums = new float[] {5.0f, 6.12f, 645.21f};
        System.out.println(nums[1]);

        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

         */

        /*
        int[] array = new int[4];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < array.length; i++) {
            System.out.print("\nВведите число: ");
            int value = scan.nextInt();
            array[i] = value;

        }
        int min = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min)
                min = array[i];

        }
        System.out.println("Минимальный элемент: " + min);

         */

        //Многомерные массивы данных array
        /*
        char[][] a = new char[3][3];
        a[0][0] = 't';
        System.out.println(a[0][0]);

        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(nums[1][1]);

        for(int i = 0; i < nums.length; i++)
            for(int b = 0; b < nums[i].length; b++) {
                if (nums[i][b] > 5)
                    break;
                System.out.println(nums[i][b]);
            }

         */
        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("\nВведите число количества чисел: ");
        byte count = scan.nextByte();
        double[] array =  new double[count];
        for(int i = 0; i < array.length; i++) {
            System.out.print("\nВведите число: ");
            int value = scan.nextInt();
            array[i] = value;
        }
        double min = array[0];
        double max = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min)
                min = array[i];
            if(array[i] > max)
                max = array[i];
                    avg += array[i];
            //             avg += array[i]/array.length;
        }
        avg = avg/array.length;
        System.out.println("\nСамое наименьшее число: " + min);
        System.out.println("\nСамое наибольшее число: " + max);
        System.out.println("\nСреднее арифмитическое: : " + avg);

         */


        // КОЛЕКЦИИ В Java arraylist and LinkedList
/*
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(1, 30);
        System.out.println(numbers.size());
        System.out.println(numbers.get(0));
        numbers.remove(0);
        // numbers.clear(); очищает все


        for(Integer i : numbers) {
            System.out.println(i);
        }
        LinkedList<Float> num = new LinkedList<>();
        num.add(5.6f);
        for(Float o : num)
        System.out.println(o);

 */
        Scanner scan = new Scanner(System.in);
        System.out.print("\nВведите количество чисел: ");
    byte count = scan.nextByte();
    double[] op = new double[count];
    for (int i = 0; i < op.length; i++) {
        System.out.print("\nВведите число: ");
        double num = scan.nextDouble();
        op[i] = num;

    }
    sum(op);
        // Перевести тип данных с int на String - String.valueOf(инт чего-то)


    }
    // Возвращающие Функции


    // Функции тоесть МЕТОДЫ

    public static void sum(double[] array) {
        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (double i : array) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
            avg += i / array.length;

        }
        System.out.println("Наибольшее число: " + max);
        System.out.println("Наименьшее число: " + min);
        System.out.println("Среднее число: " + avg);

    }

}












/*
        Scanner scan = new Scanner(System.in);
        System.out.print("\nWrite number of numbers: ");
        int word = scan.nextInt();
        int[] array = new int[word];
        fullarray(array);
        int[] f = odd(array);
    }
        public static int[] odd(int[] b) {
            for (int a : b) {
                switch (a % 2 != 0) {
                    case true:
                        System.out.println("Odd numbers are: " + a);
                        break;
                    case false:
                        break;
                }
            }

            return b;
        }
        public static void fullarray(int[] array) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("\nWrite a number: ");
            array[i] = scan.nextInt();
        }
        }

 */































































































