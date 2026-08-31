package C0;

import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: renamed from: C0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0081i implements InterfaceC0098q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClipboardManager f1044a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0081i(Context context) {
        Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f1044a = (ClipboardManager) systemService;
    }
}
