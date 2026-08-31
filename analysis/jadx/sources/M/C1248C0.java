package m;

import a.AbstractC0597a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import g.AbstractC1066a;
import java.lang.reflect.Method;
import l.InterfaceC1195B;

/* JADX INFO: renamed from: m.C0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1248C0 implements InterfaceC1195B {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final Method f14619Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final Method f14620R;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f14621A;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public C1345z0 f14624D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public View f14625E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public AdapterView.OnItemClickListener f14626F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f14627G;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Handler f14632L;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Rect f14634N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f14635O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final C1342y f14636P;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Context f14637q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ListAdapter f14638r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1325p0 f14639s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14642v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14643w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f14645y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14646z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f14640t = -2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14641u = -2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f14644x = 1002;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f14622B = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f14623C = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final RunnableC1343y0 f14628H = new RunnableC1343y0(this, 1);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final ViewOnTouchListenerC1246B0 f14629I = new ViewOnTouchListenerC1246B0(this);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C1244A0 f14630J = new C1244A0(this);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final RunnableC1343y0 f14631K = new RunnableC1343y0(this, 0);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Rect f14633M = new Rect();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f14619Q = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f14620R = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1248C0(Context context, AttributeSet attributeSet, int i, int i7) {
        int resourceId;
        this.f14637q = context;
        this.f14632L = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1066a.f12797o, i, 0);
        this.f14642v = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f14643w = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f14645y = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C1342y c1342y = new C1342y(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1066a.f12801s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            c1342y.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c1342y.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC0597a.C(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f14636P = c1342y;
        c1342y.setInputMethodMode(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1195B
    public final boolean a() {
        return this.f14636P.isShowing();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b() {
        return this.f14642v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1195B
    public final void c() {
        int i;
        int paddingBottom;
        C1325p0 c1325p0;
        C1325p0 c1325p02 = this.f14639s;
        Context context = this.f14637q;
        C1342y c1342y = this.f14636P;
        if (c1325p02 == null) {
            C1325p0 c1325p0Q = q(context, !this.f14635O);
            this.f14639s = c1325p0Q;
            c1325p0Q.setAdapter(this.f14638r);
            this.f14639s.setOnItemClickListener(this.f14626F);
            this.f14639s.setFocusable(true);
            this.f14639s.setFocusableInTouchMode(true);
            this.f14639s.setOnItemSelectedListener(new C1337v0(this));
            this.f14639s.setOnScrollListener(this.f14630J);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f14627G;
            if (onItemSelectedListener != null) {
                this.f14639s.setOnItemSelectedListener(onItemSelectedListener);
            }
            c1342y.setContentView(this.f14639s);
        }
        Drawable background = c1342y.getBackground();
        Rect rect = this.f14633M;
        if (background != null) {
            background.getPadding(rect);
            int i7 = rect.top;
            i = rect.bottom + i7;
            if (!this.f14645y) {
                this.f14643w = -i7;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = AbstractC1339w0.a(c1342y, this.f14625E, this.f14643w, c1342y.getInputMethodMode() == 2);
        int i8 = this.f14640t;
        if (i8 == -1) {
            paddingBottom = iA + i;
        } else {
            int i9 = this.f14641u;
            int iA2 = this.f14639s.a(i9 != -2 ? i9 != -1 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f14639s.getPaddingBottom() + this.f14639s.getPaddingTop() + i : 0);
        }
        boolean z5 = this.f14636P.getInputMethodMode() == 2;
        c1342y.setWindowLayoutType(this.f14644x);
        if (c1342y.isShowing()) {
            if (this.f14625E.isAttachedToWindow()) {
                int width = this.f14641u;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f14625E.getWidth();
                }
                if (i8 == -1) {
                    i8 = z5 ? paddingBottom : -1;
                    if (z5) {
                        c1342y.setWidth(this.f14641u == -1 ? -1 : 0);
                        c1342y.setHeight(0);
                    } else {
                        c1342y.setWidth(this.f14641u == -1 ? -1 : 0);
                        c1342y.setHeight(-1);
                    }
                } else if (i8 == -2) {
                    i8 = paddingBottom;
                }
                c1342y.setOutsideTouchable(true);
                int i10 = width;
                View view = this.f14625E;
                int i11 = this.f14642v;
                int i12 = this.f14643w;
                int i13 = i10 < 0 ? -1 : i10;
                if (i8 < 0) {
                    i8 = -1;
                }
                c1342y.update(view, i11, i12, i13, i8);
                return;
            }
            return;
        }
        int width2 = this.f14641u;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f14625E.getWidth();
        }
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = paddingBottom;
        }
        c1342y.setWidth(width2);
        c1342y.setHeight(i8);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f14619Q;
            if (method != null) {
                try {
                    method.invoke(c1342y, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC1341x0.b(c1342y, true);
        }
        c1342y.setOutsideTouchable(true);
        c1342y.setTouchInterceptor(this.f14629I);
        if (this.f14621A) {
            c1342y.setOverlapAnchor(this.f14646z);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f14620R;
            if (method2 != null) {
                try {
                    method2.invoke(c1342y, this.f14634N);
                } catch (Exception e7) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e7);
                }
            }
        } else {
            AbstractC1341x0.a(c1342y, this.f14634N);
        }
        c1342y.showAsDropDown(this.f14625E, this.f14642v, this.f14643w, this.f14622B);
        this.f14639s.setSelection(-1);
        if ((!this.f14635O || this.f14639s.isInTouchMode()) && (c1325p0 = this.f14639s) != null) {
            c1325p0.setListSelectionHidden(true);
            c1325p0.requestLayout();
        }
        if (this.f14635O) {
            return;
        }
        this.f14632L.post(this.f14631K);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Drawable d() {
        return this.f14636P.getBackground();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1195B
    public final void dismiss() {
        C1342y c1342y = this.f14636P;
        c1342y.dismiss();
        c1342y.setContentView(null);
        this.f14639s = null;
        this.f14632L.removeCallbacks(this.f14628H);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1195B
    public final C1325p0 e() {
        return this.f14639s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(Drawable drawable) {
        this.f14636P.setBackgroundDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(int i) {
        this.f14643w = i;
        this.f14645y = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(int i) {
        this.f14642v = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int m() {
        if (this.f14645y) {
            return this.f14643w;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void p(ListAdapter listAdapter) {
        C1345z0 c1345z0 = this.f14624D;
        if (c1345z0 == null) {
            this.f14624D = new C1345z0(this);
        } else {
            ListAdapter listAdapter2 = this.f14638r;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c1345z0);
            }
        }
        this.f14638r = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f14624D);
        }
        C1325p0 c1325p0 = this.f14639s;
        if (c1325p0 != null) {
            c1325p0.setAdapter(this.f14638r);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1325p0 q(Context context, boolean z5) {
        return new C1325p0(context, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r(int i) {
        Drawable background = this.f14636P.getBackground();
        if (background == null) {
            this.f14641u = i;
            return;
        }
        Rect rect = this.f14633M;
        background.getPadding(rect);
        this.f14641u = rect.left + rect.right + i;
    }
}
