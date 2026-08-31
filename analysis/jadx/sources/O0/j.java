package O0;

import C0.S;
import androidx.work.impl.Scheduler;
import com.google.android.gms.internal.measurement.AbstractC0836n2;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f4280r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final j f4281s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f4282t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final j f4283u;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f4284q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        j jVar = new j(100);
        j jVar2 = new j(Scheduler.MAX_GREEDY_SCHEDULER_LIMIT);
        j jVar3 = new j(300);
        j jVar4 = new j(400);
        j jVar5 = new j(500);
        j jVar6 = new j(600);
        f4280r = jVar6;
        j jVar7 = new j(700);
        j jVar8 = new j(800);
        j jVar9 = new j(900);
        f4281s = jVar4;
        f4282t = jVar5;
        f4283u = jVar7;
        AbstractC0836n2.A(jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(int i) {
        this.f4284q = i;
        boolean z5 = false;
        if (1 <= i && i < 1001) {
            z5 = true;
        }
        if (z5) {
            return;
        }
        Q0.a.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.m.f(this.f4284q, ((j) obj).f4284q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.f4284q == ((j) obj).f4284q;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4284q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return S.o(new StringBuilder("FontWeight(weight="), this.f4284q, ')');
    }
}
