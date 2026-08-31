package androidx.work.impl.constraints;

import k1.i;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkState {
    private final boolean isConnected;
    private final boolean isMetered;
    private final boolean isNotRoaming;
    private final boolean isValidated;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NetworkState(boolean z5, boolean z6, boolean z7, boolean z8) {
        this.isConnected = z5;
        this.isValidated = z6;
        this.isMetered = z7;
        this.isNotRoaming = z8;
    }

    public static /* synthetic */ NetworkState copy$default(NetworkState networkState, boolean z5, boolean z6, boolean z7, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            z5 = networkState.isConnected;
        }
        if ((i & 2) != 0) {
            z6 = networkState.isValidated;
        }
        if ((i & 4) != 0) {
            z7 = networkState.isMetered;
        }
        if ((i & 8) != 0) {
            z8 = networkState.isNotRoaming;
        }
        return networkState.copy(z5, z6, z7, z8);
    }

    public final boolean component1() {
        return this.isConnected;
    }

    public final boolean component2() {
        return this.isValidated;
    }

    public final boolean component3() {
        return this.isMetered;
    }

    public final boolean component4() {
        return this.isNotRoaming;
    }

    public final NetworkState copy(boolean z5, boolean z6, boolean z7, boolean z8) {
        return new NetworkState(z5, z6, z7, z8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return this.isConnected == networkState.isConnected && this.isValidated == networkState.isValidated && this.isMetered == networkState.isMetered && this.isNotRoaming == networkState.isNotRoaming;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Boolean.hashCode(this.isNotRoaming) + i.e(i.e(Boolean.hashCode(this.isConnected) * 31, 31, this.isValidated), 31, this.isMetered);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isConnected() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isMetered() {
        return this.isMetered;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isNotRoaming() {
        return this.isNotRoaming;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isValidated() {
        return this.isValidated;
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.isConnected + ", isValidated=" + this.isValidated + ", isMetered=" + this.isMetered + ", isNotRoaming=" + this.isNotRoaming + ')';
    }
}
