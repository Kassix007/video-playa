package r6;

import java.io.IOException;
import kotlin.jvm.internal.y;
import m5.C1386y;
import q6.A;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f16397q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y f16398r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A f16399s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y f16400t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ y f16401u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ i(y yVar, A a7, y yVar2, y yVar3) {
        this.f16398r = yVar;
        this.f16399s = a7;
        this.f16400t = yVar2;
        this.f16401u = yVar3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.f16397q;
        int iIntValue = ((Integer) obj).intValue();
        Long l7 = (Long) obj2;
        switch (i) {
            case 0:
                long jLongValue = l7.longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    A a7 = this.f16399s;
                    byte b7 = a7.readByte();
                    boolean z5 = (b7 & 1) == 1;
                    boolean z6 = (b7 & 2) == 2;
                    boolean z7 = (b7 & 4) == 4;
                    long j = z5 ? 5L : 1L;
                    if (z6) {
                        j += 4;
                    }
                    if (z7) {
                        j += 4;
                    }
                    if (jLongValue < j) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z5) {
                        this.f16398r.f14268q = Integer.valueOf(a7.e());
                    }
                    if (z6) {
                        this.f16400t.f14268q = Integer.valueOf(a7.e());
                    }
                    if (z7) {
                        this.f16401u.f14268q = Integer.valueOf(a7.e());
                    }
                }
                return C1386y.f15098a;
            default:
                long jLongValue2 = l7.longValue();
                if (iIntValue == 1) {
                    y yVar = this.f16398r;
                    if (yVar.f14268q != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (jLongValue2 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    A a8 = this.f16399s;
                    yVar.f14268q = Long.valueOf(a8.f());
                    this.f16400t.f14268q = Long.valueOf(a8.f());
                    this.f16401u.f14268q = Long.valueOf(a8.f());
                }
                return C1386y.f15098a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ i(A a7, y yVar, y yVar2, y yVar3) {
        this.f16399s = a7;
        this.f16398r = yVar;
        this.f16400t = yVar2;
        this.f16401u = yVar3;
    }
}
