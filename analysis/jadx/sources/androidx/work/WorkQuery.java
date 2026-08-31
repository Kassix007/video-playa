package androidx.work;

import android.annotation.SuppressLint;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import n5.k;
import n5.q;
import n5.s;

/* JADX INFO: loaded from: classes.dex */
public final class WorkQuery {
    public static final Companion Companion = new Companion(null);
    private final List<UUID> ids;
    private final List<WorkInfo.State> states;
    private final List<String> tags;
    private final List<String> uniqueWorkNames;

    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        private final List<UUID> ids;
        private final List<WorkInfo.State> states;
        private final List<String> tags;
        private final List<String> uniqueWorkNames;

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.work.WorkQuery.Builder.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @SuppressLint({"BuilderSetStyle"})
            public final Builder fromIds(List<UUID> ids) {
                m.e(ids, "ids");
                Builder builder = new Builder(null);
                builder.addIds(ids);
                return builder;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @SuppressLint({"BuilderSetStyle"})
            public final Builder fromStates(List<? extends WorkInfo.State> states) {
                m.e(states, "states");
                Builder builder = new Builder(null);
                builder.addStates(states);
                return builder;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @SuppressLint({"BuilderSetStyle"})
            public final Builder fromTags(List<String> tags) {
                m.e(tags, "tags");
                Builder builder = new Builder(null);
                builder.addTags(tags);
                return builder;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @SuppressLint({"BuilderSetStyle"})
            public final Builder fromUniqueWorkNames(List<String> uniqueWorkNames) {
                m.e(uniqueWorkNames, "uniqueWorkNames");
                Builder builder = new Builder(null);
                builder.addUniqueWorkNames(uniqueWorkNames);
                return builder;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            private Companion() {
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.work.WorkQuery.Builder.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Builder(g gVar) {
            this();
        }

        @SuppressLint({"BuilderSetStyle"})
        public static final Builder fromIds(List<UUID> list) {
            return Companion.fromIds(list);
        }

        @SuppressLint({"BuilderSetStyle"})
        public static final Builder fromStates(List<? extends WorkInfo.State> list) {
            return Companion.fromStates(list);
        }

        @SuppressLint({"BuilderSetStyle"})
        public static final Builder fromTags(List<String> list) {
            return Companion.fromTags(list);
        }

        @SuppressLint({"BuilderSetStyle"})
        public static final Builder fromUniqueWorkNames(List<String> list) {
            return Companion.fromUniqueWorkNames(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder addIds(List<UUID> ids) {
            m.e(ids, "ids");
            q.e0(this.ids, ids);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder addStates(List<? extends WorkInfo.State> states) {
            m.e(states, "states");
            q.e0(this.states, states);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder addTags(List<String> tags) {
            m.e(tags, "tags");
            q.e0(this.tags, tags);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder addUniqueWorkNames(List<String> uniqueWorkNames) {
            m.e(uniqueWorkNames, "uniqueWorkNames");
            q.e0(this.uniqueWorkNames, uniqueWorkNames);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final WorkQuery build() {
            if (this.ids.isEmpty() && this.uniqueWorkNames.isEmpty() && this.tags.isEmpty() && this.states.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new WorkQuery(this.ids, this.uniqueWorkNames, this.tags, this.states);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Builder() {
            this.ids = new ArrayList();
            this.uniqueWorkNames = new ArrayList();
            this.tags = new ArrayList();
            this.states = new ArrayList();
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.work.WorkQuery.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final WorkQuery fromIds(List<UUID> ids) {
            m.e(ids, "ids");
            return new WorkQuery(ids, null, null, null, 14, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final WorkQuery fromStates(List<? extends WorkInfo.State> states) {
            m.e(states, "states");
            return new WorkQuery(null, null, null, states, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final WorkQuery fromTags(List<String> tags) {
            m.e(tags, "tags");
            return new WorkQuery(null, null, tags, null, 11, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final WorkQuery fromUniqueWorkNames(String... uniqueWorkNames) {
            m.e(uniqueWorkNames, "uniqueWorkNames");
            return new WorkQuery(null, k.R0(uniqueWorkNames), null, null, 13, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public final WorkQuery fromIds(UUID... ids) {
            m.e(ids, "ids");
            return new WorkQuery(k.R0(ids), null, null, null, 14, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public final WorkQuery fromStates(WorkInfo.State... states) {
            m.e(states, "states");
            return new WorkQuery(null, null, null, k.R0(states), 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public final WorkQuery fromTags(String... tags) {
            m.e(tags, "tags");
            return new WorkQuery(null, null, k.R0(tags), null, 11, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public final WorkQuery fromUniqueWorkNames(List<String> uniqueWorkNames) {
            m.e(uniqueWorkNames, "uniqueWorkNames");
            return new WorkQuery(null, uniqueWorkNames, null, null, 13, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WorkQuery() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final WorkQuery fromIds(List<UUID> list) {
        return Companion.fromIds(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final WorkQuery fromStates(List<? extends WorkInfo.State> list) {
        return Companion.fromStates(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final WorkQuery fromTags(List<String> list) {
        return Companion.fromTags(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final WorkQuery fromUniqueWorkNames(List<String> list) {
        return Companion.fromUniqueWorkNames(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<UUID> getIds() {
        return this.ids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<WorkInfo.State> getStates() {
        return this.states;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> getTags() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> getUniqueWorkNames() {
        return this.uniqueWorkNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends androidx.work.WorkInfo$State> */
    /* JADX WARN: Multi-variable type inference failed */
    public WorkQuery(List<UUID> ids, List<String> uniqueWorkNames, List<String> tags, List<? extends WorkInfo.State> states) {
        m.e(ids, "ids");
        m.e(uniqueWorkNames, "uniqueWorkNames");
        m.e(tags, "tags");
        m.e(states, "states");
        this.ids = ids;
        this.uniqueWorkNames = uniqueWorkNames;
        this.tags = tags;
        this.states = states;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static final WorkQuery fromIds(UUID... uuidArr) {
        return Companion.fromIds(uuidArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static final WorkQuery fromStates(WorkInfo.State... stateArr) {
        return Companion.fromStates(stateArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static final WorkQuery fromTags(String... strArr) {
        return Companion.fromTags(strArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static final WorkQuery fromUniqueWorkNames(String... strArr) {
        return Companion.fromUniqueWorkNames(strArr);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WorkQuery(List list, List list2, List list3, List list4, int i, g gVar) {
        int i7 = i & 1;
        s sVar = s.f15299q;
        this(i7 != 0 ? sVar : list, (i & 2) != 0 ? sVar : list2, (i & 4) != 0 ? sVar : list3, (i & 8) != 0 ? sVar : list4);
    }
}
