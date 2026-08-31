package D;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f1238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f1241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f1242e;
    public final /* synthetic */ r f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(r rVar, int i, int i7, l lVar, u uVar) {
        this.f = rVar;
        this.f1238a = rVar;
        this.f1239b = i;
        this.f1240c = i7;
        this.f1241d = lVar;
        this.f1242e = uVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long a(int i, int i7) {
        int i8;
        r rVar = this.f1238a;
        int[] iArr = rVar.f1283a;
        if (i7 == 1) {
            i8 = iArr[i];
        } else {
            int i9 = (i7 + i) - 1;
            int[] iArr2 = rVar.f1284b;
            i8 = (iArr2[i9] + iArr[i9]) - iArr2[i];
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i8 < 0) {
            W0.h.a("width must be >= 0");
        }
        return W0.b.g(i8, i8, 0, Integer.MAX_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q b(int i) {
        t tVarR = this.f1242e.r(i);
        int i7 = tVarR.f1286a;
        List list = tVarR.f1287b;
        int size = list.size();
        int i8 = (size == 0 || i7 + size == this.f1239b) ? 0 : this.f1240c;
        p[] pVarArr = new p[size];
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int i11 = (int) ((C0117b) list.get(i10)).f1191a;
            p pVarA = this.f1241d.a(i7 + i10, i9, i11, i8, a(i9, i11));
            i9 += i11;
            pVarArr[i10] = pVarA;
        }
        return new q(i, pVarArr, this.f, tVarR.f1287b, i8);
    }
}
