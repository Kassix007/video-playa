package m5;

import com.google.android.gms.internal.measurement.I1;
import java.lang.reflect.Method;
import r5.EnumC1580a;
import u5.AbstractC1703a;
import v5.AbstractC1768a;

/* JADX INFO: renamed from: m5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1362a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1580a f15069a = EnumC1580a.f16356q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Throwable th, Throwable exception) {
        kotlin.jvm.internal.m.e(th, "<this>");
        kotlin.jvm.internal.m.e(exception, "exception");
        if (th != exception) {
            Integer num = AbstractC1768a.f17728a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            Method method = AbstractC1703a.f17216a;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1373l b(Throwable exception) {
        kotlin.jvm.internal.m.e(exception, "exception");
        return new C1373l(exception);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC1369h c(EnumC1370i enumC1370i, B5.a aVar) {
        C1383v c1383v = C1383v.f15095a;
        int iOrdinal = enumC1370i.ordinal();
        if (iOrdinal == 0) {
            return new C1376o(aVar);
        }
        if (iOrdinal == 1) {
            C1375n c1375n = new C1375n();
            c1375n.f15084q = aVar;
            c1375n.f15085r = c1383v;
            return c1375n;
        }
        if (iOrdinal != 2) {
            throw new C2.e();
        }
        C1387z c1387z = new C1387z();
        c1387z.f15099q = aVar;
        c1387z.f15100r = c1383v;
        return c1387z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1376o d(B5.a initializer) {
        kotlin.jvm.internal.m.e(initializer, "initializer");
        return new C1376o(initializer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(Object obj) {
        if (obj instanceof C1373l) {
            throw ((C1373l) obj).f15082q;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1371j f(String str, String str2) {
        return new C1371j(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final double g(long j) {
        return ((j >>> 11) * ((double) 2048)) + (j & 2047);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String h(int i, long j) {
        if (j >= 0) {
            I1.M(i);
            String string = Long.toString(j, i);
            kotlin.jvm.internal.m.d(string, "toString(...)");
            return string;
        }
        long j7 = i;
        long j8 = ((j >>> 1) / j7) << 1;
        long j9 = j - (j8 * j7);
        if (j9 >= j7) {
            j9 -= j7;
            j8++;
        }
        I1.M(i);
        String string2 = Long.toString(j8, i);
        kotlin.jvm.internal.m.d(string2, "toString(...)");
        I1.M(i);
        String string3 = Long.toString(j9, i);
        kotlin.jvm.internal.m.d(string3, "toString(...)");
        return string2.concat(string3);
    }
}
