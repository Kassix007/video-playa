package androidx.room;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f9748a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n(String[] tables) {
        kotlin.jvm.internal.m.e(tables, "tables");
        this.f9748a = tables;
    }

    public abstract void a(Set set);
}
