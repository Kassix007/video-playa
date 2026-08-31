package i1;

import C0.S;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import h1.AbstractC1120a;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f13538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13542e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13544h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f13545k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f13546l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13547m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13548n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f13549o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e() {
        super(-2, -2);
        this.f13539b = false;
        this.f13540c = 0;
        this.f13541d = 0;
        this.f13542e = -1;
        this.f = -1;
        this.f13543g = 0;
        this.f13544h = 0;
        this.f13549o = new Rect();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(int i) {
        if (i == 0) {
            return this.f13547m;
        }
        if (i != 1) {
            return false;
        }
        return this.f13548n;
    }

    public e(Context context, AttributeSet attributeSet) {
        b bVar;
        super(context, attributeSet);
        this.f13539b = false;
        this.f13540c = 0;
        this.f13541d = 0;
        this.f13542e = -1;
        this.f = -1;
        this.f13543g = 0;
        this.f13544h = 0;
        this.f13549o = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1120a.f13441b);
        this.f13540c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f13541d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f13542e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f13543g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f13544h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f13539b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f9397J;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f9397J;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f9399L;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f9398K);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e7) {
                    throw new RuntimeException(S.w("Could not inflate Behavior subclass ", string), e7);
                }
            }
            this.f13538a = bVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        b bVar2 = this.f13538a;
        if (bVar2 != null) {
            bVar2.c(this);
        }
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f13539b = false;
        this.f13540c = 0;
        this.f13541d = 0;
        this.f13542e = -1;
        this.f = -1;
        this.f13543g = 0;
        this.f13544h = 0;
        this.f13549o = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f13539b = false;
        this.f13540c = 0;
        this.f13541d = 0;
        this.f13542e = -1;
        this.f = -1;
        this.f13543g = 0;
        this.f13544h = 0;
        this.f13549o = new Rect();
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f13539b = false;
        this.f13540c = 0;
        this.f13541d = 0;
        this.f13542e = -1;
        this.f = -1;
        this.f13543g = 0;
        this.f13544h = 0;
        this.f13549o = new Rect();
    }
}
