import java.io.FileNotFoundException;

abstract public class ExtractorReport {
    //when a class is abstract you cant instantiate it
    //you can only extend it
    //you can have abstract methods in an abstract class

    public abstract Pattern getPattern();
    public abstract String getReportName();

    public abstract String clean(String input);

    private String parse(String path) throws FileNotFoundException{
        String output = "";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        if (scanner.hasNextLine()) {
            output = scanner.nextLine();
        }else {
            throw new FileNotFoundException("File is empty");
        }
        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            Matcher matcher = getPattern().matcher(nextLine);

            boolean matches = matcher.matches();
            if (matches) {
                output += clean(nextLine) + "\n";
            }
        }
return output.isBlank() ? "No matches found" : output;
    }

    public void prepareAndSendReport(String path) throws FileNotFoundException {
        System.out.println("starting point " + getReportName());
        String report = parse(path);
        System.out.println(report);
        System.out.println("Sending report: " + getReportName());
    }

}
