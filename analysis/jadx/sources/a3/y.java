package a3;

import C0.S;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import android.widget.ImageView;
import b3.C0698a;
import f3.C1063a;
import h3.C1125d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class y extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final boolean f8883i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final List f8884j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final ThreadPoolExecutor f8885k0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f8886A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final k3.d f8887B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f8888C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f8889D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public j3.c f8890E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f8891F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f8892G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f8893H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f8894I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f8895J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f8896K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public I f8897L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f8898M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final Matrix f8899N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Bitmap f8900O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public Canvas f8901P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Rect f8902Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public RectF f8903R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0698a f8904S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Rect f8905T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Rect f8906U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public RectF f8907V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public RectF f8908W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Matrix f8909X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final float[] f8910Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Matrix f8911Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f8912a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public EnumC0622a f8913b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final Semaphore f8914c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Handler f8915d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public u f8916e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final u f8917f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f8918g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f8919h0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0632k f8920q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n3.e f8921r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f8922s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8923t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8924u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f8925v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C1063a f8926w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f8927x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public L0.l f8928y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Map f8929z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        f8883i0 = Build.VERSION.SDK_INT <= 25;
        f8884j0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f8885k0 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new n3.d());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y() {
        n3.e eVar = new n3.e();
        this.f8921r = eVar;
        this.f8922s = true;
        this.f8923t = false;
        this.f8924u = false;
        this.f8919h0 = 1;
        this.f8925v = new ArrayList();
        this.f8887B = new k3.d(20);
        this.f8888C = false;
        this.f8889D = true;
        this.f8891F = 255;
        this.f8896K = false;
        this.f8897L = I.f8805q;
        this.f8898M = false;
        this.f8899N = new Matrix();
        this.f8910Y = new float[9];
        this.f8912a0 = false;
        w wVar = new w(0, this);
        this.f8914c0 = new Semaphore(1);
        this.f8917f0 = new u(this, 1);
        this.f8918g0 = -3.4028235E38f;
        eVar.addUpdateListener(wVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(final g3.e eVar, final Object obj, final Z.m mVar) {
        j3.c cVar = this.f8890E;
        if (cVar == null) {
            this.f8925v.add(new x() { // from class: a3.r
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // a3.x
                public final void run() {
                    this.f8867a.a(eVar, obj, mVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (eVar == g3.e.f13060c) {
            cVar.f(mVar, obj);
        } else {
            g3.f fVar = eVar.f13062b;
            if (fVar != null) {
                fVar.f(mVar, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f8890E.h(eVar, 0, arrayList, new g3.e(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((g3.e) arrayList.get(i)).f13062b.f(mVar, obj);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == C.f8792z) {
                u(this.f8921r.a());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(Context context) {
        if (this.f8923t) {
            return true;
        }
        if (!this.f8922s) {
            return false;
        }
        if (context == null) {
            return true;
        }
        Matrix matrix = n3.i.f15199a;
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        C0632k c0632k = this.f8920q;
        if (c0632k == null) {
            return;
        }
        Z.m mVar = l3.q.f14483a;
        Rect rect = c0632k.f8840k;
        List list = Collections.EMPTY_LIST;
        j3.c cVar = new j3.c(this, new j3.e(list, c0632k, "__container", -1L, 1, -1L, null, list, new C1125d(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), c0632k.j, c0632k);
        this.f8890E = cVar;
        if (this.f8893H) {
            cVar.q(true);
        }
        this.f8890E.f13778L = this.f8889D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        n3.e eVar = this.f8921r;
        if (eVar.f15160C) {
            eVar.cancel();
            if (!isVisible()) {
                this.f8919h0 = 1;
            }
        }
        this.f8920q = null;
        this.f8890E = null;
        this.f8926w = null;
        this.f8918g0 = -3.4028235E38f;
        eVar.f15159B = null;
        eVar.f15171z = -2.14748365E9f;
        eVar.f15158A = 2.14748365E9f;
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        j3.c cVar = this.f8890E;
        if (cVar == null) {
            return;
        }
        EnumC0622a enumC0622a = this.f8913b0;
        if (enumC0622a == null) {
            enumC0622a = EnumC0622a.f8809q;
        }
        boolean z5 = enumC0622a == EnumC0622a.f8810r;
        u uVar = this.f8917f0;
        ThreadPoolExecutor threadPoolExecutor = f8885k0;
        n3.e eVar = this.f8921r;
        Semaphore semaphore = this.f8914c0;
        if (z5) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z5) {
                    return;
                }
                semaphore.release();
                if (cVar.f13777K == eVar.a()) {
                    return;
                }
            } catch (Throwable th) {
                if (z5) {
                    semaphore.release();
                    if (cVar.f13777K != eVar.a()) {
                        threadPoolExecutor.execute(uVar);
                    }
                }
                throw th;
            }
        }
        if (z5 && v()) {
            u(eVar.a());
        }
        if (this.f8924u) {
            try {
                if (this.f8898M) {
                    l(canvas, cVar);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                n3.c.f15153a.getClass();
            }
        } else if (this.f8898M) {
            l(canvas, cVar);
        } else {
            g(canvas);
        }
        this.f8912a0 = false;
        if (z5) {
            semaphore.release();
            if (cVar.f13777K == eVar.a()) {
                return;
            }
            threadPoolExecutor.execute(uVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        C0632k c0632k = this.f8920q;
        if (c0632k == null) {
            return;
        }
        I i = this.f8897L;
        int i7 = Build.VERSION.SDK_INT;
        boolean z5 = c0632k.f8844o;
        int i8 = c0632k.f8845p;
        int iOrdinal = i.ordinal();
        boolean z6 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z5 && i7 < 28) || i8 > 4 || i7 <= 25))) {
            z6 = true;
        }
        this.f8898M = z6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(Canvas canvas) {
        j3.c cVar = this.f8890E;
        C0632k c0632k = this.f8920q;
        if (cVar == null || c0632k == null) {
            return;
        }
        Matrix matrix = this.f8899N;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preTranslate(r3.left, r3.top);
            matrix.preScale(r3.width() / c0632k.f8840k.width(), r3.height() / c0632k.f8840k.height());
        }
        cVar.g(canvas, matrix, this.f8891F, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f8891F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C0632k c0632k = this.f8920q;
        if (c0632k == null) {
            return -1;
        }
        return c0632k.f8840k.height();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C0632k c0632k = this.f8920q;
        if (c0632k == null) {
            return -1;
        }
        return c0632k.f8840k.width();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Context h() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final L0.l i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f8928y == null) {
            Drawable.Callback callback = getCallback();
            L0.l lVar = new L0.l();
            lVar.f3125b = new K5.g();
            lVar.f3126c = new HashMap();
            lVar.f3127d = new HashMap();
            lVar.f3124a = ".ttf";
            if (callback instanceof View) {
                lVar.f3128e = ((View) callback).getContext().getAssets();
            } else {
                n3.c.b("LottieDrawable must be inside of a view for images to work.");
                lVar.f3128e = null;
            }
            this.f8928y = lVar;
            String str = this.f8886A;
            if (str != null) {
                lVar.f3124a = str;
            }
        }
        return this.f8928y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f8912a0) {
            return;
        }
        this.f8912a0 = true;
        if ((!f8883i0 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        n3.e eVar = this.f8921r;
        if (eVar == null) {
            return false;
        }
        return eVar.f15160C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        this.f8925v.clear();
        n3.e eVar = this.f8921r;
        eVar.g(true);
        Iterator it = eVar.f15164s.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(eVar);
        }
        if (isVisible()) {
            return;
        }
        this.f8919h0 = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k() {
        if (this.f8890E == null) {
            this.f8925v.add(new v(this, 1));
            return;
        }
        e();
        boolean zB = b(h());
        n3.e eVar = this.f8921r;
        if (zB || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.f15160C = true;
                boolean zD = eVar.d();
                for (Animator.AnimatorListener animatorListener : eVar.f15163r) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(eVar, zD);
                    } else {
                        animatorListener.onAnimationStart(eVar);
                    }
                }
                eVar.h((int) (eVar.d() ? eVar.b() : eVar.c()));
                eVar.f15167v = 0L;
                eVar.f15170y = 0;
                if (eVar.f15160C) {
                    eVar.g(false);
                    Choreographer.getInstance().postFrameCallback(eVar);
                }
                this.f8919h0 = 1;
            } else {
                this.f8919h0 = 2;
            }
        }
        if (b(h())) {
            return;
        }
        Iterator it = f8884j0.iterator();
        g3.h hVarD = null;
        while (it.hasNext()) {
            hVarD = this.f8920q.d((String) it.next());
            if (hVarD != null) {
                break;
            }
        }
        if (hVarD != null) {
            o((int) hVarD.f13066b);
        } else {
            o((int) (eVar.f15165t < 0.0f ? eVar.c() : eVar.b()));
        }
        eVar.g(true);
        eVar.e(eVar.d());
        if (isVisible()) {
            return;
        }
        this.f8919h0 = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.graphics.Canvas r11, j3.c r12) {
        /*
            r10 = this;
            a3.k r0 = r10.f8920q
            if (r0 == 0) goto L1c9
            if (r12 != 0) goto L8
            goto L1c9
        L8:
            android.graphics.Canvas r0 = r10.f8901P
            if (r0 == 0) goto Ld
            goto L53
        Ld:
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>()
            r10.f8901P = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r10.f8908W = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r10.f8909X = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r10.f8911Z = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f8902Q = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r10.f8903R = r0
            b3.a r0 = new b3.a
            r0.<init>()
            r10.f8904S = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f8905T = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f8906U = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r10.f8907V = r0
        L53:
            android.graphics.Matrix r0 = r10.f8909X
            r11.getMatrix(r0)
            android.graphics.Rect r0 = r10.f8902Q
            r11.getClipBounds(r0)
            android.graphics.Rect r0 = r10.f8902Q
            android.graphics.RectF r1 = r10.f8903R
            int r2 = r0.left
            float r2 = (float) r2
            int r3 = r0.top
            float r3 = (float) r3
            int r4 = r0.right
            float r4 = (float) r4
            int r0 = r0.bottom
            float r0 = (float) r0
            r1.set(r2, r3, r4, r0)
            android.graphics.Matrix r0 = r10.f8909X
            android.graphics.RectF r1 = r10.f8903R
            r0.mapRect(r1)
            android.graphics.RectF r0 = r10.f8903R
            android.graphics.Rect r1 = r10.f8902Q
            f(r1, r0)
            boolean r0 = r10.f8889D
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L95
            android.graphics.RectF r0 = r10.f8908W
            int r3 = r10.getIntrinsicWidth()
            float r3 = (float) r3
            int r4 = r10.getIntrinsicHeight()
            float r4 = (float) r4
            r5 = 0
            r0.set(r5, r5, r3, r4)
            goto L9a
        L95:
            android.graphics.RectF r0 = r10.f8908W
            r12.a(r0, r1, r2)
        L9a:
            android.graphics.Matrix r0 = r10.f8909X
            android.graphics.RectF r3 = r10.f8908W
            r0.mapRect(r3)
            android.graphics.Rect r0 = r10.getBounds()
            int r3 = r0.width()
            float r3 = (float) r3
            int r4 = r10.getIntrinsicWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            int r0 = r0.height()
            float r0 = (float) r0
            int r4 = r10.getIntrinsicHeight()
            float r4 = (float) r4
            float r0 = r0 / r4
            android.graphics.RectF r4 = r10.f8908W
            float r5 = r4.left
            float r5 = r5 * r3
            float r6 = r4.top
            float r6 = r6 * r0
            float r7 = r4.right
            float r7 = r7 * r3
            float r8 = r4.bottom
            float r8 = r8 * r0
            r4.set(r5, r6, r7, r8)
            android.graphics.drawable.Drawable$Callback r4 = r10.getCallback()
            boolean r5 = r4 instanceof android.view.View
            r6 = 1
            if (r5 != 0) goto Ld7
        Ld5:
            r4 = r2
            goto Le8
        Ld7:
            android.view.View r4 = (android.view.View) r4
            android.view.ViewParent r4 = r4.getParent()
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto Ld5
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            boolean r4 = r4.getClipChildren()
            r4 = r4 ^ r6
        Le8:
            if (r4 != 0) goto Lfd
            android.graphics.RectF r4 = r10.f8908W
            android.graphics.Rect r5 = r10.f8902Q
            int r7 = r5.left
            float r7 = (float) r7
            int r8 = r5.top
            float r8 = (float) r8
            int r9 = r5.right
            float r9 = (float) r9
            int r5 = r5.bottom
            float r5 = (float) r5
            r4.intersect(r7, r8, r9, r5)
        Lfd:
            android.graphics.RectF r4 = r10.f8908W
            float r4 = r4.width()
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            android.graphics.RectF r5 = r10.f8908W
            float r5 = r5.height()
            double r7 = (double) r5
            double r7 = java.lang.Math.ceil(r7)
            int r5 = (int) r7
            if (r4 <= 0) goto L1c9
            if (r5 > 0) goto L11b
            goto L1c9
        L11b:
            android.graphics.Bitmap r7 = r10.f8900O
            if (r7 == 0) goto L14e
            int r7 = r7.getWidth()
            if (r7 < r4) goto L14e
            android.graphics.Bitmap r7 = r10.f8900O
            int r7 = r7.getHeight()
            if (r7 >= r5) goto L12e
            goto L14e
        L12e:
            android.graphics.Bitmap r7 = r10.f8900O
            int r7 = r7.getWidth()
            if (r7 > r4) goto L13e
            android.graphics.Bitmap r7 = r10.f8900O
            int r7 = r7.getHeight()
            if (r7 <= r5) goto L15d
        L13e:
            android.graphics.Bitmap r7 = r10.f8900O
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r7, r2, r2, r4, r5)
            r10.f8900O = r7
            android.graphics.Canvas r8 = r10.f8901P
            r8.setBitmap(r7)
            r10.f8912a0 = r6
            goto L15d
        L14e:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r4, r5, r7)
            r10.f8900O = r7
            android.graphics.Canvas r8 = r10.f8901P
            r8.setBitmap(r7)
            r10.f8912a0 = r6
        L15d:
            boolean r6 = r10.f8912a0
            if (r6 == 0) goto L1b9
            android.graphics.Matrix r6 = r10.f8909X
            float[] r7 = r10.f8910Y
            r6.getValues(r7)
            r6 = r7[r2]
            r8 = 4
            r7 = r7[r8]
            android.graphics.Matrix r8 = r10.f8909X
            android.graphics.Matrix r9 = r10.f8899N
            r9.set(r8)
            r9.preScale(r3, r0)
            android.graphics.RectF r0 = r10.f8908W
            float r3 = r0.left
            float r3 = -r3
            float r0 = r0.top
            float r0 = -r0
            r9.postTranslate(r3, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = r0 / r6
            float r0 = r0 / r7
            r9.postScale(r3, r0)
            android.graphics.Bitmap r0 = r10.f8900O
            r0.eraseColor(r2)
            android.graphics.Canvas r0 = r10.f8901P
            android.graphics.Matrix r3 = n3.i.f15199a
            r0.setMatrix(r3)
            android.graphics.Canvas r0 = r10.f8901P
            r0.scale(r6, r7)
            android.graphics.Canvas r0 = r10.f8901P
            int r3 = r10.f8891F
            r12.g(r0, r9, r3, r1)
            android.graphics.Matrix r12 = r10.f8909X
            android.graphics.Matrix r0 = r10.f8911Z
            r12.invert(r0)
            android.graphics.Matrix r12 = r10.f8911Z
            android.graphics.RectF r0 = r10.f8907V
            android.graphics.RectF r1 = r10.f8908W
            r12.mapRect(r0, r1)
            android.graphics.RectF r12 = r10.f8907V
            android.graphics.Rect r0 = r10.f8906U
            f(r0, r12)
        L1b9:
            android.graphics.Rect r12 = r10.f8905T
            r12.set(r2, r2, r4, r5)
            android.graphics.Bitmap r12 = r10.f8900O
            android.graphics.Rect r0 = r10.f8905T
            android.graphics.Rect r1 = r10.f8906U
            b3.a r2 = r10.f8904S
            r11.drawBitmap(r12, r0, r1, r2)
        L1c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.y.l(android.graphics.Canvas, j3.c):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m() {
        if (this.f8890E == null) {
            this.f8925v.add(new v(this, 0));
            return;
        }
        e();
        boolean zB = b(h());
        n3.e eVar = this.f8921r;
        if (zB || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.f15160C = true;
                eVar.g(false);
                Choreographer.getInstance().postFrameCallback(eVar);
                eVar.f15167v = 0L;
                if (eVar.d() && eVar.f15169x == eVar.c()) {
                    eVar.h(eVar.b());
                } else if (!eVar.d() && eVar.f15169x == eVar.b()) {
                    eVar.h(eVar.c());
                }
                Iterator it = eVar.f15164s.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(eVar);
                }
                this.f8919h0 = 1;
            } else {
                this.f8919h0 = 3;
            }
        }
        if (b(h())) {
            return;
        }
        o((int) (eVar.f15165t < 0.0f ? eVar.c() : eVar.b()));
        eVar.g(true);
        eVar.e(eVar.d());
        if (isVisible()) {
            return;
        }
        this.f8919h0 = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean n(C0632k c0632k) {
        if (this.f8920q == c0632k) {
            return false;
        }
        this.f8912a0 = true;
        d();
        this.f8920q = c0632k;
        c();
        n3.e eVar = this.f8921r;
        boolean z5 = eVar.f15159B == null;
        eVar.f15159B = c0632k;
        if (z5) {
            eVar.i(Math.max(eVar.f15171z, c0632k.f8841l), Math.min(eVar.f15158A, c0632k.f8842m));
        } else {
            eVar.i((int) c0632k.f8841l, (int) c0632k.f8842m);
        }
        float f = eVar.f15169x;
        eVar.f15169x = 0.0f;
        eVar.f15168w = 0.0f;
        eVar.h((int) f);
        eVar.f();
        u(eVar.getAnimatedFraction());
        ArrayList arrayList = this.f8925v;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            x xVar = (x) it.next();
            if (xVar != null) {
                xVar.run();
            }
            it.remove();
        }
        arrayList.clear();
        c0632k.f8833a.f8801a = this.f8892G;
        e();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(int i) {
        if (this.f8920q != null) {
            this.f8921r.h(i);
        } else {
            this.f8925v.add(new q(this, i, 2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p(int i) {
        if (this.f8920q == null) {
            this.f8925v.add(new q(this, i, 0));
        } else {
            n3.e eVar = this.f8921r;
            eVar.i(eVar.f15171z, i + 0.99f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q(String str) {
        C0632k c0632k = this.f8920q;
        if (c0632k == null) {
            this.f8925v.add(new p(this, str, 1));
        } else {
            g3.h hVarD = c0632k.d(str);
            if (hVarD == null) {
                throw new IllegalArgumentException(S.n("Cannot find marker with name ", str, "."));
            }
            p((int) (hVarD.f13066b + hVarD.f13067c));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r(String str) {
        C0632k c0632k = this.f8920q;
        ArrayList arrayList = this.f8925v;
        if (c0632k == null) {
            arrayList.add(new p(this, str, 0));
            return;
        }
        g3.h hVarD = c0632k.d(str);
        if (hVarD == null) {
            throw new IllegalArgumentException(S.n("Cannot find marker with name ", str, "."));
        }
        int i = (int) hVarD.f13066b;
        int i7 = ((int) hVarD.f13067c) + i;
        if (this.f8920q == null) {
            arrayList.add(new t(this, i, i7));
        } else {
            this.f8921r.i(i, i7 + 0.99f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s(int i) {
        if (this.f8920q == null) {
            this.f8925v.add(new q(this, i, 1));
        } else {
            this.f8921r.i(i, (int) r0.f15158A);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f8891F = i;
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        n3.c.b("Use addColorFilter instead.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z6) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z5, z6);
        if (z5) {
            int i = this.f8919h0;
            if (i == 2) {
                k();
                return visible;
            }
            if (i == 3) {
                m();
                return visible;
            }
        } else {
            if (this.f8921r.f15160C) {
                j();
                this.f8919h0 = 3;
                return visible;
            }
            if (zIsVisible) {
                this.f8919h0 = 1;
            }
        }
        return visible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f8925v.clear();
        n3.e eVar = this.f8921r;
        eVar.g(true);
        eVar.e(eVar.d());
        if (isVisible()) {
            return;
        }
        this.f8919h0 = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(String str) {
        C0632k c0632k = this.f8920q;
        if (c0632k == null) {
            this.f8925v.add(new p(this, str, 2));
        } else {
            g3.h hVarD = c0632k.d(str);
            if (hVarD == null) {
                throw new IllegalArgumentException(S.n("Cannot find marker with name ", str, "."));
            }
            s((int) hVarD.f13066b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u(float f) {
        C0632k c0632k = this.f8920q;
        if (c0632k == null) {
            this.f8925v.add(new s(this, f, 2));
        } else {
            this.f8921r.h(n3.g.f(c0632k.f8841l, c0632k.f8842m, f));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean v() {
        C0632k c0632k = this.f8920q;
        if (c0632k == null) {
            return false;
        }
        float f = this.f8918g0;
        float fA = this.f8921r.a();
        this.f8918g0 = fA;
        return Math.abs(fA - f) * c0632k.b() >= 50.0f;
    }
}
