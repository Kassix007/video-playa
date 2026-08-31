package W1;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.P1;
import h3.C1122a;
import j0.AbstractC1145B;
import j0.AbstractC1151f;
import java.util.Arrays;
import m5.C1371j;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f8046d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(C1122a c1122a, C1122a c1122a2, C1122a c1122a3, int i) {
        this.f8044b = c1122a;
        this.f8045c = c1122a2;
        this.f8046d = c1122a3;
        this.f8043a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int a() {
        Paint.Cap strokeCap = ((Paint) this.f8044b).getStrokeCap();
        int i = strokeCap == null ? -1 : AbstractC1151f.f13705a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int b() {
        Paint.Join strokeJoin = ((Paint) this.f8044b).getStrokeJoin();
        int i = strokeJoin == null ? -1 : AbstractC1151f.f13706b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(float f) {
        ((Paint) this.f8044b).setAlpha((int) Math.rint(f * 255.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(int i) {
        if (this.f8043a == i) {
            return;
        }
        this.f8043a = i;
        Paint paint = (Paint) this.f8044b;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(AbstractC1145B.s(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(AbstractC1145B.x(i)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(long j) {
        ((Paint) this.f8044b).setColor(AbstractC1145B.v(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void f(j0.j jVar) {
        this.f8046d = jVar;
        ((Paint) this.f8044b).setColorFilter(jVar != null ? jVar.f13711a : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g(Shader shader) {
        this.f8045c = shader;
        ((Paint) this.f8044b).setShader(shader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void h(int i) {
        ((Paint) this.f8044b).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void i(int i) {
        ((Paint) this.f8044b).setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void j(int i) {
        ((Paint) this.f8044b).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public d(T1.d dVar, int i) {
        this.f8044b = dVar.f7358v;
        this.f8043a = i;
        c cVar = dVar.f7360x;
        this.f8045c = cVar.a();
        Bundle bundleG = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
        this.f8046d = bundleG;
        cVar.f8039h.A(bundleG);
    }

    public d(Paint paint) {
        this.f8044b = paint;
        this.f8043a = 3;
    }

    public d(Bundle state) {
        kotlin.jvm.internal.m.e(state, "state");
        String string = state.getString("nav-entry-state:id");
        if (string != null) {
            this.f8044b = string;
            int i = state.getInt("nav-entry-state:destination-id", Integer.MIN_VALUE);
            if (i == Integer.MIN_VALUE && state.getInt("nav-entry-state:destination-id", Integer.MAX_VALUE) == Integer.MAX_VALUE) {
                K1.x("nav-entry-state:destination-id");
                throw null;
            }
            this.f8043a = i;
            this.f8045c = I1.k0("nav-entry-state:args", state);
            this.f8046d = I1.k0("nav-entry-state:saved-state", state);
            return;
        }
        K1.x("nav-entry-state:id");
        throw null;
    }
}
