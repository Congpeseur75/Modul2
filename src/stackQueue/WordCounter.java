package stackQueue;
import java.util.Map;
import java.util.TreeMap;
public class WordCounter {
    public static void countWords(String text) {
        // Chuyển đổi chuỗi thành chữ thường và tách các từ bằng khoảng trắng
        String[] words = text.toLowerCase().split("\\s+");

        // Sử dụng TreeMap để lưu trữ từ và số lần xuất hiện của chúng
        Map<String, Integer> wordCountMap = new TreeMap<>();

        // Duyệt qua từng từ và đếm số lần xuất hiện
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                // Tăng số lần xuất hiện của từ lên 1 nếu từ đã tồn tại trong map
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // Nếu từ chưa tồn tại trong map, đưa từ vào map và đặt số lần xuất hiện là 1
                wordCountMap.put(word, 1);
            }
        }

        // Hiển thị số lần xuất hiện của từng từ
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String text = "This is a test string to count the occurrences of each word in this string.";
        System.out.println("Occurrences of each word:");
        countWords(text);
    }
}
