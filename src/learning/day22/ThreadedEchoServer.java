//package learning.day22;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.net.ServerSocket;
//import java.net.Socket;
//
////import static learning.day22.ThreadedEchoServer.clientSocket;
//
//public class ThreadedEchoServer implements Runnable {
//    private static Socket clientSocket;
//
//    public ThreadedEchoServer(Socket clientSocket) {
//        this.clientSocket = clientSocket;
//    }
//
//    @Override
//    public void run() {
//        System.out.println("[" + Thread.currentThread() + "] 스레드 : ");
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {
//            String inputLine;
//            while ((inputLine = br.readLine()) != null) {
//                System.out.println("[" + Thread.currentThread() + "]" + " 클라이언트가 보낸 메세지 : " + inputLine);
//                out.println(inputLine);
//            }
//            System.out.println("[" + Thread.currentThread() + "]" + " 클라이언트가 종료됨 : ");
//            out.println(inputLine);
//        } catch (IOException ex) {
//            // Handle exceptions
//        }
//
//    }
//
//
//    public class MultipleEchoClient {
//        public static void main(String[] args) {
//            System.out.println("다중 접속 에코 서버");
//            try (ServerSocket serverSocket = new ServerSocket(200000)) {
//                while (true) {
//                    System.out.println("클라이언트 접속 대기 중.....");
//                    clientSocket = serverSocket.accept();
//                    ThreadedEchoServer tes =
//                            new ThreadedEchoServer(clientSocket);
//                    new Thread(tes).start();
//                }
//            } catch (IOException ex) {
//                // Handle exceptions
//            } catch (IOException ex) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("다중 접속 에코 서버 종료");
//        }
//
//    }
//}