import java.util.*;

public class Person {
    private String name_person;
    private Double  sum_money;
    private List<String> paket;

    public Person (String name_person,double sum_money, List<String> initialPaket) {
        this.name_person = name_person;
        this.sum_money=sum_money;
        this.paket= new ArrayList<>();
    }

    public String getName_person() {
        return name_person;
    }

    public void setName_person(@org.jetbrains.annotations.NotNull String name_person) {

        if (name_person.length() < 3 && name_person.length() > 0 ) {
            System.out.println("Длина имени менее 3 символов");
        }
        else if (name_person.isEmpty()) {
            System.out.println("Имя не должно быть пустым" );
        }
        else  this.name_person = name_person;}

    public Double getSum_money() {
        return sum_money;
    }

    public void setSum_money(Double sum_money) {
        if (sum_money<0)
        {System.out.println("Количество денег не может быть отрицательное");}
                else         this.sum_money = sum_money;
    }

    public List<String> getPaket() {
        return paket;
    }

    public void setPaket(List<String> paket) {
        this.paket = paket;
    }


   // public void addProductToPaket(String productName) {
    //    paket.add(productName);
    }




