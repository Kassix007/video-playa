package m;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: m.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1317l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f14827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f14828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f14829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f14830d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f14827a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f14828b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f14829c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f14830d = true;
        } catch (NoSuchMethodException e7) {
            e7.printStackTrace();
        }
    }
}
