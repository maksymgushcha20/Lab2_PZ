// Lab2
// IO-23
// Гуща Максим

//ВАРІАНТ\\
// C3 = 2309 / 3 = (2) | StringBuffer
// C17 = 2309 / 17 = (14) | В кожному слові заданого тексту, видалити всі наступні входження першої літери цього слова.

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.print("Введіть текст: ");
        String text = data.nextLine();

        // Створюємо масив, у якому зберігається "розбитий" на окремі слова текст
        String[] words = text.split("\\s+");

        // Видалення наступних входжень першої літери в кожному слові
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char firstLetter = word.charAt(0); // отримання першої літери поточного слова
            words[i] = removeDuplicates(word, firstLetter).toString();
        }

        StringBuffer updatedText = new StringBuffer(String.join(" ", words));

        System.out.println("Оновлений текст: " + updatedText.toString());
    }

    public static StringBuffer removeDuplicates(String word, char firstLetter) {
        StringBuffer result = new StringBuffer();
        result.append(firstLetter);

        for (int i = 1; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            // Перевірка, чи поточний символ currentChar не є дублікатом першої літери firstLetter
            if (Character.toLowerCase(currentChar) != Character.toLowerCase(firstLetter)) {
                result.append(currentChar); // Додавання символу, якщо він не є дублікатом
            }
        }
        return result;
    }
}

