package portscanner;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/* TODO:    
 *         - Get host from user input.
 *         - Open a TCP connection with host using a port.
 *         - Return output as pass or fail.
 *         - Add help if usage is incorrect.
 *         - Add a colour to the output.
 */

public class Main {

    // Format codes for ANSI Effects and Colours.

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BOLD = "\u001B[1m";

    private static void printUsage() {
        System.out.println("\nUsage:");
        System.out.println(ANSI_CYAN + "    java" + ANSI_RESET + " Main.java <host>");
        System.out.println("Examples:");
        System.out.println(ANSI_CYAN + "    java" + ANSI_RESET + " Main.java" + ANSI_PURPLE + " 127.0.0.1" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "    java" + ANSI_RESET + " Main.java" + ANSI_PURPLE +  " www.google.com\n" + ANSI_RESET);
        System.exit(1); // any positive error code.
    }
    
    private static void checkPort(String host, int portNumber) {

        // Open a socket
        // connect to host:port

        Thread thread = new Thread(() -> {
            Socket clientSocket = new Socket();
            try {
                clientSocket.connect(new InetSocketAddress(host, portNumber), 3000);
                System.out.printf("[" + ANSI_GREEN + "+" + ANSI_RESET + "] " + ANSI_BOLD + "%d" + ANSI_RESET + " Connected\n", portNumber);
                clientSocket.close();
            } catch (IOException e) {
                // do nothing .. return false
                //e.printStackTrace();
            }
        });
        thread.start();
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(ANSI_RED + "\nNo arguments recieved.\n" + ANSI_RESET);
            printUsage();
        }

        String host = args[0];
     // System.out.println(host);
        System.out.printf("\n[" + ANSI_BOLD + ANSI_YELLOW + "+" + ANSI_RESET + "] " + "Scanning " + ANSI_BOLD + "%s" + ANSI_RESET + " now...\n\n", host);

        // port 1-65535
        // Open a TCP connection for each port

        for (int portNumber = 1; portNumber <= 65535; portNumber++) {
            checkPort(host, portNumber);
        }
    }
}
