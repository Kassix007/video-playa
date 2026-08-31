package q6;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f16034a = new B(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f16036c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f16035b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f16036c = atomicReferenceArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(B segment) {
        kotlin.jvm.internal.m.e(segment, "segment");
        if (segment.f != null || segment.f16033g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f16031d) {
            return;
        }
        AtomicReference atomicReference = f16036c[(int) (Thread.currentThread().getId() & (((long) f16035b) - 1))];
        B b7 = f16034a;
        B b8 = (B) atomicReference.getAndSet(b7);
        if (b8 == b7) {
            return;
        }
        int i = b8 != null ? b8.f16030c : 0;
        if (i >= 65536) {
            atomicReference.set(b8);
            return;
        }
        segment.f = b8;
        segment.f16029b = 0;
        segment.f16030c = i + 8192;
        atomicReference.set(segment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final B b() {
        AtomicReference atomicReference = f16036c[(int) (Thread.currentThread().getId() & (((long) f16035b) - 1))];
        B b7 = f16034a;
        B b8 = (B) atomicReference.getAndSet(b7);
        if (b8 == b7) {
            return new B();
        }
        if (b8 == null) {
            atomicReference.set(null);
            return new B();
        }
        atomicReference.set(b8.f);
        b8.f = null;
        b8.f16030c = 0;
        return b8;
    }
}
