package r2;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import r.C1554e;

/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f16304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f16306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f16307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f16308e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f16309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f16310h;
    public float i;
    public final Matrix j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f16311k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i() {
        this.f16304a = new Matrix();
        this.f16305b = new ArrayList();
        this.f16306c = 0.0f;
        this.f16307d = 0.0f;
        this.f16308e = 0.0f;
        this.f = 1.0f;
        this.f16309g = 1.0f;
        this.f16310h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.f16311k = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // r2.j
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f16305b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((j) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // r2.j
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f16305b;
            if (i >= arrayList.size()) {
                return zB;
            }
            zB |= ((j) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.f16307d, -this.f16308e);
        matrix.postScale(this.f, this.f16309g);
        matrix.postRotate(this.f16306c, 0.0f, 0.0f);
        matrix.postTranslate(this.f16310h + this.f16307d, this.i + this.f16308e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getGroupName() {
        return this.f16311k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Matrix getLocalMatrix() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getPivotX() {
        return this.f16307d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getPivotY() {
        return this.f16308e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getRotation() {
        return this.f16306c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getScaleX() {
        return this.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getScaleY() {
        return this.f16309g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getTranslateX() {
        return this.f16310h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getTranslateY() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPivotX(float f) {
        if (f != this.f16307d) {
            this.f16307d = f;
            c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPivotY(float f) {
        if (f != this.f16308e) {
            this.f16308e = f;
            c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setRotation(float f) {
        if (f != this.f16306c) {
            this.f16306c = f;
            c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setScaleY(float f) {
        if (f != this.f16309g) {
            this.f16309g = f;
            c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTranslateX(float f) {
        if (f != this.f16310h) {
            this.f16310h = f;
            c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public i(i iVar, C1554e c1554e) {
        k gVar;
        this.f16304a = new Matrix();
        this.f16305b = new ArrayList();
        this.f16306c = 0.0f;
        this.f16307d = 0.0f;
        this.f16308e = 0.0f;
        this.f = 1.0f;
        this.f16309g = 1.0f;
        this.f16310h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.f16311k = null;
        this.f16306c = iVar.f16306c;
        this.f16307d = iVar.f16307d;
        this.f16308e = iVar.f16308e;
        this.f = iVar.f;
        this.f16309g = iVar.f16309g;
        this.f16310h = iVar.f16310h;
        this.i = iVar.i;
        String str = iVar.f16311k;
        this.f16311k = str;
        if (str != null) {
            c1554e.put(str, this);
        }
        matrix.set(iVar.j);
        ArrayList arrayList = iVar.f16305b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof i) {
                this.f16305b.add(new i((i) obj, c1554e));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    h hVar2 = new h(hVar);
                    hVar2.f16297e = 0.0f;
                    hVar2.f16298g = 1.0f;
                    hVar2.f16299h = 1.0f;
                    hVar2.i = 0.0f;
                    hVar2.j = 1.0f;
                    hVar2.f16300k = 0.0f;
                    hVar2.f16301l = Paint.Cap.BUTT;
                    hVar2.f16302m = Paint.Join.MITER;
                    hVar2.f16303n = 4.0f;
                    hVar2.f16296d = hVar.f16296d;
                    hVar2.f16297e = hVar.f16297e;
                    hVar2.f16298g = hVar.f16298g;
                    hVar2.f = hVar.f;
                    hVar2.f16314c = hVar.f16314c;
                    hVar2.f16299h = hVar.f16299h;
                    hVar2.i = hVar.i;
                    hVar2.j = hVar.j;
                    hVar2.f16300k = hVar.f16300k;
                    hVar2.f16301l = hVar.f16301l;
                    hVar2.f16302m = hVar.f16302m;
                    hVar2.f16303n = hVar.f16303n;
                    gVar = hVar2;
                } else if (obj instanceof g) {
                    gVar = new g((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f16305b.add(gVar);
                Object obj2 = gVar.f16313b;
                if (obj2 != null) {
                    c1554e.put(obj2, gVar);
                }
            }
        }
    }
}
