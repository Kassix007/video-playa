package J5;

import B0.G0;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Pattern f2836q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k(String pattern) {
        kotlin.jvm.internal.m.e(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
        this.f2836q = patternCompile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static G0 a(k kVar, String input) {
        kVar.getClass();
        kotlin.jvm.internal.m.e(input, "input");
        Matcher matcher = kVar.f2836q.matcher(input);
        kotlin.jvm.internal.m.d(matcher, "matcher(...)");
        if (matcher.find(0)) {
            return new G0(matcher, input);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final G0 b(String input) {
        kotlin.jvm.internal.m.e(input, "input");
        Matcher matcher = this.f2836q.matcher(input);
        kotlin.jvm.internal.m.d(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new G0(matcher, input);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c(CharSequence input) {
        kotlin.jvm.internal.m.e(input, "input");
        return this.f2836q.matcher(input).matches();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String string = this.f2836q.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public k(String pattern, int i) {
        kotlin.jvm.internal.m.e(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern, 66);
        kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
        this.f2836q = patternCompile;
    }
}
