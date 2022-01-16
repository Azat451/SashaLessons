package ClassworkInternetMagasine;

import java.util.Scanner;

public class InterNetMagazine {
    private String magazine;
    private int delivery;
    private int price;
    private int sell;
    private int order;
    private Scanner sc;


    public InterNetMagazine(){ // Спрашивает цену товара

    }

    public String getMagazine() {
        return magazine;
    }

    public void setMagazine(String magazine) {
        String[] netMagazine = new String[3];
        netMagazine[0] = "Озон";
        netMagazine[1] = "Амазон";
        netMagazine[2] = "Алибаба";
//        this.magazine = netMagazine[];
    }

    public int getDelivery() {
        return delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.print("Введите цену продукта -");
        double num = sc.nextInt();
        double myriad = 10000;
        if (num >= myriad){        //Если num-(число которое будем ввести) будет больше 10тыс. то оно ввыдоит проценты твоего дохода
            num = (num/myriad) * 100;
            System.out.println(num);
        }else {
            this.price = price;
        }
    }

    public int getSell() {
        return sell;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString(){
        return String.format("");
    }
}
