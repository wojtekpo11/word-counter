package wojtek.wordcounter;

public class Counter {

    private char separator = ' ';

    public Counter() {
    }

    public Counter(char separator) {
        this.separator = separator;
    }

    public int countWords(String data) {
        int length = data.length();
        int words = 0;
        boolean wordStarted = false;

        for (int i = 0; i < length; i++) {

            if (data.charAt(i) == separator) {
                if (wordStarted) {
                    words++;
                    wordStarted = false;
                }
            } else {
                wordStarted = true;
            }
        }
        if (wordStarted)
            words++;

        return words;
    }

    public void setSeparator(char separator) {
        this.separator = separator;
    }
}
