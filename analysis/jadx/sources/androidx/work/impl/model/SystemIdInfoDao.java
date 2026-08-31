package androidx.work.impl.model;

import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public interface SystemIdInfoDao {

    public static final class DefaultImpls {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Deprecated
        public static SystemIdInfo getSystemIdInfo(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId id) {
            m.e(id, "id");
            return SystemIdInfoDao.super.getSystemIdInfo(id);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Deprecated
        public static void removeSystemIdInfo(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId id) {
            m.e(id, "id");
            SystemIdInfoDao.super.removeSystemIdInfo(id);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default SystemIdInfo getSystemIdInfo(WorkGenerationalId id) {
        m.e(id, "id");
        return getSystemIdInfo(id.getWorkSpecId(), id.getGeneration());
    }

    SystemIdInfo getSystemIdInfo(String str, int i);

    List<String> getWorkSpecIds();

    void insertSystemIdInfo(SystemIdInfo systemIdInfo);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default void removeSystemIdInfo(WorkGenerationalId id) {
        m.e(id, "id");
        removeSystemIdInfo(id.getWorkSpecId(), id.getGeneration());
    }

    void removeSystemIdInfo(String str);

    void removeSystemIdInfo(String str, int i);
}
