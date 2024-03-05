package 생성자TV만들기;

public class ConsturctTv {
    public static void main(String[] args) {


        TV lgTV = new TV(); //기본생성자로 TV생성
        lgTV.setOn(true);
        lgTV.setVolume(200);
        lgTV.setChannel(980);
        lgTV.prnTvInfo();

        TV samsungTV = new TV(true, 250, 99);
        samsungTV.prnTvInfo();
    }
}