package 상속적용TV;

public class ProductTV extends ProtoTypeTV{
    String name;
    boolean isInternet;
    ProductTV() {
        super(true, 30, 30);
        name = "LG TV";
    }
    ProductTV(String name) {
        isPower = false;
        channel = 10;
        volume  = 10;
        isInternet = false;
        this.name = name;
    }
    void setPower(boolean onOff) {
        this.isPower = onOff;
    }
    void setVolume(int vol) {
        if(vol >= 0 && vol <= 100) {
            this.volume = vol;
        } else {
            System.out.println("볼륨 설정 범위를 벗어났습니다.");
        }
    }
    @Override //부모가 만든 메소드를 재정의해서 사용하기위한 오버라이딩 성립 여부를 확인하는 어노테이션
    public void setChannel(int cnl) {
        if(cnl > 0 && cnl < 2000) {
            channel = cnl;
            System.out.println("채널을 " + channel + "로 변경했습니다.");
        } else System.out.println("채널 설정 범위가 아닙니다.");
    }
    //오버로딩
    public void  setChannel(int cnl, boolean isInternet) {
        if(isInternet) {
            System.out.println("인터넷 모드입니다.");
            this.isInternet = true;
        } else {
            this.isInternet = false;
            if(cnl > 0 && cnl < 2000) {
                channel = cnl;
                System.out.println("채널을 " + channel + "로 변경했습니다.");
            } else System.out.println("채널 설정 범위가 아닙니다.");
        }
    }
    void viewTV() {
        String powerState = isPower ? "ON" : "OFF";
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + powerState);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷모드 : " + isInternet);
    }
}
