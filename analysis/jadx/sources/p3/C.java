package p3;

import i0.C1129a;

/* JADX INFO: loaded from: classes.dex */
public final class C implements Cloneable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f15632q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f15633r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C(int i, float f) {
        this.f15632q = f;
        this.f15633r = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float a(z0 z0Var) {
        float fSqrt;
        if (this.f15633r != 9) {
            return d(z0Var);
        }
        x0 x0Var = (x0) z0Var.f15877c;
        C1129a c1129a = x0Var.f15866g;
        if (c1129a == null) {
            c1129a = x0Var.f;
        }
        float f = this.f15632q;
        if (c1129a == null) {
            return f;
        }
        float f7 = c1129a.f13518d;
        if (f7 == c1129a.f13519e) {
            fSqrt = f * f7;
        } else {
            fSqrt = f * ((float) (Math.sqrt((r0 * r0) + (f7 * f7)) / 1.414213562373095d));
        }
        return fSqrt / 100.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float b(z0 z0Var, float f) {
        return this.f15633r == 9 ? (this.f15632q * f) / 100.0f : d(z0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float c() {
        float f;
        float f7;
        int iA = O.c.a(this.f15633r);
        float f8 = this.f15632q;
        if (iA == 0) {
            return f8;
        }
        if (iA == 3) {
            return f8 * 96.0f;
        }
        if (iA == 4) {
            f = f8 * 96.0f;
            f7 = 2.54f;
        } else if (iA == 5) {
            f = f8 * 96.0f;
            f7 = 25.4f;
        } else if (iA == 6) {
            f = f8 * 96.0f;
            f7 = 72.0f;
        } else {
            if (iA != 7) {
                return f8;
            }
            f = f8 * 96.0f;
            f7 = 6.0f;
        }
        return f / f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float d(z0 z0Var) {
        float textSize;
        int iA = O.c.a(this.f15633r);
        float f = this.f15632q;
        switch (iA) {
            case 1:
                textSize = ((x0) z0Var.f15877c).f15864d.getTextSize();
                break;
            case 2:
                textSize = ((x0) z0Var.f15877c).f15864d.getTextSize() / 2.0f;
                break;
            case 3:
                z0Var.getClass();
                return f * 96.0f;
            case 4:
                z0Var.getClass();
                return (f * 96.0f) / 2.54f;
            case 5:
                z0Var.getClass();
                return (f * 96.0f) / 25.4f;
            case 6:
                z0Var.getClass();
                return (f * 96.0f) / 72.0f;
            case 7:
                z0Var.getClass();
                return (f * 96.0f) / 6.0f;
            case 8:
                x0 x0Var = (x0) z0Var.f15877c;
                C1129a c1129a = x0Var.f15866g;
                if (c1129a == null) {
                    c1129a = x0Var.f;
                }
                if (c1129a != null) {
                    return (f * c1129a.f13518d) / 100.0f;
                }
            default:
                return f;
        }
        return textSize * f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float e(z0 z0Var) {
        if (this.f15633r != 9) {
            return d(z0Var);
        }
        x0 x0Var = (x0) z0Var.f15877c;
        C1129a c1129a = x0Var.f15866g;
        if (c1129a == null) {
            c1129a = x0Var.f;
        }
        float f = this.f15632q;
        return c1129a == null ? f : (f * c1129a.f13519e) / 100.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f() {
        return this.f15632q < 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        return this.f15632q == 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.f15632q));
        switch (this.f15633r) {
            case 1:
                str = "px";
                break;
            case 2:
                str = "em";
                break;
            case 3:
                str = "ex";
                break;
            case 4:
                str = "in";
                break;
            case 5:
                str = "cm";
                break;
            case 6:
                str = "mm";
                break;
            case 7:
                str = "pt";
                break;
            case 8:
                str = "pc";
                break;
            case 9:
                str = "percent";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        return sb.toString();
    }

    public C(float f) {
        this.f15632q = f;
        this.f15633r = 1;
    }
}
