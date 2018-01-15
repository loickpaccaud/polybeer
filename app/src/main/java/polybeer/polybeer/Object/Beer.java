package polybeer.polybeer.Object;

/**
 * Created by Loick on 15/01/2018.
 */

public class Beer {
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
}
