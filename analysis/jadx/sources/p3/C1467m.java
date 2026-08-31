package p3;

import java.util.ArrayList;

/* JADX INFO: renamed from: p3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1467m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f15788a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15789b = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        this.f15789b += 1000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f15788a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append((C1468n) obj);
            sb.append(' ');
        }
        sb.append('[');
        return C0.S.o(sb, this.f15789b, ']');
    }
}
