class EvenNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            while (i % 2 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
