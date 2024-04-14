import java.io.*; 
import java.net.*; 
import java.util.Scanner; 
public class UDPClient {
 public static void main(String[] args) { 
 try { 
 DatagramSocket clientSocket = new DatagramSocket(); 
 Scanner scanner = new Scanner(System.in); 
 System.out.print("Enter message: "); 
 String message = scanner.nextLine(); 
 byte[] sendData = message.getBytes(); 
 InetAddress serverAddress = InetAddress.getByName("localhost"); 
 DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 
9876); 
 clientSocket.send(sendPacket); 
 clientSocket.close(); 
 } catch (IOException e) { 
 e.printStackTrace(); 
 } 
 } 
} 
