package P0;

import C0.A;
import L0.C0192d;
import L0.E;
import android.graphics.Matrix;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import java.util.ArrayList;
import m5.AbstractC1362a;
import m5.EnumC1370i;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f5601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5602b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(View view) {
        this.f5601a = view;
        this.f5602b = AbstractC1362a.c(EnumC1370i.f15078r, new A0.d(12, this));
    }

    public c(View view, A a7) {
        new c(view);
        Choreographer.getInstance();
        this.f5601a = view;
        new d(new C0192d(""), E.f3087b);
        int i = b.f5596e;
        new ArrayList();
        this.f5602b = AbstractC1362a.c(EnumC1370i.f15078r, new A0.d(13, this));
        new CursorAnchorInfo.Builder();
        new Matrix();
    }
}
