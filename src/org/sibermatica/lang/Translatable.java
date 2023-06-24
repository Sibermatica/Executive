package org.sibermatica.lang;

import java.util.Locale;

/**
 * <h1>Translatable</h1>
 * Any class that implements this interface can be translatable.
 * Can be translatable to any language.
 *
 * @see java.util.Locale
 * @version 1.2.1
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @apiNote Use for video-games.  Seriously, these facilities soo much translation.
 * */
public interface Translatable {

    /**
     * Translates this object to the locale language.
     *
     * @return Translated object
     * */
    String translate();

    /**
     * Translates this object to the given language.
     * @param language The language to translate to.
     * @return The translated object.
     * */
    String translate(Locale language);

}
