package b6;

import C0.S;
import D.u;
import O3.B;
import a6.AbstractC0637c;
import a6.p;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f10024a = new f();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final c a(int i, CharSequence input, String message) {
        m.e(message, "message");
        m.e(input, "input");
        String message2 = message + "\nJSON input: " + ((Object) g(input, i));
        m.e(message2, "message");
        if (i >= 0) {
            message2 = "Unexpected JSON token at offset " + i + ": " + message2;
        }
        return new c(message2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final X5.f b(X5.f fVar, B module) {
        m.e(fVar, "<this>");
        m.e(module, "module");
        if (!m.a(fVar.c(), X5.h.f8192c)) {
            return fVar.isInline() ? b(fVar.i(0), module) : fVar;
        }
        Q2.g.B(fVar);
        return fVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte c(char c7) {
        if (c7 < '~') {
            return a.f10019b[c7];
        }
        return (byte) 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String d(X5.f fVar, AbstractC0637c json) {
        m.e(fVar, "<this>");
        m.e(json, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof a6.i) {
                return ((a6.i) annotation).discriminator();
            }
        }
        return (String) json.f9019a.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean e(X5.f fVar, AbstractC0637c json) {
        m.e(fVar, "<this>");
        m.e(json, "json");
        if (json.f9019a.f9035b) {
            return true;
        }
        List annotations = fVar.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof p) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(u uVar, String str) {
        uVar.l("Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.", uVar.f1289b - 1);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final CharSequence g(CharSequence charSequence, int i) {
        m.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i7 = i - 30;
                int i8 = i + 30;
                String str = i7 <= 0 ? "" : ".....";
                String str2 = i8 >= charSequence.length() ? "" : ".....";
                StringBuilder sbQ = S.q(str);
                if (i7 < 0) {
                    i7 = 0;
                }
                int length = charSequence.length();
                if (i8 > length) {
                    i8 = length;
                }
                sbQ.append(charSequence.subSequence(i7, i8).toString());
                sbQ.append(str2);
                return sbQ.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void h(X5.f fVar, AbstractC0637c json) {
        m.e(fVar, "<this>");
        m.e(json, "json");
        m.a(fVar.c(), X5.i.f8194c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void i(u uVar, Number number) {
        u.m(uVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String j(byte b7) {
        return b7 == 1 ? "quotation mark '\"'" : b7 == 2 ? "string escape sequence '\\'" : b7 == 4 ? "comma ','" : b7 == 5 ? "colon ':'" : b7 == 6 ? "start of the object '{'" : b7 == 7 ? "end of the object '}'" : b7 == 8 ? "start of the array '['" : b7 == 9 ? "end of the array ']'" : b7 == 10 ? "end of the input" : b7 == 127 ? "invalid token" : "valid token";
    }
}
