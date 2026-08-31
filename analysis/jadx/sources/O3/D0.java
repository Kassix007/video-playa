package O3;

import P.C0345b;
import android.content.Context;
import java.util.Arrays;
import java.util.List;
import o3.C1415a;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public abstract class D0 implements F0, h3.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4345q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f4346r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public D0(C0323t0 c0323t0) {
        this.f4345q = 0;
        AbstractC1887A.g(c0323t0);
        this.f4346r = c0323t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.F0
    public X b() {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.F0
    public C0312p0 c() {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.F0
    public Context d() {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.F0
    public B3.a e() {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.F0
    public s4.e g() {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h3.e
    public List h() {
        return (List) this.f4346r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h3.e
    public boolean i() {
        List list = (List) this.f4346r;
        return list.isEmpty() || (list.size() == 1 && ((C1415a) list.get(0)).c());
    }

    public abstract Object j();

    public abstract Object k();

    public abstract void l(Object obj);

    public abstract void m(u.v0 v0Var);

    public abstract void n();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void o() {
        C0312p0 c0312p0 = ((C0323t0) this.f4346r).f5078w;
        C0323t0.l(c0312p0);
        c0312p0.o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f4345q) {
            case 1:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.f4346r;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public D0(List list) {
        this.f4345q = 1;
        this.f4346r = list;
    }

    public D0() {
        this.f4345q = 2;
        this.f4346r = C0345b.q(Boolean.FALSE);
    }
}
