package w2;

import java.io.IOException;
import java.util.ArrayList;
import q6.x;

/* JADX INFO: renamed from: w2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1863a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f18251b = new long[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f18252c = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f18253d = new ArrayList(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18254e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public K2.a f18255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18256h;
    public final /* synthetic */ C1867e i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1863a(C1867e c1867e, String str) {
        this.i = c1867e;
        this.f18250a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.f18252c.add(this.i.f18268q.e(sb.toString()));
            sb.append(".tmp");
            this.f18253d.add(this.i.f18268q.e(sb.toString()));
            sb.setLength(length);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1864b a() {
        if (!this.f18254e || this.f18255g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.f18252c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            C1867e c1867e = this.i;
            if (i >= size) {
                this.f18256h++;
                return new C1864b(c1867e, this);
            }
            if (!c1867e.f18267F.v((x) arrayList.get(i))) {
                try {
                    c1867e.G(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
