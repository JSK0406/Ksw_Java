package learning.day21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SimpleEchoServer implements Runnable {
    // 다중 접속 에코 서버
    private static Socket clientSocket;
    public SimpleEchoServer(Socket clientSocket)
    {
        this.clientSocket = clientSocket;
    }
    public static void main(String[] args) {
        ExecutorService eService = Executors.newFixedThreadPool(5);  // 5 threads
        System.out.println("다중 접속 에코 서버");

        try (ServerSocket serverSocket = new ServerSocket(20000)) {
            while (true) {
                System.out.println("클라이언트 접속 대기 중.....");
                clientSocket = serverSocket.accept();
                SimpleEchoServer tes = new SimpleEchoServer(clientSocket);
                eService.submit(tes);
            }
        } catch (IOException ex) {
            System.out.println("입출력 예외 발생!");
        }
        System.out.println("다중 접속 에코 서버 종료");
        eService.shutdown();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + " 스레드 접속");
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)
        ) {
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                System.out.println(clientSocket.getRemoteSocketAddress().toString() + " " + Thread.currentThread() +" 클라이언트가 보낸 메세지 : " + inputLine);
                StringTokenizer st = new StringTokenizer(inputLine,"+-*/", true);
                int result = Integer.parseInt(st.nextToken());
                while (st.hasMoreTokens()) {
                    switch (st.nextToken()) {
                        case "+" -> result += Integer.parseInt(st.nextToken());
                        case "-" -> result -= Integer.parseInt(st.nextToken());
                        case "*" -> result *= Integer.parseInt(st.nextToken());
                        case "/" -> result /= Integer.parseInt(st.nextToken());
                    }
                }
                out.println(inputLine + " = " + Integer.toString(result));
            }
            System.out.println(Thread.currentThread() +" 클라이언트가 종료됨"); }
        catch (IOException ex)
        {
            System.out.println("입출력 예외 발생!");
        }
    }
}