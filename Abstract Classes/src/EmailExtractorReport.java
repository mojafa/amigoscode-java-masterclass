import java.util.regex.Pattern;

public class EmailExtractorReport extends ExtractorReport {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?``{|}~^.-]+@[a-zA-Z0-9.-]+$");
    @Override
    public Pattern getPattern() {
        return EMAIL_PATTERN;
    }

    @Override
    public String getReportName() {
        return "Email Report";
    }

    @Override
    public String clean(String input) {
        return input.toLowerCase();
    }
}
}
