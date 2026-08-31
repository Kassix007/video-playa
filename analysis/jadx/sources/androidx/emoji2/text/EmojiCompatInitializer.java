package androidx.emoji2.text;

import E1.l;
import E1.m;
import E1.p;
import E1.w;
import android.content.Context;
import androidx.lifecycle.AbstractC0654q;
import androidx.lifecycle.InterfaceC0660x;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import m2.C1358a;
import m2.InterfaceC1359b;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC1359b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m2.InterfaceC1359b
    public final Object create(Context context) {
        Object objB;
        w wVar = new w(new p(context, 0));
        wVar.f1632a = 1;
        if (l.f1638k == null) {
            synchronized (l.j) {
                try {
                    if (l.f1638k == null) {
                        l.f1638k = new l(wVar);
                    }
                } finally {
                }
            }
        }
        C1358a c1358aC = C1358a.c(context);
        c1358aC.getClass();
        synchronized (C1358a.f15051e) {
            try {
                objB = c1358aC.f15052a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = c1358aC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        AbstractC0654q lifecycle = ((InterfaceC0660x) objB).getLifecycle();
        lifecycle.a(new m(this, lifecycle));
        return Boolean.TRUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m2.InterfaceC1359b
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
