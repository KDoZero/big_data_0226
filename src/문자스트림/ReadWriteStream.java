package 문자스트림;
import java.io.*;

//문자스트림은 문자 단위로 데이터를 전송하며 사용방법은 바이트 스트림과 동일하다
public class ReadWriteStream {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("test.txt");
        String name = "KH정보교육원";
        writer.write(name);
        writer.flush();
        writer.close();

        Reader reader = new FileReader("test.txt");
        int readData;
        while(true) {
            readData = reader.read();
            if(readData == -1) break;
            System.out.print((char)readData + " ");
        }
        reader.close();
    }
}
