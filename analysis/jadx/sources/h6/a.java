package h6;

import L.s;
import d6.o;
import d6.q;
import d6.u;
import java.io.IOException;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f13460a = new a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d6.o
    public final u a(i6.f fVar) throws IOException {
        h hVar = fVar.f13648a;
        synchronized (hVar) {
            try {
                if (!hVar.f13485B) {
                    throw new IllegalStateException("released");
                }
                if (hVar.f13484A) {
                    throw new IllegalStateException("Check failed.");
                }
                if (hVar.f13498z) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d finder = hVar.f13495w;
        m.b(finder);
        q qVar = hVar.f13489q;
        try {
            i6.d dVarJ = finder.a(fVar.f, fVar.f13653g, fVar.f13654h, qVar.f12400v, !m.a(fVar.f13652e.f12414b, "GET")).j(qVar, fVar);
            m.e(finder, "finder");
            s sVar = new s();
            sVar.f3062b = hVar;
            sVar.f3063c = finder;
            sVar.f3064d = dVarJ;
            sVar.f3065e = dVarJ.g();
            hVar.f13497y = sVar;
            hVar.f13487D = sVar;
            synchronized (hVar) {
                hVar.f13498z = true;
                hVar.f13484A = true;
            }
            if (hVar.f13486C) {
                throw new IOException("Canceled");
            }
            return i6.f.a(fVar, 0, sVar, null, 61).b(fVar.f13652e);
        } catch (k e7) {
            finder.c(e7.f13514r);
            throw e7;
        } catch (IOException e8) {
            finder.c(e8);
            throw new k(e8);
        }
    }
}
