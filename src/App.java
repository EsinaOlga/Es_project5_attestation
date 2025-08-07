import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        //Создаем пустой массив для ввода продуктов в пакет
        List<String> initialPaket = new ArrayList<>();
        // initialPaket.add("Хлеб");
        // initialPaket.add("Масло");
        //  initialPaket.add("Кофе");
        // initialPaket.add("Молоко");
        // initialPaket.add("Торт");
        //Вызываем метод сканер
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");//Ввод имени с клавиатуры
        String name = scanner.nextLine(); //Считываем введенные данные
        System.out.println("Введите вашу сумму денег");// Ввод суммы денег у клиента
        Double money = scanner.nextDouble();//Считываем  введенные данные
        scanner.nextLine();//Считываем введенные данные что была возможность ввести следующую строку

        Person person = new Person(name, money, new ArrayList<>());//задаем параметры метода Person
        person.setName_person(name);//загружаем полученное имя клиента
        person.setSum_money(money);//загружаем введенную сумму денег
        //    System.out.println(person.getSum_money() + " у польователя " + person.getName_person() + " " + paket);
        List<Product> product = new ArrayList<>(); //Создаем массив продуктов и их стоимость
        product.add(new Product("Хлеб", 40.0));
        product.add(new Product("Молоко", 60.0));
        product.add(new Product("Торт", 1000.0));
        product.add(new Product("Кофе растворимый", 879.0));
        product.add(new Product("Масло", 150.0));

        String[] prod = {"Хлеб", "Масло", "Кофе", "Молоко", "Торт"};//задаем список продуктов
        //for (String pr : prod) {
            int index = 0;
            while (true) {
                System.out.println("Введите название продукта из списка: "+ Arrays.toString(prod)+ " Для окончания введите 'end'.");
                //System.out.println(person.getName_person()+"Введите желаемый продукт"+prod[]);
                String name_pr = scanner.nextLine().trim();

                if (name_pr.equalsIgnoreCase("end")) {
                    System.out.println(person.getName_person() + " завершил выбор продуктов.");

                    // Выходим из цикла, когда *любой* покупатель введет "end"
                    break;
                }
                boolean found = false;
                for (Product p : product) {
                    if (p.getName_product().equalsIgnoreCase(name_pr)) {
                        System.out.println("Вы выбрали продукт " + p.getName_product() + ", стоимостью " + p.getCost()+" руб.");
                        if (p.getCost() <= person.getSum_money()) {
                            //System.out.println("Вам хватает на покупку продукта - " + p.getName_product());
                            initialPaket.add(p.getName_product());//Добавляем продукт в пакет
                            person.setSum_money(person.getSum_money() - p.getCost());
                            System.out.println(person.getName_person()+" купил(а) " + p.getName_product());
                           // System.out.println("Остаток денег после покупки - " + person.getSum_money()+"руб.");
                        } else {
                            System.out.println(person.getName_person()+" не может позволить себе - " + p.getName_product());
                        }
                        break;
                    }
                }
            }

//System.out.println( + " ");
        if (initialPaket.isEmpty()) {
            System.out.println(person.getName_person()+" ничего не купил(а) ");
        }
        else { System.out.println(person.getName_person()+" купил(а) следующие продукты: ");
            for (String item : initialPaket) {
                    System.out.println(" - " + item);
                System.out.println("Благодарим за покупку!");

                }
            }
        System.out.println(person.getSum_money() + " руб. - остаток средств на счете");
        //System.out.println("Благодарим за покупку!");
        }


    }


















