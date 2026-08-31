package p5;

import java.util.Comparator;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: p5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1484a implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1484a f15898b = new C1484a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1484a f15899c = new C1484a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15900a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [p5.a.<clinit>():void] */
    public /* synthetic */ C1484a(int i) {
        this.f15900a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f15900a) {
            case 0:
                Comparable a7 = (Comparable) obj;
                Comparable b7 = (Comparable) obj2;
                m.e(a7, "a");
                m.e(b7, "b");
                return a7.compareTo(b7);
            default:
                Comparable a8 = (Comparable) obj;
                Comparable b8 = (Comparable) obj2;
                m.e(a8, "a");
                m.e(b8, "b");
                return b8.compareTo(a8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f15900a) {
            case 0:
                return f15899c;
            default:
                return f15898b;
        }
    }
}
