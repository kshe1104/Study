package access;

public class Speaker {
    private int volume;
    Speaker(int volume)
    {
        this.volume = volume; //생성자를 통해 초기 음량설정
    }
    void volumeUp()
    {
        if(volume>=100){
            System.out.println("음량을 증가할 수 없습니다. 최대음량입니다.");
        }
        else{
            volume+=10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown()
    {
        volume-=10;
        System.out.println("volumeDown");
    }
    void showVolume(){
        System.out.println("현재 음량:"+ volume);
    }
}
