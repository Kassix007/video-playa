.class public final Landroidx/work/impl/model/WorkSpecDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/work/impl/model/WorkSpecDao;


# instance fields
.field private final __db:Landroidx/room/w;

.field private final __insertionAdapterOfWorkSpec:Landroidx/room/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/j;"
        }
    .end annotation
.end field

.field private final __preparedStmtOfDelete:Landroidx/room/D;

.field private final __preparedStmtOfIncrementGeneration:Landroidx/room/D;

.field private final __preparedStmtOfIncrementPeriodCount:Landroidx/room/D;

.field private final __preparedStmtOfIncrementWorkSpecRunAttemptCount:Landroidx/room/D;

.field private final __preparedStmtOfMarkWorkSpecScheduled:Landroidx/room/D;

.field private final __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast:Landroidx/room/D;

.field private final __preparedStmtOfResetScheduledState:Landroidx/room/D;

.field private final __preparedStmtOfResetWorkSpecNextScheduleTimeOverride:Landroidx/room/D;

.field private final __preparedStmtOfResetWorkSpecRunAttemptCount:Landroidx/room/D;

.field private final __preparedStmtOfSetCancelledState:Landroidx/room/D;

.field private final __preparedStmtOfSetLastEnqueueTime:Landroidx/room/D;

.field private final __preparedStmtOfSetNextScheduleTimeOverride:Landroidx/room/D;

.field private final __preparedStmtOfSetOutput:Landroidx/room/D;

.field private final __preparedStmtOfSetState:Landroidx/room/D;

.field private final __preparedStmtOfSetStopReason:Landroidx/room/D;

