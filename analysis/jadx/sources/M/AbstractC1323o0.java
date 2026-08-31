package m;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: m.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1323o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f14840a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e7) {
            e7.printStackTrace();
        }
        f14840a = declaredField;
    }
}
