package access.ex;

public class Item { //item 클래스 생성
    String name; //변수
    int price; //변수
    int quantity; //변수

    Item(String item,int price,int quantity) //생성자(매개변수3개)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName()
    {
        return name;
    }

    public int getTotalPrice()
    {
        return price*quantity;
    }


}
