package pkg5;

public class MakeReport {

    StringBuffer buffer = new StringBuffer();

    private String line = "======================================\n";
    private String title = "이름\t 주소 \t\t 전화번호 \n";
    private void makeHeader() {
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }
    private void generateBody() {
        buffer.append("John \t");
        buffer.append("Seoul Korea \t");
        buffer.append("010-1234-7838\n");
    }
    private void makeFooter() {
        buffer.append(line);
    }
    // encapsulation
    public String getReport() {
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }
}
