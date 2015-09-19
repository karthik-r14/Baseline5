////ReadInput takes in user input and returns it.
package com.pathashala.baseline5;

import java.util.Scanner;

public class ReadInput {

    private Scanner scanner;

    public ReadInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String read() {
        return scanner.nextLine();
    }
}
