package m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.wnapp.smspariaz.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import w1.AbstractC1835K;
import w1.AbstractC1836L;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static b1 f14753A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static b1 f14754B;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f14755q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CharSequence f14756r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f14757s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a1 f14758t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a1 f14759u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14760v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14761w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c1 f14762x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f14763y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14764z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [m.a1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [m.a1] */
    public b1(View view, CharSequence charSequence) {
        final int i = 0;
        this.f14758t = new Runnable(this) { // from class: m.a1

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ b1 f14752r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f14752r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f14752r.c(false);
                        break;
                    default:
                        this.f14752r.a();
                        break;
                }
            }
        };
        final int i7 = 1;
        this.f14759u = new Runnable(this) { // from class: m.a1

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ b1 f14752r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f14752r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.f14752r.c(false);
                        break;
                    default:
                        this.f14752r.a();
                        break;
                }
            }
        };
        this.f14755q = view;
        this.f14756r = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC1836L.f18154a;
        this.f14757s = Build.VERSION.SDK_INT >= 28 ? A1.k.j(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f14764z = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(b1 b1Var) {
        b1 b1Var2 = f14753A;
        if (b1Var2 != null) {
            b1Var2.f14755q.removeCallbacks(b1Var2.f14758t);
        }
        f14753A = b1Var;
        if (b1Var != null) {
            b1Var.f14755q.postDelayed(b1Var.f14758t, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        b1 b1Var = f14754B;
        View view = this.f14755q;
        if (b1Var == this) {
            f14754B = null;
            c1 c1Var = this.f14762x;
            if (c1Var != null) {
                View view2 = (View) c1Var.f14766b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) c1Var.f14765a).getSystemService("window")).removeView(view2);
                }
                this.f14762x = null;
                this.f14764z = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f14753A == this) {
            b(null);
        }
        view.removeCallbacks(this.f14759u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(boolean z5) {
        int height;
        int i;
        int i7;
        boolean z6;
        int i8;
        int i9;
        long longPressTimeout;
        long j;
        long j7;
        View view = this.f14755q;
        if (view.isAttachedToWindow()) {
            b(null);
            b1 b1Var = f14754B;
            if (b1Var != null) {
                b1Var.a();
            }
            f14754B = this;
            this.f14763y = z5;
            c1 c1Var = new c1(view.getContext());
            View view2 = (View) c1Var.f14766b;
            Context context = (Context) c1Var.f14765a;
            this.f14762x = c1Var;
            int width = this.f14760v;
            int i10 = this.f14761w;
            boolean z7 = this.f14763y;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) c1Var.f14768d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) c1Var.f14767c).setText(this.f14756r);
            int[] iArr = (int[]) c1Var.f14770g;
            int[] iArr2 = (int[]) c1Var.f;
            Rect rect = (Rect) c1Var.f14769e;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i10 + dimensionPixelOffset2;
                i = i10 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z7 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            int i11 = width;
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i9 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i7 = i;
                    z6 = z7;
                    i8 = 0;
                    i9 = 1;
                } else {
                    Resources resources = context.getResources();
                    i9 = 1;
                    i7 = i;
                    z6 = z7;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i8 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i12 = iArr2[i8] - iArr[i8];
                iArr2[i8] = i12;
                iArr2[i9] = iArr2[i9] - iArr[i9];
                layoutParams.x = (i12 + i11) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, i8);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i13 = iArr2[i9];
                int i14 = ((i13 + i7) - dimensionPixelOffset3) - measuredHeight;
                int i15 = i13 + height + dimensionPixelOffset3;
                if (z6) {
                    if (i14 >= 0) {
                        layoutParams.y = i14;
                    } else {
                        layoutParams.y = i15;
                    }
                } else if (measuredHeight + i15 <= rect.height()) {
                    layoutParams.y = i15;
                } else {
                    layoutParams.y = i14;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f14763y) {
                j7 = 2500;
            } else {
                WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                if ((view.getWindowSystemUiVisibility() & 1) == i9) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j7 = j - longPressTimeout;
            }
            a1 a1Var = this.f14759u;
            view.removeCallbacks(a1Var);
            view.postDelayed(a1Var, j7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            m.c1 r4 = r3.f14762x
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f14763y
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.f14755q
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            goto L6f
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.f14764z = r4
            r3.a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            m.c1 r4 = r3.f14762x
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f14764z
            if (r1 != 0) goto L66
            int r1 = r3.f14760v
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f14757s
            if (r1 > r2) goto L66
            int r1 = r3.f14761w
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f14760v = r4
            r3.f14761w = r5
            r3.f14764z = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.b1.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f14760v = view.getWidth() / 2;
        this.f14761w = view.getHeight() / 2;
        c(true);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
