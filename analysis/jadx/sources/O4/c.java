package O4;

import android.content.Context;
import java.util.HashMap;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f5204b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f5203a = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f5205c = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(b font) {
        m.e(font, "font");
        String mappingPrefix = font.getMappingPrefix();
        String s6 = font.getMappingPrefix();
        m.e(s6, "s");
        if (s6.length() != 3) {
            throw new IllegalArgumentException("The mapping prefix of a font must be 3 characters long.");
        }
        f5205c.put(mappingPrefix, font);
    }
}
