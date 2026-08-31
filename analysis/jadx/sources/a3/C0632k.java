package a3;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import r.C1566q;
import r.S;

/* JADX INFO: renamed from: a3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0632k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f8835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f8836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f8837e;
    public HashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f8838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public S f8839h;
    public C1566q i;
    public ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f8840k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f8841l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f8842m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f8843n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8844o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f8833a = new G();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f8834b = new HashSet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8845p = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(String str) {
        n3.c.b(str);
        this.f8834b.add(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float b() {
        return (long) (((this.f8842m - this.f8841l) / this.f8843n) * 1000.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Map c() {
        float fC = n3.i.c();
        if (fC != this.f8837e) {
            for (Map.Entry entry : this.f8836d.entrySet()) {
                HashMap map = this.f8836d;
                String str = (String) entry.getKey();
                C0620A c0620a = (C0620A) entry.getValue();
                float f = this.f8837e / fC;
                int i = (int) (c0620a.f8754a * f);
                int i7 = (int) (c0620a.f8755b * f);
                C0620A c0620a2 = new C0620A(i, i7, c0620a.f8756c, c0620a.f8757d, c0620a.f8758e);
                Bitmap bitmap = c0620a.f;
                if (bitmap != null) {
                    c0620a2.f = Bitmap.createScaledBitmap(bitmap, i, i7, true);
                }
                map.put(str, c0620a2);
            }
        }
        this.f8837e = fC;
        return this.f8836d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final g3.h d(String str) {
        int size = this.f8838g.size();
        for (int i = 0; i < size; i++) {
            g3.h hVar = (g3.h) this.f8838g.get(i);
            String str2 = hVar.f13065a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return hVar;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append(((j3.e) obj).a("\t"));
        }
        return sb.toString();
    }
}
