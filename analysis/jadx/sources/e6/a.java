package e6;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12672b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ a(String str, boolean z5) {
        this.f12671a = str;
        this.f12672b = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String name = this.f12671a;
        m.e(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.f12672b);
        return thread;
    }
}
