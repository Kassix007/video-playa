package J5;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f2809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f2810b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Charset charsetForName = Charset.forName("UTF-8");
        kotlin.jvm.internal.m.d(charsetForName, "forName(...)");
        f2809a = charsetForName;
        kotlin.jvm.internal.m.d(Charset.forName("UTF-16"), "forName(...)");
        kotlin.jvm.internal.m.d(Charset.forName("UTF-16BE"), "forName(...)");
        kotlin.jvm.internal.m.d(Charset.forName("UTF-16LE"), "forName(...)");
        kotlin.jvm.internal.m.d(Charset.forName("US-ASCII"), "forName(...)");
        Charset charsetForName2 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.m.d(charsetForName2, "forName(...)");
        f2810b = charsetForName2;
    }
}
