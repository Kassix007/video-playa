package w1;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.wnapp.smspariaz.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: w1.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1834J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f18145d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f18146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SparseArray f18147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f18148c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f18146a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewA = a(viewGroup.getChildAt(childCount));
                if (viewA != null) {
                    return viewA;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
