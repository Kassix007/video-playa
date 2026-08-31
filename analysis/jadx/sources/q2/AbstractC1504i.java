package q2;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: renamed from: q2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1504i {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T, V> ObjectAnimator a(T t6, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t6, property, (TypeConverter) null, path);
    }
}
