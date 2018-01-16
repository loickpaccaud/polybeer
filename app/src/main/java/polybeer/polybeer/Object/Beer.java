package polybeer.polybeer.Object;

import java.io.Serializable;

public class Beer implements Serializable{
    private Integer id;
    private String name;
    private String tagline;
    private String first_brewed;
    private String description;
    private String image_url;
    private Double abv;
    private Double ibu;
    private Double target_fg;
    private Double target_og;
    private Double ebc;
    private Double srm;
    private Double ph;
    private Double attenuation_level;
    private String ingedients_malt;
    private String ingedients_hops;
    private String ingedients_yeast;
    private String brewers_tips;
    private String contibutor;

    public Beer(Integer id, String name, String tagline, String first_brewed, String description, String image_url, Double abv, Double ibu, Double target_fg, Double target_og, Double ebc, Double srm, Double ph, Double attenuation_level, String ingedients_malt, String ingedients_hops, String ingedients_yeast, String brewers_tips, String contibutor) {
        this.id = id;
        this.name = name;
        this.tagline = tagline;
        this.first_brewed = first_brewed;
        this.description = description;
        this.image_url = image_url;
        this.abv = abv;
        this.ibu = ibu;
        this.target_fg = target_fg;
        this.target_og = target_og;
        this.ebc = ebc;
        this.srm = srm;
        this.ph = ph;
        this.attenuation_level = attenuation_level;
        this.ingedients_malt = ingedients_malt;
        this.ingedients_hops = ingedients_hops;
        this.ingedients_yeast = ingedients_yeast;
        this.brewers_tips = brewers_tips;
        this.contibutor = contibutor;
    }

    public Beer(){
        this.id = 1;
        this.name = "Buzz";
        this.tagline = "A Real Bitter Experience.";
        this.first_brewed = "09/2007";
        this.description = "A light, crisp and bitter IPA brewed with English and American hops. A small batch brewed only once.";
        this.image_url = "https://images.punkapi.com/v2/keg.png";
        this.abv = 4.5;
        this.ibu = 60.0;
        this.target_fg = 1010.0;
        this.target_og = 1044.0;
        this.ebc = 20.0;
        this.srm = 10.0;
        this.ph = 4.4;
        this.attenuation_level = 75.0;
        this.ingedients_malt = "Maris Otter Extra Pale \\n Caramalt \\n Munich";
        this.ingedients_hops = "Fuggles \\n First Gold \\n Fuggles \\n First Gold \\n Cascade";
        this.ingedients_yeast = "Wyeast 1056 - American Ale™";
        this.brewers_tips = "The earthy and floral aromas from the hops can be overpowering. Drop a little Cascade in at the end of the boil to lift the profile with a bit of citrus.";
        this.contibutor = "Sam Mason <samjbmason>";
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getFirst_brewed() {
        return first_brewed;
    }

    public void setFirst_brewed(String first_brewed) {
        this.first_brewed = first_brewed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public Double getAbv() {
        return abv;
    }

    public void setAbv(Double abv) {
        this.abv = abv;
    }

    public Double getIbu() {
        return ibu;
    }

    public void setIbu(Double ibu) {
        this.ibu = ibu;
    }

    public Double getTarget_fg() {
        return target_fg;
    }

    public void setTarget_fg(Double target_fg) {
        this.target_fg = target_fg;
    }

    public Double getTarget_og() {
        return target_og;
    }

    public void setTarget_og(Double target_og) {
        this.target_og = target_og;
    }

    public Double getEbc() {
        return ebc;
    }

    public void setEbc(Double ebc) {
        this.ebc = ebc;
    }

    public Double getSrm() {
        return srm;
    }

    public void setSrm(Double srm) {
        this.srm = srm;
    }

    public Double getPh() {
        return ph;
    }

    public void setPh(Double ph) {
        this.ph = ph;
    }

    public Double getAttenuation_level() {
        return attenuation_level;
    }

    public void setAttenuation_level(Double attenuation_level) {
        this.attenuation_level = attenuation_level;
    }

    public String getIngedients_malt() {
        return ingedients_malt;
    }

    public void setIngedients_malt(String ingedients_malt) {
        this.ingedients_malt = ingedients_malt;
    }

    public String getIngedients_hops() {
        return ingedients_hops;
    }

    public void setIngedients_hops(String ingedients_hops) {
        this.ingedients_hops = ingedients_hops;
    }

    public String getIngedients_yeast() {
        return ingedients_yeast;
    }

    public void setIngedients_yeast(String ingedients_yeast) {
        this.ingedients_yeast = ingedients_yeast;
    }

    public String getBrewers_tips() {
        return brewers_tips;
    }

    public void setBrewers_tips(String brewers_tips) {
        this.brewers_tips = brewers_tips;
    }

    public String getContibutor() {
        return contibutor;
    }

    public void setContibutor(String contibutor) {
        this.contibutor = contibutor;
    }
}
