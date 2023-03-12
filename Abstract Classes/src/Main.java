public class Main {
    public static void main(String[] args) throws Exception{

        String path = "src/data.txt";
        new NumberExtractorReport().prepareAndSendReport(path);

        new EmailExtractorReport().prepareAndSendReport(path);


    }
}