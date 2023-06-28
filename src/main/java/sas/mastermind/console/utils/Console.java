package sas.mastermind.console.utils;

import java.util.Scanner;

public class Console {

    public static Console console;

    public static Console instance() {
        if (Console.console == null) {
            Console.console = new Console();
        }
        return Console.console;
    }

    public char readChar(String title) {
        char charValue = ' ';
        boolean ok = false;
        do {
            String input = this.readString(title);
            if (input.length() != 1) {
                this.writeError("character");
            } else {
                charValue = input.charAt(0);
                ok = true;
            }
        } while (!ok);
        return charValue;
    }

    public String readString(String s) {
        System.out.println(s);
        return new Scanner(System.in).nextLine();
    }

    public int readInt() {
        int input = 0;
        boolean ok = false;
        do {
            try {
                input = Integer.parseInt(new Scanner(System.in).nextLine());
                ok = true;
            } catch (Exception ex) {
                writeError("an INTEGER");
            }
        } while (!ok);
        return input;
    }

    public void writeln(String message) {
        System.out.println(message);
    }

    public void write(String message) {
        System.out.print(message);
    }

    public void writeError(String format) {
        this.writeln("FORMAT ERROR! Enter " + format + " formatted value.");
    }
}
