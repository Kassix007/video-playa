.class public final Landroidx/work/impl/model/RawWorkInfoDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/work/impl/model/RawWorkInfoDao;


# instance fields
.field private final __db:Landroidx/room/w;


# direct methods
.method public constructor <init>(Landroidx/room/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__db:Landroidx/room/w;

    .line 5
    .line 6
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
    new-instance v0, Landroidx/work/impl/model/a;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-direct {v0, p0, v1}, Landroidx/work/impl/model/a;-><init>(Landroidx/work/impl/model/RawWorkInfoDao_Impl;I)V

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
    iget-object v0, p0, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__db:Landroidx/room/w;

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
    new-instance v0, Landroidx/work/impl/model/a;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, p0, v1}, Landroidx/work/impl/model/a;-><init>(Landroidx/work/impl/model/RawWorkInfoDao_Impl;I)V

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
    iget-object v0, p0, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__db:Landroidx/room/w;

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

.method public static synthetic a(Landroidx/work/impl/model/RawWorkInfoDao_Impl;Ljava/util/HashMap;)Lm5/y;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1(Ljava/util/HashMap;)Lm5/y;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$000(Landroidx/work/impl/model/RawWorkInfoDao_Impl;)Landroidx/room/w;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__db:Landroidx/room/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Landroidx/work/impl/model/RawWorkInfoDao_Impl;Ljava/util/HashMap;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__fetchRelationshipWorkTagAsjavaLangString(Ljava/util/HashMap;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$200(Landroidx/work/impl/model/RawWorkInfoDao_Impl;Ljava/util/HashMap;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__fetchRelationshipWorkProgressAsandroidxWorkData(Ljava/util/HashMap;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Landroidx/work/impl/model/RawWorkInfoDao_Impl;Ljava/util/HashMap;)Lm5/y;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->lambda$__fetchRelationshipWorkTagAsjavaLangString$0(Ljava/util/HashMap;)Lm5/y;

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
    invoke-direct {p0, p1}, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__fetchRelationshipWorkProgressAsandroidxWorkData(Ljava/util/HashMap;)V

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
    invoke-direct {p0, p1}, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__fetchRelationshipWorkTagAsjavaLangString(Ljava/util/HashMap;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 5
    .line 6
    return-object p1
.end method


# virtual methods
.method public getWorkInfoPojos(Lj2/f;)Ljava/util/List;
    .locals 63
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj2/f;",
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
    iget-object v0, v1, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__db:Landroidx/room/w;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/room/w;->assertNotSuspendingTransaction()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__db:Landroidx/room/w;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    move-object/from16 v3, p1

    .line 12
    .line 13
    invoke-static {v0, v3, v2}, Ll6/d;->B(Landroidx/room/w;Lj2/f;Z)Landroid/database/Cursor;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    :try_start_0
    const-string v0, "id"

    .line 18
    .line 19
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const-string v4, "state"

    .line 24
    .line 25
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const-string v5, "output"

    .line 30
    .line 31
    invoke-static {v3, v5}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    const-string v6, "initial_delay"

    .line 36
    .line 37
    invoke-static {v3, v6}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    const-string v7, "interval_duration"

    .line 42
    .line 43
    invoke-static {v3, v7}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    const-string v8, "flex_duration"

    .line 48
    .line 49
    invoke-static {v3, v8}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    const-string v9, "run_attempt_count"

    .line 54
    .line 55
    invoke-static {v3, v9}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    const-string v10, "backoff_policy"

    .line 60
    .line 61
    invoke-static {v3, v10}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    const-string v11, "backoff_delay_duration"

    .line 66
    .line 67
    invoke-static {v3, v11}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v11

    .line 71
    const-string v12, "last_enqueue_time"

    .line 72
    .line 73
    invoke-static {v3, v12}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v12

    .line 77
    const-string v13, "period_count"

    .line 78
    .line 79
    invoke-static {v3, v13}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v13

    .line 83
    const-string v14, "generation"

    .line 84
    .line 85
    invoke-static {v3, v14}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v14

    .line 89
    const-string v15, "next_schedule_time_override"

    .line 90
    .line 91
    invoke-static {v3, v15}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v15

    .line 95
    const-string v2, "stop_reason"

    .line 96
    .line 97
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    move/from16 p1, v2

    .line 102
    .line 103
    const-string v2, "required_network_type"

    .line 104
    .line 105
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    move/from16 v16, v2

    .line 110
    .line 111
    const-string v2, "required_network_request"

    .line 112
    .line 113
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    move/from16 v17, v2

    .line 118
    .line 119
    const-string v2, "requires_charging"

    .line 120
    .line 121
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    move/from16 v18, v2

    .line 126
    .line 127
    const-string v2, "requires_device_idle"

    .line 128
    .line 129
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    move/from16 v19, v2

    .line 134
    .line 135
    const-string v2, "requires_battery_not_low"

    .line 136
    .line 137
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    move/from16 v20, v2

    .line 142
    .line 143
    const-string v2, "requires_storage_not_low"

    .line 144
    .line 145
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    move/from16 v21, v2

    .line 150
    .line 151
    const-string v2, "trigger_content_update_delay"

    .line 152
    .line 153
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    move/from16 v22, v2

    .line 158
    .line 159
    const-string v2, "trigger_max_content_delay"

    .line 160
    .line 161
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    move/from16 v23, v2

    .line 166
    .line 167
    const-string v2, "content_uri_triggers"

    .line 168
    .line 169
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/n2;->q(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    move/from16 v24, v2

    .line 174
    .line 175
    new-instance v2, Ljava/util/HashMap;

    .line 176
    .line 177
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 178
    .line 179
    .line 180
    move/from16 v25, v15

    .line 181
    .line 182
    new-instance v15, Ljava/util/HashMap;

    .line 183
    .line 184
    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    .line 185
    .line 186
    .line 187
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 188
    .line 189
    .line 190
    move-result v26

    .line 191
    if-eqz v26, :cond_2

    .line 192
    .line 193
    move/from16 v26, v14

    .line 194
    .line 195
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v14

    .line 199
    invoke-virtual {v2, v14}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v27

    .line 203
    if-nez v27, :cond_0

    .line 204
    .line 205
    move/from16 v27, v13

    .line 206
    .line 207
    new-instance v13, Ljava/util/ArrayList;

    .line 208
    .line 209
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, v14, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    goto :goto_1

    .line 216
    :catchall_0
    move-exception v0

    .line 217
    goto/16 :goto_2a

    .line 218
    .line 219
    :cond_0
    move/from16 v27, v13

    .line 220
    .line 221
    :goto_1
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v13

    .line 225
    invoke-virtual {v15, v13}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v14

    .line 229
    if-nez v14, :cond_1

    .line 230
    .line 231
    new-instance v14, Ljava/util/ArrayList;

    .line 232
    .line 233
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v15, v13, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    :cond_1
    move/from16 v14, v26

    .line 240
    .line 241
    move/from16 v13, v27

    .line 242
    .line 243
    goto :goto_0

    .line 244
    :cond_2
    move/from16 v27, v13

    .line 245
    .line 246
    move/from16 v26, v14

    .line 247
    .line 248
    const/4 v13, -0x1

    .line 249
    invoke-interface {v3, v13}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 250
    .line 251
    .line 252
    invoke-direct {v1, v2}, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__fetchRelationshipWorkTagAsjavaLangString(Ljava/util/HashMap;)V

    .line 253
    .line 254
    .line 255
    invoke-direct {v1, v15}, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__fetchRelationshipWorkProgressAsandroidxWorkData(Ljava/util/HashMap;)V

    .line 256
    .line 257
    .line 258
    new-instance v14, Ljava/util/ArrayList;

    .line 259
    .line 260
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    .line 261
    .line 262
    .line 263
    move-result v13

    .line 264
    invoke-direct {v14, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 265
    .line 266
    .line 267
    :goto_2
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 268
    .line 269
    .line 270
    move-result v13

    .line 271
    if-eqz v13, :cond_1e

    .line 272
    .line 273
    const/4 v13, -0x1

    .line 274
    if-ne v0, v13, :cond_3

    .line 275
    .line 276
    const/16 v30, 0x0

    .line 277
    .line 278
    goto :goto_3

    .line 279
    :cond_3
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v28

    .line 283
    move-object/from16 v30, v28

    .line 284
    .line 285
    :goto_3
    if-ne v4, v13, :cond_4

    .line 286
    .line 287
    const/16 v31, 0x0

    .line 288
    .line 289
    goto :goto_4

    .line 290
    :cond_4
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getInt(I)I

    .line 291
    .line 292
    .line 293
    move-result v28

    .line 294
    invoke-static/range {v28 .. v28}, Landroidx/work/impl/model/WorkTypeConverters;->intToState(I)Landroidx/work/WorkInfo$State;

    .line 295
    .line 296
    .line 297
    move-result-object v28

    .line 298
    move-object/from16 v31, v28

    .line 299
    .line 300
    :goto_4
    if-ne v5, v13, :cond_5

    .line 301
    .line 302
    const/16 v32, 0x0

    .line 303
    .line 304
    goto :goto_5

    .line 305
    :cond_5
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getBlob(I)[B

    .line 306
    .line 307
    .line 308
    move-result-object v28

    .line 309
    invoke-static/range {v28 .. v28}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 310
    .line 311
    .line 312
    move-result-object v28

    .line 313
    move-object/from16 v32, v28

    .line 314
    .line 315
    :goto_5
    const-wide/16 v33, 0x0

    .line 316
    .line 317
    if-ne v6, v13, :cond_6

    .line 318
    .line 319
    move-wide/from16 v35, v33

    .line 320
    .line 321
    goto :goto_6

    .line 322
    :cond_6
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 323
    .line 324
    .line 325
    move-result-wide v35

    .line 326
    :goto_6
    if-ne v7, v13, :cond_7

    .line 327
    .line 328
    move-wide/from16 v37, v33

    .line 329
    .line 330
    goto :goto_7

    .line 331
    :cond_7
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 332
    .line 333
    .line 334
    move-result-wide v37

    .line 335
    :goto_7
    if-ne v8, v13, :cond_8

    .line 336
    .line 337
    move-wide/from16 v39, v33

    .line 338
    .line 339
    goto :goto_8

    .line 340
    :cond_8
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 341
    .line 342
    .line 343
    move-result-wide v39

    .line 344
    :goto_8
    const/16 v28, 0x0

    .line 345
    .line 346
    if-ne v9, v13, :cond_9

    .line 347
    .line 348
    move/from16 v29, v28

    .line 349
    .line 350
    goto :goto_9

    .line 351
    :cond_9
    invoke-interface {v3, v9}, Landroid/database/Cursor;->getInt(I)I

    .line 352
    .line 353
    .line 354
    move-result v29

    .line 355
    :goto_9
    if-ne v10, v13, :cond_a

    .line 356
    .line 357
    const/16 v41, 0x0

    .line 358
    .line 359
    goto :goto_a

    .line 360
    :cond_a
    invoke-interface {v3, v10}, Landroid/database/Cursor;->getInt(I)I

    .line 361
    .line 362
    .line 363
    move-result v41

    .line 364
    invoke-static/range {v41 .. v41}, Landroidx/work/impl/model/WorkTypeConverters;->intToBackoffPolicy(I)Landroidx/work/BackoffPolicy;

    .line 365
    .line 366
    .line 367
    move-result-object v41

    .line 368
    :goto_a
    if-ne v11, v13, :cond_b

    .line 369
    .line 370
    move-wide/from16 v42, v33

    .line 371
    .line 372
    goto :goto_b

    .line 373
    :cond_b
    invoke-interface {v3, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 374
    .line 375
    .line 376
    move-result-wide v42

    .line 377
    :goto_b
    if-ne v12, v13, :cond_c

    .line 378
    .line 379
    move-wide/from16 v44, v33

    .line 380
    .line 381
    :goto_c
    move/from16 v1, v27

    .line 382
    .line 383
    goto :goto_d

    .line 384
    :cond_c
    invoke-interface {v3, v12}, Landroid/database/Cursor;->getLong(I)J

    .line 385
    .line 386
    .line 387
    move-result-wide v44

    .line 388
    goto :goto_c

    .line 389
    :goto_d
    if-ne v1, v13, :cond_d

    .line 390
    .line 391
    move/from16 v46, v28

    .line 392
    .line 393
    :goto_e
    move/from16 v27, v1

    .line 394
    .line 395
    move/from16 v1, v26

    .line 396
    .line 397
    goto :goto_f

    .line 398
    :cond_d
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 399
    .line 400
    .line 401
    move-result v27

    .line 402
    move/from16 v46, v27

    .line 403
    .line 404
    goto :goto_e

    .line 405
    :goto_f
    if-ne v1, v13, :cond_e

    .line 406
    .line 407
    move/from16 v47, v28

    .line 408
    .line 409
    :goto_10
    move/from16 v26, v1

    .line 410
    .line 411
    move/from16 v1, v25

    .line 412
    .line 413
    goto :goto_11

    .line 414
    :cond_e
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 415
    .line 416
    .line 417
    move-result v26

    .line 418
    move/from16 v47, v26

    .line 419
    .line 420
    goto :goto_10

    .line 421
    :goto_11
    if-ne v1, v13, :cond_f

    .line 422
    .line 423
    move-wide/from16 v48, v33

    .line 424
    .line 425
    :goto_12
    move/from16 v25, v1

    .line 426
    .line 427
    move/from16 v1, p1

    .line 428
    .line 429
    goto :goto_13

    .line 430
    :cond_f
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 431
    .line 432
    .line 433
    move-result-wide v48

    .line 434
    goto :goto_12

    .line 435
    :goto_13
    if-ne v1, v13, :cond_10

    .line 436
    .line 437
    move/from16 v50, v28

    .line 438
    .line 439
    :goto_14
    move/from16 p1, v1

    .line 440
    .line 441
    move/from16 v1, v16

    .line 442
    .line 443
    goto :goto_15

    .line 444
    :cond_10
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 445
    .line 446
    .line 447
    move-result v50

    .line 448
    goto :goto_14

    .line 449
    :goto_15
    if-ne v1, v13, :cond_11

    .line 450
    .line 451
    const/16 v53, 0x0

    .line 452
    .line 453
    :goto_16
    move/from16 v16, v1

    .line 454
    .line 455
    move/from16 v1, v17

    .line 456
    .line 457
    goto :goto_17

    .line 458
    :cond_11
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 459
    .line 460
    .line 461
    move-result v16

    .line 462
    invoke-static/range {v16 .. v16}, Landroidx/work/impl/model/WorkTypeConverters;->intToNetworkType(I)Landroidx/work/NetworkType;

    .line 463
    .line 464
    .line 465
    move-result-object v16

    .line 466
    move-object/from16 v53, v16

    .line 467
    .line 468
    goto :goto_16

    .line 469
    :goto_17
    if-ne v1, v13, :cond_12

    .line 470
    .line 471
    const/16 v52, 0x0

    .line 472
    .line 473
    :goto_18
    move/from16 v17, v1

    .line 474
    .line 475
    move/from16 v1, v18

    .line 476
    .line 477
    goto :goto_19

    .line 478
    :cond_12
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 479
    .line 480
    .line 481
    move-result-object v17

    .line 482
    invoke-static/range {v17 .. v17}, Landroidx/work/impl/model/WorkTypeConverters;->toNetworkRequest$work_runtime_release([B)Landroidx/work/impl/utils/NetworkRequestCompat;

    .line 483
    .line 484
    .line 485
    move-result-object v17

    .line 486
    move-object/from16 v52, v17

    .line 487
    .line 488
    goto :goto_18

    .line 489
    :goto_19
    if-ne v1, v13, :cond_13

    .line 490
    .line 491
    move/from16 v54, v28

    .line 492
    .line 493
    :goto_1a
    move/from16 v18, v1

    .line 494
    .line 495
    move/from16 v1, v19

    .line 496
    .line 497
    goto :goto_1c

    .line 498
    :cond_13
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 499
    .line 500
    .line 501
    move-result v18

    .line 502
    if-eqz v18, :cond_14

    .line 503
    .line 504
    const/16 v18, 0x1

    .line 505
    .line 506
    goto :goto_1b

    .line 507
    :cond_14
    move/from16 v18, v28

    .line 508
    .line 509
    :goto_1b
    move/from16 v54, v18

    .line 510
    .line 511
    goto :goto_1a

    .line 512
    :goto_1c
    if-ne v1, v13, :cond_15

    .line 513
    .line 514
    move/from16 v55, v28

    .line 515
    .line 516
    :goto_1d
    move/from16 v19, v1

    .line 517
    .line 518
    move/from16 v1, v20

    .line 519
    .line 520
    goto :goto_1f

    .line 521
    :cond_15
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 522
    .line 523
    .line 524
    move-result v19

    .line 525
    if-eqz v19, :cond_16

    .line 526
    .line 527
    const/16 v19, 0x1

    .line 528
    .line 529
    goto :goto_1e

    .line 530
    :cond_16
    move/from16 v19, v28

    .line 531
    .line 532
    :goto_1e
    move/from16 v55, v19

    .line 533
    .line 534
    goto :goto_1d

    .line 535
    :goto_1f
    if-ne v1, v13, :cond_17

    .line 536
    .line 537
    move/from16 v56, v28

    .line 538
    .line 539
    :goto_20
    move/from16 v20, v1

    .line 540
    .line 541
    move/from16 v1, v21

    .line 542
    .line 543
    goto :goto_22

    .line 544
    :cond_17
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 545
    .line 546
    .line 547
    move-result v20

    .line 548
    if-eqz v20, :cond_18

    .line 549
    .line 550
    const/16 v20, 0x1

    .line 551
    .line 552
    goto :goto_21

    .line 553
    :cond_18
    move/from16 v20, v28

    .line 554
    .line 555
    :goto_21
    move/from16 v56, v20

    .line 556
    .line 557
    goto :goto_20

    .line 558
    :goto_22
    if-ne v1, v13, :cond_1a

    .line 559
    .line 560
    :cond_19
    :goto_23
    move/from16 v21, v1

    .line 561
    .line 562
    move/from16 v1, v22

    .line 563
    .line 564
    move/from16 v57, v28

    .line 565
    .line 566
    goto :goto_24

    .line 567
    :cond_1a
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 568
    .line 569
    .line 570
    move-result v21

    .line 571
    if-eqz v21, :cond_19

    .line 572
    .line 573
    const/16 v28, 0x1

    .line 574
    .line 575
    goto :goto_23

    .line 576
    :goto_24
    if-ne v1, v13, :cond_1b

    .line 577
    .line 578
    move-wide/from16 v58, v33

    .line 579
    .line 580
    :goto_25
    move/from16 v22, v1

    .line 581
    .line 582
    move/from16 v1, v23

    .line 583
    .line 584
    goto :goto_26

    .line 585
    :cond_1b
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 586
    .line 587
    .line 588
    move-result-wide v58

    .line 589
    goto :goto_25

    .line 590
    :goto_26
    if-ne v1, v13, :cond_1c

    .line 591
    .line 592
    :goto_27
    move/from16 v23, v1

    .line 593
    .line 594
    move/from16 v1, v24

    .line 595
    .line 596
    move-wide/from16 v60, v33

    .line 597
    .line 598
    goto :goto_28

    .line 599
    :cond_1c
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 600
    .line 601
    .line 602
    move-result-wide v33

    .line 603
    goto :goto_27

    .line 604
    :goto_28
    if-ne v1, v13, :cond_1d

    .line 605
    .line 606
    const/16 v62, 0x0

    .line 607
    .line 608
    goto :goto_29

    .line 609
    :cond_1d
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 610
    .line 611
    .line 612
    move-result-object v24

    .line 613
    invoke-static/range {v24 .. v24}, Landroidx/work/impl/model/WorkTypeConverters;->byteArrayToSetOfTriggers([B)Ljava/util/Set;

    .line 614
    .line 615
    .line 616
    move-result-object v24

    .line 617
    move-object/from16 v62, v24

    .line 618
    .line 619
    :goto_29
    new-instance v51, Landroidx/work/Constraints;

    .line 620
    .line 621
    invoke-direct/range {v51 .. v62}, Landroidx/work/Constraints;-><init>(Landroidx/work/impl/utils/NetworkRequestCompat;Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V

    .line 622
    .line 623
    .line 624
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v13

    .line 628
    invoke-virtual {v2, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v13

    .line 632
    check-cast v13, Ljava/util/ArrayList;

    .line 633
    .line 634
    move/from16 v24, v1

    .line 635
    .line 636
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    invoke-virtual {v15, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v1

    .line 644
    move-object/from16 v52, v1

    .line 645
    .line 646
    check-cast v52, Ljava/util/ArrayList;

    .line 647
    .line 648
    move-wide/from16 v33, v35

    .line 649
    .line 650
    move-wide/from16 v35, v37

    .line 651
    .line 652
    move-wide/from16 v37, v39

    .line 653
    .line 654
    move/from16 v40, v29

    .line 655
    .line 656
    new-instance v29, Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;

    .line 657
    .line 658
    move-object/from16 v39, v51

    .line 659
    .line 660
    move-object/from16 v51, v13

    .line 661
    .line 662
    invoke-direct/range {v29 .. v52}, Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;-><init>(Ljava/lang/String;Landroidx/work/WorkInfo$State;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJIIJILjava/util/List;Ljava/util/List;)V

    .line 663
    .line 664
    .line 665
    move-object/from16 v1, v29

    .line 666
    .line 667
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 668
    .line 669
    .line 670
    move-object/from16 v1, p0

    .line 671
    .line 672
    goto/16 :goto_2

    .line 673
    .line 674
    :cond_1e
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 675
    .line 676
    .line 677
    return-object v14

    .line 678
    :goto_2a
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 679
    .line 680
    .line 681
    throw v0
.end method

.method public getWorkInfoPojosFlow(Lj2/f;)LP5/h;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj2/f;",
            ")",
            "LP5/h;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__db:Landroidx/room/w;

    .line 2
    .line 3
    const-string v1, "WorkProgress"

    .line 4
    .line 5
    const-string v2, "WorkSpec"

    .line 6
    .line 7
    const-string v3, "WorkTag"

    .line 8
    .line 9
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Landroidx/work/impl/model/RawWorkInfoDao_Impl$2;

    .line 14
    .line 15
    invoke-direct {v2, p0, p1}, Landroidx/work/impl/model/RawWorkInfoDao_Impl$2;-><init>(Landroidx/work/impl/model/RawWorkInfoDao_Impl;Lj2/f;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-static {v0, p1, v1, v2}, Landroidx/room/g;->a(Landroidx/room/w;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lu2/m;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method public getWorkInfoPojosLiveData(Lj2/f;)Landroidx/lifecycle/G;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj2/f;",
            ")",
            "Landroidx/lifecycle/G;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__db:Landroidx/room/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/w;->getInvalidationTracker()Landroidx/room/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "WorkProgress"

    .line 8
    .line 9
    const-string v2, "WorkSpec"

    .line 10
    .line 11
    const-string v3, "WorkTag"

    .line 12
    .line 13
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Landroidx/work/impl/model/RawWorkInfoDao_Impl$1;

    .line 18
    .line 19
    invoke-direct {v2, p0, p1}, Landroidx/work/impl/model/RawWorkInfoDao_Impl$1;-><init>(Landroidx/work/impl/model/RawWorkInfoDao_Impl;Lj2/f;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {v0, v1, p1, v2}, Landroidx/room/q;->b([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/room/B;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method
