package P;

import a0.AbstractC0606h;
import a0.C0601c;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: P.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0346b0 extends a0.v implements Parcelable, a0.o, W, S0 {
    public static final Parcelable.Creator<C0346b0> CREATOR = new C0344a0(0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public E0 f5388r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0346b0(float f) {
        AbstractC0606h abstractC0606hK = a0.n.k();
        E0 e02 = new E0(abstractC0606hK.g(), f);
        if (!(abstractC0606hK instanceof C0601c)) {
            e02.f8709b = new E0(1, f);
        }
        this.f5388r = e02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.o
    public final I0 a() {
        return S.f5377v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.u
    public final a0.w d() {
        return this.f5388r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float e() {
        return ((E0) a0.n.t(this.f5388r, this)).f5309c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(float f) {
        AbstractC0606h abstractC0606hK;
        E0 e02 = (E0) a0.n.i(this.f5388r);
        if (e02.f5309c == f) {
            return;
        }
        E0 e03 = this.f5388r;
        synchronized (a0.n.f8680b) {
            abstractC0606hK = a0.n.k();
            ((E0) a0.n.o(e03, this, abstractC0606hK, e02)).f5309c = f;
        }
        a0.n.n(abstractC0606hK, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.u
    public final a0.w g(a0.w wVar, a0.w wVar2, a0.w wVar3) {
        if (((E0) wVar2).f5309c == ((E0) wVar3).f5309c) {
            return wVar2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.S0
    public Object getValue() {
        return Float.valueOf(e());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.u
    public final void h(a0.w wVar) {
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f5388r = (E0) wVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.W
    public void setValue(Object obj) {
        f(((Number) obj).floatValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MutableFloatState(value=" + ((E0) a0.n.i(this.f5388r)).f5309c + ")@" + hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(e());
    }
}
