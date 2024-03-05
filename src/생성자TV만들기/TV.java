package 생성자TV만들기;

public class TV {
    private boolean isOn; //전원
    private int channel; //채널
    private int volume;
    //매개변수가 없는 기본생성자
    TV() {
        isOn = false;
        channel = 11;
        volume = 10;
        System.out.println("전원 : " + isOn + ", 채널 : " + channel + ", 볼륨 : " + volume);
    }
    //생성자 오버로딩된 생성자
    TV(boolean isOn, int channel, int volume) {
        this.isOn = isOn;
        this.channel = channel;
        this.volume = volume;
    }
    public void setOn(boolean onOff) {
        isOn = onOff;
        String onOffStr = (isOn) ? "ON" : "OFF"; //boolean값으로 받은 값을 ON/OFF 문자열로 변환
        System.out.println("기본생성자 호출 !!!!! TV 전원 : " + onOffStr);
    }
    public void setChannel(int cnl) {
        if(cnl >= 1 && cnl <= 999)  { //인스턴스 필드에 값을 쓰기 전에 유효한 값인지 여부 확인
            channel = cnl;
            System.out.println("채널을 " + channel + "로 변경 하였습니다.");
        } else {
            System.out.println("유효하지 않은 채널입니다.");
        }
    }
    public  void setVolume(int vol) {
        if(vol >= 0 && vol <= 100) {
            volume = vol;
            System.out.println("볼륨을 " + volume + "로 변경하였습니다.");
        } else {
            System.out.println("유효하지 않은 볼륨값입니다.");
        }
    }
    public void prnTvInfo() {
        String onOffStr = (isOn) ? "ON" : "OFF";
        System.out.println("===== TV 정보 =====");
        System.out.println("전원 : " + onOffStr);
        System.out.println("볼륨 : " + volume);
        System.out.println("채널 : " + channel);
    }
}
