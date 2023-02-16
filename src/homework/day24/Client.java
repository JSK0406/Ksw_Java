package homework.day24;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연결할 서버의 IP주소를 입력하세요 : ");
        String addr = sc.nextLine();
        try (Socket socket = new Socket(addr, 9000);
             BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             ) {
            String text = br.readLine();
            System.out.println(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
