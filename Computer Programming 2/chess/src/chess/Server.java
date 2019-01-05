package chess;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;

	// 1. 데이터를 계속 전송 쓰레드
	// 2. 데이터를 계속 수신 쓰레드

	public void serverSetting() {
		try {
			// localhost, 10002
			System.out.println("서버 생성중...");
			serverSocket = new ServerSocket(10002); // 바인드
			System.out.println("서버 대기중...");
			clientSocket = serverSocket.accept(); // 어셉트.
			System.out.println("클라이언트 접속 완료!");
			// 소켓이 접속 완료 된 부분
		} catch (Exception e) {
		}
	}

	public void closeAll() {
		try {
			serverSocket.close();
			clientSocket.close();
			dataInputStream.close();
			dataOutputStream.close();
			System.out.println("클라이언트와의 연결이 끊어졌습니다.");
		} catch (Exception e) {
		}
	}

	public void streamSetting() {
		try {
			dataInputStream = new DataInputStream(clientSocket.getInputStream());
			dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
		} catch (Exception e) {
		}
	}

	public void dataRecv() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while (true) {
						String recvData = dataInputStream.readUTF();
						try (BufferedWriter bw = new BufferedWriter(new FileWriter("windata.txt"))) {
							bw.write(recvData);
						} catch (IOException e) {
						}
					}
				} catch (Exception e) {
				}
				closeAll();
				Thread.interrupted();
			}
		}).start();
	}

	public void dataSend() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while (true) {
						String sendData = "";
						try (BufferedReader br = new BufferedReader(new FileReader("windata.txt"))) {
							String l;
							while ((l = br.readLine()) != null)
								sendData += (l + "\r\n");
						} catch (IOException e) {
						}
						dataOutputStream.writeUTF(sendData);
					}
				} catch (Exception e) {
				}
				closeAll();
				Thread.interrupted();
			}
		}).start();
	}

	public Server() {
		serverSetting();
		streamSetting();
		dataSend();
		dataRecv();
	}

	public static void main(String[] args) {
		new Server();
	}
}