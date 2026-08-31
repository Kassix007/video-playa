package p4;

import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.K1;
import i3.C1136a;
import l4.C1232b;

/* JADX INFO: renamed from: p4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1480a extends K1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Typeface f15880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1136a f15881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15882e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1480a(C1136a c1136a, Typeface typeface) {
        this.f15880c = typeface;
        this.f15881d = c1136a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.K1
    public final void A(int i) {
        if (this.f15882e) {
            return;
        }
        C1232b c1232b = (C1232b) this.f15881d.f13562r;
        if (c1232b.j(this.f15880c)) {
            c1232b.h(false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.K1
    public final void B(Typeface typeface, boolean z5) {
        if (this.f15882e) {
            return;
        }
        C1232b c1232b = (C1232b) this.f15881d.f13562r;
        if (c1232b.j(typeface)) {
            c1232b.h(false);
        }
    }
}
