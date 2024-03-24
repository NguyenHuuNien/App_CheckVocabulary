package Objects_Language;

public class TiengAnh extends Language{
    private String text;

    public TiengAnh() {
    }

    public TiengAnh(String text, String nghia) {
        super("TiengAnh",nghia);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public String review() {
        return text + " " + super.getNghia_Vie();
    }
    
}
