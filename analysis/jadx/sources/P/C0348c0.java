package P;

import a0.AbstractC0606h;
import a0.C0601c;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: P.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0348c0 extends a0.v implements Parcelable, a0.o, W, S0 {
    public static final Parcelable.Creator<C0348c0> CREATOR = new C0344a0(1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public F0 f5389r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0348c0(int i) {
        AbstractC0606h abstractC0606hK = a0.n.k();
        F0 f02 = new F0(abstractC0606hK.g(), i);
        if (!(abstractC0606hK instanceof C0601c)) {
            f02.f8709b = new F0(1, i);
        }
        this.f5389r = f02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.o
    public final I0 a() {
        return S.f5377v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.u
    public final a0.w d() {
        return this.f5389r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e() {
        return ((F0) a0.n.t(this.f5389r, this)).f5310c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(int i) {
        AbstractC0606h abstractC0606hK;
        F0 f02 = (F0) a0.n.i(this.f5389r);
        if (f02.f5310c != i) {
            F0 f03 = this.f5389r;
            synchronized (a0.n.f8680b) {
                abstractC0606hK = a0.n.k();
                ((F0) a0.n.o(f03, this, abstractC0606hK, f02)).f5310c = i;
            }
            a0.n.n(abstractC0606hK, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.u
    public final a0.w g(a0.w wVar, a0.w wVar2, a0.w wVar3) {
        if (((F0) wVar2).f5310c == ((F0) wVar3).f5310c) {
            return wVar2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.S0
    public Object getValue() {
        return Integer.valueOf(e());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.u
    public final void h(a0.w wVar) {
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f5389r = (F0) wVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.W
    public void setValue(Object obj) {
        f(((Number) obj).intValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MutableIntState(value=" + ((F0) a0.n.i(this.f5389r)).f5310c + ")@" + hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(e());
    }
}
