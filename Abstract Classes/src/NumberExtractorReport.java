import java.util.regex.Pattern;

public class NumberExtractorReport extends ExtractorReport {
    private static final Pattern NUMBER_PATTERN = Pattern.compile("^[0-9]+$");
    @Override
    public Pattern getPattern() {
        return NUMBER_PATTERN;
    }

    @Override
    public String getReportName() {
        return "Number Report";
    }

    @Override
    public String clean(String input) {
        return input;
    }
}

