package Objects_Language;

public class TiengNhat extends Language{
    private String kanji;
    private String romaji;
    private String hiragana;
    private String katakana;

    public TiengNhat() {
    }

    public TiengNhat(String kanji, String hiragana, String katakana, String romaji, String nghia) {
        super("TiengNhat",nghia);
        this.kanji = kanji;
        this.romaji = romaji;
        this.hiragana = hiragana;
        this.katakana = katakana;
    }

    public String getKanji() {
        return kanji;
    }

    public void setKanji(String kanji) {
        this.kanji = kanji;
    }

    public String getRomaji() {
        return romaji;
    }

    public void setRomaji(String romaji) {
        this.romaji = romaji;
    }

    public String getHiragana() {
        return hiragana;
    }

    public void setHiragana(String hiragana) {
        this.hiragana = hiragana;
    }

    public String getKatakana() {
        return katakana;
    }

    public void setKatakana(String katakana) {
        this.katakana = katakana;
    }
    public String getTX(){
        if(kanji.length()>0) return kanji;
        else if(hiragana.length()>0) return hiragana;
        else if(katakana.length()>0) return katakana;
        else return super.getNghia_Vie();
    }
    
    public String review() {
        return kanji + " " + romaji + " " + hiragana + " " + katakana + " " + super.getNghia_Vie();
    }
    
}
