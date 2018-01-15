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
    private Float abv;
    private Float ibu;
    private Float target_fg;
    private Float target_og;
    private Float ebc;
    private Float srm;
    private Float ph;
    private Float attenuation_level;
    private Integer volume;
    private Integer boil_volume;
    private Integer mash_temperature;
    private Integer mash_duration;
    private Integer ferm_temperature;
    private String twist;
    private String ingedients_malt;
    private String ingedients_hops;
    private String ingedients_yeast;
    private String food_pairing;
    private String brewers_tips;
    private String contibutor;

    public Beer(Integer id, String name, String tagline, String first_brewed, String description, String image_url, Float abv, Float ibu, Float target_fg, Float target_og, Float ebc, Float srm, Float ph, Float attenuation_level, Integer volume, Integer boil_volume, Integer mash_temperature, Integer mash_duration, Integer ferm_temperature, String twist, String ingedients_malt, String ingedients_hops, String ingedients_yeast, String food_pairing, String brewers_tips, String contibutor) {
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
        this.volume = volume;
        this.boil_volume = boil_volume;
        this.mash_temperature = mash_temperature;
        this.mash_duration = mash_duration;
        this.ferm_temperature = ferm_temperature;
        this.twist = twist;
        this.ingedients_malt = ingedients_malt;
        this.ingedients_hops = ingedients_hops;
        this.ingedients_yeast = ingedients_yeast;
        this.food_pairing = food_pairing;
        this.brewers_tips = brewers_tips;
        this.contibutor = contibutor;
    }
}
