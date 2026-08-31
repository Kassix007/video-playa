package m;

import android.view.View;
import android.view.ViewConfiguration;
import l.InterfaceC1195B;

/* JADX INFO: renamed from: m.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1331s0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f14867q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f14868r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f14869s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f14870t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public RunnableC1329r0 f14871u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RunnableC1329r0 f14872v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14873w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14874x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f14875y = new int[2];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractViewOnTouchListenerC1331s0(View view) {
        this.f14870t = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f14867q = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f14868r = tapTimeout;
        this.f14869s = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        RunnableC1329r0 runnableC1329r0 = this.f14872v;
        View view = this.f14870t;
        if (runnableC1329r0 != null) {
            view.removeCallbacks(runnableC1329r0);
        }
        RunnableC1329r0 runnableC1329r02 = this.f14871u;
        if (runnableC1329r02 != null) {
            view.removeCallbacks(runnableC1329r02);
        }
    }

    public abstract InterfaceC1195B b();

    public abstract boolean c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean d() {
        InterfaceC1195B interfaceC1195BB = b();
        if (interfaceC1195BB == null || !interfaceC1195BB.a()) {
            return true;
        }
        interfaceC1195BB.dismiss();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            r12 = this;
            boolean r13 = r12.f14873w
            r0 = 3
            android.view.View r1 = r12.f14870t
            r2 = 0
            r3 = 1
            if (r13 == 0) goto L68
            l.B r4 = r12.b()
            if (r4 == 0) goto L5c
            boolean r5 = r4.a()
            if (r5 != 0) goto L16
            goto L5c
        L16:
            m.p0 r4 = r4.e()
            if (r4 == 0) goto L5c
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L23
            goto L5c
        L23:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r14)
            int[] r6 = r12.f14875y
            r1.getLocationOnScreen(r6)
            r1 = r6[r2]
            float r1 = (float) r1
            r7 = r6[r3]
            float r7 = (float) r7
            r5.offsetLocation(r1, r7)
            r4.getLocationOnScreen(r6)
            r1 = r6[r2]
            int r1 = -r1
            float r1 = (float) r1
            r6 = r6[r3]
            int r6 = -r6
            float r6 = (float) r6
            r5.offsetLocation(r1, r6)
            int r1 = r12.f14874x
            boolean r1 = r4.b(r5, r1)
            r5.recycle()
            int r14 = r14.getActionMasked()
            if (r14 == r3) goto L56
            if (r14 == r0) goto L56
            r14 = r3
            goto L57
        L56:
            r14 = r2
        L57:
            if (r1 == 0) goto L5c
            if (r14 == 0) goto L5c
            goto L62
        L5c:
            boolean r14 = r12.d()
            if (r14 != 0) goto L65
        L62:
            r14 = r3
            goto L113
        L65:
            r14 = r2
            goto L113
        L68:
            boolean r4 = r1.isEnabled()
            if (r4 != 0) goto L70
            goto Lfd
        L70:
            int r4 = r14.getActionMasked()
            if (r4 == 0) goto Lcf
            if (r4 == r3) goto Lcb
            r5 = 2
            if (r4 == r5) goto L7f
            if (r4 == r0) goto Lcb
            goto Lfd
        L7f:
            int r0 = r12.f14874x
            int r0 = r14.findPointerIndex(r0)
            if (r0 < 0) goto Lfd
            float r4 = r14.getX(r0)
            float r14 = r14.getY(r0)
            float r0 = r12.f14867q
            float r5 = -r0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto Lb9
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 < 0) goto Lb9
            int r5 = r1.getRight()
            int r6 = r1.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto Lb9
            int r4 = r1.getBottom()
            int r5 = r1.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r0
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 >= 0) goto Lb9
            goto Lfd
        Lb9:
            r12.a()
            android.view.ViewParent r14 = r1.getParent()
            r14.requestDisallowInterceptTouchEvent(r3)
            boolean r14 = r12.c()
            if (r14 == 0) goto Lfd
            r14 = r3
            goto Lfe
        Lcb:
            r12.a()
            goto Lfd
        Lcf:
            int r14 = r14.getPointerId(r2)
            r12.f14874x = r14
            m.r0 r14 = r12.f14871u
            if (r14 != 0) goto Le1
            m.r0 r14 = new m.r0
            r0 = 0
            r14.<init>(r12, r0)
            r12.f14871u = r14
        Le1:
            m.r0 r14 = r12.f14871u
            int r0 = r12.f14868r
            long r4 = (long) r0
            r1.postDelayed(r14, r4)
            m.r0 r14 = r12.f14872v
            if (r14 != 0) goto Lf5
            m.r0 r14 = new m.r0
            r0 = 1
            r14.<init>(r12, r0)
            r12.f14872v = r14
        Lf5:
            m.r0 r14 = r12.f14872v
            int r0 = r12.f14869s
            long r4 = (long) r0
            r1.postDelayed(r14, r4)
        Lfd:
            r14 = r2
        Lfe:
            if (r14 == 0) goto L113
            long r4 = android.os.SystemClock.uptimeMillis()
            r10 = 0
            r11 = 0
            r8 = 3
            r9 = 0
            r6 = r4
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            r1.onTouchEvent(r0)
            r0.recycle()
        L113:
            r12.f14873w = r14
            if (r14 != 0) goto L11b
            if (r13 == 0) goto L11a
            goto L11b
        L11a:
            return r2
        L11b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m.AbstractViewOnTouchListenerC1331s0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f14873w = false;
        this.f14874x = -1;
        RunnableC1329r0 runnableC1329r0 = this.f14871u;
        if (runnableC1329r0 != null) {
            this.f14870t.removeCallbacks(runnableC1329r0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
