package access;

public class BankAccount {
    private int balance; //데이터 자체에 접근을 막는다

    public BankAccount() //생성자를 통해 초기값을 설정한다.
    {
        balance = 0;
    }

    public void deposit(int amount) //입금기능 오픈함
    {
        if(isAmountValid(amount))
        {
            balance+=amount;
        }
        else{
            System.out.println("유호하지 않은 금액입니다.");
        }
    }

    public void withdraw(int amount) //출금기능으로써 오픈한다
    {
        if (isAmountValid(amount) && balance-amount>=0){
            balance-=amount;
        }
        else{
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }

    }
    public int getBalance() //잔고를 보여주는 기능
    {
        return balance;

    }

    private boolean isAmountValid(int amount) //숨겨진 기능
    {
        return amount>0; //해당 조건이 참인지 거짓인지를 반환함
    }
}
