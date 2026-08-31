package P;

import a0.AbstractC0606h;
import a0.C0601c;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: P.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0350d0 extends a0.v implements Parcelable, a0.o, W, S0 {
    public static final Parcelable.Creator<C0350d0> CREATOR = new C0344a0(2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public G0 f5392r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0350d0(long j) {
        AbstractC0606h abstractC0606hK = a0.n.k();
        G0 g02 = new G0(abstractC0606hK.g(), j);
        if (!(abstractC0606hK instanceof C0601c)) {
            g02.f8709b = new G0(1, j);
        }
        this.f5392r = g02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.o
    public final I0 a() {
        return S.f5377v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.u
    public final a0.w d() {
        return this.f5392r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(long j) {
        AbstractC0606h abstractC0606hK;
        G0 g02 = (G0) a0.n.i(this.f5392r);
        if (g02.f5312c != j) {
            G0 g03 = this.f5392r;
            synchronized (a0.n.f8680b) {
                abstractC0606hK = a0.n.k();
                ((G0) a0.n.o(g03, this, abstractC0606hK, g02)).f5312c = j;
            }
            a0.n.n(abstractC0606hK, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.u
    public final a0.w g(a0.w wVar, a0.w wVar2, a0.w wVar3) {
        if (((G0) wVar2).f5312c == ((G0) wVar3).f5312c) {
            return wVar2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.S0
    public Object getValue() {
        return Long.valueOf(((G0) a0.n.t(this.f5392r, this)).f5312c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.u
    public final void h(a0.w wVar) {
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f5392r = (G0) wVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.W
    public void setValue(Object obj) {
        e(((Number) obj).longValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MutableLongState(value=" + ((G0) a0.n.i(this.f5392r)).f5312c + ")@" + hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(((G0) a0.n.t(this.f5392r, this)).f5312c);
    }
}
