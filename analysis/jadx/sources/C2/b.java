package C2;

import J5.m;
import android.graphics.Bitmap;
import c3.C0733c;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import d6.l;
import d6.p;
import d6.u;
import java.util.regex.Pattern;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import q6.A;
import q6.z;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1170e;
    public final l f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(A a7) {
        final int i = 0;
        B5.a aVar = new B5.a(this) { // from class: C2.a

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ b f1165r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f1165r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // B5.a
            public final Object invoke() {
                int i7 = i;
                b bVar = this.f1165r;
                switch (i7) {
                    case 0:
                        d6.c cVar = d6.c.f12305n;
                        return Q2.g.J(bVar.f);
                    default:
                        String strD = bVar.f.d("Content-Type");
                        if (strD == null) {
                            return null;
                        }
                        Pattern pattern = p.f12375b;
                        try {
                            return AbstractC0836n2.o(strD);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        };
        EnumC1370i enumC1370i = EnumC1370i.f15078r;
        this.f1166a = AbstractC1362a.c(enumC1370i, aVar);
        final int i7 = 1;
        this.f1167b = AbstractC1362a.c(enumC1370i, new B5.a(this) { // from class: C2.a

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ b f1165r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f1165r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // B5.a
            public final Object invoke() {
                int i72 = i7;
                b bVar = this.f1165r;
                switch (i72) {
                    case 0:
                        d6.c cVar = d6.c.f12305n;
                        return Q2.g.J(bVar.f);
                    default:
                        String strD = bVar.f.d("Content-Type");
                        if (strD == null) {
                            return null;
                        }
                        Pattern pattern = p.f12375b;
                        try {
                            return AbstractC0836n2.o(strD);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.f1168c = Long.parseLong(a7.E(Long.MAX_VALUE));
        this.f1169d = Long.parseLong(a7.E(Long.MAX_VALUE));
        this.f1170e = Integer.parseInt(a7.E(Long.MAX_VALUE)) > 0;
        int i8 = Integer.parseInt(a7.E(Long.MAX_VALUE));
        C0733c c0733c = new C0733c(1);
        for (int i9 = 0; i9 < i8; i9++) {
            String strE = a7.E(Long.MAX_VALUE);
            Bitmap.Config[] configArr = H2.f.f2137a;
            int iR0 = m.R0(strE, ':', 0, 6);
            if (iR0 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strE).toString());
            }
            String strSubstring = strE.substring(0, iR0);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            String string = m.n1(strSubstring).toString();
            String strSubstring2 = strE.substring(iR0 + 1);
            kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
            c0733c.b(string, strSubstring2);
        }
        this.f = c0733c.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(z zVar) {
        zVar.b(this.f1168c);
        zVar.writeByte(10);
        zVar.b(this.f1169d);
        zVar.writeByte(10);
        zVar.b(this.f1170e ? 1L : 0L);
        zVar.writeByte(10);
        l lVar = this.f;
        zVar.b(lVar.size());
        zVar.writeByte(10);
        int size = lVar.size();
        for (int i = 0; i < size; i++) {
            zVar.R(lVar.g(i));
            zVar.R(": ");
            zVar.R(lVar.i(i));
            zVar.writeByte(10);
        }
    }

    public b(u uVar) {
        final int i = 0;
        B5.a aVar = new B5.a(this) { // from class: C2.a

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ b f1165r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f1165r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // B5.a
            public final Object invoke() {
                int i72 = i;
                b bVar = this.f1165r;
                switch (i72) {
                    case 0:
                        d6.c cVar = d6.c.f12305n;
                        return Q2.g.J(bVar.f);
                    default:
                        String strD = bVar.f.d("Content-Type");
                        if (strD == null) {
                            return null;
                        }
                        Pattern pattern = p.f12375b;
                        try {
                            return AbstractC0836n2.o(strD);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        };
        EnumC1370i enumC1370i = EnumC1370i.f15078r;
        this.f1166a = AbstractC1362a.c(enumC1370i, aVar);
        final int i7 = 1;
        this.f1167b = AbstractC1362a.c(enumC1370i, new B5.a(this) { // from class: C2.a

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ b f1165r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f1165r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // B5.a
            public final Object invoke() {
                int i72 = i7;
                b bVar = this.f1165r;
                switch (i72) {
                    case 0:
                        d6.c cVar = d6.c.f12305n;
                        return Q2.g.J(bVar.f);
                    default:
                        String strD = bVar.f.d("Content-Type");
                        if (strD == null) {
                            return null;
                        }
                        Pattern pattern = p.f12375b;
                        try {
                            return AbstractC0836n2.o(strD);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.f1168c = uVar.f12428A;
        this.f1169d = uVar.f12429B;
        this.f1170e = uVar.f12436u != null;
        this.f = uVar.f12437v;
    }
}
