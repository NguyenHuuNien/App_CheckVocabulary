package Objects_Language;

import java.io.Serializable;

public class Language implements Serializable{
    private String ngonNgu;
    private String nghia_Vie;

    public Language() {
    }

    public Language(String ngonNgu, String nghia_Vie) {
        this.ngonNgu = ngonNgu;
        this.nghia_Vie = nghia_Vie;
    }

    public String getNgonNgu() {
        return ngonNgu;
    }

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    public String getNghia_Vie() {
        return nghia_Vie;
    }

    public void setNghia_Vie(String nghia_Vie) {
        this.nghia_Vie = nghia_Vie;
    }

    @Override
    public String toString() {
        return "Language{" + "ngonNgu=" + ngonNgu + ", nghia_Vie=" + nghia_Vie + '}';
    }
    
}
