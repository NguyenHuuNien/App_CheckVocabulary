package kotoba_wo_chekku;

public class kotoba {
    private String kanji;
    private String romaji;
    private String hiragana;
    private String katakana;
    private String vie;
    public kotoba(){
        
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

    public String getVie() {
        return vie;
    }

    public void setVie(String vie) {
        this.vie = vie;
    }
    public boolean check(String s){
        if(kanji.equals(s)) return true;
        else if(romaji.equals(s)) return true;
        else if(hiragana.equals(s)) return true;
        else if(katakana.equals(s)) return true;
        else if(vie.equals(s)) return true;
        return false;
    }
}
