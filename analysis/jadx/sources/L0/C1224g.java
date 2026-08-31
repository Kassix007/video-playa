package l0;

import k1.i;

/* JADX INFO: renamed from: l0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1224g extends AbstractC1220c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f14432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14434e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1224g(float f, float f7, int i, int i7, int i8) {
        f7 = (i8 & 2) != 0 ? 4.0f : f7;
        i = (i8 & 4) != 0 ? 0 : i;
        i7 = (i8 & 8) != 0 ? 0 : i7;
        this.f14431b = f;
        this.f14432c = f7;
        this.f14433d = i;
        this.f14434e = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1224g)) {
            return false;
        }
        C1224g c1224g = (C1224g) obj;
        if (this.f14431b != c1224g.f14431b || this.f14432c != c1224g.f14432c || this.f14433d != c1224g.f14433d || this.f14434e != c1224g.f14434e) {
            return false;
        }
        c1224g.getClass();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return i.c(this.f14434e, i.c(this.f14433d, i.b(this.f14432c, Float.hashCode(this.f14431b) * 31, 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f14431b);
        sb.append(", miter=");
        sb.append(this.f14432c);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.f14433d;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i7 = this.f14434e;
        if (i7 == 0) {
            str = "Miter";
        } else if (i7 == 1) {
            str = "Round";
        } else if (i7 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
