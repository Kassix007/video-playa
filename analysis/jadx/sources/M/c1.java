package m;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.wnapp.smspariaz.R;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f14769e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f14770g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c1() {
        this.f14765a = new AtomicBoolean();
        this.f14766b = null;
        this.f14767c = new HashMap(16, 1.0f);
        this.f14768d = new HashMap(16, 1.0f);
        this.f14769e = new HashMap(16, 1.0f);
        this.f = new HashMap(16, 1.0f);
        this.f14770g = null;
    }

    public c1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f14768d = layoutParams;
        this.f14769e = new Rect();
        this.f = new int[2];
        this.f14770g = new int[2];
        this.f14765a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f14766b = viewInflate;
        this.f14767c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(c1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
