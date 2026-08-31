package androidx.room;

import a3.C0625d;
import android.content.Context;
import e2.AbstractC1037b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9770b;
    public Executor f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f9774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0625d f9775h;
    public boolean i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9777l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public HashSet f9781p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f9771c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f9772d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f9773e = new ArrayList();
    public final int j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9776k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f9778m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final D2.o f9779n = new D2.o(2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f9780o = new LinkedHashSet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t(Context context, String str) {
        this.f9769a = context;
        this.f9770b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(AbstractC1037b... abstractC1037bArr) {
        if (this.f9781p == null) {
            this.f9781p = new HashSet();
        }
        for (AbstractC1037b abstractC1037b : abstractC1037bArr) {
            HashSet hashSet = this.f9781p;
            kotlin.jvm.internal.m.b(hashSet);
            hashSet.add(Integer.valueOf(abstractC1037b.startVersion));
            HashSet hashSet2 = this.f9781p;
            kotlin.jvm.internal.m.b(hashSet2);
            hashSet2.add(Integer.valueOf(abstractC1037b.endVersion));
        }
        this.f9779n.b((AbstractC1037b[]) Arrays.copyOf(abstractC1037bArr, abstractC1037bArr.length));
    }
}
