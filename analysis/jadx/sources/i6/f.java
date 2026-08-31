package i6;

import L.s;
import d6.o;
import d6.u;
import h6.h;
import java.util.ArrayList;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f13648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f13649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f13651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d6.s f13652e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13654h;
    public int i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(h hVar, ArrayList arrayList, int i, s sVar, d6.s request, int i7, int i8, int i9) {
        m.e(request, "request");
        this.f13648a = hVar;
        this.f13649b = arrayList;
        this.f13650c = i;
        this.f13651d = sVar;
        this.f13652e = request;
        this.f = i7;
        this.f13653g = i8;
        this.f13654h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static f a(f fVar, int i, s sVar, d6.s sVar2, int i7) {
        if ((i7 & 1) != 0) {
            i = fVar.f13650c;
        }
        int i8 = i;
        if ((i7 & 2) != 0) {
            sVar = fVar.f13651d;
        }
        s sVar3 = sVar;
        if ((i7 & 4) != 0) {
            sVar2 = fVar.f13652e;
        }
        d6.s request = sVar2;
        int i9 = fVar.f;
        int i10 = fVar.f13653g;
        int i11 = fVar.f13654h;
        m.e(request, "request");
        return new f(fVar.f13648a, fVar.f13649b, i8, sVar3, request, i9, i10, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final u b(d6.s request) {
        m.e(request, "request");
        ArrayList arrayList = this.f13649b;
        int size = arrayList.size();
        int i = this.f13650c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        s sVar = this.f13651d;
        if (sVar != null) {
            if (!((h6.d) sVar.f3063c).b(request.f12413a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i7 = i + 1;
        f fVarA = a(this, i7, null, request, 58);
        o oVar = (o) arrayList.get(i);
        u uVarA = oVar.a(fVarA);
        if (uVarA == null) {
            throw new NullPointerException("interceptor " + oVar + " returned null");
        }
        if (sVar != null && i7 < arrayList.size() && fVarA.i != 1) {
            throw new IllegalStateException(("network interceptor " + oVar + " must call proceed() exactly once").toString());
        }
        if (uVarA.f12438w != null) {
            return uVarA;
        }
        throw new IllegalStateException(("interceptor " + oVar + " returned a response with no body").toString());
    }
}
