package c;

import M5.InterfaceC0261w;
import b.C0684a;
import b.u;
import com.google.android.gms.internal.measurement.O1;

/* JADX INFO: renamed from: c.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0710h extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0261w f10063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public B5.e f10064e;
    public O1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10065g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b.u
    public final void a() {
        O1 o12 = this.f;
        if (o12 != null) {
            o12.b();
        }
        O1 o13 = this.f;
        if (o13 != null) {
            o13.f10679a = false;
        }
        this.f10065g = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b.u
    public final void b() {
        O1 o12 = this.f;
        if (o12 != null && !o12.f10679a) {
            o12.b();
            this.f = null;
        }
        if (this.f == null) {
            this.f = new O1(this.f10063d, false, this.f10064e, this);
        }
        O1 o13 = this.f;
        if (o13 != null) {
            ((O5.e) o13.f10680b).f(null);
        }
        O1 o14 = this.f;
        if (o14 != null) {
            o14.f10679a = false;
        }
        this.f10065g = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b.u
    public final void c(C0684a c0684a) {
        super.c(c0684a);
        O1 o12 = this.f;
        if (o12 != null) {
            ((O5.e) o12.f10680b).j(c0684a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b.u
    public final void d(C0684a c0684a) {
        super.d(c0684a);
        O1 o12 = this.f;
        if (o12 != null) {
            o12.b();
        }
        if (this.f9909a) {
            this.f = new O1(this.f10063d, true, this.f10064e, this);
        }
        this.f10065g = true;
    }
}
