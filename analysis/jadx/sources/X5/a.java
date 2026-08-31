package X5;

import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.m;
import n5.s;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f8174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f8175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f8176e;
    public final ArrayList f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(String serialName) {
        m.e(serialName, "serialName");
        this.f8172a = serialName;
        this.f8173b = new ArrayList();
        this.f8174c = new HashSet();
        this.f8175d = new ArrayList();
        this.f8176e = new ArrayList();
        this.f = new ArrayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(a aVar, String str, f descriptor) {
        aVar.getClass();
        m.e(descriptor, "descriptor");
        if (aVar.f8174c.add(str)) {
            aVar.f8173b.add(str);
            aVar.f8175d.add(descriptor);
            aVar.f8176e.add(s.f15299q);
            aVar.f.add(false);
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + aVar.f8172a).toString());
    }
}
