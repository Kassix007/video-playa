package d3;

import o3.C1415a;

/* JADX INFO: loaded from: classes.dex */
public final class i extends k {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.e
    public final Object f(C1415a c1415a, float f) {
        return Float.valueOf(m(c1415a, f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float l() {
        return m(this.f12232c.f(), c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float m(C1415a c1415a, float f) {
        float f7;
        Object obj = c1415a.f15413b;
        Object obj2 = c1415a.f15413b;
        if (obj == null || c1415a.f15414c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        Z.m mVar = this.f12234e;
        if (mVar != null) {
            f7 = f;
            Float f8 = (Float) mVar.o(c1415a.f15417g, c1415a.f15418h.floatValue(), (Float) obj2, (Float) c1415a.f15414c, f7, d(), this.f12233d);
            if (f8 != null) {
                return f8.floatValue();
            }
        } else {
            f7 = f;
        }
        if (c1415a.i == -3987645.8f) {
            c1415a.i = ((Float) obj2).floatValue();
        }
        float f9 = c1415a.i;
        if (c1415a.j == -3987645.8f) {
            c1415a.j = ((Float) c1415a.f15414c).floatValue();
        }
        return n3.g.f(f9, c1415a.j, f7);
    }
}
