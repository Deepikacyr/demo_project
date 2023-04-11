package com.test.basics;

import java.util.Scanner;

public class CesarClipher {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt user to choose between encryption and decryption
		System.out.print("Enter 'E' to encrypt or 'D' to decrypt: ");
		char choice = scanner.nextLine().toUpperCase().charAt(0);

		if (choice == 'E') {
			// Encryption
			System.out.print("Enter message to encrypt: ");
			String message = scanner.nextLine().toUpperCase();

			System.out.print("Enter the key (displacement): ");
			int key = scanner.nextInt();
			scanner.nextLine(); // consume the newline character

			String encryptedMessage = encrypt(message, key);
			System.out.println("Encrypted message: " + encryptedMessage);

		} else if (choice == 'D') {
			// Decryption
			System.out.print("Enter message to decrypt: ");
			String message = scanner.nextLine().toUpperCase();

			System.out.print("Enter the key (displacement): ");
			int key = scanner.nextInt();
			scanner.nextLine(); // consume the newline character

			String decryptedMessage = decrypt(message, key);
			System.out.println("Decrypted message: " + decryptedMessage);

			// Decrypt and display all possible solutions
			System.out.println("All possible decrypted messages:");
			for (int i = 0; i < 26; i++) {
				String possibleMessage = decrypt(message, i);
				System.out.println(possibleMessage);
			}

		} else {
			System.out.println("Invalid choice.");
		}

		scanner.close();
	}

	public static String encrypt(String message, int key) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < message.length(); i++) {
			char c = message.charAt(i);
			if (Character.isLetter(c)) {
				int shifted = ((c - 'A') + key) % 26;
				sb.append((char) (shifted + 'A'));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public static String decrypt(String message, int key) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < message.length(); i++) {
			char c = message.charAt(i);
			if (Character.isLetter(c)) {
				int shifted = ((c - 'A') - key + 26) % 26;
				sb.append((char) (shifted + 'A'));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
