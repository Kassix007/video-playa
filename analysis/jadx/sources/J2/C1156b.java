package j2;

import E.Y;
import android.content.Context;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: j2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1156b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y f13740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13742e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1156b(Context context, String str, Y callback, boolean z5, boolean z6) {
        m.e(callback, "callback");
        this.f13738a = context;
        this.f13739b = str;
        this.f13740c = callback;
        this.f13741d = z5;
        this.f13742e = z6;
    }
}
