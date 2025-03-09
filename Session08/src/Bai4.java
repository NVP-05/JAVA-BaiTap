public class Bai4 {
    public static void main(String[] args) {
        String initialString = "abcdefghij".repeat(100000);

        System.out.println("Testing StringBuilder...");
        testPerformance(new StringBuilder(initialString));

        System.out.println("\nTesting StringBuffer...");
        testPerformance(new StringBuffer(initialString));
    }

    private static void testPerformance(Object obj) {
        long startTime, endTime;

        if (!(obj instanceof StringBuilder) && !(obj instanceof StringBuffer)) {
            return;
        }

        StringBuilder sb = obj instanceof StringBuilder ? (StringBuilder) obj : null;
        StringBuffer sbf = obj instanceof StringBuffer ? (StringBuffer) obj : null;

        startTime = System.nanoTime();
        if (sb != null) sb.reverse();
        else if (sbf != null) sbf.reverse();
        endTime = System.nanoTime();
        System.out.println("Reverse time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        if (sb != null) sb.insert(500000, "INSERTED");
        else if (sbf != null) sbf.insert(500000, "INSERTED");
        endTime = System.nanoTime();
        System.out.println("Insert time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        if (sb != null) sb.delete(400000, 400010);
        else if (sbf != null) sbf.delete(400000, 400010);
        endTime = System.nanoTime();
        System.out.println("Delete time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        if (sb != null) sb.replace(300000, 300010, "REPLACED");
        else if (sbf != null) sbf.replace(300000, 300010, "REPLACED");
        endTime = System.nanoTime();
        System.out.println("Replace time: " + (endTime - startTime) + " ns");
    }
}