package org.example;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class random {

    // Définition des jeux de caractères
    private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{};:'\"|,.<>?/";

    // Générateur aléatoire sécurisé
    private static final SecureRandom random = new SecureRandom();

    // Méthode pour générer un mot de passe
    public static String generateSecurePassword(int minLength, int maxLength) {
        // Vérification des longueurs minimales et maximales
        if (minLength > maxLength) {
            throw new IllegalArgumentException("minLength cannot be greater than maxLength");
        }

        // Choisir une longueur de mot de passe aléatoire entre minLength et maxLength
        int passwordLength = random.nextInt((maxLength - minLength) + 1) + minLength;

        // Liste pour contenir les caractères du mot de passe
        List<Character> passwordChars = new ArrayList<>();

        // Ajout d'au moins un caractère de chaque type
        passwordChars.add(UPPER_CASE.charAt(random.nextInt(UPPER_CASE.length())));
        passwordChars.add(LOWER_CASE.charAt(random.nextInt(LOWER_CASE.length())));
        passwordChars.add(DIGITS.charAt(random.nextInt(DIGITS.length())));
        passwordChars.add(SPECIAL_CHARACTERS.charAt(random.nextInt(SPECIAL_CHARACTERS.length())));

        // Compléter le mot de passe avec des caractères aléatoires jusqu'à la longueur souhaitée
        String allCharacters = UPPER_CASE + LOWER_CASE + DIGITS + SPECIAL_CHARACTERS;
        for (int i = 4; i < passwordLength; i++) {
            passwordChars.add(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }

        // Mélanger les caractères pour un mot de passe plus sécurisé
        Collections.shuffle(passwordChars);

        // Construire le mot de passe à partir des caractères
        StringBuilder password = new StringBuilder();
        for (char c : passwordChars) {
            password.append(c);
        }

        return password.toString();
    }

    public static void main(String[] args) {
        // Générer un mot de passe sécurisé avec une longueur entre 8 et 12
        String securePassword = generateSecurePassword(8, 12);
        System.out.println("Mot de passe sécurisé généré : " + securePassword);
    }
}

