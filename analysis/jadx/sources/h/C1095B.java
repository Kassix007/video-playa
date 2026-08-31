package h;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import m.C1243A;
import m.C1292Z;
import m.C1320n;
import m.C1322o;
import m.C1324p;
import r.Q;

/* JADX INFO: renamed from: h.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1095B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class[] f13197b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f13198c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f13199d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f13200e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f13201g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Q f13202h = new Q(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f13203a = new Object[2];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1320n a(Context context, AttributeSet attributeSet) {
        return new C1320n(context, attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1322o b(Context context, AttributeSet attributeSet) {
        return new C1322o(context, attributeSet, com.wnapp.smspariaz.R.attr.buttonStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1324p c(Context context, AttributeSet attributeSet) {
        return new C1324p(context, attributeSet, com.wnapp.smspariaz.R.attr.checkboxStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1243A d(Context context, AttributeSet attributeSet) {
        return new C1243A(context, attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1292Z e(Context context, AttributeSet attributeSet) {
        return new C1292Z(context, attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View f(Context context, String str, String str2) {
        String strConcat;
        Q q7 = f13202h;
        Constructor constructor = (Constructor) q7.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f13197b);
            q7.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f13203a);
    }
}
