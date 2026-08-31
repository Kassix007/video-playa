package t1;

import R4.U;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.web2native.MainActivity;
import i1.d;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: t1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1615b extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f16673b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1615b(MainActivity mainActivity) {
        super(mainActivity);
        this.f16673b = new d(this, mainActivity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // R4.U
    public final void a() {
        MainActivity mainActivity = this.f6862a;
        Resources.Theme theme = mainActivity.getTheme();
        m.d(theme, "activity.theme");
        b(theme, new TypedValue());
        ((ViewGroup) mainActivity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f16673b);
    }
}