.field private final __updateAdapterOfWorkSpec:Landroidx/room/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/i;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/room/w;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 5
    .line 6
    new-instance v0, Landroidx/work/impl/model/WorkSpecDao_Impl$1;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl$1;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/w;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__insertionAdapterOfWorkSpec:Landroidx/room/j;

    .line 12
    .line 13
    new-instance v0, Landroidx/work/impl/model/WorkSpecDao_Impl$2;

    .line 14
    .line 15
    invoke-direct {v0, p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl$2;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/w;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__updateAdapterOfWorkSpec:Landroidx/room/i;

    .line 19
    .line 20
    new-instance v0, Landroidx/work/impl/model/WorkSpecDao_Impl$3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl$3;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/w;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfDelete:Landroidx/room/D;

    .line 26
    .line 27
    new-instance v0, Landroidx/work/impl/model/WorkSpecDao_Impl$4;

    .line 28
    .line 29
    invoke-direct {v0, p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl$4;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/w;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetState:Landroidx/room/D;

    .line 33
    .line 34
    new-instance v0, Landroidx/work/impl/model/WorkSpecDao_Impl$5;

    .line 35
    .line 36
    invoke-direct {v0, p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl$5;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/w;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetCancelledState:Landroidx/room/D;

    .line 40
    .line 41
    new-instance v0, Landroidx/work/impl/model/WorkSpecDao_Impl$6;

    .line 42
    .line 43
    invoke-direct {v0, p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl$6;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/w;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfIncrementPeriodCount:Landroidx/room/D;

    .line 47
    .line 48
    new-instance v0, Landroidx/work/impl/model/WorkSpecDao_Impl$7;

    .line 49
    .line 50
    invoke-direct {v0, p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl$7;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/w;)V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetOutput:Landroidx/room/D;

    .line 54
    .line 55
    new-instance v0, Landroidx/work/impl/model/WorkSpecDao_Impl$8;

    .line 56
    .line 57
    invoke-direct {v0, p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl$8;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/w;)V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetLastEnqueueTime:Landroidx/room/D;

    .line 61
    .line 62
    new-instance v0, Landroidx/work/impl/model/WorkSpecDao_Impl$9;

    .line 63
    .line 64
    invoke-direct {v0, p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl$9;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/w;)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfIncrementWorkSpecRunAttemptCount:Landroidx/room/D;

    .line 68
    .line 69
    new-instance v0, Landroidx/work/impl/model/WorkSpecDao_Impl$10;

    .line 70
    .line 71
    invoke-direct {v0, p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl$10;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/w;)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfResetWorkSpecRunAttemptCount:Landroidx/room/D;

    .line 75
    .line 76
    new-instance v0, Landroidx/work/impl/model/WorkSpecDao_Impl$11;

    .line 77
    .line 78
    invoke-direct {v0, p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl$11;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/w;)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetNextScheduleTimeOverride:Landroidx/room/D;

    .line 82
    .line 83
    new-instance v0, Landroidx/work/impl/model/WorkSpecDao_Impl$12;

    .line 84
    .line 85
    invoke-direct {v0, p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl$12;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/w;)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfResetWorkSpecNextScheduleTimeOverride:Landroidx/room/D;

    .line 89
    .line 90
    new-instance v0, Landroidx/work/impl/model/WorkSpecDao_Impl$13;

    .line 91
    .line 92
    invoke-direct {v0, p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl$13;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/w;)V

    .line 93
    .line 94
    .line 95
    iput-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfMarkWorkSpecScheduled:Landroidx/room/D;

    .line 96
    .line 97
    new-instance v0, Landroidx/work/impl/model/WorkSpecDao_Impl$14;

    .line 98
    .line 99
    invoke-direct {v0, p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl$14;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/w;)V

    .line 100
    .line 101
    .line 102
    iput-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfResetScheduledState:Landroidx/room/D;

    .line 103
    .line 104
    new-instance v0, Landroidx/work/impl/model/WorkSpecDao_Impl$15;

    .line 105
    .line 106
    invoke-direct {v0, p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl$15;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/w;)V

    .line 107
    .line 108
    .line 109
    iput-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast:Landroidx/room/D;

    .line 110
    .line 111
    new-instance v0, Landroidx/work/impl/model/WorkSpecDao_Impl$16;

    .line 112
    .line 113
    invoke-direct {v0, p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl$16;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/w;)V

    .line 114
    .line 115
    .line 116
    iput-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfIncrementGeneration:Landroidx/room/D;

    .line 117
    .line 118
    new-instance v0, Landroidx/work/impl/model/WorkSpecDao_Impl$17;

    .line 119
    .line 120
    invoke-direct {v0, p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl$17;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/w;)V

    .line 121
    .line 122
    .line 123
    iput-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetStopReason:Landroidx/room/D;

    .line 124
    .line 125
    return-void
.end method

.method private __fetchRelationshipWorkProgressAsandroidxWorkData(Ljava/util/HashMap;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Landroidx/work/Data;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0x3e7

    .line 17
    .line 18
    if-le v1, v2, :cond_1

    .line 19
    .line 20
    new-instance v0, Landroidx/work/impl/model/b;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-direct {v0, p0, v1}, Landroidx/work/impl/model/b;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v0}, Ln5/A;->y(Ljava/util/HashMap;LB5/c;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    const-string v1, "SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN ("

    .line 31
    .line 32
    invoke-static {v1}, LC0/S;->q(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-static {v1, v2}, Ly4/b;->d(Ljava/lang/StringBuilder;I)V

    .line 41
    .line 42
    .line 43
    const-string v3, ")"

    .line 44
    .line 45
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v2, v1}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const/4 v2, 0x1

    .line 61
    move v3, v2

    .line 62
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_2

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v1, v3, v4}, Landroidx/room/z;->m(ILjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    add-int/2addr v3, v2

    .line 78
    goto :goto_0

    .line 79
    :cond_2
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 80
    .line 81
    const/4 v2, 0x0

    .line 82
    invoke-static {v0, v1, v2}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    :try_start_0
    const-string v1, "work_spec_id"

    .line 87
    .line 88
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    const/4 v3, -0x1

    .line 93
    if-ne v1, v3, :cond_3

    .line 94
    .line 95
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_3
    :goto_1
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_4

    .line 104
    .line 105
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {p1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, Ljava/util/ArrayList;

    .line 114
    .line 115
    if-eqz v3, :cond_3

    .line 116
    .line 117
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-static {v4}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :catchall_0
    move-exception p1

    .line 130
    goto :goto_2

    .line 131
    :cond_4
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :goto_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 136
    .line 137
    .line 138
    throw p1
.end method

.method private __fetchRelationshipWorkTagAsjavaLangString(Ljava/util/HashMap;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0x3e7

    .line 17
    .line 18
    if-le v1, v2, :cond_1

    .line 19
    .line 20
    new-instance v0, Landroidx/work/impl/model/b;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, p0, v1}, Landroidx/work/impl/model/b;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v0}, Ln5/A;->y(Ljava/util/HashMap;LB5/c;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    const-string v1, "SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN ("

    .line 31
    .line 32
    invoke-static {v1}, LC0/S;->q(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-static {v1, v2}, Ly4/b;->d(Ljava/lang/StringBuilder;I)V

    .line 41
    .line 42
    .line 43
    const-string v3, ")"

    .line 44
    .line 45
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v2, v1}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const/4 v2, 0x1

    .line 61
    move v3, v2

    .line 62
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_2

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v1, v3, v4}, Landroidx/room/z;->m(ILjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    add-int/2addr v3, v2

    .line 78
    goto :goto_0

    .line 79
    :cond_2
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 80
    .line 81
    const/4 v2, 0x0

    .line 82
    invoke-static {v0, v1, v2}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    :try_start_0
    const-string v1, "work_spec_id"

    .line 87
    .line 88
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    const/4 v3, -0x1

    .line 93
    if-ne v1, v3, :cond_3

    .line 94
    .line 95
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_3
    :goto_1
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_4

    .line 104
    .line 105
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {p1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, Ljava/util/ArrayList;

    .line 114
    .line 115
    if-eqz v3, :cond_3

    .line 116
    .line 117
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :catchall_0
    move-exception p1

    .line 126
    goto :goto_2

    .line 127
    :cond_4
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :goto_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 132
    .line 133
    .line 134
    throw p1
.end method

.method public static synthetic a(Landroidx/work/impl/model/WorkSpecDao_Impl;Ljava/util/HashMap;)Lm5/y;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl;->lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1(Ljava/util/HashMap;)Lm5/y;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$000(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/w;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Landroidx/work/impl/model/WorkSpecDao_Impl;Ljava/util/HashMap;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl;->__fetchRelationshipWorkTagAsjavaLangString(Ljava/util/HashMap;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$200(Landroidx/work/impl/model/WorkSpecDao_Impl;Ljava/util/HashMap;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl;->__fetchRelationshipWorkProgressAsandroidxWorkData(Ljava/util/HashMap;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Landroidx/work/impl/model/WorkSpecDao_Impl;Ljava/util/HashMap;)Lm5/y;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl;->lambda$__fetchRelationshipWorkTagAsjavaLangString$0(Ljava/util/HashMap;)Lm5/y;

    move-result-object p0

    return-object p0
.end method

.method public static getRequiredConverters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method private synthetic lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1(Ljava/util/HashMap;)Lm5/y;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl;->__fetchRelationshipWorkProgressAsandroidxWorkData(Ljava/util/HashMap;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 5
    .line 6
    return-object p1
.end method

.method private synthetic lambda$__fetchRelationshipWorkTagAsjavaLangString$0(Ljava/util/HashMap;)Lm5/y;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/work/impl/model/WorkSpecDao_Impl;->__fetchRelationshipWorkTagAsjavaLangString(Ljava/util/HashMap;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 5
    .line 6
    return-object p1
.end method


# virtual methods
.method public countNonFinishedContentUriTriggerWorkers()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)"

    .line 3
    .line 4
    invoke-static {v0, v1}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 9
    .line 10
    invoke-virtual {v2}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 14
    .line 15
    invoke-static {v2, v1, v0}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :try_start_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 26
    .line 27
    .line 28
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Landroidx/room/z;->b()V

    .line 36
    .line 37
    .line 38
    return v0

    .line 39
    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Landroidx/room/z;->b()V

    .line 43
    .line 44
    .line 45
    throw v0
.end method

.method public delete(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfDelete:Landroidx/room/D;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/D;->acquire()Lj2/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-interface {v0, v1, p1}, Lj2/e;->m(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/room/w;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    :try_start_1
    invoke-interface {v0}, Lj2/g;->q()I

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/room/w;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    .line 28
    .line 29
    :try_start_2
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroidx/room/w;->endTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfDelete:Landroidx/room/D;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_0

    .line 42
    :catchall_1
    move-exception p1

    .line 43
    :try_start_3
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 44
    .line 45
    invoke-virtual {v1}, Landroidx/room/w;->endTransaction()V

    .line 46
    .line 47
    .line 48
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 49
    :goto_0
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfDelete:Landroidx/room/D;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method

.method public getAllEligibleWorkSpecsForScheduling(I)Ljava/util/List;
    .locals 81
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroidx/work/impl/model/WorkSpec;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const-string v2, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?"

    .line 5
    .line 6
    invoke-static {v0, v2}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move/from16 v3, p1

    .line 11
    .line 12
    int-to-long v3, v3

    .line 13
    invoke-virtual {v2, v0, v3, v4}, Landroidx/room/z;->H(IJ)V

    .line 14
    .line 15
    .line 16
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 17
    .line 18
    invoke-virtual {v3}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 19
    .line 20
    .line 21
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-static {v3, v2, v4}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    :try_start_0
    const-string v5, "id"

    .line 29
    .line 30
    invoke-static {v3, v5}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    const-string v6, "state"

    .line 35
    .line 36
    invoke-static {v3, v6}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    const-string v7, "worker_class_name"

    .line 41
    .line 42
    invoke-static {v3, v7}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    const-string v8, "input_merger_class_name"

    .line 47
    .line 48
    invoke-static {v3, v8}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    const-string v9, "input"

    .line 53
    .line 54
    invoke-static {v3, v9}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    const-string v10, "output"

    .line 59
    .line 60
    invoke-static {v3, v10}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    const-string v11, "initial_delay"

    .line 65
    .line 66
    invoke-static {v3, v11}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v11

    .line 70
    const-string v12, "interval_duration"

    .line 71
    .line 72
    invoke-static {v3, v12}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v12

    .line 76
    const-string v13, "flex_duration"

    .line 77
    .line 78
    invoke-static {v3, v13}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v13

    .line 82
    const-string v14, "run_attempt_count"

    .line 83
    .line 84
    invoke-static {v3, v14}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v14

    .line 88
    const-string v15, "backoff_policy"

    .line 89
    .line 90
    invoke-static {v3, v15}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v15

    .line 94
    const-string v0, "backoff_delay_duration"

    .line 95
    .line 96
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    const-string v4, "last_enqueue_time"

    .line 101
    .line 102
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    const-string v1, "minimum_retention_duration"

    .line 107
    .line 108
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 112
    move-object/from16 v16, v2

    .line 113
    .line 114
    :try_start_1
    const-string v2, "schedule_requested_at"

    .line 115
    .line 116
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    move/from16 v17, v2

    .line 121
    .line 122
    const-string v2, "run_in_foreground"

    .line 123
    .line 124
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    move/from16 v18, v2

    .line 129
    .line 130
    const-string v2, "out_of_quota_policy"

    .line 131
    .line 132
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    move/from16 v19, v2

    .line 137
    .line 138
    const-string v2, "period_count"

    .line 139
    .line 140
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    move/from16 v20, v2

    .line 145
    .line 146
    const-string v2, "generation"

    .line 147
    .line 148
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    move/from16 v21, v2

    .line 153
    .line 154
    const-string v2, "next_schedule_time_override"

    .line 155
    .line 156
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    move/from16 v22, v2

    .line 161
    .line 162
    const-string v2, "next_schedule_time_override_generation"

    .line 163
    .line 164
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    move/from16 v23, v2

    .line 169
    .line 170
    const-string v2, "stop_reason"

    .line 171
    .line 172
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    move/from16 v24, v2

    .line 177
    .line 178
    const-string v2, "trace_tag"

    .line 179
    .line 180
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    move/from16 v25, v2

    .line 185
    .line 186
    const-string v2, "required_network_type"

    .line 187
    .line 188
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    move/from16 v26, v2

    .line 193
    .line 194
    const-string v2, "required_network_request"

    .line 195
    .line 196
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    move/from16 v27, v2

    .line 201
    .line 202
    const-string v2, "requires_charging"

    .line 203
    .line 204
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    move/from16 v28, v2

    .line 209
    .line 210
    const-string v2, "requires_device_idle"

    .line 211
    .line 212
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    move/from16 v29, v2

    .line 217
    .line 218
    const-string v2, "requires_battery_not_low"

    .line 219
    .line 220
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    move/from16 v30, v2

    .line 225
    .line 226
    const-string v2, "requires_storage_not_low"

    .line 227
    .line 228
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    move/from16 v31, v2

    .line 233
    .line 234
    const-string v2, "trigger_content_update_delay"

    .line 235
    .line 236
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    move/from16 v32, v2

    .line 241
    .line 242
    const-string v2, "trigger_max_content_delay"

    .line 243
    .line 244
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    move/from16 v33, v2

    .line 249
    .line 250
    const-string v2, "content_uri_triggers"

    .line 251
    .line 252
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    move/from16 v34, v2

    .line 257
    .line 258
    new-instance v2, Ljava/util/ArrayList;

    .line 259
    .line 260
    move/from16 v35, v1

    .line 261
    .line 262
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 267
    .line 268
    .line 269
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    if-eqz v1, :cond_6

    .line 274
    .line 275
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v37

    .line 279
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    invoke-static {v1}, Landroidx/work/impl/model/WorkTypeConverters;->intToState(I)Landroidx/work/WorkInfo$State;

    .line 284
    .line 285
    .line 286
    move-result-object v38

    .line 287
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v39

    .line 291
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v40

    .line 295
    invoke-interface {v3, v9}, Landroid/database/Cursor;->getBlob(I)[B

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-static {v1}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 300
    .line 301
    .line 302
    move-result-object v41

    .line 303
    invoke-interface {v3, v10}, Landroid/database/Cursor;->getBlob(I)[B

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-static {v1}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 308
    .line 309
    .line 310
    move-result-object v42

    .line 311
    invoke-interface {v3, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 312
    .line 313
    .line 314
    move-result-wide v43

    .line 315
    invoke-interface {v3, v12}, Landroid/database/Cursor;->getLong(I)J

    .line 316
    .line 317
    .line 318
    move-result-wide v45

    .line 319
    invoke-interface {v3, v13}, Landroid/database/Cursor;->getLong(I)J

    .line 320
    .line 321
    .line 322
    move-result-wide v47

    .line 323
    invoke-interface {v3, v14}, Landroid/database/Cursor;->getInt(I)I

    .line 324
    .line 325
    .line 326
    move-result v50

    .line 327
    invoke-interface {v3, v15}, Landroid/database/Cursor;->getInt(I)I

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    invoke-static {v1}, Landroidx/work/impl/model/WorkTypeConverters;->intToBackoffPolicy(I)Landroidx/work/BackoffPolicy;

    .line 332
    .line 333
    .line 334
    move-result-object v51

    .line 335
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 336
    .line 337
    .line 338
    move-result-wide v52

    .line 339
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 340
    .line 341
    .line 342
    move-result-wide v54

    .line 343
    move/from16 v1, v35

    .line 344
    .line 345
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 346
    .line 347
    .line 348
    move-result-wide v56

    .line 349
    move/from16 v35, v0

    .line 350
    .line 351
    move/from16 v0, v17

    .line 352
    .line 353
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 354
    .line 355
    .line 356
    move-result-wide v58

    .line 357
    move/from16 v17, v0

    .line 358
    .line 359
    move/from16 v0, v18

    .line 360
    .line 361
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 362
    .line 363
    .line 364
    move-result v18

    .line 365
    if-eqz v18, :cond_0

    .line 366
    .line 367
    const/16 v60, 0x1

    .line 368
    .line 369
    :goto_1
    move/from16 v18, v0

    .line 370
    .line 371
    move/from16 v0, v19

    .line 372
    .line 373
    goto :goto_2

    .line 374
    :cond_0
    const/16 v60, 0x0

    .line 375
    .line 376
    goto :goto_1

    .line 377
    :goto_2
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 378
    .line 379
    .line 380
    move-result v19

    .line 381
    invoke-static/range {v19 .. v19}, Landroidx/work/impl/model/WorkTypeConverters;->intToOutOfQuotaPolicy(I)Landroidx/work/OutOfQuotaPolicy;

    .line 382
    .line 383
    .line 384
    move-result-object v61

    .line 385
    move/from16 v19, v0

    .line 386
    .line 387
    move/from16 v0, v20

    .line 388
    .line 389
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 390
    .line 391
    .line 392
    move-result v62

    .line 393
    move/from16 v20, v0

    .line 394
    .line 395
    move/from16 v0, v21

    .line 396
    .line 397
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 398
    .line 399
    .line 400
    move-result v63

    .line 401
    move/from16 v21, v0

    .line 402
    .line 403
    move/from16 v0, v22

    .line 404
    .line 405
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 406
    .line 407
    .line 408
    move-result-wide v64

    .line 409
    move/from16 v22, v0

    .line 410
    .line 411
    move/from16 v0, v23

    .line 412
    .line 413
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 414
    .line 415
    .line 416
    move-result v66

    .line 417
    move/from16 v23, v0

    .line 418
    .line 419
    move/from16 v0, v24

    .line 420
    .line 421
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 422
    .line 423
    .line 424
    move-result v67

    .line 425
    move/from16 v24, v0

    .line 426
    .line 427
    move/from16 v0, v25

    .line 428
    .line 429
    invoke-interface {v3, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 430
    .line 431
    .line 432
    move-result v25

    .line 433
    if-eqz v25, :cond_1

    .line 434
    .line 435
    const/16 v25, 0x0

    .line 436
    .line 437
    :goto_3
    move-object/from16 v68, v25

    .line 438
    .line 439
    move/from16 v25, v0

    .line 440
    .line 441
    move/from16 v0, v26

    .line 442
    .line 443
    goto :goto_4

    .line 444
    :cond_1
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v25

    .line 448
    goto :goto_3

    .line 449
    :goto_4
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 450
    .line 451
    .line 452
    move-result v26

    .line 453
    invoke-static/range {v26 .. v26}, Landroidx/work/impl/model/WorkTypeConverters;->intToNetworkType(I)Landroidx/work/NetworkType;

    .line 454
    .line 455
    .line 456
    move-result-object v71

    .line 457
    move/from16 v26, v0

    .line 458
    .line 459
    move/from16 v0, v27

    .line 460
    .line 461
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 462
    .line 463
    .line 464
    move-result-object v27

    .line 465
    invoke-static/range {v27 .. v27}, Landroidx/work/impl/model/WorkTypeConverters;->toNetworkRequest$work_runtime_release([B)Landroidx/work/impl/utils/NetworkRequestCompat;

    .line 466
    .line 467
    .line 468
    move-result-object v70

    .line 469
    move/from16 v27, v0

    .line 470
    .line 471
    move/from16 v0, v28

    .line 472
    .line 473
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 474
    .line 475
    .line 476
    move-result v28

    .line 477
    if-eqz v28, :cond_2

    .line 478
    .line 479
    const/16 v72, 0x1

    .line 480
    .line 481
    :goto_5
    move/from16 v28, v0

    .line 482
    .line 483
    move/from16 v0, v29

    .line 484
    .line 485
    goto :goto_6

    .line 486
    :cond_2
    const/16 v72, 0x0

    .line 487
    .line 488
    goto :goto_5

    .line 489
    :goto_6
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 490
    .line 491
    .line 492
    move-result v29

    .line 493
    if-eqz v29, :cond_3

    .line 494
    .line 495
    const/16 v73, 0x1

    .line 496
    .line 497
    :goto_7
    move/from16 v29, v0

    .line 498
    .line 499
    move/from16 v0, v30

    .line 500
    .line 501
    goto :goto_8

    .line 502
    :cond_3
    const/16 v73, 0x0

    .line 503
    .line 504
    goto :goto_7

    .line 505
    :goto_8
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 506
    .line 507
    .line 508
    move-result v30

    .line 509
    if-eqz v30, :cond_4

    .line 510
    .line 511
    const/16 v74, 0x1

    .line 512
    .line 513
    :goto_9
    move/from16 v30, v0

    .line 514
    .line 515
    move/from16 v0, v31

    .line 516
    .line 517
    goto :goto_a

    .line 518
    :cond_4
    const/16 v74, 0x0

    .line 519
    .line 520
    goto :goto_9

    .line 521
    :goto_a
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 522
    .line 523
    .line 524
    move-result v31

    .line 525
    if-eqz v31, :cond_5

    .line 526
    .line 527
    const/16 v75, 0x1

    .line 528
    .line 529
    :goto_b
    move/from16 v31, v0

    .line 530
    .line 531
    move/from16 v0, v32

    .line 532
    .line 533
    goto :goto_c

    .line 534
    :cond_5
    const/16 v75, 0x0

    .line 535
    .line 536
    goto :goto_b

    .line 537
    :goto_c
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 538
    .line 539
    .line 540
    move-result-wide v76

    .line 541
    move/from16 v32, v0

    .line 542
    .line 543
    move/from16 v0, v33

    .line 544
    .line 545
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 546
    .line 547
    .line 548
    move-result-wide v78

    .line 549
    move/from16 v33, v0

    .line 550
    .line 551
    move/from16 v0, v34

    .line 552
    .line 553
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 554
    .line 555
    .line 556
    move-result-object v34

    .line 557
    invoke-static/range {v34 .. v34}, Landroidx/work/impl/model/WorkTypeConverters;->byteArrayToSetOfTriggers([B)Ljava/util/Set;

    .line 558
    .line 559
    .line 560
    move-result-object v80

    .line 561
    new-instance v49, Landroidx/work/Constraints;

    .line 562
    .line 563
    move-object/from16 v69, v49

    .line 564
    .line 565
    invoke-direct/range {v69 .. v80}, Landroidx/work/Constraints;-><init>(Landroidx/work/impl/utils/NetworkRequestCompat;Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V

    .line 566
    .line 567
    .line 568
    move-object/from16 v49, v69

    .line 569
    .line 570
    new-instance v36, Landroidx/work/impl/model/WorkSpec;

    .line 571
    .line 572
    invoke-direct/range {v36 .. v68}, Landroidx/work/impl/model/WorkSpec;-><init>(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;IIJIILjava/lang/String;)V

    .line 573
    .line 574
    .line 575
    move/from16 v34, v0

    .line 576
    .line 577
    move-object/from16 v0, v36

    .line 578
    .line 579
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 580
    .line 581
    .line 582
    move/from16 v0, v35

    .line 583
    .line 584
    move/from16 v35, v1

    .line 585
    .line 586
    goto/16 :goto_0

    .line 587
    .line 588
    :catchall_0
    move-exception v0

    .line 589
    goto :goto_d

    .line 590
    :cond_6
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {v16 .. v16}, Landroidx/room/z;->b()V

    .line 594
    .line 595
    .line 596
    return-object v2

    .line 597
    :catchall_1
    move-exception v0

    .line 598
    move-object/from16 v16, v2

    .line 599
    .line 600
    :goto_d
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 601
    .line 602
    .line 603
    invoke-virtual/range {v16 .. v16}, Landroidx/room/z;->b()V

    .line 604
    .line 605
    .line 606
    throw v0
.end method

.method public getAllUnfinishedWork()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)"

    .line 3
    .line 4
    invoke-static {v0, v1}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 9
    .line 10
    invoke-virtual {v2}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 14
    .line 15
    invoke-static {v2, v1, v0}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Landroidx/room/z;->b()V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Landroidx/room/z;->b()V

    .line 55
    .line 56
    .line 57
    throw v0
.end method

.method public getAllWorkSpecIds()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "SELECT id FROM workspec"

    .line 3
    .line 4
    invoke-static {v0, v1}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 9
    .line 10
    invoke-virtual {v2}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 14
    .line 15
    invoke-static {v2, v1, v0}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Landroidx/room/z;->b()V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Landroidx/room/z;->b()V

    .line 55
    .line 56
    .line 57
    throw v0
.end method

.method public getAllWorkSpecIdsLiveData()Landroidx/lifecycle/G;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/G;"
        }
    .end annotation

    .line 1
    const-string v0, "SELECT id FROM workspec"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1, v0}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroidx/room/w;->getInvalidationTracker()Landroidx/room/q;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "workspec"

    .line 15
    .line 16
    filled-new-array {v2}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    new-instance v3, Landroidx/work/impl/model/WorkSpecDao_Impl$18;

    .line 21
    .line 22
    invoke-direct {v3, p0, v0}, Landroidx/work/impl/model/WorkSpecDao_Impl$18;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/z;)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-virtual {v1, v2, v0, v3}, Landroidx/room/q;->b([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/room/B;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0
.end method

.method public getEligibleWorkForScheduling(I)Ljava/util/List;
    .locals 81
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroidx/work/impl/model/WorkSpec;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const-string v2, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))"

    .line 5
    .line 6
    invoke-static {v0, v2}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move/from16 v3, p1

    .line 11
    .line 12
    int-to-long v3, v3

    .line 13
    invoke-virtual {v2, v0, v3, v4}, Landroidx/room/z;->H(IJ)V

    .line 14
    .line 15
    .line 16
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 17
    .line 18
    invoke-virtual {v3}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 19
    .line 20
    .line 21
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-static {v3, v2, v4}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    :try_start_0
    const-string v5, "id"

    .line 29
    .line 30
    invoke-static {v3, v5}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    const-string v6, "state"

    .line 35
    .line 36
    invoke-static {v3, v6}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    const-string v7, "worker_class_name"

    .line 41
    .line 42
    invoke-static {v3, v7}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    const-string v8, "input_merger_class_name"

    .line 47
    .line 48
    invoke-static {v3, v8}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    const-string v9, "input"

    .line 53
    .line 54
    invoke-static {v3, v9}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    const-string v10, "output"

    .line 59
    .line 60
    invoke-static {v3, v10}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    const-string v11, "initial_delay"

    .line 65
    .line 66
    invoke-static {v3, v11}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v11

    .line 70
    const-string v12, "interval_duration"

    .line 71
    .line 72
    invoke-static {v3, v12}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v12

    .line 76
    const-string v13, "flex_duration"

    .line 77
    .line 78
    invoke-static {v3, v13}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v13

    .line 82
    const-string v14, "run_attempt_count"

    .line 83
    .line 84
    invoke-static {v3, v14}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v14

    .line 88
    const-string v15, "backoff_policy"

    .line 89
    .line 90
    invoke-static {v3, v15}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v15

    .line 94
    const-string v0, "backoff_delay_duration"

    .line 95
    .line 96
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    const-string v4, "last_enqueue_time"

    .line 101
    .line 102
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    const-string v1, "minimum_retention_duration"

    .line 107
    .line 108
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 112
    move-object/from16 v16, v2

    .line 113
    .line 114
    :try_start_1
    const-string v2, "schedule_requested_at"

    .line 115
    .line 116
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    move/from16 v17, v2

    .line 121
    .line 122
    const-string v2, "run_in_foreground"

    .line 123
    .line 124
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    move/from16 v18, v2

    .line 129
    .line 130
    const-string v2, "out_of_quota_policy"

    .line 131
    .line 132
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    move/from16 v19, v2

    .line 137
    .line 138
    const-string v2, "period_count"

    .line 139
    .line 140
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    move/from16 v20, v2

    .line 145
    .line 146
    const-string v2, "generation"

    .line 147
    .line 148
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    move/from16 v21, v2

    .line 153
    .line 154
    const-string v2, "next_schedule_time_override"

    .line 155
    .line 156
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    move/from16 v22, v2

    .line 161
    .line 162
    const-string v2, "next_schedule_time_override_generation"

    .line 163
    .line 164
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    move/from16 v23, v2

    .line 169
    .line 170
    const-string v2, "stop_reason"

    .line 171
    .line 172
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    move/from16 v24, v2

    .line 177
    .line 178
    const-string v2, "trace_tag"

    .line 179
    .line 180
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    move/from16 v25, v2

    .line 185
    .line 186
    const-string v2, "required_network_type"

    .line 187
    .line 188
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    move/from16 v26, v2

    .line 193
    .line 194
    const-string v2, "required_network_request"

    .line 195
    .line 196
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    move/from16 v27, v2

    .line 201
    .line 202
    const-string v2, "requires_charging"

    .line 203
    .line 204
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    move/from16 v28, v2

    .line 209
    .line 210
    const-string v2, "requires_device_idle"

    .line 211
    .line 212
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    move/from16 v29, v2

    .line 217
    .line 218
    const-string v2, "requires_battery_not_low"

    .line 219
    .line 220
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    move/from16 v30, v2

    .line 225
    .line 226
    const-string v2, "requires_storage_not_low"

    .line 227
    .line 228
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    move/from16 v31, v2

    .line 233
    .line 234
    const-string v2, "trigger_content_update_delay"

    .line 235
    .line 236
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    move/from16 v32, v2

    .line 241
    .line 242
    const-string v2, "trigger_max_content_delay"

    .line 243
    .line 244
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    move/from16 v33, v2

    .line 249
    .line 250
    const-string v2, "content_uri_triggers"

    .line 251
    .line 252
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    move/from16 v34, v2

    .line 257
    .line 258
    new-instance v2, Ljava/util/ArrayList;

    .line 259
    .line 260
    move/from16 v35, v1

    .line 261
    .line 262
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 267
    .line 268
    .line 269
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    if-eqz v1, :cond_6

    .line 274
    .line 275
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v37

    .line 279
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    invoke-static {v1}, Landroidx/work/impl/model/WorkTypeConverters;->intToState(I)Landroidx/work/WorkInfo$State;

    .line 284
    .line 285
    .line 286
    move-result-object v38

    .line 287
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v39

    .line 291
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v40

    .line 295
    invoke-interface {v3, v9}, Landroid/database/Cursor;->getBlob(I)[B

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-static {v1}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 300
    .line 301
    .line 302
    move-result-object v41

    .line 303
    invoke-interface {v3, v10}, Landroid/database/Cursor;->getBlob(I)[B

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-static {v1}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 308
    .line 309
    .line 310
    move-result-object v42

    .line 311
    invoke-interface {v3, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 312
    .line 313
    .line 314
    move-result-wide v43

    .line 315
    invoke-interface {v3, v12}, Landroid/database/Cursor;->getLong(I)J

    .line 316
    .line 317
    .line 318
    move-result-wide v45

    .line 319
    invoke-interface {v3, v13}, Landroid/database/Cursor;->getLong(I)J

    .line 320
    .line 321
    .line 322
    move-result-wide v47

    .line 323
    invoke-interface {v3, v14}, Landroid/database/Cursor;->getInt(I)I

    .line 324
    .line 325
    .line 326
    move-result v50

    .line 327
    invoke-interface {v3, v15}, Landroid/database/Cursor;->getInt(I)I

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    invoke-static {v1}, Landroidx/work/impl/model/WorkTypeConverters;->intToBackoffPolicy(I)Landroidx/work/BackoffPolicy;

    .line 332
    .line 333
    .line 334
    move-result-object v51

    .line 335
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 336
    .line 337
    .line 338
    move-result-wide v52

    .line 339
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 340
    .line 341
    .line 342
    move-result-wide v54

    .line 343
    move/from16 v1, v35

    .line 344
    .line 345
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 346
    .line 347
    .line 348
    move-result-wide v56

    .line 349
    move/from16 v35, v0

    .line 350
    .line 351
    move/from16 v0, v17

    .line 352
    .line 353
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 354
    .line 355
    .line 356
    move-result-wide v58

    .line 357
    move/from16 v17, v0

    .line 358
    .line 359
    move/from16 v0, v18

    .line 360
    .line 361
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 362
    .line 363
    .line 364
    move-result v18

    .line 365
    if-eqz v18, :cond_0

    .line 366
    .line 367
    const/16 v60, 0x1

    .line 368
    .line 369
    :goto_1
    move/from16 v18, v0

    .line 370
    .line 371
    move/from16 v0, v19

    .line 372
    .line 373
    goto :goto_2

    .line 374
    :cond_0
    const/16 v60, 0x0

    .line 375
    .line 376
    goto :goto_1

    .line 377
    :goto_2
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 378
    .line 379
    .line 380
    move-result v19

    .line 381
    invoke-static/range {v19 .. v19}, Landroidx/work/impl/model/WorkTypeConverters;->intToOutOfQuotaPolicy(I)Landroidx/work/OutOfQuotaPolicy;

    .line 382
    .line 383
    .line 384
    move-result-object v61

    .line 385
    move/from16 v19, v0

    .line 386
    .line 387
    move/from16 v0, v20

    .line 388
    .line 389
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 390
    .line 391
    .line 392
    move-result v62

    .line 393
    move/from16 v20, v0

    .line 394
    .line 395
    move/from16 v0, v21

    .line 396
    .line 397
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 398
    .line 399
    .line 400
    move-result v63

    .line 401
    move/from16 v21, v0

    .line 402
    .line 403
    move/from16 v0, v22

    .line 404
    .line 405
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 406
    .line 407
    .line 408
    move-result-wide v64

    .line 409
    move/from16 v22, v0

    .line 410
    .line 411
    move/from16 v0, v23

    .line 412
    .line 413
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 414
    .line 415
    .line 416
    move-result v66

    .line 417
    move/from16 v23, v0

    .line 418
    .line 419
    move/from16 v0, v24

    .line 420
    .line 421
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 422
    .line 423
    .line 424
    move-result v67

    .line 425
    move/from16 v24, v0

    .line 426
    .line 427
    move/from16 v0, v25

    .line 428
    .line 429
    invoke-interface {v3, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 430
    .line 431
    .line 432
    move-result v25

    .line 433
    if-eqz v25, :cond_1

    .line 434
    .line 435
    const/16 v25, 0x0

    .line 436
    .line 437
    :goto_3
    move-object/from16 v68, v25

    .line 438
    .line 439
    move/from16 v25, v0

    .line 440
    .line 441
    move/from16 v0, v26

    .line 442
    .line 443
    goto :goto_4

    .line 444
    :cond_1
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v25

    .line 448
    goto :goto_3

    .line 449
    :goto_4
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 450
    .line 451
    .line 452
    move-result v26

    .line 453
    invoke-static/range {v26 .. v26}, Landroidx/work/impl/model/WorkTypeConverters;->intToNetworkType(I)Landroidx/work/NetworkType;

    .line 454
    .line 455
    .line 456
    move-result-object v71

    .line 457
    move/from16 v26, v0

    .line 458
    .line 459
    move/from16 v0, v27

    .line 460
    .line 461
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 462
    .line 463
    .line 464
    move-result-object v27

    .line 465
    invoke-static/range {v27 .. v27}, Landroidx/work/impl/model/WorkTypeConverters;->toNetworkRequest$work_runtime_release([B)Landroidx/work/impl/utils/NetworkRequestCompat;

    .line 466
    .line 467
    .line 468
    move-result-object v70

    .line 469
    move/from16 v27, v0

    .line 470
    .line 471
    move/from16 v0, v28

    .line 472
    .line 473
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 474
    .line 475
    .line 476
    move-result v28

    .line 477
    if-eqz v28, :cond_2

    .line 478
    .line 479
    const/16 v72, 0x1

    .line 480
    .line 481
    :goto_5
    move/from16 v28, v0

    .line 482
    .line 483
    move/from16 v0, v29

    .line 484
    .line 485
    goto :goto_6

    .line 486
    :cond_2
    const/16 v72, 0x0

    .line 487
    .line 488
    goto :goto_5

    .line 489
    :goto_6
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 490
    .line 491
    .line 492
    move-result v29

    .line 493
    if-eqz v29, :cond_3

    .line 494
    .line 495
    const/16 v73, 0x1

    .line 496
    .line 497
    :goto_7
    move/from16 v29, v0

    .line 498
    .line 499
    move/from16 v0, v30

    .line 500
    .line 501
    goto :goto_8

    .line 502
    :cond_3
    const/16 v73, 0x0

    .line 503
    .line 504
    goto :goto_7

    .line 505
    :goto_8
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 506
    .line 507
    .line 508
    move-result v30

    .line 509
    if-eqz v30, :cond_4

    .line 510
    .line 511
    const/16 v74, 0x1

    .line 512
    .line 513
    :goto_9
    move/from16 v30, v0

    .line 514
    .line 515
    move/from16 v0, v31

    .line 516
    .line 517
    goto :goto_a

    .line 518
    :cond_4
    const/16 v74, 0x0

    .line 519
    .line 520
    goto :goto_9

    .line 521
    :goto_a
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 522
    .line 523
    .line 524
    move-result v31

    .line 525
    if-eqz v31, :cond_5

    .line 526
    .line 527
    const/16 v75, 0x1

    .line 528
    .line 529
    :goto_b
    move/from16 v31, v0

    .line 530
    .line 531
    move/from16 v0, v32

    .line 532
    .line 533
    goto :goto_c

    .line 534
    :cond_5
    const/16 v75, 0x0

    .line 535
    .line 536
    goto :goto_b

    .line 537
    :goto_c
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 538
    .line 539
    .line 540
    move-result-wide v76

    .line 541
    move/from16 v32, v0

    .line 542
    .line 543
    move/from16 v0, v33

    .line 544
    .line 545
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 546
    .line 547
    .line 548
    move-result-wide v78

    .line 549
    move/from16 v33, v0

    .line 550
    .line 551
    move/from16 v0, v34

    .line 552
    .line 553
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 554
    .line 555
    .line 556
    move-result-object v34

    .line 557
    invoke-static/range {v34 .. v34}, Landroidx/work/impl/model/WorkTypeConverters;->byteArrayToSetOfTriggers([B)Ljava/util/Set;

    .line 558
    .line 559
    .line 560
    move-result-object v80

    .line 561
    new-instance v49, Landroidx/work/Constraints;

    .line 562
    .line 563
    move-object/from16 v69, v49

    .line 564
    .line 565
    invoke-direct/range {v69 .. v80}, Landroidx/work/Constraints;-><init>(Landroidx/work/impl/utils/NetworkRequestCompat;Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V

    .line 566
    .line 567
    .line 568
    move-object/from16 v49, v69

    .line 569
    .line 570
    new-instance v36, Landroidx/work/impl/model/WorkSpec;

    .line 571
    .line 572
    invoke-direct/range {v36 .. v68}, Landroidx/work/impl/model/WorkSpec;-><init>(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;IIJIILjava/lang/String;)V

    .line 573
    .line 574
    .line 575
    move/from16 v34, v0

    .line 576
    .line 577
    move-object/from16 v0, v36

    .line 578
    .line 579
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 580
    .line 581
    .line 582
    move/from16 v0, v35

    .line 583
    .line 584
    move/from16 v35, v1

    .line 585
    .line 586
    goto/16 :goto_0

    .line 587
    .line 588
    :catchall_0
    move-exception v0

    .line 589
    goto :goto_d

    .line 590
    :cond_6
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {v16 .. v16}, Landroidx/room/z;->b()V

    .line 594
    .line 595
    .line 596
    return-object v2

    .line 597
    :catchall_1
    move-exception v0

    .line 598
    move-object/from16 v16, v2

    .line 599
    .line 600
    :goto_d
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 601
    .line 602
    .line 603
    invoke-virtual/range {v16 .. v16}, Landroidx/room/z;->b()V

    .line 604
    .line 605
    .line 606
    throw v0
.end method

.method public getEligibleWorkForSchedulingWithContentUris()Ljava/util/List;
    .locals 81
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/work/impl/model/WorkSpec;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v2, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time"

    .line 5
    .line 6
    invoke-static {v0, v2}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 11
    .line 12
    invoke-virtual {v3}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 13
    .line 14
    .line 15
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 16
    .line 17
    invoke-static {v3, v2, v0}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    :try_start_0
    const-string v4, "id"

    .line 22
    .line 23
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const-string v5, "state"

    .line 28
    .line 29
    invoke-static {v3, v5}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const-string v6, "worker_class_name"

    .line 34
    .line 35
    invoke-static {v3, v6}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    const-string v7, "input_merger_class_name"

    .line 40
    .line 41
    invoke-static {v3, v7}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    const-string v8, "input"

    .line 46
    .line 47
    invoke-static {v3, v8}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    const-string v9, "output"

    .line 52
    .line 53
    invoke-static {v3, v9}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    const-string v10, "initial_delay"

    .line 58
    .line 59
    invoke-static {v3, v10}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    const-string v11, "interval_duration"

    .line 64
    .line 65
    invoke-static {v3, v11}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    const-string v12, "flex_duration"

    .line 70
    .line 71
    invoke-static {v3, v12}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v12

    .line 75
    const-string v13, "run_attempt_count"

    .line 76
    .line 77
    invoke-static {v3, v13}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v13

    .line 81
    const-string v14, "backoff_policy"

    .line 82
    .line 83
    invoke-static {v3, v14}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v14

    .line 87
    const-string v15, "backoff_delay_duration"

    .line 88
    .line 89
    invoke-static {v3, v15}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v15

    .line 93
    const-string v0, "last_enqueue_time"

    .line 94
    .line 95
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const-string v1, "minimum_retention_duration"

    .line 100
    .line 101
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 105
    move-object/from16 v16, v2

    .line 106
    .line 107
    :try_start_1
    const-string v2, "schedule_requested_at"

    .line 108
    .line 109
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    move/from16 v17, v2

    .line 114
    .line 115
    const-string v2, "run_in_foreground"

    .line 116
    .line 117
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    move/from16 v18, v2

    .line 122
    .line 123
    const-string v2, "out_of_quota_policy"

    .line 124
    .line 125
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    move/from16 v19, v2

    .line 130
    .line 131
    const-string v2, "period_count"

    .line 132
    .line 133
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    move/from16 v20, v2

    .line 138
    .line 139
    const-string v2, "generation"

    .line 140
    .line 141
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    move/from16 v21, v2

    .line 146
    .line 147
    const-string v2, "next_schedule_time_override"

    .line 148
    .line 149
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    move/from16 v22, v2

    .line 154
    .line 155
    const-string v2, "next_schedule_time_override_generation"

    .line 156
    .line 157
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    move/from16 v23, v2

    .line 162
    .line 163
    const-string v2, "stop_reason"

    .line 164
    .line 165
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    move/from16 v24, v2

    .line 170
    .line 171
    const-string v2, "trace_tag"

    .line 172
    .line 173
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    move/from16 v25, v2

    .line 178
    .line 179
    const-string v2, "required_network_type"

    .line 180
    .line 181
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    move/from16 v26, v2

    .line 186
    .line 187
    const-string v2, "required_network_request"

    .line 188
    .line 189
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    move/from16 v27, v2

    .line 194
    .line 195
    const-string v2, "requires_charging"

    .line 196
    .line 197
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    move/from16 v28, v2

    .line 202
    .line 203
    const-string v2, "requires_device_idle"

    .line 204
    .line 205
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    move/from16 v29, v2

    .line 210
    .line 211
    const-string v2, "requires_battery_not_low"

    .line 212
    .line 213
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    move/from16 v30, v2

    .line 218
    .line 219
    const-string v2, "requires_storage_not_low"

    .line 220
    .line 221
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    move/from16 v31, v2

    .line 226
    .line 227
    const-string v2, "trigger_content_update_delay"

    .line 228
    .line 229
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    move/from16 v32, v2

    .line 234
    .line 235
    const-string v2, "trigger_max_content_delay"

    .line 236
    .line 237
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    move/from16 v33, v2

    .line 242
    .line 243
    const-string v2, "content_uri_triggers"

    .line 244
    .line 245
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    move/from16 v34, v2

    .line 250
    .line 251
    new-instance v2, Ljava/util/ArrayList;

    .line 252
    .line 253
    move/from16 v35, v1

    .line 254
    .line 255
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 260
    .line 261
    .line 262
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    if-eqz v1, :cond_6

    .line 267
    .line 268
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v37

    .line 272
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    invoke-static {v1}, Landroidx/work/impl/model/WorkTypeConverters;->intToState(I)Landroidx/work/WorkInfo$State;

    .line 277
    .line 278
    .line 279
    move-result-object v38

    .line 280
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v39

    .line 284
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v40

    .line 288
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getBlob(I)[B

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-static {v1}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 293
    .line 294
    .line 295
    move-result-object v41

    .line 296
    invoke-interface {v3, v9}, Landroid/database/Cursor;->getBlob(I)[B

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-static {v1}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 301
    .line 302
    .line 303
    move-result-object v42

    .line 304
    invoke-interface {v3, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 305
    .line 306
    .line 307
    move-result-wide v43

    .line 308
    invoke-interface {v3, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 309
    .line 310
    .line 311
    move-result-wide v45

    .line 312
    invoke-interface {v3, v12}, Landroid/database/Cursor;->getLong(I)J

    .line 313
    .line 314
    .line 315
    move-result-wide v47

    .line 316
    invoke-interface {v3, v13}, Landroid/database/Cursor;->getInt(I)I

    .line 317
    .line 318
    .line 319
    move-result v50

    .line 320
    invoke-interface {v3, v14}, Landroid/database/Cursor;->getInt(I)I

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    invoke-static {v1}, Landroidx/work/impl/model/WorkTypeConverters;->intToBackoffPolicy(I)Landroidx/work/BackoffPolicy;

    .line 325
    .line 326
    .line 327
    move-result-object v51

    .line 328
    invoke-interface {v3, v15}, Landroid/database/Cursor;->getLong(I)J

    .line 329
    .line 330
    .line 331
    move-result-wide v52

    .line 332
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 333
    .line 334
    .line 335
    move-result-wide v54

    .line 336
    move/from16 v1, v35

    .line 337
    .line 338
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 339
    .line 340
    .line 341
    move-result-wide v56

    .line 342
    move/from16 v35, v0

    .line 343
    .line 344
    move/from16 v0, v17

    .line 345
    .line 346
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 347
    .line 348
    .line 349
    move-result-wide v58

    .line 350
    move/from16 v17, v0

    .line 351
    .line 352
    move/from16 v0, v18

    .line 353
    .line 354
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 355
    .line 356
    .line 357
    move-result v18

    .line 358
    const/16 v36, 0x1

    .line 359
    .line 360
    if-eqz v18, :cond_0

    .line 361
    .line 362
    move/from16 v60, v36

    .line 363
    .line 364
    :goto_1
    move/from16 v18, v0

    .line 365
    .line 366
    move/from16 v0, v19

    .line 367
    .line 368
    goto :goto_2

    .line 369
    :cond_0
    const/16 v60, 0x0

    .line 370
    .line 371
    goto :goto_1

    .line 372
    :goto_2
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 373
    .line 374
    .line 375
    move-result v19

    .line 376
    invoke-static/range {v19 .. v19}, Landroidx/work/impl/model/WorkTypeConverters;->intToOutOfQuotaPolicy(I)Landroidx/work/OutOfQuotaPolicy;

    .line 377
    .line 378
    .line 379
    move-result-object v61

    .line 380
    move/from16 v19, v0

    .line 381
    .line 382
    move/from16 v0, v20

    .line 383
    .line 384
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 385
    .line 386
    .line 387
    move-result v62

    .line 388
    move/from16 v20, v0

    .line 389
    .line 390
    move/from16 v0, v21

    .line 391
    .line 392
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 393
    .line 394
    .line 395
    move-result v63

    .line 396
    move/from16 v21, v0

    .line 397
    .line 398
    move/from16 v0, v22

    .line 399
    .line 400
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 401
    .line 402
    .line 403
    move-result-wide v64

    .line 404
    move/from16 v22, v0

    .line 405
    .line 406
    move/from16 v0, v23

    .line 407
    .line 408
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 409
    .line 410
    .line 411
    move-result v66

    .line 412
    move/from16 v23, v0

    .line 413
    .line 414
    move/from16 v0, v24

    .line 415
    .line 416
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 417
    .line 418
    .line 419
    move-result v67

    .line 420
    move/from16 v24, v0

    .line 421
    .line 422
    move/from16 v0, v25

    .line 423
    .line 424
    invoke-interface {v3, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 425
    .line 426
    .line 427
    move-result v25

    .line 428
    if-eqz v25, :cond_1

    .line 429
    .line 430
    const/16 v25, 0x0

    .line 431
    .line 432
    :goto_3
    move-object/from16 v68, v25

    .line 433
    .line 434
    move/from16 v25, v0

    .line 435
    .line 436
    move/from16 v0, v26

    .line 437
    .line 438
    goto :goto_4

    .line 439
    :cond_1
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v25

    .line 443
    goto :goto_3

    .line 444
    :goto_4
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 445
    .line 446
    .line 447
    move-result v26

    .line 448
    invoke-static/range {v26 .. v26}, Landroidx/work/impl/model/WorkTypeConverters;->intToNetworkType(I)Landroidx/work/NetworkType;

    .line 449
    .line 450
    .line 451
    move-result-object v71

    .line 452
    move/from16 v26, v0

    .line 453
    .line 454
    move/from16 v0, v27

    .line 455
    .line 456
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 457
    .line 458
    .line 459
    move-result-object v27

    .line 460
    invoke-static/range {v27 .. v27}, Landroidx/work/impl/model/WorkTypeConverters;->toNetworkRequest$work_runtime_release([B)Landroidx/work/impl/utils/NetworkRequestCompat;

    .line 461
    .line 462
    .line 463
    move-result-object v70

    .line 464
    move/from16 v27, v0

    .line 465
    .line 466
    move/from16 v0, v28

    .line 467
    .line 468
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 469
    .line 470
    .line 471
    move-result v28

    .line 472
    if-eqz v28, :cond_2

    .line 473
    .line 474
    move/from16 v72, v36

    .line 475
    .line 476
    :goto_5
    move/from16 v28, v0

    .line 477
    .line 478
    move/from16 v0, v29

    .line 479
    .line 480
    goto :goto_6

    .line 481
    :cond_2
    const/16 v72, 0x0

    .line 482
    .line 483
    goto :goto_5

    .line 484
    :goto_6
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 485
    .line 486
    .line 487
    move-result v29

    .line 488
    if-eqz v29, :cond_3

    .line 489
    .line 490
    move/from16 v73, v36

    .line 491
    .line 492
    :goto_7
    move/from16 v29, v0

    .line 493
    .line 494
    move/from16 v0, v30

    .line 495
    .line 496
    goto :goto_8

    .line 497
    :cond_3
    const/16 v73, 0x0

    .line 498
    .line 499
    goto :goto_7

    .line 500
    :goto_8
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 501
    .line 502
    .line 503
    move-result v30

    .line 504
    if-eqz v30, :cond_4

    .line 505
    .line 506
    move/from16 v74, v36

    .line 507
    .line 508
    :goto_9
    move/from16 v30, v0

    .line 509
    .line 510
    move/from16 v0, v31

    .line 511
    .line 512
    goto :goto_a

    .line 513
    :cond_4
    const/16 v74, 0x0

    .line 514
    .line 515
    goto :goto_9

    .line 516
    :goto_a
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 517
    .line 518
    .line 519
    move-result v31

    .line 520
    if-eqz v31, :cond_5

    .line 521
    .line 522
    move/from16 v75, v36

    .line 523
    .line 524
    :goto_b
    move/from16 v31, v0

    .line 525
    .line 526
    move/from16 v0, v32

    .line 527
    .line 528
    goto :goto_c

    .line 529
    :cond_5
    const/16 v75, 0x0

    .line 530
    .line 531
    goto :goto_b

    .line 532
    :goto_c
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 533
    .line 534
    .line 535
    move-result-wide v76

    .line 536
    move/from16 v32, v0

    .line 537
    .line 538
    move/from16 v0, v33

    .line 539
    .line 540
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 541
    .line 542
    .line 543
    move-result-wide v78

    .line 544
    move/from16 v33, v0

    .line 545
    .line 546
    move/from16 v0, v34

    .line 547
    .line 548
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 549
    .line 550
    .line 551
    move-result-object v34

    .line 552
    invoke-static/range {v34 .. v34}, Landroidx/work/impl/model/WorkTypeConverters;->byteArrayToSetOfTriggers([B)Ljava/util/Set;

    .line 553
    .line 554
    .line 555
    move-result-object v80

    .line 556
    new-instance v49, Landroidx/work/Constraints;

    .line 557
    .line 558
    move-object/from16 v69, v49

    .line 559
    .line 560
    invoke-direct/range {v69 .. v80}, Landroidx/work/Constraints;-><init>(Landroidx/work/impl/utils/NetworkRequestCompat;Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V

    .line 561
    .line 562
    .line 563
    move-object/from16 v49, v69

    .line 564
    .line 565
    new-instance v36, Landroidx/work/impl/model/WorkSpec;

    .line 566
    .line 567
    invoke-direct/range {v36 .. v68}, Landroidx/work/impl/model/WorkSpec;-><init>(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;IIJIILjava/lang/String;)V

    .line 568
    .line 569
    .line 570
    move/from16 v34, v0

    .line 571
    .line 572
    move-object/from16 v0, v36

    .line 573
    .line 574
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 575
    .line 576
    .line 577
    move/from16 v0, v35

    .line 578
    .line 579
    move/from16 v35, v1

    .line 580
    .line 581
    goto/16 :goto_0

    .line 582
    .line 583
    :catchall_0
    move-exception v0

    .line 584
    goto :goto_d

    .line 585
    :cond_6
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v16 .. v16}, Landroidx/room/z;->b()V

    .line 589
    .line 590
    .line 591
    return-object v2

    .line 592
    :catchall_1
    move-exception v0

    .line 593
    move-object/from16 v16, v2

    .line 594
    .line 595
    :goto_d
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v16 .. v16}, Landroidx/room/z;->b()V

    .line 599
    .line 600
    .line 601
    throw v0
.end method

.method public getInputsFromPrerequisites(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Landroidx/work/Data;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)"

    .line 3
    .line 4
    invoke-static {v0, v1}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1, v0, p1}, Landroidx/room/z;->m(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-static {p1, v1, v0}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {v3}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Landroidx/room/z;->b()V

    .line 56
    .line 57
    .line 58
    return-object v2

    .line 59
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Landroidx/room/z;->b()V

    .line 63
    .line 64
    .line 65
    throw v0
.end method

.method public getRecentlyCompletedWork(J)Ljava/util/List;
    .locals 80
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Landroidx/work/impl/model/WorkSpec;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const-string v2, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC"

    .line 5
    .line 6
    invoke-static {v0, v2}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move-wide/from16 v3, p1

    .line 11
    .line 12
    invoke-virtual {v2, v0, v3, v4}, Landroidx/room/z;->H(IJ)V

    .line 13
    .line 14
    .line 15
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 16
    .line 17
    invoke-virtual {v3}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 18
    .line 19
    .line 20
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-static {v3, v2, v4}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    :try_start_0
    const-string v5, "id"

    .line 28
    .line 29
    invoke-static {v3, v5}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const-string v6, "state"

    .line 34
    .line 35
    invoke-static {v3, v6}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    const-string v7, "worker_class_name"

    .line 40
    .line 41
    invoke-static {v3, v7}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    const-string v8, "input_merger_class_name"

    .line 46
    .line 47
    invoke-static {v3, v8}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    const-string v9, "input"

    .line 52
    .line 53
    invoke-static {v3, v9}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    const-string v10, "output"

    .line 58
    .line 59
    invoke-static {v3, v10}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    const-string v11, "initial_delay"

    .line 64
    .line 65
    invoke-static {v3, v11}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    const-string v12, "interval_duration"

    .line 70
    .line 71
    invoke-static {v3, v12}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v12

    .line 75
    const-string v13, "flex_duration"

    .line 76
    .line 77
    invoke-static {v3, v13}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v13

    .line 81
    const-string v14, "run_attempt_count"

    .line 82
    .line 83
    invoke-static {v3, v14}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v14

    .line 87
    const-string v15, "backoff_policy"

    .line 88
    .line 89
    invoke-static {v3, v15}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v15

    .line 93
    const-string v0, "backoff_delay_duration"

    .line 94
    .line 95
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const-string v4, "last_enqueue_time"

    .line 100
    .line 101
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    const-string v1, "minimum_retention_duration"

    .line 106
    .line 107
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 111
    move-object/from16 v16, v2

    .line 112
    .line 113
    :try_start_1
    const-string v2, "schedule_requested_at"

    .line 114
    .line 115
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    move/from16 p2, v2

    .line 120
    .line 121
    const-string v2, "run_in_foreground"

    .line 122
    .line 123
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    move/from16 v17, v2

    .line 128
    .line 129
    const-string v2, "out_of_quota_policy"

    .line 130
    .line 131
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    move/from16 v18, v2

    .line 136
    .line 137
    const-string v2, "period_count"

    .line 138
    .line 139
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    move/from16 v19, v2

    .line 144
    .line 145
    const-string v2, "generation"

    .line 146
    .line 147
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    move/from16 v20, v2

    .line 152
    .line 153
    const-string v2, "next_schedule_time_override"

    .line 154
    .line 155
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    move/from16 v21, v2

    .line 160
    .line 161
    const-string v2, "next_schedule_time_override_generation"

    .line 162
    .line 163
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    move/from16 v22, v2

    .line 168
    .line 169
    const-string v2, "stop_reason"

    .line 170
    .line 171
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    move/from16 v23, v2

    .line 176
    .line 177
    const-string v2, "trace_tag"

    .line 178
    .line 179
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    move/from16 v24, v2

    .line 184
    .line 185
    const-string v2, "required_network_type"

    .line 186
    .line 187
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    move/from16 v25, v2

    .line 192
    .line 193
    const-string v2, "required_network_request"

    .line 194
    .line 195
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    move/from16 v26, v2

    .line 200
    .line 201
    const-string v2, "requires_charging"

    .line 202
    .line 203
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    move/from16 v27, v2

    .line 208
    .line 209
    const-string v2, "requires_device_idle"

    .line 210
    .line 211
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    move/from16 v28, v2

    .line 216
    .line 217
    const-string v2, "requires_battery_not_low"

    .line 218
    .line 219
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    move/from16 v29, v2

    .line 224
    .line 225
    const-string v2, "requires_storage_not_low"

    .line 226
    .line 227
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    move/from16 v30, v2

    .line 232
    .line 233
    const-string v2, "trigger_content_update_delay"

    .line 234
    .line 235
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    move/from16 v31, v2

    .line 240
    .line 241
    const-string v2, "trigger_max_content_delay"

    .line 242
    .line 243
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    move/from16 v32, v2

    .line 248
    .line 249
    const-string v2, "content_uri_triggers"

    .line 250
    .line 251
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    move/from16 v33, v2

    .line 256
    .line 257
    new-instance v2, Ljava/util/ArrayList;

    .line 258
    .line 259
    move/from16 v34, v1

    .line 260
    .line 261
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 266
    .line 267
    .line 268
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    if-eqz v1, :cond_6

    .line 273
    .line 274
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v36

    .line 278
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    invoke-static {v1}, Landroidx/work/impl/model/WorkTypeConverters;->intToState(I)Landroidx/work/WorkInfo$State;

    .line 283
    .line 284
    .line 285
    move-result-object v37

    .line 286
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v38

    .line 290
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v39

    .line 294
    invoke-interface {v3, v9}, Landroid/database/Cursor;->getBlob(I)[B

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    invoke-static {v1}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 299
    .line 300
    .line 301
    move-result-object v40

    .line 302
    invoke-interface {v3, v10}, Landroid/database/Cursor;->getBlob(I)[B

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    invoke-static {v1}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 307
    .line 308
    .line 309
    move-result-object v41

    .line 310
    invoke-interface {v3, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 311
    .line 312
    .line 313
    move-result-wide v42

    .line 314
    invoke-interface {v3, v12}, Landroid/database/Cursor;->getLong(I)J

    .line 315
    .line 316
    .line 317
    move-result-wide v44

    .line 318
    invoke-interface {v3, v13}, Landroid/database/Cursor;->getLong(I)J

    .line 319
    .line 320
    .line 321
    move-result-wide v46

    .line 322
    invoke-interface {v3, v14}, Landroid/database/Cursor;->getInt(I)I

    .line 323
    .line 324
    .line 325
    move-result v49

    .line 326
    invoke-interface {v3, v15}, Landroid/database/Cursor;->getInt(I)I

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    invoke-static {v1}, Landroidx/work/impl/model/WorkTypeConverters;->intToBackoffPolicy(I)Landroidx/work/BackoffPolicy;

    .line 331
    .line 332
    .line 333
    move-result-object v50

    .line 334
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 335
    .line 336
    .line 337
    move-result-wide v51

    .line 338
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 339
    .line 340
    .line 341
    move-result-wide v53

    .line 342
    move/from16 v1, v34

    .line 343
    .line 344
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 345
    .line 346
    .line 347
    move-result-wide v55

    .line 348
    move/from16 v34, v0

    .line 349
    .line 350
    move/from16 v0, p2

    .line 351
    .line 352
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 353
    .line 354
    .line 355
    move-result-wide v57

    .line 356
    move/from16 p2, v0

    .line 357
    .line 358
    move/from16 v0, v17

    .line 359
    .line 360
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 361
    .line 362
    .line 363
    move-result v17

    .line 364
    if-eqz v17, :cond_0

    .line 365
    .line 366
    const/16 v59, 0x1

    .line 367
    .line 368
    :goto_1
    move/from16 v17, v0

    .line 369
    .line 370
    move/from16 v0, v18

    .line 371
    .line 372
    goto :goto_2

    .line 373
    :cond_0
    const/16 v59, 0x0

    .line 374
    .line 375
    goto :goto_1

    .line 376
    :goto_2
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 377
    .line 378
    .line 379
    move-result v18

    .line 380
    invoke-static/range {v18 .. v18}, Landroidx/work/impl/model/WorkTypeConverters;->intToOutOfQuotaPolicy(I)Landroidx/work/OutOfQuotaPolicy;

    .line 381
    .line 382
    .line 383
    move-result-object v60

    .line 384
    move/from16 v18, v0

    .line 385
    .line 386
    move/from16 v0, v19

    .line 387
    .line 388
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 389
    .line 390
    .line 391
    move-result v61

    .line 392
    move/from16 v19, v0

    .line 393
    .line 394
    move/from16 v0, v20

    .line 395
    .line 396
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 397
    .line 398
    .line 399
    move-result v62

    .line 400
    move/from16 v20, v0

    .line 401
    .line 402
    move/from16 v0, v21

    .line 403
    .line 404
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 405
    .line 406
    .line 407
    move-result-wide v63

    .line 408
    move/from16 v21, v0

    .line 409
    .line 410
    move/from16 v0, v22

    .line 411
    .line 412
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 413
    .line 414
    .line 415
    move-result v65

    .line 416
    move/from16 v22, v0

    .line 417
    .line 418
    move/from16 v0, v23

    .line 419
    .line 420
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 421
    .line 422
    .line 423
    move-result v66

    .line 424
    move/from16 v23, v0

    .line 425
    .line 426
    move/from16 v0, v24

    .line 427
    .line 428
    invoke-interface {v3, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 429
    .line 430
    .line 431
    move-result v24

    .line 432
    if-eqz v24, :cond_1

    .line 433
    .line 434
    const/16 v24, 0x0

    .line 435
    .line 436
    :goto_3
    move-object/from16 v67, v24

    .line 437
    .line 438
    move/from16 v24, v0

    .line 439
    .line 440
    move/from16 v0, v25

    .line 441
    .line 442
    goto :goto_4

    .line 443
    :cond_1
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v24

    .line 447
    goto :goto_3

    .line 448
    :goto_4
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 449
    .line 450
    .line 451
    move-result v25

    .line 452
    invoke-static/range {v25 .. v25}, Landroidx/work/impl/model/WorkTypeConverters;->intToNetworkType(I)Landroidx/work/NetworkType;

    .line 453
    .line 454
    .line 455
    move-result-object v70

    .line 456
    move/from16 v25, v0

    .line 457
    .line 458
    move/from16 v0, v26

    .line 459
    .line 460
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 461
    .line 462
    .line 463
    move-result-object v26

    .line 464
    invoke-static/range {v26 .. v26}, Landroidx/work/impl/model/WorkTypeConverters;->toNetworkRequest$work_runtime_release([B)Landroidx/work/impl/utils/NetworkRequestCompat;

    .line 465
    .line 466
    .line 467
    move-result-object v69

    .line 468
    move/from16 v26, v0

    .line 469
    .line 470
    move/from16 v0, v27

    .line 471
    .line 472
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 473
    .line 474
    .line 475
    move-result v27

    .line 476
    if-eqz v27, :cond_2

    .line 477
    .line 478
    const/16 v71, 0x1

    .line 479
    .line 480
    :goto_5
    move/from16 v27, v0

    .line 481
    .line 482
    move/from16 v0, v28

    .line 483
    .line 484
    goto :goto_6

    .line 485
    :cond_2
    const/16 v71, 0x0

    .line 486
    .line 487
    goto :goto_5

    .line 488
    :goto_6
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 489
    .line 490
    .line 491
    move-result v28

    .line 492
    if-eqz v28, :cond_3

    .line 493
    .line 494
    const/16 v72, 0x1

    .line 495
    .line 496
    :goto_7
    move/from16 v28, v0

    .line 497
    .line 498
    move/from16 v0, v29

    .line 499
    .line 500
    goto :goto_8

    .line 501
    :cond_3
    const/16 v72, 0x0

    .line 502
    .line 503
    goto :goto_7

    .line 504
    :goto_8
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 505
    .line 506
    .line 507
    move-result v29

    .line 508
    if-eqz v29, :cond_4

    .line 509
    .line 510
    const/16 v73, 0x1

    .line 511
    .line 512
    :goto_9
    move/from16 v29, v0

    .line 513
    .line 514
    move/from16 v0, v30

    .line 515
    .line 516
    goto :goto_a

    .line 517
    :cond_4
    const/16 v73, 0x0

    .line 518
    .line 519
    goto :goto_9

    .line 520
    :goto_a
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 521
    .line 522
    .line 523
    move-result v30

    .line 524
    if-eqz v30, :cond_5

    .line 525
    .line 526
    const/16 v74, 0x1

    .line 527
    .line 528
    :goto_b
    move/from16 v30, v0

    .line 529
    .line 530
    move/from16 v0, v31

    .line 531
    .line 532
    goto :goto_c

    .line 533
    :cond_5
    const/16 v74, 0x0

    .line 534
    .line 535
    goto :goto_b

    .line 536
    :goto_c
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 537
    .line 538
    .line 539
    move-result-wide v75

    .line 540
    move/from16 v31, v0

    .line 541
    .line 542
    move/from16 v0, v32

    .line 543
    .line 544
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 545
    .line 546
    .line 547
    move-result-wide v77

    .line 548
    move/from16 v32, v0

    .line 549
    .line 550
    move/from16 v0, v33

    .line 551
    .line 552
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 553
    .line 554
    .line 555
    move-result-object v33

    .line 556
    invoke-static/range {v33 .. v33}, Landroidx/work/impl/model/WorkTypeConverters;->byteArrayToSetOfTriggers([B)Ljava/util/Set;

    .line 557
    .line 558
    .line 559
    move-result-object v79

    .line 560
    new-instance v48, Landroidx/work/Constraints;

    .line 561
    .line 562
    move-object/from16 v68, v48

    .line 563
    .line 564
    invoke-direct/range {v68 .. v79}, Landroidx/work/Constraints;-><init>(Landroidx/work/impl/utils/NetworkRequestCompat;Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V

    .line 565
    .line 566
    .line 567
    move-object/from16 v48, v68

    .line 568
    .line 569
    new-instance v35, Landroidx/work/impl/model/WorkSpec;

    .line 570
    .line 571
    invoke-direct/range {v35 .. v67}, Landroidx/work/impl/model/WorkSpec;-><init>(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;IIJIILjava/lang/String;)V

    .line 572
    .line 573
    .line 574
    move/from16 v33, v0

    .line 575
    .line 576
    move-object/from16 v0, v35

    .line 577
    .line 578
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 579
    .line 580
    .line 581
    move/from16 v0, v34

    .line 582
    .line 583
    move/from16 v34, v1

    .line 584
    .line 585
    goto/16 :goto_0

    .line 586
    .line 587
    :catchall_0
    move-exception v0

    .line 588
    goto :goto_d

    .line 589
    :cond_6
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v16 .. v16}, Landroidx/room/z;->b()V

    .line 593
    .line 594
    .line 595
    return-object v2

    .line 596
    :catchall_1
    move-exception v0

    .line 597
    move-object/from16 v16, v2

    .line 598
    .line 599
    :goto_d
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {v16 .. v16}, Landroidx/room/z;->b()V

    .line 603
    .line 604
    .line 605
    throw v0
.end method

.method public getRunningWork()Ljava/util/List;
    .locals 81
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/work/impl/model/WorkSpec;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v2, "SELECT * FROM workspec WHERE state=1"

    .line 5
    .line 6
    invoke-static {v0, v2}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 11
    .line 12
    invoke-virtual {v3}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 13
    .line 14
    .line 15
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 16
    .line 17
    invoke-static {v3, v2, v0}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    :try_start_0
    const-string v4, "id"

    .line 22
    .line 23
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const-string v5, "state"

    .line 28
    .line 29
    invoke-static {v3, v5}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const-string v6, "worker_class_name"

    .line 34
    .line 35
    invoke-static {v3, v6}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    const-string v7, "input_merger_class_name"

    .line 40
    .line 41
    invoke-static {v3, v7}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    const-string v8, "input"

    .line 46
    .line 47
    invoke-static {v3, v8}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    const-string v9, "output"

    .line 52
    .line 53
    invoke-static {v3, v9}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    const-string v10, "initial_delay"

    .line 58
    .line 59
    invoke-static {v3, v10}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    const-string v11, "interval_duration"

    .line 64
    .line 65
    invoke-static {v3, v11}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    const-string v12, "flex_duration"

    .line 70
    .line 71
    invoke-static {v3, v12}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v12

    .line 75
    const-string v13, "run_attempt_count"

    .line 76
    .line 77
    invoke-static {v3, v13}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v13

    .line 81
    const-string v14, "backoff_policy"

    .line 82
    .line 83
    invoke-static {v3, v14}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v14

    .line 87
    const-string v15, "backoff_delay_duration"

    .line 88
    .line 89
    invoke-static {v3, v15}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v15

    .line 93
    const-string v0, "last_enqueue_time"

    .line 94
    .line 95
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const-string v1, "minimum_retention_duration"

    .line 100
    .line 101
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 105
    move-object/from16 v16, v2

    .line 106
    .line 107
    :try_start_1
    const-string v2, "schedule_requested_at"

    .line 108
    .line 109
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    move/from16 v17, v2

    .line 114
    .line 115
    const-string v2, "run_in_foreground"

    .line 116
    .line 117
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    move/from16 v18, v2

    .line 122
    .line 123
    const-string v2, "out_of_quota_policy"

    .line 124
    .line 125
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    move/from16 v19, v2

    .line 130
    .line 131
    const-string v2, "period_count"

    .line 132
    .line 133
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    move/from16 v20, v2

    .line 138
    .line 139
    const-string v2, "generation"

    .line 140
    .line 141
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    move/from16 v21, v2

    .line 146
    .line 147
    const-string v2, "next_schedule_time_override"

    .line 148
    .line 149
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    move/from16 v22, v2

    .line 154
    .line 155
    const-string v2, "next_schedule_time_override_generation"

    .line 156
    .line 157
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    move/from16 v23, v2

    .line 162
    .line 163
    const-string v2, "stop_reason"

    .line 164
    .line 165
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    move/from16 v24, v2

    .line 170
    .line 171
    const-string v2, "trace_tag"

    .line 172
    .line 173
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    move/from16 v25, v2

    .line 178
    .line 179
    const-string v2, "required_network_type"

    .line 180
    .line 181
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    move/from16 v26, v2

    .line 186
    .line 187
    const-string v2, "required_network_request"

    .line 188
    .line 189
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    move/from16 v27, v2

    .line 194
    .line 195
    const-string v2, "requires_charging"

    .line 196
    .line 197
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    move/from16 v28, v2

    .line 202
    .line 203
    const-string v2, "requires_device_idle"

    .line 204
    .line 205
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    move/from16 v29, v2

    .line 210
    .line 211
    const-string v2, "requires_battery_not_low"

    .line 212
    .line 213
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    move/from16 v30, v2

    .line 218
    .line 219
    const-string v2, "requires_storage_not_low"

    .line 220
    .line 221
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    move/from16 v31, v2

    .line 226
    .line 227
    const-string v2, "trigger_content_update_delay"

    .line 228
    .line 229
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    move/from16 v32, v2

    .line 234
    .line 235
    const-string v2, "trigger_max_content_delay"

    .line 236
    .line 237
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    move/from16 v33, v2

    .line 242
    .line 243
    const-string v2, "content_uri_triggers"

    .line 244
    .line 245
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    move/from16 v34, v2

    .line 250
    .line 251
    new-instance v2, Ljava/util/ArrayList;

    .line 252
    .line 253
    move/from16 v35, v1

    .line 254
    .line 255
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 260
    .line 261
    .line 262
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    if-eqz v1, :cond_6

    .line 267
    .line 268
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v37

    .line 272
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    invoke-static {v1}, Landroidx/work/impl/model/WorkTypeConverters;->intToState(I)Landroidx/work/WorkInfo$State;

    .line 277
    .line 278
    .line 279
    move-result-object v38

    .line 280
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v39

    .line 284
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v40

    .line 288
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getBlob(I)[B

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-static {v1}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 293
    .line 294
    .line 295
    move-result-object v41

    .line 296
    invoke-interface {v3, v9}, Landroid/database/Cursor;->getBlob(I)[B

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-static {v1}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 301
    .line 302
    .line 303
    move-result-object v42

    .line 304
    invoke-interface {v3, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 305
    .line 306
    .line 307
    move-result-wide v43

    .line 308
    invoke-interface {v3, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 309
    .line 310
    .line 311
    move-result-wide v45

    .line 312
    invoke-interface {v3, v12}, Landroid/database/Cursor;->getLong(I)J

    .line 313
    .line 314
    .line 315
    move-result-wide v47

    .line 316
    invoke-interface {v3, v13}, Landroid/database/Cursor;->getInt(I)I

    .line 317
    .line 318
    .line 319
    move-result v50

    .line 320
    invoke-interface {v3, v14}, Landroid/database/Cursor;->getInt(I)I

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    invoke-static {v1}, Landroidx/work/impl/model/WorkTypeConverters;->intToBackoffPolicy(I)Landroidx/work/BackoffPolicy;

    .line 325
    .line 326
    .line 327
    move-result-object v51

    .line 328
    invoke-interface {v3, v15}, Landroid/database/Cursor;->getLong(I)J

    .line 329
    .line 330
    .line 331
    move-result-wide v52

    .line 332
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 333
    .line 334
    .line 335
    move-result-wide v54

    .line 336
    move/from16 v1, v35

    .line 337
    .line 338
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 339
    .line 340
    .line 341
    move-result-wide v56

    .line 342
    move/from16 v35, v0

    .line 343
    .line 344
    move/from16 v0, v17

    .line 345
    .line 346
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 347
    .line 348
    .line 349
    move-result-wide v58

    .line 350
    move/from16 v17, v0

    .line 351
    .line 352
    move/from16 v0, v18

    .line 353
    .line 354
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 355
    .line 356
    .line 357
    move-result v18

    .line 358
    const/16 v36, 0x1

    .line 359
    .line 360
    if-eqz v18, :cond_0

    .line 361
    .line 362
    move/from16 v60, v36

    .line 363
    .line 364
    :goto_1
    move/from16 v18, v0

    .line 365
    .line 366
    move/from16 v0, v19

    .line 367
    .line 368
    goto :goto_2

    .line 369
    :cond_0
    const/16 v60, 0x0

    .line 370
    .line 371
    goto :goto_1

    .line 372
    :goto_2
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 373
    .line 374
    .line 375
    move-result v19

    .line 376
    invoke-static/range {v19 .. v19}, Landroidx/work/impl/model/WorkTypeConverters;->intToOutOfQuotaPolicy(I)Landroidx/work/OutOfQuotaPolicy;

    .line 377
    .line 378
    .line 379
    move-result-object v61

    .line 380
    move/from16 v19, v0

    .line 381
    .line 382
    move/from16 v0, v20

    .line 383
    .line 384
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 385
    .line 386
    .line 387
    move-result v62

    .line 388
    move/from16 v20, v0

    .line 389
    .line 390
    move/from16 v0, v21

    .line 391
    .line 392
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 393
    .line 394
    .line 395
    move-result v63

    .line 396
    move/from16 v21, v0

    .line 397
    .line 398
    move/from16 v0, v22

    .line 399
    .line 400
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 401
    .line 402
    .line 403
    move-result-wide v64

    .line 404
    move/from16 v22, v0

    .line 405
    .line 406
    move/from16 v0, v23

    .line 407
    .line 408
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 409
    .line 410
    .line 411
    move-result v66

    .line 412
    move/from16 v23, v0

    .line 413
    .line 414
    move/from16 v0, v24

    .line 415
    .line 416
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 417
    .line 418
    .line 419
    move-result v67

    .line 420
    move/from16 v24, v0

    .line 421
    .line 422
    move/from16 v0, v25

    .line 423
    .line 424
    invoke-interface {v3, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 425
    .line 426
    .line 427
    move-result v25

    .line 428
    if-eqz v25, :cond_1

    .line 429
    .line 430
    const/16 v25, 0x0

    .line 431
    .line 432
    :goto_3
    move-object/from16 v68, v25

    .line 433
    .line 434
    move/from16 v25, v0

    .line 435
    .line 436
    move/from16 v0, v26

    .line 437
    .line 438
    goto :goto_4

    .line 439
    :cond_1
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v25

    .line 443
    goto :goto_3

    .line 444
    :goto_4
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 445
    .line 446
    .line 447
    move-result v26

    .line 448
    invoke-static/range {v26 .. v26}, Landroidx/work/impl/model/WorkTypeConverters;->intToNetworkType(I)Landroidx/work/NetworkType;

    .line 449
    .line 450
    .line 451
    move-result-object v71

    .line 452
    move/from16 v26, v0

    .line 453
    .line 454
    move/from16 v0, v27

    .line 455
    .line 456
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 457
    .line 458
    .line 459
    move-result-object v27

    .line 460
    invoke-static/range {v27 .. v27}, Landroidx/work/impl/model/WorkTypeConverters;->toNetworkRequest$work_runtime_release([B)Landroidx/work/impl/utils/NetworkRequestCompat;

    .line 461
    .line 462
    .line 463
    move-result-object v70

    .line 464
    move/from16 v27, v0

    .line 465
    .line 466
    move/from16 v0, v28

    .line 467
    .line 468
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 469
    .line 470
    .line 471
    move-result v28

    .line 472
    if-eqz v28, :cond_2

    .line 473
    .line 474
    move/from16 v72, v36

    .line 475
    .line 476
    :goto_5
    move/from16 v28, v0

    .line 477
    .line 478
    move/from16 v0, v29

    .line 479
    .line 480
    goto :goto_6

    .line 481
    :cond_2
    const/16 v72, 0x0

    .line 482
    .line 483
    goto :goto_5

    .line 484
    :goto_6
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 485
    .line 486
    .line 487
    move-result v29

    .line 488
    if-eqz v29, :cond_3

    .line 489
    .line 490
    move/from16 v73, v36

    .line 491
    .line 492
    :goto_7
    move/from16 v29, v0

    .line 493
    .line 494
    move/from16 v0, v30

    .line 495
    .line 496
    goto :goto_8

    .line 497
    :cond_3
    const/16 v73, 0x0

    .line 498
    .line 499
    goto :goto_7

    .line 500
    :goto_8
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 501
    .line 502
    .line 503
    move-result v30

    .line 504
    if-eqz v30, :cond_4

    .line 505
    .line 506
    move/from16 v74, v36

    .line 507
    .line 508
    :goto_9
    move/from16 v30, v0

    .line 509
    .line 510
    move/from16 v0, v31

    .line 511
    .line 512
    goto :goto_a

    .line 513
    :cond_4
    const/16 v74, 0x0

    .line 514
    .line 515
    goto :goto_9

    .line 516
    :goto_a
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 517
    .line 518
    .line 519
    move-result v31

    .line 520
    if-eqz v31, :cond_5

    .line 521
    .line 522
    move/from16 v75, v36

    .line 523
    .line 524
    :goto_b
    move/from16 v31, v0

    .line 525
    .line 526
    move/from16 v0, v32

    .line 527
    .line 528
    goto :goto_c

    .line 529
    :cond_5
    const/16 v75, 0x0

    .line 530
    .line 531
    goto :goto_b

    .line 532
    :goto_c
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 533
    .line 534
    .line 535
    move-result-wide v76

    .line 536
    move/from16 v32, v0

    .line 537
    .line 538
    move/from16 v0, v33

    .line 539
    .line 540
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 541
    .line 542
    .line 543
    move-result-wide v78

    .line 544
    move/from16 v33, v0

    .line 545
    .line 546
    move/from16 v0, v34

    .line 547
    .line 548
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 549
    .line 550
    .line 551
    move-result-object v34

    .line 552
    invoke-static/range {v34 .. v34}, Landroidx/work/impl/model/WorkTypeConverters;->byteArrayToSetOfTriggers([B)Ljava/util/Set;

    .line 553
    .line 554
    .line 555
    move-result-object v80

    .line 556
    new-instance v49, Landroidx/work/Constraints;

    .line 557
    .line 558
    move-object/from16 v69, v49

    .line 559
    .line 560
    invoke-direct/range {v69 .. v80}, Landroidx/work/Constraints;-><init>(Landroidx/work/impl/utils/NetworkRequestCompat;Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V

    .line 561
    .line 562
    .line 563
    move-object/from16 v49, v69

    .line 564
    .line 565
    new-instance v36, Landroidx/work/impl/model/WorkSpec;

    .line 566
    .line 567
    invoke-direct/range {v36 .. v68}, Landroidx/work/impl/model/WorkSpec;-><init>(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;IIJIILjava/lang/String;)V

    .line 568
    .line 569
    .line 570
    move/from16 v34, v0

    .line 571
    .line 572
    move-object/from16 v0, v36

    .line 573
    .line 574
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 575
    .line 576
    .line 577
    move/from16 v0, v35

    .line 578
    .line 579
    move/from16 v35, v1

    .line 580
    .line 581
    goto/16 :goto_0

    .line 582
    .line 583
    :catchall_0
    move-exception v0

    .line 584
    goto :goto_d

    .line 585
    :cond_6
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v16 .. v16}, Landroidx/room/z;->b()V

    .line 589
    .line 590
    .line 591
    return-object v2

    .line 592
    :catchall_1
    move-exception v0

    .line 593
    move-object/from16 v16, v2

    .line 594
    .line 595
    :goto_d
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v16 .. v16}, Landroidx/room/z;->b()V

    .line 599
    .line 600
    .line 601
    throw v0
.end method

.method public getScheduleRequestedAtLiveData(Ljava/lang/String;)Landroidx/lifecycle/G;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Landroidx/lifecycle/G;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "SELECT schedule_requested_at FROM workspec WHERE id=?"

    .line 3
    .line 4
    invoke-static {v0, v1}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1, v0, p1}, Landroidx/room/z;->m(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/room/w;->getInvalidationTracker()Landroidx/room/q;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v0, "workspec"

    .line 18
    .line 19
    filled-new-array {v0}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v2, Landroidx/work/impl/model/WorkSpecDao_Impl$26;

    .line 24
    .line 25
    invoke-direct {v2, p0, v1}, Landroidx/work/impl/model/WorkSpecDao_Impl$26;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/z;)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {p1, v0, v1, v2}, Landroidx/room/q;->b([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/room/B;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public getScheduledWork()Ljava/util/List;
    .locals 81
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/work/impl/model/WorkSpec;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v2, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1"

    .line 5
    .line 6
    invoke-static {v0, v2}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 11
    .line 12
    invoke-virtual {v3}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 13
    .line 14
    .line 15
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 16
    .line 17
    invoke-static {v3, v2, v0}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    :try_start_0
    const-string v4, "id"

    .line 22
    .line 23
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const-string v5, "state"

    .line 28
    .line 29
    invoke-static {v3, v5}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const-string v6, "worker_class_name"

    .line 34
    .line 35
    invoke-static {v3, v6}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    const-string v7, "input_merger_class_name"

    .line 40
    .line 41
    invoke-static {v3, v7}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    const-string v8, "input"

    .line 46
    .line 47
    invoke-static {v3, v8}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    const-string v9, "output"

    .line 52
    .line 53
    invoke-static {v3, v9}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    const-string v10, "initial_delay"

    .line 58
    .line 59
    invoke-static {v3, v10}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    const-string v11, "interval_duration"

    .line 64
    .line 65
    invoke-static {v3, v11}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    const-string v12, "flex_duration"

    .line 70
    .line 71
    invoke-static {v3, v12}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v12

    .line 75
    const-string v13, "run_attempt_count"

    .line 76
    .line 77
    invoke-static {v3, v13}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v13

    .line 81
    const-string v14, "backoff_policy"

    .line 82
    .line 83
    invoke-static {v3, v14}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v14

    .line 87
    const-string v15, "backoff_delay_duration"

    .line 88
    .line 89
    invoke-static {v3, v15}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v15

    .line 93
    const-string v0, "last_enqueue_time"

    .line 94
    .line 95
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const-string v1, "minimum_retention_duration"

    .line 100
    .line 101
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 105
    move-object/from16 v16, v2

    .line 106
    .line 107
    :try_start_1
    const-string v2, "schedule_requested_at"

    .line 108
    .line 109
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    move/from16 v17, v2

    .line 114
    .line 115
    const-string v2, "run_in_foreground"

    .line 116
    .line 117
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    move/from16 v18, v2

    .line 122
    .line 123
    const-string v2, "out_of_quota_policy"

    .line 124
    .line 125
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    move/from16 v19, v2

    .line 130
    .line 131
    const-string v2, "period_count"

    .line 132
    .line 133
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    move/from16 v20, v2

    .line 138
    .line 139
    const-string v2, "generation"

    .line 140
    .line 141
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    move/from16 v21, v2

    .line 146
    .line 147
    const-string v2, "next_schedule_time_override"

    .line 148
    .line 149
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    move/from16 v22, v2

    .line 154
    .line 155
    const-string v2, "next_schedule_time_override_generation"

    .line 156
    .line 157
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    move/from16 v23, v2

    .line 162
    .line 163
    const-string v2, "stop_reason"

    .line 164
    .line 165
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    move/from16 v24, v2

    .line 170
    .line 171
    const-string v2, "trace_tag"

    .line 172
    .line 173
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    move/from16 v25, v2

    .line 178
    .line 179
    const-string v2, "required_network_type"

    .line 180
    .line 181
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    move/from16 v26, v2

    .line 186
    .line 187
    const-string v2, "required_network_request"

    .line 188
    .line 189
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    move/from16 v27, v2

    .line 194
    .line 195
    const-string v2, "requires_charging"

    .line 196
    .line 197
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    move/from16 v28, v2

    .line 202
    .line 203
    const-string v2, "requires_device_idle"

    .line 204
    .line 205
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    move/from16 v29, v2

    .line 210
    .line 211
    const-string v2, "requires_battery_not_low"

    .line 212
    .line 213
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    move/from16 v30, v2

    .line 218
    .line 219
    const-string v2, "requires_storage_not_low"

    .line 220
    .line 221
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    move/from16 v31, v2

    .line 226
    .line 227
    const-string v2, "trigger_content_update_delay"

    .line 228
    .line 229
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    move/from16 v32, v2

    .line 234
    .line 235
    const-string v2, "trigger_max_content_delay"

    .line 236
    .line 237
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    move/from16 v33, v2

    .line 242
    .line 243
    const-string v2, "content_uri_triggers"

    .line 244
    .line 245
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    move/from16 v34, v2

    .line 250
    .line 251
    new-instance v2, Ljava/util/ArrayList;

    .line 252
    .line 253
    move/from16 v35, v1

    .line 254
    .line 255
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 260
    .line 261
    .line 262
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    if-eqz v1, :cond_6

    .line 267
    .line 268
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v37

    .line 272
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    invoke-static {v1}, Landroidx/work/impl/model/WorkTypeConverters;->intToState(I)Landroidx/work/WorkInfo$State;

    .line 277
    .line 278
    .line 279
    move-result-object v38

    .line 280
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v39

    .line 284
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v40

    .line 288
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getBlob(I)[B

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-static {v1}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 293
    .line 294
    .line 295
    move-result-object v41

    .line 296
    invoke-interface {v3, v9}, Landroid/database/Cursor;->getBlob(I)[B

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-static {v1}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 301
    .line 302
    .line 303
    move-result-object v42

    .line 304
    invoke-interface {v3, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 305
    .line 306
    .line 307
    move-result-wide v43

    .line 308
    invoke-interface {v3, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 309
    .line 310
    .line 311
    move-result-wide v45

    .line 312
    invoke-interface {v3, v12}, Landroid/database/Cursor;->getLong(I)J

    .line 313
    .line 314
    .line 315
    move-result-wide v47

    .line 316
    invoke-interface {v3, v13}, Landroid/database/Cursor;->getInt(I)I

    .line 317
    .line 318
    .line 319
    move-result v50

    .line 320
    invoke-interface {v3, v14}, Landroid/database/Cursor;->getInt(I)I

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    invoke-static {v1}, Landroidx/work/impl/model/WorkTypeConverters;->intToBackoffPolicy(I)Landroidx/work/BackoffPolicy;

    .line 325
    .line 326
    .line 327
    move-result-object v51

    .line 328
    invoke-interface {v3, v15}, Landroid/database/Cursor;->getLong(I)J

    .line 329
    .line 330
    .line 331
    move-result-wide v52

    .line 332
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 333
    .line 334
    .line 335
    move-result-wide v54

    .line 336
    move/from16 v1, v35

    .line 337
    .line 338
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 339
    .line 340
    .line 341
    move-result-wide v56

    .line 342
    move/from16 v35, v0

    .line 343
    .line 344
    move/from16 v0, v17

    .line 345
    .line 346
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 347
    .line 348
    .line 349
    move-result-wide v58

    .line 350
    move/from16 v17, v0

    .line 351
    .line 352
    move/from16 v0, v18

    .line 353
    .line 354
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 355
    .line 356
    .line 357
    move-result v18

    .line 358
    const/16 v36, 0x1

    .line 359
    .line 360
    if-eqz v18, :cond_0

    .line 361
    .line 362
    move/from16 v60, v36

    .line 363
    .line 364
    :goto_1
    move/from16 v18, v0

    .line 365
    .line 366
    move/from16 v0, v19

    .line 367
    .line 368
    goto :goto_2

    .line 369
    :cond_0
    const/16 v60, 0x0

    .line 370
    .line 371
    goto :goto_1

    .line 372
    :goto_2
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 373
    .line 374
    .line 375
    move-result v19

    .line 376
    invoke-static/range {v19 .. v19}, Landroidx/work/impl/model/WorkTypeConverters;->intToOutOfQuotaPolicy(I)Landroidx/work/OutOfQuotaPolicy;

    .line 377
    .line 378
    .line 379
    move-result-object v61

    .line 380
    move/from16 v19, v0

    .line 381
    .line 382
    move/from16 v0, v20

    .line 383
    .line 384
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 385
    .line 386
    .line 387
    move-result v62

    .line 388
    move/from16 v20, v0

    .line 389
    .line 390
    move/from16 v0, v21

    .line 391
    .line 392
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 393
    .line 394
    .line 395
    move-result v63

    .line 396
    move/from16 v21, v0

    .line 397
    .line 398
    move/from16 v0, v22

    .line 399
    .line 400
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 401
    .line 402
    .line 403
    move-result-wide v64

    .line 404
    move/from16 v22, v0

    .line 405
    .line 406
    move/from16 v0, v23

    .line 407
    .line 408
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 409
    .line 410
    .line 411
    move-result v66

    .line 412
    move/from16 v23, v0

    .line 413
    .line 414
    move/from16 v0, v24

    .line 415
    .line 416
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 417
    .line 418
    .line 419
    move-result v67

    .line 420
    move/from16 v24, v0

    .line 421
    .line 422
    move/from16 v0, v25

    .line 423
    .line 424
    invoke-interface {v3, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 425
    .line 426
    .line 427
    move-result v25

    .line 428
    if-eqz v25, :cond_1

    .line 429
    .line 430
    const/16 v25, 0x0

    .line 431
    .line 432
    :goto_3
    move-object/from16 v68, v25

    .line 433
    .line 434
    move/from16 v25, v0

    .line 435
    .line 436
    move/from16 v0, v26

    .line 437
    .line 438
    goto :goto_4

    .line 439
    :cond_1
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v25

    .line 443
    goto :goto_3

    .line 444
    :goto_4
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 445
    .line 446
    .line 447
    move-result v26

    .line 448
    invoke-static/range {v26 .. v26}, Landroidx/work/impl/model/WorkTypeConverters;->intToNetworkType(I)Landroidx/work/NetworkType;

    .line 449
    .line 450
    .line 451
    move-result-object v71

    .line 452
    move/from16 v26, v0

    .line 453
    .line 454
    move/from16 v0, v27

    .line 455
    .line 456
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 457
    .line 458
    .line 459
    move-result-object v27

    .line 460
    invoke-static/range {v27 .. v27}, Landroidx/work/impl/model/WorkTypeConverters;->toNetworkRequest$work_runtime_release([B)Landroidx/work/impl/utils/NetworkRequestCompat;

    .line 461
    .line 462
    .line 463
    move-result-object v70

    .line 464
    move/from16 v27, v0

    .line 465
    .line 466
    move/from16 v0, v28

    .line 467
    .line 468
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 469
    .line 470
    .line 471
    move-result v28

    .line 472
    if-eqz v28, :cond_2

    .line 473
    .line 474
    move/from16 v72, v36

    .line 475
    .line 476
    :goto_5
    move/from16 v28, v0

    .line 477
    .line 478
    move/from16 v0, v29

    .line 479
    .line 480
    goto :goto_6

    .line 481
    :cond_2
    const/16 v72, 0x0

    .line 482
    .line 483
    goto :goto_5

    .line 484
    :goto_6
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 485
    .line 486
    .line 487
    move-result v29

    .line 488
    if-eqz v29, :cond_3

    .line 489
    .line 490
    move/from16 v73, v36

    .line 491
    .line 492
    :goto_7
    move/from16 v29, v0

    .line 493
    .line 494
    move/from16 v0, v30

    .line 495
    .line 496
    goto :goto_8

    .line 497
    :cond_3
    const/16 v73, 0x0

    .line 498
    .line 499
    goto :goto_7

    .line 500
    :goto_8
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 501
    .line 502
    .line 503
    move-result v30

    .line 504
    if-eqz v30, :cond_4

    .line 505
    .line 506
    move/from16 v74, v36

    .line 507
    .line 508
    :goto_9
    move/from16 v30, v0

    .line 509
    .line 510
    move/from16 v0, v31

    .line 511
    .line 512
    goto :goto_a

    .line 513
    :cond_4
    const/16 v74, 0x0

    .line 514
    .line 515
    goto :goto_9

    .line 516
    :goto_a
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 517
    .line 518
    .line 519
    move-result v31

    .line 520
    if-eqz v31, :cond_5

    .line 521
    .line 522
    move/from16 v75, v36

    .line 523
    .line 524
    :goto_b
    move/from16 v31, v0

    .line 525
    .line 526
    move/from16 v0, v32

    .line 527
    .line 528
    goto :goto_c

    .line 529
    :cond_5
    const/16 v75, 0x0

    .line 530
    .line 531
    goto :goto_b

    .line 532
    :goto_c
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 533
    .line 534
    .line 535
    move-result-wide v76

    .line 536
    move/from16 v32, v0

    .line 537
    .line 538
    move/from16 v0, v33

    .line 539
    .line 540
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 541
    .line 542
    .line 543
    move-result-wide v78

    .line 544
    move/from16 v33, v0

    .line 545
    .line 546
    move/from16 v0, v34

    .line 547
    .line 548
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 549
    .line 550
    .line 551
    move-result-object v34

    .line 552
    invoke-static/range {v34 .. v34}, Landroidx/work/impl/model/WorkTypeConverters;->byteArrayToSetOfTriggers([B)Ljava/util/Set;

    .line 553
    .line 554
    .line 555
    move-result-object v80

    .line 556
    new-instance v49, Landroidx/work/Constraints;

    .line 557
    .line 558
    move-object/from16 v69, v49

    .line 559
    .line 560
    invoke-direct/range {v69 .. v80}, Landroidx/work/Constraints;-><init>(Landroidx/work/impl/utils/NetworkRequestCompat;Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V

    .line 561
    .line 562
    .line 563
    move-object/from16 v49, v69

    .line 564
    .line 565
    new-instance v36, Landroidx/work/impl/model/WorkSpec;

    .line 566
    .line 567
    invoke-direct/range {v36 .. v68}, Landroidx/work/impl/model/WorkSpec;-><init>(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;IIJIILjava/lang/String;)V

    .line 568
    .line 569
    .line 570
    move/from16 v34, v0

    .line 571
    .line 572
    move-object/from16 v0, v36

    .line 573
    .line 574
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 575
    .line 576
    .line 577
    move/from16 v0, v35

    .line 578
    .line 579
    move/from16 v35, v1

    .line 580
    .line 581
    goto/16 :goto_0

    .line 582
    .line 583
    :catchall_0
    move-exception v0

    .line 584
    goto :goto_d

    .line 585
    :cond_6
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v16 .. v16}, Landroidx/room/z;->b()V

    .line 589
    .line 590
    .line 591
    return-object v2

    .line 592
    :catchall_1
    move-exception v0

    .line 593
    move-object/from16 v16, v2

    .line 594
    .line 595
    :goto_d
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v16 .. v16}, Landroidx/room/z;->b()V

    .line 599
    .line 600
    .line 601
    throw v0
.end method

.method public getState(Ljava/lang/String;)Landroidx/work/WorkInfo$State;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "SELECT state FROM workspec WHERE id=?"

    .line 3
    .line 4
    invoke-static {v0, v1}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1, v0, p1}, Landroidx/room/z;->m(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-static {p1, v1, v0}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-interface {p1, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    move-object v0, v3

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_0
    if-nez v0, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    sget-object v2, Landroidx/work/impl/model/WorkTypeConverters;->INSTANCE:Landroidx/work/impl/model/WorkTypeConverters;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-static {v0}, Landroidx/work/impl/model/WorkTypeConverters;->intToState(I)Landroidx/work/WorkInfo$State;

    .line 56
    .line 57
    .line 58
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    goto :goto_1

    .line 60
    :catchall_0
    move-exception v0

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Landroidx/room/z;->b()V

    .line 66
    .line 67
    .line 68
    return-object v3

    .line 69
    :goto_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Landroidx/room/z;->b()V

    .line 73
    .line 74
    .line 75
    throw v0
.end method

.method public getUnfinishedWorkWithName(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)"

    .line 3
    .line 4
    invoke-static {v0, v1}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1, v0, p1}, Landroidx/room/z;->m(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-static {p1, v1, v0}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Landroidx/room/z;->b()V

    .line 52
    .line 53
    .line 54
    return-object v2

    .line 55
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Landroidx/room/z;->b()V

    .line 59
    .line 60
    .line 61
    throw v0
.end method

.method public getUnfinishedWorkWithTag(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)"

    .line 3
    .line 4
    invoke-static {v0, v1}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1, v0, p1}, Landroidx/room/z;->m(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-static {p1, v1, v0}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Landroidx/room/z;->b()V

    .line 52
    .line 53
    .line 54
    return-object v2

    .line 55
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Landroidx/room/z;->b()V

    .line 59
    .line 60
    .line 61
    throw v0
.end method

.method public getWorkSpec(Ljava/lang/String;)Landroidx/work/impl/model/WorkSpec;
    .locals 69

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const-string v2, "SELECT * FROM workspec WHERE id=?"

    .line 5
    .line 6
    invoke-static {v0, v2}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move-object/from16 v3, p1

    .line 11
    .line 12
    invoke-virtual {v2, v0, v3}, Landroidx/room/z;->m(ILjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 16
    .line 17
    invoke-virtual {v3}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 18
    .line 19
    .line 20
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-static {v3, v2, v4}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    :try_start_0
    const-string v5, "id"

    .line 28
    .line 29
    invoke-static {v3, v5}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const-string v6, "state"

    .line 34
    .line 35
    invoke-static {v3, v6}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    const-string v7, "worker_class_name"

    .line 40
    .line 41
    invoke-static {v3, v7}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    const-string v8, "input_merger_class_name"

    .line 46
    .line 47
    invoke-static {v3, v8}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    const-string v9, "input"

    .line 52
    .line 53
    invoke-static {v3, v9}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    const-string v10, "output"

    .line 58
    .line 59
    invoke-static {v3, v10}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    const-string v11, "initial_delay"

    .line 64
    .line 65
    invoke-static {v3, v11}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    const-string v12, "interval_duration"

    .line 70
    .line 71
    invoke-static {v3, v12}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v12

    .line 75
    const-string v13, "flex_duration"

    .line 76
    .line 77
    invoke-static {v3, v13}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v13

    .line 81
    const-string v14, "run_attempt_count"

    .line 82
    .line 83
    invoke-static {v3, v14}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v14

    .line 87
    const-string v15, "backoff_policy"

    .line 88
    .line 89
    invoke-static {v3, v15}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v15

    .line 93
    const-string v0, "backoff_delay_duration"

    .line 94
    .line 95
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const-string v4, "last_enqueue_time"

    .line 100
    .line 101
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    const-string v1, "minimum_retention_duration"

    .line 106
    .line 107
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 111
    move-object/from16 v16, v2

    .line 112
    .line 113
    :try_start_1
    const-string v2, "schedule_requested_at"

    .line 114
    .line 115
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    move/from16 v17, v2

    .line 120
    .line 121
    const-string v2, "run_in_foreground"

    .line 122
    .line 123
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    move/from16 v18, v2

    .line 128
    .line 129
    const-string v2, "out_of_quota_policy"

    .line 130
    .line 131
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    move/from16 v19, v2

    .line 136
    .line 137
    const-string v2, "period_count"

    .line 138
    .line 139
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    move/from16 v20, v2

    .line 144
    .line 145
    const-string v2, "generation"

    .line 146
    .line 147
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    move/from16 v21, v2

    .line 152
    .line 153
    const-string v2, "next_schedule_time_override"

    .line 154
    .line 155
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    move/from16 v22, v2

    .line 160
    .line 161
    const-string v2, "next_schedule_time_override_generation"

    .line 162
    .line 163
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    move/from16 v23, v2

    .line 168
    .line 169
    const-string v2, "stop_reason"

    .line 170
    .line 171
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    move/from16 v24, v2

    .line 176
    .line 177
    const-string v2, "trace_tag"

    .line 178
    .line 179
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    move/from16 v25, v2

    .line 184
    .line 185
    const-string v2, "required_network_type"

    .line 186
    .line 187
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    move/from16 v26, v2

    .line 192
    .line 193
    const-string v2, "required_network_request"

    .line 194
    .line 195
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    move/from16 v27, v2

    .line 200
    .line 201
    const-string v2, "requires_charging"

    .line 202
    .line 203
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    move/from16 v28, v2

    .line 208
    .line 209
    const-string v2, "requires_device_idle"

    .line 210
    .line 211
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    move/from16 v29, v2

    .line 216
    .line 217
    const-string v2, "requires_battery_not_low"

    .line 218
    .line 219
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    move/from16 v30, v2

    .line 224
    .line 225
    const-string v2, "requires_storage_not_low"

    .line 226
    .line 227
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    move/from16 v31, v2

    .line 232
    .line 233
    const-string v2, "trigger_content_update_delay"

    .line 234
    .line 235
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    move/from16 v32, v2

    .line 240
    .line 241
    const-string v2, "trigger_max_content_delay"

    .line 242
    .line 243
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    move/from16 v33, v2

    .line 248
    .line 249
    const-string v2, "content_uri_triggers"

    .line 250
    .line 251
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->r(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    .line 256
    .line 257
    .line 258
    move-result v34

    .line 259
    const/16 v35, 0x0

    .line 260
    .line 261
    if-eqz v34, :cond_6

    .line 262
    .line 263
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v37

    .line 267
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 268
    .line 269
    .line 270
    move-result v5

    .line 271
    invoke-static {v5}, Landroidx/work/impl/model/WorkTypeConverters;->intToState(I)Landroidx/work/WorkInfo$State;

    .line 272
    .line 273
    .line 274
    move-result-object v38

    .line 275
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v39

    .line 279
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v40

    .line 283
    invoke-interface {v3, v9}, Landroid/database/Cursor;->getBlob(I)[B

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    invoke-static {v5}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 288
    .line 289
    .line 290
    move-result-object v41

    .line 291
    invoke-interface {v3, v10}, Landroid/database/Cursor;->getBlob(I)[B

    .line 292
    .line 293
    .line 294
    move-result-object v5

    .line 295
    invoke-static {v5}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 296
    .line 297
    .line 298
    move-result-object v42

    .line 299
    invoke-interface {v3, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 300
    .line 301
    .line 302
    move-result-wide v43

    .line 303
    invoke-interface {v3, v12}, Landroid/database/Cursor;->getLong(I)J

    .line 304
    .line 305
    .line 306
    move-result-wide v45

    .line 307
    invoke-interface {v3, v13}, Landroid/database/Cursor;->getLong(I)J

    .line 308
    .line 309
    .line 310
    move-result-wide v47

    .line 311
    invoke-interface {v3, v14}, Landroid/database/Cursor;->getInt(I)I

    .line 312
    .line 313
    .line 314
    move-result v50

    .line 315
    invoke-interface {v3, v15}, Landroid/database/Cursor;->getInt(I)I

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    invoke-static {v5}, Landroidx/work/impl/model/WorkTypeConverters;->intToBackoffPolicy(I)Landroidx/work/BackoffPolicy;

    .line 320
    .line 321
    .line 322
    move-result-object v51

    .line 323
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 324
    .line 325
    .line 326
    move-result-wide v52

    .line 327
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 328
    .line 329
    .line 330
    move-result-wide v54

    .line 331
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 332
    .line 333
    .line 334
    move-result-wide v56

    .line 335
    move/from16 v0, v17

    .line 336
    .line 337
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 338
    .line 339
    .line 340
    move-result-wide v58

    .line 341
    move/from16 v0, v18

    .line 342
    .line 343
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    if-eqz v0, :cond_0

    .line 348
    .line 349
    const/16 v60, 0x1

    .line 350
    .line 351
    :goto_0
    move/from16 v0, v19

    .line 352
    .line 353
    goto :goto_1

    .line 354
    :cond_0
    const/16 v60, 0x0

    .line 355
    .line 356
    goto :goto_0

    .line 357
    :goto_1
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    invoke-static {v0}, Landroidx/work/impl/model/WorkTypeConverters;->intToOutOfQuotaPolicy(I)Landroidx/work/OutOfQuotaPolicy;

    .line 362
    .line 363
    .line 364
    move-result-object v61

    .line 365
    move/from16 v0, v20

    .line 366
    .line 367
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 368
    .line 369
    .line 370
    move-result v62

    .line 371
    move/from16 v0, v21

    .line 372
    .line 373
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 374
    .line 375
    .line 376
    move-result v63

    .line 377
    move/from16 v0, v22

    .line 378
    .line 379
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 380
    .line 381
    .line 382
    move-result-wide v64

    .line 383
    move/from16 v0, v23

    .line 384
    .line 385
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 386
    .line 387
    .line 388
    move-result v66

    .line 389
    move/from16 v0, v24

    .line 390
    .line 391
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 392
    .line 393
    .line 394
    move-result v67

    .line 395
    move/from16 v0, v25

    .line 396
    .line 397
    invoke-interface {v3, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    if-eqz v1, :cond_1

    .line 402
    .line 403
    :goto_2
    move/from16 v0, v26

    .line 404
    .line 405
    move-object/from16 v68, v35

    .line 406
    .line 407
    goto :goto_3

    .line 408
    :cond_1
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v35

    .line 412
    goto :goto_2

    .line 413
    :goto_3
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    invoke-static {v0}, Landroidx/work/impl/model/WorkTypeConverters;->intToNetworkType(I)Landroidx/work/NetworkType;

    .line 418
    .line 419
    .line 420
    move-result-object v6

    .line 421
    move/from16 v0, v27

    .line 422
    .line 423
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    invoke-static {v0}, Landroidx/work/impl/model/WorkTypeConverters;->toNetworkRequest$work_runtime_release([B)Landroidx/work/impl/utils/NetworkRequestCompat;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    move/from16 v0, v28

    .line 432
    .line 433
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 434
    .line 435
    .line 436
    move-result v0

    .line 437
    if-eqz v0, :cond_2

    .line 438
    .line 439
    const/4 v7, 0x1

    .line 440
    :goto_4
    move/from16 v0, v29

    .line 441
    .line 442
    goto :goto_5

    .line 443
    :cond_2
    const/4 v7, 0x0

    .line 444
    goto :goto_4

    .line 445
    :goto_5
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 446
    .line 447
    .line 448
    move-result v0

    .line 449
    if-eqz v0, :cond_3

    .line 450
    .line 451
    const/4 v8, 0x1

    .line 452
    :goto_6
    move/from16 v0, v30

    .line 453
    .line 454
    goto :goto_7

    .line 455
    :cond_3
    const/4 v8, 0x0

    .line 456
    goto :goto_6

    .line 457
    :goto_7
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    if-eqz v0, :cond_4

    .line 462
    .line 463
    const/4 v9, 0x1

    .line 464
    :goto_8
    move/from16 v0, v31

    .line 465
    .line 466
    goto :goto_9

    .line 467
    :cond_4
    const/4 v9, 0x0

    .line 468
    goto :goto_8

    .line 469
    :goto_9
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 470
    .line 471
    .line 472
    move-result v0

    .line 473
    if-eqz v0, :cond_5

    .line 474
    .line 475
    const/4 v10, 0x1

    .line 476
    :goto_a
    move/from16 v0, v32

    .line 477
    .line 478
    goto :goto_b

    .line 479
    :cond_5
    const/4 v10, 0x0

    .line 480
    goto :goto_a

    .line 481
    :goto_b
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 482
    .line 483
    .line 484
    move-result-wide v11

    .line 485
    move/from16 v0, v33

    .line 486
    .line 487
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 488
    .line 489
    .line 490
    move-result-wide v13

    .line 491
    invoke-interface {v3, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    invoke-static {v0}, Landroidx/work/impl/model/WorkTypeConverters;->byteArrayToSetOfTriggers([B)Ljava/util/Set;

    .line 496
    .line 497
    .line 498
    move-result-object v15

    .line 499
    new-instance v49, Landroidx/work/Constraints;

    .line 500
    .line 501
    move-object/from16 v4, v49

    .line 502
    .line 503
    invoke-direct/range {v4 .. v15}, Landroidx/work/Constraints;-><init>(Landroidx/work/impl/utils/NetworkRequestCompat;Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V

    .line 504
    .line 505
    .line 506
    move-object/from16 v49, v4

    .line 507
    .line 508
    new-instance v36, Landroidx/work/impl/model/WorkSpec;

    .line 509
    .line 510
    invoke-direct/range {v36 .. v68}, Landroidx/work/impl/model/WorkSpec;-><init>(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;IIJIILjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 511
    .line 512
    .line 513
    move-object/from16 v35, v36

    .line 514
    .line 515
    goto :goto_c

    .line 516
    :catchall_0
    move-exception v0

    .line 517
    goto :goto_d

    .line 518
    :cond_6
    :goto_c
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v16 .. v16}, Landroidx/room/z;->b()V

    .line 522
    .line 523
    .line 524
    return-object v35

    .line 525
    :catchall_1
    move-exception v0

    .line 526
    move-object/from16 v16, v2

    .line 527
    .line 528
    :goto_d
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 529
    .line 530
    .line 531
    invoke-virtual/range {v16 .. v16}, Landroidx/room/z;->b()V

    .line 532
    .line 533
    .line 534
    throw v0
.end method

.method public getWorkSpecIdAndStatesForName(Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Landroidx/work/impl/model/WorkSpec$IdAndState;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"

    .line 3
    .line 4
    invoke-static {v0, v1}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1, v0, p1}, Landroidx/room/z;->m(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static {p1, v1, v2}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    invoke-static {v5}, Landroidx/work/impl/model/WorkTypeConverters;->intToState(I)Landroidx/work/WorkInfo$State;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    new-instance v6, Landroidx/work/impl/model/WorkSpec$IdAndState;

    .line 51
    .line 52
    invoke-direct {v6, v4, v5}, Landroidx/work/impl/model/WorkSpec$IdAndState;-><init>(Ljava/lang/String;Landroidx/work/WorkInfo$State;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    goto :goto_1

    .line 61
    :cond_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Landroidx/room/z;->b()V

    .line 65
    .line 66
    .line 67
    return-object v3

    .line 68
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Landroidx/room/z;->b()V

    .line 72
    .line 73
    .line 74
    throw v0
.end method

.method public getWorkStatusPojoFlowDataForIds(Ljava/util/List;)LP5/h;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "LP5/h;"
        }
    .end annotation

    .line 1
    const-string v0, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN ("

    .line 2
    .line 3
    invoke-static {v0}, LC0/S;->q(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v0, v1}, Ly4/b;->d(Ljava/lang/StringBuilder;I)V

    .line 12
    .line 13
    .line 14
    const-string v2, ")"

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v1, v0}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const/4 v1, 0x1

    .line 32
    move v2, v1

    .line 33
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0, v2, v3}, Landroidx/room/z;->m(ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    add-int/2addr v2, v1

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 51
    .line 52
    const-string v2, "WorkProgress"

    .line 53
    .line 54
    const-string v3, "workspec"

    .line 55
    .line 56
    const-string v4, "WorkTag"

    .line 57
    .line 58
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    new-instance v3, Landroidx/work/impl/model/WorkSpecDao_Impl$20;

    .line 63
    .line 64
    invoke-direct {v3, p0, v0}, Landroidx/work/impl/model/WorkSpecDao_Impl$20;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/z;)V

    .line 65
    .line 66
    .line 67
    invoke-static {p1, v1, v2, v3}, Landroidx/room/g;->a(Landroidx/room/w;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lu2/m;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1
.end method

.method public getWorkStatusPojoFlowForName(Ljava/lang/String;)LP5/h;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "LP5/h;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"

    .line 3
    .line 4
    invoke-static {v0, v1}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1, v0, p1}, Landroidx/room/z;->m(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 12
    .line 13
    const-string v2, "workspec"

    .line 14
    .line 15
    const-string v3, "workname"

    .line 16
    .line 17
    const-string v4, "WorkTag"

    .line 18
    .line 19
    const-string v5, "WorkProgress"

    .line 20
    .line 21
    filled-new-array {v4, v5, v2, v3}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v3, Landroidx/work/impl/model/WorkSpecDao_Impl$24;

    .line 26
    .line 27
    invoke-direct {v3, p0, v1}, Landroidx/work/impl/model/WorkSpecDao_Impl$24;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/z;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v0, v2, v3}, Landroidx/room/g;->a(Landroidx/room/w;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lu2/m;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method

.method public getWorkStatusPojoFlowForTag(Ljava/lang/String;)LP5/h;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "LP5/h;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)"

    .line 3
    .line 4
    invoke-static {v0, v1}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1, v0, p1}, Landroidx/room/z;->m(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 12
    .line 13
    const-string v2, "workspec"

    .line 14
    .line 15
    const-string v3, "worktag"

    .line 16
    .line 17
    const-string v4, "WorkTag"

    .line 18
    .line 19
    const-string v5, "WorkProgress"

    .line 20
    .line 21
    filled-new-array {v4, v5, v2, v3}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v3, Landroidx/work/impl/model/WorkSpecDao_Impl$21;

    .line 26
    .line 27
    invoke-direct {v3, p0, v1}, Landroidx/work/impl/model/WorkSpecDao_Impl$21;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/z;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v0, v2, v3}, Landroidx/room/g;->a(Landroidx/room/w;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lu2/m;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method

.method public getWorkStatusPojoForId(Ljava/lang/String;)Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;
    .locals 42

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const-string v2, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id=?"

    .line 5
    .line 6
    invoke-static {v0, v2}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move-object/from16 v3, p1

    .line 11
    .line 12
    invoke-virtual {v2, v0, v3}, Landroidx/room/z;->m(ILjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 16
    .line 17
    invoke-virtual {v3}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 18
    .line 19
    .line 20
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 21
    .line 22
    invoke-virtual {v3}, Landroidx/room/w;->beginTransaction()V

    .line 23
    .line 24
    .line 25
    :try_start_0
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 26
    .line 27
    invoke-static {v3, v2, v0}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 28
    .line 29
    .line 30
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    :try_start_1
    new-instance v4, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance v5, Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    :cond_0
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    const/4 v7, 0x0

    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-nez v8, :cond_1

    .line 57
    .line 58
    new-instance v8, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    goto/16 :goto_7

    .line 69
    .line 70
    :cond_1
    :goto_1
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-nez v7, :cond_0

    .line 79
    .line 80
    new-instance v7, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    const/4 v6, -0x1

    .line 90
    invoke-interface {v3, v6}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 91
    .line 92
    .line 93
    invoke-direct {v1, v4}, Landroidx/work/impl/model/WorkSpecDao_Impl;->__fetchRelationshipWorkTagAsjavaLangString(Ljava/util/HashMap;)V

    .line 94
    .line 95
    .line 96
    invoke-direct {v1, v5}, Landroidx/work/impl/model/WorkSpecDao_Impl;->__fetchRelationshipWorkProgressAsandroidxWorkData(Ljava/util/HashMap;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-eqz v6, :cond_7

    .line 104
    .line 105
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    invoke-static {v6}, Landroidx/work/impl/model/WorkTypeConverters;->intToState(I)Landroidx/work/WorkInfo$State;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    const/4 v6, 0x2

    .line 118
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getBlob(I)[B

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-static {v6}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    const/4 v6, 0x3

    .line 127
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 128
    .line 129
    .line 130
    move-result v19

    .line 131
    const/4 v6, 0x4

    .line 132
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 133
    .line 134
    .line 135
    move-result v26

    .line 136
    const/16 v6, 0xe

    .line 137
    .line 138
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 139
    .line 140
    .line 141
    move-result-wide v12

    .line 142
    const/16 v6, 0xf

    .line 143
    .line 144
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 145
    .line 146
    .line 147
    move-result-wide v14

    .line 148
    const/16 v6, 0x10

    .line 149
    .line 150
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 151
    .line 152
    .line 153
    move-result-wide v16

    .line 154
    const/16 v6, 0x11

    .line 155
    .line 156
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    invoke-static {v6}, Landroidx/work/impl/model/WorkTypeConverters;->intToBackoffPolicy(I)Landroidx/work/BackoffPolicy;

    .line 161
    .line 162
    .line 163
    move-result-object v20

    .line 164
    const/16 v6, 0x12

    .line 165
    .line 166
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 167
    .line 168
    .line 169
    move-result-wide v21

    .line 170
    const/16 v6, 0x13

    .line 171
    .line 172
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 173
    .line 174
    .line 175
    move-result-wide v23

    .line 176
    const/16 v6, 0x14

    .line 177
    .line 178
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 179
    .line 180
    .line 181
    move-result v25

    .line 182
    const/16 v6, 0x15

    .line 183
    .line 184
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 185
    .line 186
    .line 187
    move-result-wide v27

    .line 188
    const/16 v6, 0x16

    .line 189
    .line 190
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 191
    .line 192
    .line 193
    move-result v29

    .line 194
    const/4 v6, 0x5

    .line 195
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    invoke-static {v6}, Landroidx/work/impl/model/WorkTypeConverters;->intToNetworkType(I)Landroidx/work/NetworkType;

    .line 200
    .line 201
    .line 202
    move-result-object v32

    .line 203
    const/4 v6, 0x6

    .line 204
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getBlob(I)[B

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    invoke-static {v6}, Landroidx/work/impl/model/WorkTypeConverters;->toNetworkRequest$work_runtime_release([B)Landroidx/work/impl/utils/NetworkRequestCompat;

    .line 209
    .line 210
    .line 211
    move-result-object v31

    .line 212
    const/4 v6, 0x7

    .line 213
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    if-eqz v6, :cond_3

    .line 218
    .line 219
    move/from16 v33, v0

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_3
    move/from16 v33, v7

    .line 223
    .line 224
    :goto_2
    const/16 v6, 0x8

    .line 225
    .line 226
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    if-eqz v6, :cond_4

    .line 231
    .line 232
    move/from16 v34, v0

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_4
    move/from16 v34, v7

    .line 236
    .line 237
    :goto_3
    const/16 v6, 0x9

    .line 238
    .line 239
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 240
    .line 241
    .line 242
    move-result v6

    .line 243
    if-eqz v6, :cond_5

    .line 244
    .line 245
    move/from16 v35, v0

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_5
    move/from16 v35, v7

    .line 249
    .line 250
    :goto_4
    const/16 v6, 0xa

    .line 251
    .line 252
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 253
    .line 254
    .line 255
    move-result v6

    .line 256
    if-eqz v6, :cond_6

    .line 257
    .line 258
    move/from16 v36, v0

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_6
    move/from16 v36, v7

    .line 262
    .line 263
    :goto_5
    const/16 v0, 0xb

    .line 264
    .line 265
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 266
    .line 267
    .line 268
    move-result-wide v37

    .line 269
    const/16 v0, 0xc

    .line 270
    .line 271
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 272
    .line 273
    .line 274
    move-result-wide v39

    .line 275
    const/16 v0, 0xd

    .line 276
    .line 277
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-static {v0}, Landroidx/work/impl/model/WorkTypeConverters;->byteArrayToSetOfTriggers([B)Ljava/util/Set;

    .line 282
    .line 283
    .line 284
    move-result-object v41

    .line 285
    new-instance v30, Landroidx/work/Constraints;

    .line 286
    .line 287
    invoke-direct/range {v30 .. v41}, Landroidx/work/Constraints;-><init>(Landroidx/work/impl/utils/NetworkRequestCompat;Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V

    .line 288
    .line 289
    .line 290
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    check-cast v0, Ljava/util/ArrayList;

    .line 299
    .line 300
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v4

    .line 308
    move-object/from16 v31, v4

    .line 309
    .line 310
    check-cast v31, Ljava/util/ArrayList;

    .line 311
    .line 312
    new-instance v8, Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;

    .line 313
    .line 314
    move-object/from16 v18, v30

    .line 315
    .line 316
    move-object/from16 v30, v0

    .line 317
    .line 318
    invoke-direct/range {v8 .. v31}, Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;-><init>(Ljava/lang/String;Landroidx/work/WorkInfo$State;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJIIJILjava/util/List;Ljava/util/List;)V

    .line 319
    .line 320
    .line 321
    goto :goto_6

    .line 322
    :cond_7
    const/4 v8, 0x0

    .line 323
    :goto_6
    iget-object v0, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 324
    .line 325
    invoke-virtual {v0}, Landroidx/room/w;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 326
    .line 327
    .line 328
    :try_start_2
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v2}, Landroidx/room/z;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 332
    .line 333
    .line 334
    iget-object v0, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 335
    .line 336
    invoke-virtual {v0}, Landroidx/room/w;->endTransaction()V

    .line 337
    .line 338
    .line 339
    return-object v8

    .line 340
    :catchall_1
    move-exception v0

    .line 341
    goto :goto_8

    .line 342
    :goto_7
    :try_start_3
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2}, Landroidx/room/z;->b()V

    .line 346
    .line 347
    .line 348
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 349
    :goto_8
    iget-object v2, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 350
    .line 351
    invoke-virtual {v2}, Landroidx/room/w;->endTransaction()V

    .line 352
    .line 353
    .line 354
    throw v0
.end method

.method public getWorkStatusPojoForIds(Ljava/util/List;)Ljava/util/List;
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN ("

    .line 4
    .line 5
    invoke-static {v0}, LC0/S;->q(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {v0, v2}, Ly4/b;->d(Ljava/lang/StringBuilder;I)V

    .line 14
    .line 15
    .line 16
    const-string v3, ")"

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v2, v0}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v3, 0x1

    .line 34
    move v4, v3

    .line 35
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    check-cast v5, Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v2, v4, v5}, Landroidx/room/z;->m(ILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    add-int/2addr v4, v3

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-object v0, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 53
    .line 54
    invoke-virtual {v0}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 55
    .line 56
    .line 57
    iget-object v0, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 58
    .line 59
    invoke-virtual {v0}, Landroidx/room/w;->beginTransaction()V

    .line 60
    .line 61
    .line 62
    :try_start_0
    iget-object v0, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 63
    .line 64
    invoke-static {v0, v2, v3}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 65
    .line 66
    .line 67
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 68
    :try_start_1
    new-instance v0, Ljava/util/HashMap;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 71
    .line 72
    .line 73
    new-instance v5, Ljava/util/HashMap;

    .line 74
    .line 75
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 76
    .line 77
    .line 78
    :cond_1
    :goto_1
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    const/4 v7, 0x0

    .line 83
    if-eqz v6, :cond_3

    .line 84
    .line 85
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-virtual {v0, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    if-nez v8, :cond_2

    .line 94
    .line 95
    new-instance v8, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    goto/16 :goto_8

    .line 106
    .line 107
    :cond_2
    :goto_2
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    if-nez v7, :cond_1

    .line 116
    .line 117
    new-instance v7, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v5, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_3
    const/4 v6, -0x1

    .line 127
    invoke-interface {v4, v6}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 128
    .line 129
    .line 130
    invoke-direct {v1, v0}, Landroidx/work/impl/model/WorkSpecDao_Impl;->__fetchRelationshipWorkTagAsjavaLangString(Ljava/util/HashMap;)V

    .line 131
    .line 132
    .line 133
    invoke-direct {v1, v5}, Landroidx/work/impl/model/WorkSpecDao_Impl;->__fetchRelationshipWorkProgressAsandroidxWorkData(Ljava/util/HashMap;)V

    .line 134
    .line 135
    .line 136
    new-instance v6, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-interface {v4}, Landroid/database/Cursor;->getCount()I

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 143
    .line 144
    .line 145
    :goto_3
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    if-eqz v8, :cond_8

    .line 150
    .line 151
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    invoke-interface {v4, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 156
    .line 157
    .line 158
    move-result v8

    .line 159
    invoke-static {v8}, Landroidx/work/impl/model/WorkTypeConverters;->intToState(I)Landroidx/work/WorkInfo$State;

    .line 160
    .line 161
    .line 162
    move-result-object v11

    .line 163
    const/4 v8, 0x2

    .line 164
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getBlob(I)[B

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    invoke-static {v8}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 169
    .line 170
    .line 171
    move-result-object v12

    .line 172
    const/4 v8, 0x3

    .line 173
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 174
    .line 175
    .line 176
    move-result v20

    .line 177
    const/4 v8, 0x4

    .line 178
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 179
    .line 180
    .line 181
    move-result v27

    .line 182
    const/16 v8, 0xe

    .line 183
    .line 184
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 185
    .line 186
    .line 187
    move-result-wide v13

    .line 188
    const/16 v8, 0xf

    .line 189
    .line 190
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 191
    .line 192
    .line 193
    move-result-wide v15

    .line 194
    const/16 v8, 0x10

    .line 195
    .line 196
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 197
    .line 198
    .line 199
    move-result-wide v17

    .line 200
    const/16 v8, 0x11

    .line 201
    .line 202
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    invoke-static {v8}, Landroidx/work/impl/model/WorkTypeConverters;->intToBackoffPolicy(I)Landroidx/work/BackoffPolicy;

    .line 207
    .line 208
    .line 209
    move-result-object v21

    .line 210
    const/16 v8, 0x12

    .line 211
    .line 212
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 213
    .line 214
    .line 215
    move-result-wide v22

    .line 216
    const/16 v8, 0x13

    .line 217
    .line 218
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 219
    .line 220
    .line 221
    move-result-wide v24

    .line 222
    const/16 v8, 0x14

    .line 223
    .line 224
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 225
    .line 226
    .line 227
    move-result v26

    .line 228
    const/16 v8, 0x15

    .line 229
    .line 230
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 231
    .line 232
    .line 233
    move-result-wide v28

    .line 234
    const/16 v8, 0x16

    .line 235
    .line 236
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 237
    .line 238
    .line 239
    move-result v30

    .line 240
    const/4 v8, 0x5

    .line 241
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 242
    .line 243
    .line 244
    move-result v8

    .line 245
    invoke-static {v8}, Landroidx/work/impl/model/WorkTypeConverters;->intToNetworkType(I)Landroidx/work/NetworkType;

    .line 246
    .line 247
    .line 248
    move-result-object v33

    .line 249
    const/4 v8, 0x6

    .line 250
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getBlob(I)[B

    .line 251
    .line 252
    .line 253
    move-result-object v8

    .line 254
    invoke-static {v8}, Landroidx/work/impl/model/WorkTypeConverters;->toNetworkRequest$work_runtime_release([B)Landroidx/work/impl/utils/NetworkRequestCompat;

    .line 255
    .line 256
    .line 257
    move-result-object v32

    .line 258
    const/4 v8, 0x7

    .line 259
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 260
    .line 261
    .line 262
    move-result v8

    .line 263
    if-eqz v8, :cond_4

    .line 264
    .line 265
    move/from16 v34, v3

    .line 266
    .line 267
    goto :goto_4

    .line 268
    :cond_4
    move/from16 v34, v7

    .line 269
    .line 270
    :goto_4
    const/16 v8, 0x8

    .line 271
    .line 272
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 273
    .line 274
    .line 275
    move-result v8

    .line 276
    if-eqz v8, :cond_5

    .line 277
    .line 278
    move/from16 v35, v3

    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_5
    move/from16 v35, v7

    .line 282
    .line 283
    :goto_5
    const/16 v8, 0x9

    .line 284
    .line 285
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 286
    .line 287
    .line 288
    move-result v8

    .line 289
    if-eqz v8, :cond_6

    .line 290
    .line 291
    move/from16 v36, v3

    .line 292
    .line 293
    goto :goto_6

    .line 294
    :cond_6
    move/from16 v36, v7

    .line 295
    .line 296
    :goto_6
    const/16 v8, 0xa

    .line 297
    .line 298
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 299
    .line 300
    .line 301
    move-result v8

    .line 302
    if-eqz v8, :cond_7

    .line 303
    .line 304
    move/from16 v37, v3

    .line 305
    .line 306
    goto :goto_7

    .line 307
    :cond_7
    move/from16 v37, v7

    .line 308
    .line 309
    :goto_7
    const/16 v8, 0xb

    .line 310
    .line 311
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 312
    .line 313
    .line 314
    move-result-wide v38

    .line 315
    const/16 v8, 0xc

    .line 316
    .line 317
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 318
    .line 319
    .line 320
    move-result-wide v40

    .line 321
    const/16 v8, 0xd

    .line 322
    .line 323
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getBlob(I)[B

    .line 324
    .line 325
    .line 326
    move-result-object v8

    .line 327
    invoke-static {v8}, Landroidx/work/impl/model/WorkTypeConverters;->byteArrayToSetOfTriggers([B)Ljava/util/Set;

    .line 328
    .line 329
    .line 330
    move-result-object v42

    .line 331
    new-instance v31, Landroidx/work/Constraints;

    .line 332
    .line 333
    invoke-direct/range {v31 .. v42}, Landroidx/work/Constraints;-><init>(Landroidx/work/impl/utils/NetworkRequestCompat;Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V

    .line 334
    .line 335
    .line 336
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v8

    .line 340
    invoke-virtual {v0, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v8

    .line 344
    check-cast v8, Ljava/util/ArrayList;

    .line 345
    .line 346
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v9

    .line 350
    invoke-virtual {v5, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v9

    .line 354
    move-object/from16 v32, v9

    .line 355
    .line 356
    check-cast v32, Ljava/util/ArrayList;

    .line 357
    .line 358
    new-instance v9, Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;

    .line 359
    .line 360
    move-object/from16 v19, v31

    .line 361
    .line 362
    move-object/from16 v31, v8

    .line 363
    .line 364
    invoke-direct/range {v9 .. v32}, Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;-><init>(Ljava/lang/String;Landroidx/work/WorkInfo$State;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJIIJILjava/util/List;Ljava/util/List;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    goto/16 :goto_3

    .line 371
    .line 372
    :cond_8
    iget-object v0, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 373
    .line 374
    invoke-virtual {v0}, Landroidx/room/w;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 375
    .line 376
    .line 377
    :try_start_2
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2}, Landroidx/room/z;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 381
    .line 382
    .line 383
    iget-object v0, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 384
    .line 385
    invoke-virtual {v0}, Landroidx/room/w;->endTransaction()V

    .line 386
    .line 387
    .line 388
    return-object v6

    .line 389
    :catchall_1
    move-exception v0

    .line 390
    goto :goto_9

    .line 391
    :goto_8
    :try_start_3
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2}, Landroidx/room/z;->b()V

    .line 395
    .line 396
    .line 397
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 398
    :goto_9
    iget-object v2, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 399
    .line 400
    invoke-virtual {v2}, Landroidx/room/w;->endTransaction()V

    .line 401
    .line 402
    .line 403
    throw v0
.end method

.method public getWorkStatusPojoForName(Ljava/lang/String;)Ljava/util/List;
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const-string v2, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"

    .line 5
    .line 6
    invoke-static {v0, v2}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move-object/from16 v3, p1

    .line 11
    .line 12
    invoke-virtual {v2, v0, v3}, Landroidx/room/z;->m(ILjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 16
    .line 17
    invoke-virtual {v3}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 18
    .line 19
    .line 20
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 21
    .line 22
    invoke-virtual {v3}, Landroidx/room/w;->beginTransaction()V

    .line 23
    .line 24
    .line 25
    :try_start_0
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 26
    .line 27
    invoke-static {v3, v2, v0}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 28
    .line 29
    .line 30
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    :try_start_1
    new-instance v4, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance v5, Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    :cond_0
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    const/4 v7, 0x0

    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-nez v8, :cond_1

    .line 57
    .line 58
    new-instance v8, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    goto/16 :goto_7

    .line 69
    .line 70
    :cond_1
    :goto_1
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-nez v7, :cond_0

    .line 79
    .line 80
    new-instance v7, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    const/4 v6, -0x1

    .line 90
    invoke-interface {v3, v6}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 91
    .line 92
    .line 93
    invoke-direct {v1, v4}, Landroidx/work/impl/model/WorkSpecDao_Impl;->__fetchRelationshipWorkTagAsjavaLangString(Ljava/util/HashMap;)V

    .line 94
    .line 95
    .line 96
    invoke-direct {v1, v5}, Landroidx/work/impl/model/WorkSpecDao_Impl;->__fetchRelationshipWorkProgressAsandroidxWorkData(Ljava/util/HashMap;)V

    .line 97
    .line 98
    .line 99
    new-instance v6, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 106
    .line 107
    .line 108
    :goto_2
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    if-eqz v8, :cond_7

    .line 113
    .line 114
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    invoke-static {v8}, Landroidx/work/impl/model/WorkTypeConverters;->intToState(I)Landroidx/work/WorkInfo$State;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    const/4 v8, 0x2

    .line 127
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getBlob(I)[B

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    invoke-static {v8}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    const/4 v8, 0x3

    .line 136
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 137
    .line 138
    .line 139
    move-result v20

    .line 140
    const/4 v8, 0x4

    .line 141
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 142
    .line 143
    .line 144
    move-result v27

    .line 145
    const/16 v8, 0xe

    .line 146
    .line 147
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 148
    .line 149
    .line 150
    move-result-wide v13

    .line 151
    const/16 v8, 0xf

    .line 152
    .line 153
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 154
    .line 155
    .line 156
    move-result-wide v15

    .line 157
    const/16 v8, 0x10

    .line 158
    .line 159
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 160
    .line 161
    .line 162
    move-result-wide v17

    .line 163
    const/16 v8, 0x11

    .line 164
    .line 165
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    invoke-static {v8}, Landroidx/work/impl/model/WorkTypeConverters;->intToBackoffPolicy(I)Landroidx/work/BackoffPolicy;

    .line 170
    .line 171
    .line 172
    move-result-object v21

    .line 173
    const/16 v8, 0x12

    .line 174
    .line 175
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 176
    .line 177
    .line 178
    move-result-wide v22

    .line 179
    const/16 v8, 0x13

    .line 180
    .line 181
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 182
    .line 183
    .line 184
    move-result-wide v24

    .line 185
    const/16 v8, 0x14

    .line 186
    .line 187
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 188
    .line 189
    .line 190
    move-result v26

    .line 191
    const/16 v8, 0x15

    .line 192
    .line 193
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 194
    .line 195
    .line 196
    move-result-wide v28

    .line 197
    const/16 v8, 0x16

    .line 198
    .line 199
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 200
    .line 201
    .line 202
    move-result v30

    .line 203
    const/4 v8, 0x5

    .line 204
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 205
    .line 206
    .line 207
    move-result v8

    .line 208
    invoke-static {v8}, Landroidx/work/impl/model/WorkTypeConverters;->intToNetworkType(I)Landroidx/work/NetworkType;

    .line 209
    .line 210
    .line 211
    move-result-object v33

    .line 212
    const/4 v8, 0x6

    .line 213
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getBlob(I)[B

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    invoke-static {v8}, Landroidx/work/impl/model/WorkTypeConverters;->toNetworkRequest$work_runtime_release([B)Landroidx/work/impl/utils/NetworkRequestCompat;

    .line 218
    .line 219
    .line 220
    move-result-object v32

    .line 221
    const/4 v8, 0x7

    .line 222
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 223
    .line 224
    .line 225
    move-result v8

    .line 226
    if-eqz v8, :cond_3

    .line 227
    .line 228
    move/from16 v34, v0

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_3
    move/from16 v34, v7

    .line 232
    .line 233
    :goto_3
    const/16 v8, 0x8

    .line 234
    .line 235
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    if-eqz v8, :cond_4

    .line 240
    .line 241
    move/from16 v35, v0

    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_4
    move/from16 v35, v7

    .line 245
    .line 246
    :goto_4
    const/16 v8, 0x9

    .line 247
    .line 248
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    if-eqz v8, :cond_5

    .line 253
    .line 254
    move/from16 v36, v0

    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_5
    move/from16 v36, v7

    .line 258
    .line 259
    :goto_5
    const/16 v8, 0xa

    .line 260
    .line 261
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 262
    .line 263
    .line 264
    move-result v8

    .line 265
    if-eqz v8, :cond_6

    .line 266
    .line 267
    move/from16 v37, v0

    .line 268
    .line 269
    goto :goto_6

    .line 270
    :cond_6
    move/from16 v37, v7

    .line 271
    .line 272
    :goto_6
    const/16 v8, 0xb

    .line 273
    .line 274
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 275
    .line 276
    .line 277
    move-result-wide v38

    .line 278
    const/16 v8, 0xc

    .line 279
    .line 280
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 281
    .line 282
    .line 283
    move-result-wide v40

    .line 284
    const/16 v8, 0xd

    .line 285
    .line 286
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getBlob(I)[B

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    invoke-static {v8}, Landroidx/work/impl/model/WorkTypeConverters;->byteArrayToSetOfTriggers([B)Ljava/util/Set;

    .line 291
    .line 292
    .line 293
    move-result-object v42

    .line 294
    new-instance v31, Landroidx/work/Constraints;

    .line 295
    .line 296
    invoke-direct/range {v31 .. v42}, Landroidx/work/Constraints;-><init>(Landroidx/work/impl/utils/NetworkRequestCompat;Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V

    .line 297
    .line 298
    .line 299
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    invoke-virtual {v4, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v8

    .line 307
    check-cast v8, Ljava/util/ArrayList;

    .line 308
    .line 309
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v9

    .line 313
    invoke-virtual {v5, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v9

    .line 317
    move-object/from16 v32, v9

    .line 318
    .line 319
    check-cast v32, Ljava/util/ArrayList;

    .line 320
    .line 321
    new-instance v9, Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;

    .line 322
    .line 323
    move-object/from16 v19, v31

    .line 324
    .line 325
    move-object/from16 v31, v8

    .line 326
    .line 327
    invoke-direct/range {v9 .. v32}, Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;-><init>(Ljava/lang/String;Landroidx/work/WorkInfo$State;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJIIJILjava/util/List;Ljava/util/List;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    goto/16 :goto_2

    .line 334
    .line 335
    :cond_7
    iget-object v0, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 336
    .line 337
    invoke-virtual {v0}, Landroidx/room/w;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 338
    .line 339
    .line 340
    :try_start_2
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2}, Landroidx/room/z;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 344
    .line 345
    .line 346
    iget-object v0, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 347
    .line 348
    invoke-virtual {v0}, Landroidx/room/w;->endTransaction()V

    .line 349
    .line 350
    .line 351
    return-object v6

    .line 352
    :catchall_1
    move-exception v0

    .line 353
    goto :goto_8

    .line 354
    :goto_7
    :try_start_3
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2}, Landroidx/room/z;->b()V

    .line 358
    .line 359
    .line 360
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 361
    :goto_8
    iget-object v2, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 362
    .line 363
    invoke-virtual {v2}, Landroidx/room/w;->endTransaction()V

    .line 364
    .line 365
    .line 366
    throw v0
.end method

.method public getWorkStatusPojoForTag(Ljava/lang/String;)Ljava/util/List;
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const-string v2, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)"

    .line 5
    .line 6
    invoke-static {v0, v2}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move-object/from16 v3, p1

    .line 11
    .line 12
    invoke-virtual {v2, v0, v3}, Landroidx/room/z;->m(ILjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 16
    .line 17
    invoke-virtual {v3}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 18
    .line 19
    .line 20
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 21
    .line 22
    invoke-virtual {v3}, Landroidx/room/w;->beginTransaction()V

    .line 23
    .line 24
    .line 25
    :try_start_0
    iget-object v3, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 26
    .line 27
    invoke-static {v3, v2, v0}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 28
    .line 29
    .line 30
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    :try_start_1
    new-instance v4, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance v5, Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    :cond_0
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    const/4 v7, 0x0

    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-nez v8, :cond_1

    .line 57
    .line 58
    new-instance v8, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    goto/16 :goto_7

    .line 69
    .line 70
    :cond_1
    :goto_1
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-nez v7, :cond_0

    .line 79
    .line 80
    new-instance v7, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    const/4 v6, -0x1

    .line 90
    invoke-interface {v3, v6}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 91
    .line 92
    .line 93
    invoke-direct {v1, v4}, Landroidx/work/impl/model/WorkSpecDao_Impl;->__fetchRelationshipWorkTagAsjavaLangString(Ljava/util/HashMap;)V

    .line 94
    .line 95
    .line 96
    invoke-direct {v1, v5}, Landroidx/work/impl/model/WorkSpecDao_Impl;->__fetchRelationshipWorkProgressAsandroidxWorkData(Ljava/util/HashMap;)V

    .line 97
    .line 98
    .line 99
    new-instance v6, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 106
    .line 107
    .line 108
    :goto_2
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    if-eqz v8, :cond_7

    .line 113
    .line 114
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    invoke-static {v8}, Landroidx/work/impl/model/WorkTypeConverters;->intToState(I)Landroidx/work/WorkInfo$State;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    const/4 v8, 0x2

    .line 127
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getBlob(I)[B

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    invoke-static {v8}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    const/4 v8, 0x3

    .line 136
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 137
    .line 138
    .line 139
    move-result v20

    .line 140
    const/4 v8, 0x4

    .line 141
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 142
    .line 143
    .line 144
    move-result v27

    .line 145
    const/16 v8, 0xe

    .line 146
    .line 147
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 148
    .line 149
    .line 150
    move-result-wide v13

    .line 151
    const/16 v8, 0xf

    .line 152
    .line 153
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 154
    .line 155
    .line 156
    move-result-wide v15

    .line 157
    const/16 v8, 0x10

    .line 158
    .line 159
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 160
    .line 161
    .line 162
    move-result-wide v17

    .line 163
    const/16 v8, 0x11

    .line 164
    .line 165
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    invoke-static {v8}, Landroidx/work/impl/model/WorkTypeConverters;->intToBackoffPolicy(I)Landroidx/work/BackoffPolicy;

    .line 170
    .line 171
    .line 172
    move-result-object v21

    .line 173
    const/16 v8, 0x12

    .line 174
    .line 175
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 176
    .line 177
    .line 178
    move-result-wide v22

    .line 179
    const/16 v8, 0x13

    .line 180
    .line 181
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 182
    .line 183
    .line 184
    move-result-wide v24

    .line 185
    const/16 v8, 0x14

    .line 186
    .line 187
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 188
    .line 189
    .line 190
    move-result v26

    .line 191
    const/16 v8, 0x15

    .line 192
    .line 193
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 194
    .line 195
    .line 196
    move-result-wide v28

    .line 197
    const/16 v8, 0x16

    .line 198
    .line 199
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 200
    .line 201
    .line 202
    move-result v30

    .line 203
    const/4 v8, 0x5

    .line 204
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 205
    .line 206
    .line 207
    move-result v8

    .line 208
    invoke-static {v8}, Landroidx/work/impl/model/WorkTypeConverters;->intToNetworkType(I)Landroidx/work/NetworkType;

    .line 209
    .line 210
    .line 211
    move-result-object v33

    .line 212
    const/4 v8, 0x6

    .line 213
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getBlob(I)[B

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    invoke-static {v8}, Landroidx/work/impl/model/WorkTypeConverters;->toNetworkRequest$work_runtime_release([B)Landroidx/work/impl/utils/NetworkRequestCompat;

    .line 218
    .line 219
    .line 220
    move-result-object v32

    .line 221
    const/4 v8, 0x7

    .line 222
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 223
    .line 224
    .line 225
    move-result v8

    .line 226
    if-eqz v8, :cond_3

    .line 227
    .line 228
    move/from16 v34, v0

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_3
    move/from16 v34, v7

    .line 232
    .line 233
    :goto_3
    const/16 v8, 0x8

    .line 234
    .line 235
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    if-eqz v8, :cond_4

    .line 240
    .line 241
    move/from16 v35, v0

    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_4
    move/from16 v35, v7

    .line 245
    .line 246
    :goto_4
    const/16 v8, 0x9

    .line 247
    .line 248
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    if-eqz v8, :cond_5

    .line 253
    .line 254
    move/from16 v36, v0

    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_5
    move/from16 v36, v7

    .line 258
    .line 259
    :goto_5
    const/16 v8, 0xa

    .line 260
    .line 261
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 262
    .line 263
    .line 264
    move-result v8

    .line 265
    if-eqz v8, :cond_6

    .line 266
    .line 267
    move/from16 v37, v0

    .line 268
    .line 269
    goto :goto_6

    .line 270
    :cond_6
    move/from16 v37, v7

    .line 271
    .line 272
    :goto_6
    const/16 v8, 0xb

    .line 273
    .line 274
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 275
    .line 276
    .line 277
    move-result-wide v38

    .line 278
    const/16 v8, 0xc

    .line 279
    .line 280
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 281
    .line 282
    .line 283
    move-result-wide v40

    .line 284
    const/16 v8, 0xd

    .line 285
    .line 286
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getBlob(I)[B

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    invoke-static {v8}, Landroidx/work/impl/model/WorkTypeConverters;->byteArrayToSetOfTriggers([B)Ljava/util/Set;

    .line 291
    .line 292
    .line 293
    move-result-object v42

    .line 294
    new-instance v31, Landroidx/work/Constraints;

    .line 295
    .line 296
    invoke-direct/range {v31 .. v42}, Landroidx/work/Constraints;-><init>(Landroidx/work/impl/utils/NetworkRequestCompat;Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V

    .line 297
    .line 298
    .line 299
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    invoke-virtual {v4, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v8

    .line 307
    check-cast v8, Ljava/util/ArrayList;

    .line 308
    .line 309
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v9

    .line 313
    invoke-virtual {v5, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v9

    .line 317
    move-object/from16 v32, v9

    .line 318
    .line 319
    check-cast v32, Ljava/util/ArrayList;

    .line 320
    .line 321
    new-instance v9, Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;

    .line 322
    .line 323
    move-object/from16 v19, v31

    .line 324
    .line 325
    move-object/from16 v31, v8

    .line 326
    .line 327
    invoke-direct/range {v9 .. v32}, Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;-><init>(Ljava/lang/String;Landroidx/work/WorkInfo$State;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJIIJILjava/util/List;Ljava/util/List;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    goto/16 :goto_2

    .line 334
    .line 335
    :cond_7
    iget-object v0, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 336
    .line 337
    invoke-virtual {v0}, Landroidx/room/w;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 338
    .line 339
    .line 340
    :try_start_2
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2}, Landroidx/room/z;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 344
    .line 345
    .line 346
    iget-object v0, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 347
    .line 348
    invoke-virtual {v0}, Landroidx/room/w;->endTransaction()V

    .line 349
    .line 350
    .line 351
    return-object v6

    .line 352
    :catchall_1
    move-exception v0

    .line 353
    goto :goto_8

    .line 354
    :goto_7
    :try_start_3
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2}, Landroidx/room/z;->b()V

    .line 358
    .line 359
    .line 360
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 361
    :goto_8
    iget-object v2, v1, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 362
    .line 363
    invoke-virtual {v2}, Landroidx/room/w;->endTransaction()V

    .line 364
    .line 365
    .line 366
    throw v0
.end method

.method public getWorkStatusPojoLiveDataForIds(Ljava/util/List;)Landroidx/lifecycle/G;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Landroidx/lifecycle/G;"
        }
    .end annotation

    .line 1
    const-string v0, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN ("

    .line 2
    .line 3
    invoke-static {v0}, LC0/S;->q(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v0, v1}, Ly4/b;->d(Ljava/lang/StringBuilder;I)V

    .line 12
    .line 13
    .line 14
    const-string v2, ")"

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v1, v0}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const/4 v1, 0x1

    .line 32
    move v2, v1

    .line 33
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0, v2, v3}, Landroidx/room/z;->m(ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    add-int/2addr v2, v1

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 51
    .line 52
    invoke-virtual {p1}, Landroidx/room/w;->getInvalidationTracker()Landroidx/room/q;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const-string v2, "WorkProgress"

    .line 57
    .line 58
    const-string v3, "workspec"

    .line 59
    .line 60
    const-string v4, "WorkTag"

    .line 61
    .line 62
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    new-instance v3, Landroidx/work/impl/model/WorkSpecDao_Impl$19;

    .line 67
    .line 68
    invoke-direct {v3, p0, v0}, Landroidx/work/impl/model/WorkSpecDao_Impl$19;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/z;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v2, v1, v3}, Landroidx/room/q;->b([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/room/B;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1
.end method

.method public getWorkStatusPojoLiveDataForName(Ljava/lang/String;)Landroidx/lifecycle/G;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Landroidx/lifecycle/G;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"

    .line 3
    .line 4
    invoke-static {v0, v1}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1, v0, p1}, Landroidx/room/z;->m(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/room/w;->getInvalidationTracker()Landroidx/room/q;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v2, "workspec"

    .line 18
    .line 19
    const-string v3, "workname"

    .line 20
    .line 21
    const-string v4, "WorkTag"

    .line 22
    .line 23
    const-string v5, "WorkProgress"

    .line 24
    .line 25
    filled-new-array {v4, v5, v2, v3}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    new-instance v3, Landroidx/work/impl/model/WorkSpecDao_Impl$23;

    .line 30
    .line 31
    invoke-direct {v3, p0, v1}, Landroidx/work/impl/model/WorkSpecDao_Impl$23;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/z;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v2, v0, v3}, Landroidx/room/q;->b([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/room/B;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method public getWorkStatusPojoLiveDataForTag(Ljava/lang/String;)Landroidx/lifecycle/G;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Landroidx/lifecycle/G;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)"

    .line 3
    .line 4
    invoke-static {v0, v1}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1, v0, p1}, Landroidx/room/z;->m(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/room/w;->getInvalidationTracker()Landroidx/room/q;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v2, "workspec"

    .line 18
    .line 19
    const-string v3, "worktag"

    .line 20
    .line 21
    const-string v4, "WorkTag"

    .line 22
    .line 23
    const-string v5, "WorkProgress"

    .line 24
    .line 25
    filled-new-array {v4, v5, v2, v3}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    new-instance v3, Landroidx/work/impl/model/WorkSpecDao_Impl$22;

    .line 30
    .line 31
    invoke-direct {v3, p0, v1}, Landroidx/work/impl/model/WorkSpecDao_Impl$22;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/z;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v2, v0, v3}, Landroidx/room/q;->b([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/room/B;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method public hasUnfinishedWorkFlow()LP5/h;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LP5/h;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"

    .line 3
    .line 4
    invoke-static {v0, v1}, Landroidx/room/z;->a(ILjava/lang/String;)Landroidx/room/z;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 9
    .line 10
    const-string v3, "workspec"

    .line 11
    .line 12
    filled-new-array {v3}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    new-instance v4, Landroidx/work/impl/model/WorkSpecDao_Impl$25;

    .line 17
    .line 18
    invoke-direct {v4, p0, v1}, Landroidx/work/impl/model/WorkSpecDao_Impl$25;-><init>(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/room/z;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v2, v0, v3, v4}, Landroidx/room/g;->a(Landroidx/room/w;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lu2/m;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public incrementGeneration(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfIncrementGeneration:Landroidx/room/D;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/D;->acquire()Lj2/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-interface {v0, v1, p1}, Lj2/e;->m(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/room/w;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    :try_start_1
    invoke-interface {v0}, Lj2/g;->q()I

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/room/w;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    .line 28
    .line 29
    :try_start_2
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroidx/room/w;->endTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfIncrementGeneration:Landroidx/room/D;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_0

    .line 42
    :catchall_1
    move-exception p1

    .line 43
    :try_start_3
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 44
    .line 45
    invoke-virtual {v1}, Landroidx/room/w;->endTransaction()V

    .line 46
    .line 47
    .line 48
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 49
    :goto_0
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfIncrementGeneration:Landroidx/room/D;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method

.method public incrementPeriodCount(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfIncrementPeriodCount:Landroidx/room/D;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/D;->acquire()Lj2/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-interface {v0, v1, p1}, Lj2/e;->m(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/room/w;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    :try_start_1
    invoke-interface {v0}, Lj2/g;->q()I

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/room/w;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    .line 28
    .line 29
    :try_start_2
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroidx/room/w;->endTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfIncrementPeriodCount:Landroidx/room/D;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_0

    .line 42
    :catchall_1
    move-exception p1

    .line 43
    :try_start_3
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 44
    .line 45
    invoke-virtual {v1}, Landroidx/room/w;->endTransaction()V

    .line 46
    .line 47
    .line 48
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 49
    :goto_0
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfIncrementPeriodCount:Landroidx/room/D;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method

.method public incrementWorkSpecRunAttemptCount(Ljava/lang/String;)I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfIncrementWorkSpecRunAttemptCount:Landroidx/room/D;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/D;->acquire()Lj2/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-interface {v0, v1, p1}, Lj2/e;->m(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/room/w;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    :try_start_1
    invoke-interface {v0}, Lj2/g;->q()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroidx/room/w;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    .line 29
    .line 30
    :try_start_2
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroidx/room/w;->endTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfIncrementWorkSpecRunAttemptCount:Landroidx/room/D;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 38
    .line 39
    .line 40
    return p1

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_0

    .line 43
    :catchall_1
    move-exception p1

    .line 44
    :try_start_3
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroidx/room/w;->endTransaction()V

    .line 47
    .line 48
    .line 49
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 50
    :goto_0
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfIncrementWorkSpecRunAttemptCount:Landroidx/room/D;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 53
    .line 54
    .line 55
    throw p1
.end method

.method public insertWorkSpec(Landroidx/work/impl/model/WorkSpec;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/w;->beginTransaction()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__insertionAdapterOfWorkSpec:Landroidx/room/j;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroidx/room/j;->insert(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/room/w;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/room/w;->endTransaction()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/room/w;->endTransaction()V

    .line 31
    .line 32
    .line 33
    throw p1
.end method

.method public markWorkSpecScheduled(Ljava/lang/String;J)I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfMarkWorkSpecScheduled:Landroidx/room/D;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/D;->acquire()Lj2/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-interface {v0, v1, p2, p3}, Lj2/e;->H(IJ)V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x2

    .line 17
    invoke-interface {v0, p2, p1}, Lj2/e;->m(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :try_start_0
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroidx/room/w;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    :try_start_1
    invoke-interface {v0}, Lj2/g;->q()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iget-object p2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 30
    .line 31
    invoke-virtual {p2}, Landroidx/room/w;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    .line 33
    .line 34
    :try_start_2
    iget-object p2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 35
    .line 36
    invoke-virtual {p2}, Landroidx/room/w;->endTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 37
    .line 38
    .line 39
    iget-object p2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfMarkWorkSpecScheduled:Landroidx/room/D;

    .line 40
    .line 41
    invoke-virtual {p2, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 42
    .line 43
    .line 44
    return p1

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_0

    .line 47
    :catchall_1
    move-exception p1

    .line 48
    :try_start_3
    iget-object p2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 49
    .line 50
    invoke-virtual {p2}, Landroidx/room/w;->endTransaction()V

    .line 51
    .line 52
    .line 53
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 54
    :goto_0
    iget-object p2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfMarkWorkSpecScheduled:Landroidx/room/D;

    .line 55
    .line 56
    invoke-virtual {p2, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 57
    .line 58
    .line 59
    throw p1
.end method

.method public pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast:Landroidx/room/D;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/D;->acquire()Lj2/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :try_start_0
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroidx/room/w;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    :try_start_1
    invoke-interface {v0}, Lj2/g;->q()I

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroidx/room/w;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 23
    .line 24
    .line 25
    :try_start_2
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroidx/room/w;->endTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast:Landroidx/room/D;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    goto :goto_0

    .line 38
    :catchall_1
    move-exception v1

    .line 39
    :try_start_3
    iget-object v2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 40
    .line 41
    invoke-virtual {v2}, Landroidx/room/w;->endTransaction()V

    .line 42
    .line 43
    .line 44
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 45
    :goto_0
    iget-object v2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast:Landroidx/room/D;

    .line 46
    .line 47
    invoke-virtual {v2, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 48
    .line 49
    .line 50
    throw v1
.end method

.method public resetScheduledState()I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfResetScheduledState:Landroidx/room/D;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/D;->acquire()Lj2/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :try_start_0
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroidx/room/w;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    :try_start_1
    invoke-interface {v0}, Lj2/g;->q()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 22
    .line 23
    invoke-virtual {v2}, Landroidx/room/w;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 24
    .line 25
    .line 26
    :try_start_2
    iget-object v2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 27
    .line 28
    invoke-virtual {v2}, Landroidx/room/w;->endTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfResetScheduledState:Landroidx/room/D;

    .line 32
    .line 33
    invoke-virtual {v2, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 34
    .line 35
    .line 36
    return v1

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    goto :goto_0

    .line 39
    :catchall_1
    move-exception v1

    .line 40
    :try_start_3
    iget-object v2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 41
    .line 42
    invoke-virtual {v2}, Landroidx/room/w;->endTransaction()V

    .line 43
    .line 44
    .line 45
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 46
    :goto_0
    iget-object v2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfResetScheduledState:Landroidx/room/D;

    .line 47
    .line 48
    invoke-virtual {v2, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 49
    .line 50
    .line 51
    throw v1
.end method

.method public resetWorkSpecNextScheduleTimeOverride(Ljava/lang/String;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfResetWorkSpecNextScheduleTimeOverride:Landroidx/room/D;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/D;->acquire()Lj2/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-interface {v0, v1, p1}, Lj2/e;->m(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x2

    .line 17
    int-to-long v1, p2

    .line 18
    invoke-interface {v0, p1, v1, v2}, Lj2/e;->H(IJ)V

    .line 19
    .line 20
    .line 21
    :try_start_0
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/room/w;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    :try_start_1
    invoke-interface {v0}, Lj2/g;->q()I

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroidx/room/w;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    .line 33
    .line 34
    :try_start_2
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroidx/room/w;->endTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfResetWorkSpecNextScheduleTimeOverride:Landroidx/room/D;

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_0

    .line 47
    :catchall_1
    move-exception p1

    .line 48
    :try_start_3
    iget-object p2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 49
    .line 50
    invoke-virtual {p2}, Landroidx/room/w;->endTransaction()V

    .line 51
    .line 52
    .line 53
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 54
    :goto_0
    iget-object p2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfResetWorkSpecNextScheduleTimeOverride:Landroidx/room/D;

    .line 55
    .line 56
    invoke-virtual {p2, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 57
    .line 58
    .line 59
    throw p1
.end method

.method public resetWorkSpecRunAttemptCount(Ljava/lang/String;)I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfResetWorkSpecRunAttemptCount:Landroidx/room/D;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/D;->acquire()Lj2/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-interface {v0, v1, p1}, Lj2/e;->m(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/room/w;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    :try_start_1
    invoke-interface {v0}, Lj2/g;->q()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroidx/room/w;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    .line 29
    .line 30
    :try_start_2
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroidx/room/w;->endTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfResetWorkSpecRunAttemptCount:Landroidx/room/D;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 38
    .line 39
    .line 40
    return p1

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_0

    .line 43
    :catchall_1
    move-exception p1

    .line 44
    :try_start_3
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroidx/room/w;->endTransaction()V

    .line 47
    .line 48
    .line 49
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 50
    :goto_0
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfResetWorkSpecRunAttemptCount:Landroidx/room/D;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 53
    .line 54
    .line 55
    throw p1
.end method

.method public setCancelledState(Ljava/lang/String;)I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetCancelledState:Landroidx/room/D;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/D;->acquire()Lj2/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-interface {v0, v1, p1}, Lj2/e;->m(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/room/w;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    :try_start_1
    invoke-interface {v0}, Lj2/g;->q()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroidx/room/w;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    .line 29
    .line 30
    :try_start_2
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroidx/room/w;->endTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetCancelledState:Landroidx/room/D;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 38
    .line 39
    .line 40
    return p1

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_0

    .line 43
    :catchall_1
    move-exception p1

    .line 44
    :try_start_3
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroidx/room/w;->endTransaction()V

    .line 47
    .line 48
    .line 49
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 50
    :goto_0
    iget-object v1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetCancelledState:Landroidx/room/D;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 53
    .line 54
    .line 55
    throw p1
.end method

.method public setLastEnqueueTime(Ljava/lang/String;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetLastEnqueueTime:Landroidx/room/D;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/D;->acquire()Lj2/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-interface {v0, v1, p2, p3}, Lj2/e;->H(IJ)V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x2

    .line 17
    invoke-interface {v0, p2, p1}, Lj2/e;->m(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :try_start_0
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroidx/room/w;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    :try_start_1
    invoke-interface {v0}, Lj2/g;->q()I

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroidx/room/w;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 31
    .line 32
    .line 33
    :try_start_2
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroidx/room/w;->endTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetLastEnqueueTime:Landroidx/room/D;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_0

    .line 46
    :catchall_1
    move-exception p1

    .line 47
    :try_start_3
    iget-object p2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 48
    .line 49
    invoke-virtual {p2}, Landroidx/room/w;->endTransaction()V

    .line 50
    .line 51
    .line 52
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 53
    :goto_0
    iget-object p2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetLastEnqueueTime:Landroidx/room/D;

    .line 54
    .line 55
    invoke-virtual {p2, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 56
    .line 57
    .line 58
    throw p1
.end method

.method public setNextScheduleTimeOverride(Ljava/lang/String;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetNextScheduleTimeOverride:Landroidx/room/D;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/D;->acquire()Lj2/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-interface {v0, v1, p2, p3}, Lj2/e;->H(IJ)V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x2

    .line 17
    invoke-interface {v0, p2, p1}, Lj2/e;->m(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :try_start_0
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroidx/room/w;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    :try_start_1
    invoke-interface {v0}, Lj2/g;->q()I

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroidx/room/w;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 31
    .line 32
    .line 33
    :try_start_2
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroidx/room/w;->endTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetNextScheduleTimeOverride:Landroidx/room/D;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_0

    .line 46
    :catchall_1
    move-exception p1

    .line 47
    :try_start_3
    iget-object p2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 48
    .line 49
    invoke-virtual {p2}, Landroidx/room/w;->endTransaction()V

    .line 50
    .line 51
    .line 52
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 53
    :goto_0
    iget-object p2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetNextScheduleTimeOverride:Landroidx/room/D;

    .line 54
    .line 55
    invoke-virtual {p2, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 56
    .line 57
    .line 58
    throw p1
.end method

.method public setOutput(Ljava/lang/String;Landroidx/work/Data;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetOutput:Landroidx/room/D;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/D;->acquire()Lj2/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-static {p2}, Landroidx/work/Data;->toByteArrayInternalV1(Landroidx/work/Data;)[B

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-interface {v0, v1, p2}, Lj2/e;->N(I[B)V

    .line 18
    .line 19
    .line 20
    const/4 p2, 0x2

    .line 21
    invoke-interface {v0, p2, p1}, Lj2/e;->m(ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :try_start_0
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/room/w;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    :try_start_1
    invoke-interface {v0}, Lj2/g;->q()I

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroidx/room/w;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    .line 36
    .line 37
    :try_start_2
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroidx/room/w;->endTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetOutput:Landroidx/room/D;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_0

    .line 50
    :catchall_1
    move-exception p1

    .line 51
    :try_start_3
    iget-object p2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 52
    .line 53
    invoke-virtual {p2}, Landroidx/room/w;->endTransaction()V

    .line 54
    .line 55
    .line 56
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 57
    :goto_0
    iget-object p2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetOutput:Landroidx/room/D;

    .line 58
    .line 59
    invoke-virtual {p2, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 60
    .line 61
    .line 62
    throw p1
.end method

.method public setState(Landroidx/work/WorkInfo$State;Ljava/lang/String;)I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetState:Landroidx/room/D;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/D;->acquire()Lj2/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {p1}, Landroidx/work/impl/model/WorkTypeConverters;->stateToInt(Landroidx/work/WorkInfo$State;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    int-to-long v1, p1

    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-interface {v0, p1, v1, v2}, Lj2/e;->H(IJ)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-interface {v0, p1, p2}, Lj2/e;->m(ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :try_start_0
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroidx/room/w;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    :try_start_1
    invoke-interface {v0}, Lj2/g;->q()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iget-object p2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 35
    .line 36
    invoke-virtual {p2}, Landroidx/room/w;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 37
    .line 38
    .line 39
    :try_start_2
    iget-object p2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 40
    .line 41
    invoke-virtual {p2}, Landroidx/room/w;->endTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    .line 43
    .line 44
    iget-object p2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetState:Landroidx/room/D;

    .line 45
    .line 46
    invoke-virtual {p2, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 47
    .line 48
    .line 49
    return p1

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_0

    .line 52
    :catchall_1
    move-exception p1

    .line 53
    :try_start_3
    iget-object p2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 54
    .line 55
    invoke-virtual {p2}, Landroidx/room/w;->endTransaction()V

    .line 56
    .line 57
    .line 58
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 59
    :goto_0
    iget-object p2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetState:Landroidx/room/D;

    .line 60
    .line 61
    invoke-virtual {p2, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 62
    .line 63
    .line 64
    throw p1
.end method

.method public setStopReason(Ljava/lang/String;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetStopReason:Landroidx/room/D;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/D;->acquire()Lj2/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    int-to-long v2, p2

    .line 14
    invoke-interface {v0, v1, v2, v3}, Lj2/e;->H(IJ)V

    .line 15
    .line 16
    .line 17
    const/4 p2, 0x2

    .line 18
    invoke-interface {v0, p2, p1}, Lj2/e;->m(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :try_start_0
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/room/w;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    :try_start_1
    invoke-interface {v0}, Lj2/g;->q()I

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroidx/room/w;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    .line 33
    .line 34
    :try_start_2
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroidx/room/w;->endTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetStopReason:Landroidx/room/D;

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_0

    .line 47
    :catchall_1
    move-exception p1

    .line 48
    :try_start_3
    iget-object p2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 49
    .line 50
    invoke-virtual {p2}, Landroidx/room/w;->endTransaction()V

    .line 51
    .line 52
    .line 53
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 54
    :goto_0
    iget-object p2, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__preparedStmtOfSetStopReason:Landroidx/room/D;

    .line 55
    .line 56
    invoke-virtual {p2, v0}, Landroidx/room/D;->release(Lj2/g;)V

    .line 57
    .line 58
    .line 59
    throw p1
.end method

.method public updateWorkSpec(Landroidx/work/impl/model/WorkSpec;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/w;->beginTransaction()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__updateAdapterOfWorkSpec:Landroidx/room/i;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroidx/room/i;->handle(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/room/w;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/room/w;->endTransaction()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDao_Impl;->__db:Landroidx/room/w;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/room/w;->endTransaction()V

    .line 31
    .line 32
    .line 33
    throw p1
.end method
