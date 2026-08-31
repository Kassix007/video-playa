package q0;

import C0.S;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import i3.C1136a;
import kotlin.jvm.internal.m;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: q0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1488a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParser f15904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15905b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1136a f15906c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1488a(XmlResourceParser xmlResourceParser) {
        this.f15904a = xmlResourceParser;
        C1136a c1136a = new C1136a(6);
        c1136a.f13562r = new float[64];
        this.f15906c = c1136a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float a(TypedArray typedArray, String str, int i, float f) {
        if (m1.b.d(this.f15904a, str)) {
            f = typedArray.getFloat(i, f);
        }
        b(typedArray.getChangingConfigurations());
        return f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i) {
        this.f15905b = i | this.f15905b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1488a)) {
            return false;
        }
        C1488a c1488a = (C1488a) obj;
        return m.a(this.f15904a, c1488a.f15904a) && this.f15905b == c1488a.f15905b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f15905b) + (this.f15904a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f15904a);
        sb.append(", config=");
        return S.o(sb, this.f15905b, ')');
    }
}
