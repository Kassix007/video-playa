package com.mikepenz.iconics.typeface.library.fontawesome;

import K2.j;
import O4.b;
import P4.a;
import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.wnapp.smspariaz.R;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import m5.InterfaceC1369h;
import n5.l;
import n5.y;

/* JADX INFO: loaded from: classes.dex */
public final class FontAwesome implements b {
    public static final FontAwesome INSTANCE = new FontAwesome();
    private static final InterfaceC1369h characters$delegate = AbstractC1362a.d(new j(2));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private FontAwesome() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map characters_delegate$lambda$1() {
        a[] aVarArrValues = a.values();
        int I6 = y.I(aVarArrValues.length);
        if (I6 < 16) {
            I6 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(I6);
        for (a aVar : aVarArrValues) {
            linkedHashMap.put(aVar.name(), Character.valueOf(aVar.f5977q));
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getAuthor() {
        return "FontAwesome";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Map<String, Character> getCharacters() {
        return (Map) characters$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getDescription() {
        return "The internet's most popular icon toolkit has been redesigned and built from scratch. On top of this, features like icon font ligatures, an SVG framework, official NPM packages for popular frontend libraries like React, and access to a new CDN.";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getFontName() {
        return "FontAwesome";
    }

    @Override // O4.b
    public int getFontRes() {
        return R.font.fontawesome_solid_font_v5_13_3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O4.b
    public O4.a getIcon(String key) {
        m.e(key, "key");
        return a.valueOf(key);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getIconCount() {
        return getCharacters().size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List<String> getIcons() {
        Set<String> setKeySet = getCharacters().keySet();
        LinkedList linkedList = new LinkedList();
        l.z0(setKeySet, linkedList);
        return linkedList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getLicense() {
        return "Font Awesome Free License";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getLicenseUrl() {
        return "https://github.com/FortAwesome/Font-Awesome/blob/master/LICENSE.txt";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O4.b
    public String getMappingPrefix() {
        return "faw";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O4.b
    public Typeface getRawTypeface() {
        return AbstractC0836n2.w(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getUrl() {
        return "https://fontawesome.com/";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getVersion() {
        return "5.13.3.0";
    }
}
