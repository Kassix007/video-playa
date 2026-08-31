package androidx.work.impl.constraints;

import C0.S;
import kotlin.jvm.internal.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintsState {

    public static final class ConstraintsMet extends ConstraintsState {
        public static final ConstraintsMet INSTANCE = new ConstraintsMet();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private ConstraintsMet() {
            super(null);
        }
    }

    public static final class ConstraintsNotMet extends ConstraintsState {
        private final int reason;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ConstraintsNotMet(int i) {
            super(null);
            this.reason = i;
        }

        public static /* synthetic */ ConstraintsNotMet copy$default(ConstraintsNotMet constraintsNotMet, int i, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                i = constraintsNotMet.reason;
            }
            return constraintsNotMet.copy(i);
        }

        public final int component1() {
            return this.reason;
        }

        public final ConstraintsNotMet copy(int i) {
            return new ConstraintsNotMet(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConstraintsNotMet) && this.reason == ((ConstraintsNotMet) obj).reason;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getReason() {
            return this.reason;
        }

        public int hashCode() {
            return Integer.hashCode(this.reason);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return S.o(new StringBuilder("ConstraintsNotMet(reason="), this.reason, ')');
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.work.impl.constraints.ConstraintsState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ConstraintsState(g gVar) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private ConstraintsState() {
    }
}
