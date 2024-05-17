package poggerz.kaupenModders.kaupen_mod.util.memez;

import poggerz.kaupenModders.kaupen_mod.kaupenMod;

public class kaupenPoggerz {
    public final String words;
    public kaupenPoggerz(String words) {
        this.words = words;
        kaupenMod.LOGGER.info(words);
    }
}