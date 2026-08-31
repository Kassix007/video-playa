package o3;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import s4.o;
import s4.p;
import s4.q;
import s4.r;
import s4.s;

/* JADX INFO: renamed from: o3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1416b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f15425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f15426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f15429e;
    public Object f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f15430g = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1416b() {
        d(0.0f, 270.0f, 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(float f) {
        float f7 = this.f15428d;
        if (f7 == f) {
            return;
        }
        float f8 = ((f - f7) + 360.0f) % 360.0f;
        if (f8 > 180.0f) {
            return;
        }
        float f9 = this.f15426b;
        float f10 = this.f15427c;
        q qVar = new q(f9, f10, f9, f10);
        qVar.f = this.f15428d;
        qVar.f16555g = f8;
        ((ArrayList) this.f15430g).add(new o(qVar));
        this.f15428d = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(Matrix matrix, Path path) {
        ArrayList arrayList = (ArrayList) this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s) arrayList.get(i)).a(matrix, path);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(float f, float f7) {
        r rVar = new r();
        rVar.f16556b = f;
        rVar.f16557c = f7;
        ((ArrayList) this.f).add(rVar);
        p pVar = new p(rVar, this.f15426b, this.f15427c);
        float fB = pVar.b() + 270.0f;
        float fB2 = pVar.b() + 270.0f;
        a(fB);
        ((ArrayList) this.f15430g).add(pVar);
        this.f15428d = fB2;
        this.f15426b = f;
        this.f15427c = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(float f, float f7, float f8) {
        this.f15425a = f;
        this.f15426b = 0.0f;
        this.f15427c = f;
        this.f15428d = f7;
        this.f15429e = (f7 + f8) % 360.0f;
        ((ArrayList) this.f).clear();
        ((ArrayList) this.f15430g).clear();
    }
}
