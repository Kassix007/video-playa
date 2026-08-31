package Z5;

import com.google.android.gms.internal.measurement.I1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import m5.AbstractC1362a;
import m5.EnumC1370i;

/* JADX INFO: loaded from: classes.dex */
public class P implements X5.f, InterfaceC0581j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0593w f8557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8559d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f8560e;
    public final List[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f8561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f8562h;
    public final Object i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f8563k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public P(String str, InterfaceC0593w interfaceC0593w, int i) {
        this.f8556a = str;
        this.f8557b = interfaceC0593w;
        this.f8558c = i;
        String[] strArr = new String[i];
        for (int i7 = 0; i7 < i; i7++) {
            strArr[i7] = "[UNINITIALIZED]";
        }
        this.f8560e = strArr;
        int i8 = this.f8558c;
        this.f = new List[i8];
        this.f8561g = new boolean[i8];
        this.f8562h = n5.t.f15300q;
        final int i9 = 0;
        B5.a aVar = new B5.a(this) { // from class: Z5.O

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ P f8555r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f8555r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, m5.h] */
            @Override // B5.a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        InterfaceC0593w interfaceC0593w2 = this.f8555r.f8557b;
                        return interfaceC0593w2 != null ? interfaceC0593w2.a() : N.f8553b;
                    case 1:
                        return N.c(this.f8555r.f8557b != null ? new ArrayList(0) : null);
                    default:
                        P p7 = this.f8555r;
                        return Integer.valueOf(N.d(p7, (X5.f[]) p7.j.getValue()));
                }
            }
        };
        EnumC1370i enumC1370i = EnumC1370i.f15077q;
        this.i = AbstractC1362a.c(enumC1370i, aVar);
        final int i10 = 1;
        this.j = AbstractC1362a.c(enumC1370i, new B5.a(this) { // from class: Z5.O

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ P f8555r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f8555r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, m5.h] */
            @Override // B5.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        InterfaceC0593w interfaceC0593w2 = this.f8555r.f8557b;
                        return interfaceC0593w2 != null ? interfaceC0593w2.a() : N.f8553b;
                    case 1:
                        return N.c(this.f8555r.f8557b != null ? new ArrayList(0) : null);
                    default:
                        P p7 = this.f8555r;
                        return Integer.valueOf(N.d(p7, (X5.f[]) p7.j.getValue()));
                }
            }
        });
        final int i11 = 2;
        this.f8563k = AbstractC1362a.c(enumC1370i, new B5.a(this) { // from class: Z5.O

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ P f8555r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f8555r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, m5.h] */
            @Override // B5.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        InterfaceC0593w interfaceC0593w2 = this.f8555r.f8557b;
                        return interfaceC0593w2 != null ? interfaceC0593w2.a() : N.f8553b;
                    case 1:
                        return N.c(this.f8555r.f8557b != null ? new ArrayList(0) : null);
                    default:
                        P p7 = this.f8555r;
                        return Integer.valueOf(N.d(p7, (X5.f[]) p7.j.getValue()));
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // X5.f
    public final int a(String name) {
        kotlin.jvm.internal.m.e(name, "name");
        Integer num = (Integer) this.f8562h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final String b() {
        return this.f8556a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public I1 c() {
        return X5.i.f8194c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final int d() {
        return this.f8558c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final String e(int i) {
        return this.f8560e[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, m5.h] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, m5.h] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof P) {
            X5.f fVar = (X5.f) obj;
            if (this.f8556a.equals(fVar.b()) && Arrays.equals((X5.f[]) this.j.getValue(), (X5.f[]) ((P) obj).j.getValue())) {
                int iD = fVar.d();
                int i = this.f8558c;
                if (i == iD) {
                    for (int i7 = 0; i7 < i; i7++) {
                        if (kotlin.jvm.internal.m.a(i(i7).b(), fVar.i(i7).b()) && kotlin.jvm.internal.m.a(i(i7).c(), fVar.i(i7).c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // Z5.InterfaceC0581j
    public final Set f() {
        return this.f8562h.keySet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final boolean g() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final List getAnnotations() {
        return n5.s.f15299q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final List h(int i) {
        List list = this.f[i];
        return list == null ? n5.s.f15299q : list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, m5.h] */
    public int hashCode() {
        return ((Number) this.f8563k.getValue()).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, m5.h] */
    @Override // X5.f
    public X5.f i(int i) {
        return ((V5.a[]) this.i.getValue())[i].b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public boolean isInline() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final boolean j(int i) {
        return this.f8561g[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(String name, boolean z5) {
        kotlin.jvm.internal.m.e(name, "name");
        int i = this.f8559d + 1;
        this.f8559d = i;
        String[] strArr = this.f8560e;
        strArr[i] = name;
        this.f8561g[i] = z5;
        this.f[i] = null;
        if (i == this.f8558c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                map.put(strArr[i7], Integer.valueOf(i7));
            }
            this.f8562h = map;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return N.g(this);
    }
}
