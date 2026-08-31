package C0;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import i0.C1129a;
import j0.AbstractC1145B;
import j0.C1147b;
import j0.InterfaceC1144A;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import m0.C1348c;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends View implements B0.s0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final c1 f1004F = new c1(0);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Method f1005G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static Field f1006H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static boolean f1007I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static boolean f1008J;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final H0 f1009A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f1010B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f1011C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final long f1012D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f1013E;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final A f1014q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0115z0 f1015r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public B5.e f1016s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public B5.a f1017t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final M0 f1018u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1019v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Rect f1020w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1021x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1022y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j0.n f1023z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d1(A a7, C0115z0 c0115z0, B5.e eVar, B5.a aVar) {
        super(a7.getContext());
        this.f1014q = a7;
        this.f1015r = c0115z0;
        this.f1016s = eVar;
        this.f1017t = aVar;
        this.f1018u = new M0();
        this.f1023z = new j0.n();
        this.f1009A = new H0(K.f884u);
        this.f1010B = j0.H.f13693b;
        this.f1011C = true;
        setWillNotDraw(false);
        c0115z0.addView(this);
        this.f1012D = View.generateViewId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final InterfaceC1144A getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        M0 m02 = this.f1018u;
        if (!m02.f897g) {
            return null;
        }
        m02.e();
        return m02.f896e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setInvalidated(boolean z5) {
        if (z5 != this.f1021x) {
            this.f1021x = z5;
            this.f1014q.B(this, z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void a(long j) {
        int i = (int) (j >> 32);
        int i7 = (int) (j & 4294967295L);
        if (i == getWidth() && i7 == getHeight()) {
            return;
        }
        setPivotX(j0.H.b(this.f1010B) * i);
        setPivotY(j0.H.c(this.f1010B) * i7);
        setOutlineProvider(this.f1018u.b() != null ? f1004F : null);
        layout(getLeft(), getTop(), getLeft() + i, getTop() + i7);
        j();
        this.f1009A.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void b(C1129a c1129a, boolean z5) {
        H0 h02 = this.f1009A;
        if (!z5) {
            float[] fArrB = h02.b(this);
            if (h02.f834d) {
                return;
            }
            AbstractC1145B.p(fArrB, c1129a);
            return;
        }
        float[] fArr = (float[]) h02.f837h;
        if (h02.f832b) {
            h02.f833c = W.i(h02.b(this), fArr);
            h02.f832b = false;
        }
        if (!h02.f833c) {
            fArr = null;
        }
        if (fArr != null) {
            if (h02.f834d) {
                return;
            }
            AbstractC1145B.p(fArr, c1129a);
        } else {
            c1129a.f13516b = 0.0f;
            c1129a.f13517c = 0.0f;
            c1129a.f13518d = 0.0f;
            c1129a.f13519e = 0.0f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void c(j0.C c7) {
        B5.a aVar;
        int i = c7.f13667q | this.f1013E;
        if ((i & 4096) != 0) {
            long j = c7.f13675y;
            this.f1010B = j;
            setPivotX(j0.H.b(j) * getWidth());
            setPivotY(j0.H.c(this.f1010B) * getHeight());
        }
        if ((i & 1) != 0) {
            setScaleX(c7.f13668r);
        }
        if ((i & 2) != 0) {
            setScaleY(c7.f13669s);
        }
        if ((i & 4) != 0) {
            setAlpha(c7.f13670t);
        }
        if ((i & 8) != 0) {
            setTranslationX(0.0f);
        }
        if ((i & 16) != 0) {
            setTranslationY(0.0f);
        }
        if ((i & 32) != 0) {
            setElevation(c7.f13671u);
        }
        if ((i & 1024) != 0) {
            setRotation(0.0f);
        }
        if ((i & 256) != 0) {
            setRotationX(0.0f);
        }
        if ((i & 512) != 0) {
            setRotationY(0.0f);
        }
        if ((i & 2048) != 0) {
            setCameraDistancePx(c7.f13674x);
        }
        boolean z5 = getManualClipPath() != null;
        boolean z6 = c7.f13662A;
        O3.D d5 = AbstractC1145B.f13658a;
        boolean z7 = z6 && c7.f13676z != d5;
        if ((i & 24576) != 0) {
            this.f1019v = z6 && c7.f13676z == d5;
            j();
            setClipToOutline(z7);
        }
        boolean zD = this.f1018u.d(c7.f13666E, c7.f13670t, z7, c7.f13671u, c7.f13663B);
        M0 m02 = this.f1018u;
        if (m02.f) {
            setOutlineProvider(m02.b() != null ? f1004F : null);
        }
        boolean z8 = getManualClipPath() != null;
        if (z5 != z8 || (z8 && zD)) {
            invalidate();
        }
        if (!this.f1022y && getElevation() > 0.0f && (aVar = this.f1017t) != null) {
            aVar.invoke();
        }
        if ((i & 7963) != 0) {
            this.f1009A.d();
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            if ((i & 64) != 0) {
                setOutlineAmbientShadowColor(AbstractC1145B.v(c7.f13672v));
            }
            if ((i & 128) != 0) {
                setOutlineSpotShadowColor(AbstractC1145B.v(c7.f13673w));
            }
        }
        if (i7 >= 31 && (131072 & i) != 0) {
            setRenderEffect(null);
        }
        if ((i & 32768) != 0) {
            setLayerType(0, null);
            this.f1011C = true;
        }
        this.f1013E = c7.f13667q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void d(long j) {
        int i = (int) (j >> 32);
        int left = getLeft();
        H0 h02 = this.f1009A;
        if (i != left) {
            offsetLeftAndRight(i - getLeft());
            h02.d();
        }
        int i7 = (int) (j & 4294967295L);
        if (i7 != getTop()) {
            offsetTopAndBottom(i7 - getTop());
            h02.d();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void destroy() {
        setInvalidated(false);
        A a7 = this.f1014q;
        a7.f739T = true;
        this.f1016s = null;
        this.f1017t = null;
        a7.K(this);
        this.f1015r.removeViewInLayout(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z5;
        j0.n nVar = this.f1023z;
        C1147b c1147b = nVar.f13717a;
        Canvas canvas2 = c1147b.f13696a;
        c1147b.f13696a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z5 = false;
        } else {
            c1147b.k();
            this.f1018u.a(c1147b);
            z5 = true;
        }
        B5.e eVar = this.f1016s;
        if (eVar != null) {
            eVar.invoke(c1147b, null);
        }
        if (z5) {
            c1147b.i();
        }
        nVar.f13717a.f13696a = canvas2;
        setInvalidated(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void e() {
        if (!this.f1021x || f1008J) {
            return;
        }
        W.s(this);
        setInvalidated(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final long f(boolean z5, long j) {
        H0 h02 = this.f1009A;
        if (z5) {
            float[] fArr = (float[]) h02.f837h;
            if (h02.f832b) {
                h02.f833c = W.i(h02.b(this), fArr);
                h02.f832b = false;
            }
            if (!h02.f833c) {
                fArr = null;
            }
            if (fArr == null) {
                return 9187343241974906880L;
            }
            if (!h02.f834d) {
                return AbstractC1145B.o(fArr, j);
            }
        } else {
            float[] fArrB = h02.b(this);
            if (!h02.f834d) {
                return AbstractC1145B.o(fArrB, j);
            }
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void g(j0.m mVar, C1348c c1348c) {
        boolean z5 = getElevation() > 0.0f;
        this.f1022y = z5;
        if (z5) {
            mVar.p();
        }
        this.f1015r.a(mVar, this, getDrawingTime());
        if (this.f1022y) {
            mVar.n();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0115z0 getContainer() {
        return this.f1015r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getLayerId() {
        return this.f1012D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final A getOwnerView() {
        return this.f1014q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f1014q.getUniqueDrawingId();
        }
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo0getUnderlyingMatrixsQKQjiQ() {
        return this.f1009A.b(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final boolean h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        if (this.f1019v) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f1018u.c(j);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f1011C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void i(B5.e eVar, B5.a aVar) {
        this.f1015r.addView(this);
        H0 h02 = this.f1009A;
        h02.f831a = false;
        h02.f832b = false;
        h02.f834d = true;
        h02.f833c = true;
        AbstractC1145B.q((float[]) h02.f836g);
        AbstractC1145B.q((float[]) h02.f837h);
        this.f1019v = false;
        this.f1022y = false;
        this.f1010B = j0.H.f13693b;
        this.f1016s = eVar;
        this.f1017t = aVar;
        setInvalidated(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View, B0.s0
    public final void invalidate() {
        if (this.f1021x) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f1014q.invalidate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        Rect rect;
        if (this.f1019v) {
            Rect rect2 = this.f1020w;
            if (rect2 == null) {
                this.f1020w = new Rect(0, 0, getWidth(), getHeight());
            } else {
                kotlin.jvm.internal.m.b(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f1020w;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
    }
}
