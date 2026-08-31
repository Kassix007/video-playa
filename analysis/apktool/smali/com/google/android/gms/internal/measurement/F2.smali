.class public final Lcom/google/android/gms/internal/measurement/F2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG4/d;
.implements Lcom/google/android/gms/internal/measurement/J2;


# static fields
.field public static final r:Lcom/google/android/gms/internal/measurement/o2;


# instance fields
.field public final q:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/o2;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/o2;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/google/android/gms/internal/measurement/F2;->r:Lcom/google/android/gms/internal/measurement/o2;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    packed-switch p1, :pswitch_data_0

    .line 2
    new-instance p1, Lcom/google/android/gms/internal/measurement/F2;

    sget-object v0, Lcom/google/android/gms/internal/measurement/P2;->c:Lcom/google/android/gms/internal/measurement/P2;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/android/gms/internal/measurement/J2;

    sget-object v1, Lcom/google/android/gms/internal/measurement/o2;->r:Lcom/google/android/gms/internal/measurement/o2;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/measurement/F2;->r:Lcom/google/android/gms/internal/measurement/o2;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/measurement/F2;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    return-void

    .line 4
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/measurement/g2;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    iput-object p0, p1, Lcom/google/android/gms/internal/measurement/g2;->e:Lcom/google/android/gms/internal/measurement/F2;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    const/4 v2, 0x2

    .line 4
    if-ge v1, v2, :cond_1

    .line 5
    .line 6
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, [Lcom/google/android/gms/internal/measurement/J2;

    .line 9
    .line 10
    aget-object v2, v2, v1

    .line 11
    .line 12
    invoke-interface {v2, p1}, Lcom/google/android/gms/internal/measurement/J2;->a(Ljava/lang/Class;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return v0
.end method

.method public b(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/R2;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/4 v1, 0x2

    .line 3
    if-ge v0, v1, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [Lcom/google/android/gms/internal/measurement/J2;

    .line 8
    .line 9
    aget-object v1, v1, v0

    .line 10
    .line 11
    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/measurement/J2;->a(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/measurement/J2;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/R2;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v1, "No factory is available for message type: "

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0
.end method

.method public c()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/measurement/M1;

    .line 4
    .line 5
    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/M1;->a:Landroid/content/ContentResolver;

    .line 6
    .line 7
    iget-object v3, v0, Lcom/google/android/gms/internal/measurement/M1;->b:Landroid/net/Uri;

    .line 8
    .line 9
    invoke-virtual {v1, v3}, Landroid/content/ContentResolver;->acquireUnstableContentProviderClient(Landroid/net/Uri;)Landroid/content/ContentProviderClient;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v1, "ConfigurationContentLdr"

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    const-string v0, "Unable to acquire ContentProviderClient, using default values"

    .line 18
    .line 19
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    :try_start_0
    sget-object v4, Lcom/google/android/gms/internal/measurement/M1;->i:[Ljava/lang/String;

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentProviderClient;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 31
    .line 32
    .line 33
    move-result-object v3
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    :try_start_1
    const-string v0, "ContentProvider query returned null cursor, using default values"

    .line 37
    .line 38
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    invoke-virtual {v2}, Landroid/content/ContentProviderClient;->release()Z

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    move-object v4, v0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :try_start_2
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    .line 58
    :try_start_3
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Landroid/content/ContentProviderClient;->release()Z

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :catchall_1
    move-exception v0

    .line 66
    goto :goto_4

    .line 67
    :catch_0
    move-exception v0

    .line 68
    goto :goto_3

    .line 69
    :cond_2
    const/16 v4, 0x100

    .line 70
    .line 71
    if-gt v0, v4, :cond_3

    .line 72
    .line 73
    :try_start_4
    new-instance v4, Lr/e;

    .line 74
    .line 75
    invoke-direct {v4, v0}, Lr/Q;-><init>(I)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    new-instance v4, Ljava/util/HashMap;

    .line 80
    .line 81
    const/high16 v5, 0x3f800000    # 1.0f

    .line 82
    .line 83
    invoke-direct {v4, v0, v5}, Ljava/util/HashMap;-><init>(IF)V

    .line 84
    .line 85
    .line 86
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_4

    .line 91
    .line 92
    const/4 v0, 0x0

    .line 93
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const/4 v5, 0x1

    .line 98
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-interface {v4, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    invoke-interface {v3}, Landroid/database/Cursor;->isAfterLast()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_5

    .line 111
    .line 112
    const-string v0, "Cursor read incomplete (ContentProvider dead?), using default values"

    .line 113
    .line 114
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 118
    .line 119
    :try_start_5
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Landroid/content/ContentProviderClient;->release()Z

    .line 123
    .line 124
    .line 125
    return-object v0

    .line 126
    :cond_5
    :try_start_6
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Landroid/content/ContentProviderClient;->release()Z

    .line 130
    .line 131
    .line 132
    return-object v4

    .line 133
    :goto_1
    if-eqz v3, :cond_6

    .line 134
    .line 135
    :try_start_7
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :catchall_2
    move-exception v0

    .line 140
    :try_start_8
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    :cond_6
    :goto_2
    throw v4
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 144
    :goto_3
    :try_start_9
    const-string v3, "ContentProvider query failed, using default values"

    .line 145
    .line 146
    invoke-static {v1, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 147
    .line 148
    .line 149
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 150
    .line 151
    invoke-virtual {v2}, Landroid/content/ContentProviderClient;->release()Z

    .line 152
    .line 153
    .line 154
    return-object v0

    .line 155
    :goto_4
    invoke-virtual {v2}, Landroid/content/ContentProviderClient;->release()Z

    .line 156
    .line 157
    .line 158
    throw v0
.end method

.method public d(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/S2;)V
    .locals 1

    .line 1
    check-cast p2, Lcom/google/android/gms/internal/measurement/Y1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lcom/google/android/gms/internal/measurement/g2;

    .line 6
    .line 7
    shl-int/lit8 p1, p1, 0x3

    .line 8
    .line 9
    or-int/lit8 p1, p1, 0x2

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/g2;->o0(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/measurement/Y1;->b(Lcom/google/android/gms/internal/measurement/S2;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/g2;->o0(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, v0, Lcom/google/android/gms/internal/measurement/g2;->e:Lcom/google/android/gms/internal/measurement/F2;

    .line 22
    .line 23
    invoke-interface {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/S2;->e(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/F2;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public e(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/S2;)V
    .locals 2

    .line 1
    check-cast p2, Lcom/google/android/gms/internal/measurement/Y1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lcom/google/android/gms/internal/measurement/g2;

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/measurement/g2;->e0(II)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/g2;->e:Lcom/google/android/gms/internal/measurement/F2;

    .line 12
    .line 13
    invoke-interface {p3, p2, v1}, Lcom/google/android/gms/internal/measurement/S2;->e(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/F2;)V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x4

    .line 17
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/g2;->e0(II)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 18

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/T1;->g:Ljava/lang/Object;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v0, v1, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/content/Context;

    .line 8
    .line 9
    sget-object v2, Lcom/google/android/gms/internal/measurement/P1;->a:LG4/b;

    .line 10
    .line 11
    if-nez v2, :cond_d

    .line 12
    .line 13
    const-class v3, Lcom/google/android/gms/internal/measurement/P1;

    .line 14
    .line 15
    monitor-enter v3

    .line 16
    :try_start_0
    sget-object v2, Lcom/google/android/gms/internal/measurement/P1;->a:LG4/b;

    .line 17
    .line 18
    if-nez v2, :cond_c

    .line 19
    .line 20
    sget-object v2, Landroid/os/Build;->TYPE:Ljava/lang/String;

    .line 21
    .line 22
    sget-object v4, Landroid/os/Build;->TAGS:Ljava/lang/String;

    .line 23
    .line 24
    sget-object v5, Lcom/google/android/gms/internal/measurement/S1;->a:Lr/e;

    .line 25
    .line 26
    const-string v5, "eng"

    .line 27
    .line 28
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-nez v5, :cond_0

    .line 33
    .line 34
    const-string v5, "userdebug"

    .line 35
    .line 36
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    goto/16 :goto_d

    .line 45
    .line 46
    :cond_0
    :goto_0
    const-string v2, "dev-keys"

    .line 47
    .line 48
    invoke-virtual {v4, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_2

    .line 53
    .line 54
    const-string v2, "test-keys"

    .line 55
    .line 56
    invoke-virtual {v4, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    sget-object v0, LG4/a;->q:LG4/a;

    .line 64
    .line 65
    move-object v2, v0

    .line 66
    goto/16 :goto_a

    .line 67
    .line 68
    :cond_2
    :goto_1
    invoke-virtual {v0}, Landroid/content/Context;->isDeviceProtectedStorage()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-nez v2, :cond_3

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/content/Context;->createDeviceProtectedStorageContext()Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :cond_3
    move-object v2, v0

    .line 79
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    .line 80
    .line 81
    .line 82
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    :try_start_1
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskWrites()Landroid/os/StrictMode$ThreadPolicy;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 84
    .line 85
    .line 86
    const/4 v5, 0x0

    .line 87
    :try_start_2
    new-instance v0, Ljava/io/File;

    .line 88
    .line 89
    const-string v6, "phenotype_hermetic"

    .line 90
    .line 91
    invoke-virtual {v2, v6, v5}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    const-string v7, "overrides.txt"

    .line 96
    .line 97
    invoke-direct {v0, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 98
    .line 99
    .line 100
    :try_start_3
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-eqz v6, :cond_4

    .line 105
    .line 106
    new-instance v6, LG4/c;

    .line 107
    .line 108
    invoke-direct {v6, v0}, LG4/c;-><init>(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_4
    sget-object v6, LG4/a;->q:LG4/a;

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :catchall_1
    move-exception v0

    .line 116
    goto/16 :goto_b

    .line 117
    .line 118
    :catch_0
    move-exception v0

    .line 119
    const-string v6, "HermeticFileOverrides"

    .line 120
    .line 121
    const-string v7, "no data dir"

    .line 122
    .line 123
    invoke-static {v6, v7, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 124
    .line 125
    .line 126
    sget-object v6, LG4/a;->q:LG4/a;

    .line 127
    .line 128
    :goto_2
    invoke-virtual {v6}, LG4/b;->b()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_b

    .line 133
    .line 134
    invoke-virtual {v6}, LG4/b;->a()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, Ljava/io/File;

    .line 139
    .line 140
    const-string v6, "Parsed "

    .line 141
    .line 142
    const-string v7, " for Android package "

    .line 143
    .line 144
    const-string v8, "Invalid: "
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 145
    .line 146
    :try_start_4
    new-instance v9, Ljava/io/BufferedReader;

    .line 147
    .line 148
    new-instance v10, Ljava/io/InputStreamReader;

    .line 149
    .line 150
    new-instance v11, Ljava/io/FileInputStream;

    .line 151
    .line 152
    invoke-direct {v11, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 153
    .line 154
    .line 155
    invoke-direct {v10, v11}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 156
    .line 157
    .line 158
    invoke-direct {v9, v10}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 159
    .line 160
    .line 161
    :try_start_5
    new-instance v10, Lr/Q;

    .line 162
    .line 163
    invoke-direct {v10, v5}, Lr/Q;-><init>(I)V

    .line 164
    .line 165
    .line 166
    new-instance v11, Ljava/util/HashMap;

    .line 167
    .line 168
    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 169
    .line 170
    .line 171
    :goto_3
    invoke-virtual {v9}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v12

    .line 175
    if-eqz v12, :cond_a

    .line 176
    .line 177
    const-string v13, " "

    .line 178
    .line 179
    const/4 v14, 0x3

    .line 180
    invoke-virtual {v12, v13, v14}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v13

    .line 184
    array-length v15, v13

    .line 185
    if-eq v15, v14, :cond_5

    .line 186
    .line 187
    const-string v13, "HermeticFileOverrides"

    .line 188
    .line 189
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 190
    .line 191
    .line 192
    move-result v14

    .line 193
    add-int/lit8 v14, v14, 0x9

    .line 194
    .line 195
    new-instance v15, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    invoke-direct {v15, v14}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v12

    .line 210
    invoke-static {v13, v12}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 211
    .line 212
    .line 213
    goto :goto_3

    .line 214
    :catchall_2
    move-exception v0

    .line 215
    move-object v2, v0

    .line 216
    goto/16 :goto_6

    .line 217
    .line 218
    :cond_5
    aget-object v12, v13, v5

    .line 219
    .line 220
    new-instance v14, Ljava/lang/String;

    .line 221
    .line 222
    invoke-direct {v14, v12}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    const/4 v12, 0x1

    .line 226
    aget-object v12, v13, v12

    .line 227
    .line 228
    new-instance v15, Ljava/lang/String;

    .line 229
    .line 230
    invoke-direct {v15, v12}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-static {v15}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v12

    .line 237
    const/16 v16, 0x2

    .line 238
    .line 239
    aget-object v15, v13, v16

    .line 240
    .line 241
    invoke-virtual {v11, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v15

    .line 245
    check-cast v15, Ljava/lang/String;

    .line 246
    .line 247
    if-nez v15, :cond_8

    .line 248
    .line 249
    aget-object v13, v13, v16

    .line 250
    .line 251
    new-instance v15, Ljava/lang/String;

    .line 252
    .line 253
    invoke-direct {v15, v13}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-static {v15}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v13

    .line 260
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    move-object/from16 v17, v0

    .line 265
    .line 266
    const/16 v0, 0x400

    .line 267
    .line 268
    if-lt v5, v0, :cond_6

    .line 269
    .line 270
    if-ne v13, v15, :cond_7

    .line 271
    .line 272
    :cond_6
    invoke-virtual {v11, v15, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    :cond_7
    move-object v15, v13

    .line 276
    goto :goto_4

    .line 277
    :cond_8
    move-object/from16 v17, v0

    .line 278
    .line 279
    :goto_4
    invoke-virtual {v10, v14}, Lr/Q;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    check-cast v0, Lr/Q;

    .line 284
    .line 285
    if-nez v0, :cond_9

    .line 286
    .line 287
    new-instance v0, Lr/Q;

    .line 288
    .line 289
    const/4 v5, 0x0

    .line 290
    invoke-direct {v0, v5}, Lr/Q;-><init>(I)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v10, v14, v0}, Lr/Q;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    goto :goto_5

    .line 297
    :cond_9
    const/4 v5, 0x0

    .line 298
    :goto_5
    invoke-virtual {v0, v12, v15}, Lr/Q;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-object/from16 v0, v17

    .line 302
    .line 303
    goto/16 :goto_3

    .line 304
    .line 305
    :cond_a
    move-object/from16 v17, v0

    .line 306
    .line 307
    const-string v0, "HermeticFileOverrides"

    .line 308
    .line 309
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 318
    .line 319
    .line 320
    move-result v8

    .line 321
    add-int/lit8 v8, v8, 0x1c

    .line 322
    .line 323
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v11

    .line 327
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 328
    .line 329
    .line 330
    move-result v11

    .line 331
    add-int/2addr v8, v11

    .line 332
    new-instance v11, Ljava/lang/StringBuilder;

    .line 333
    .line 334
    invoke-direct {v11, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 354
    .line 355
    .line 356
    new-instance v0, Lcom/google/android/gms/internal/measurement/N1;

    .line 357
    .line 358
    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/measurement/N1;-><init>(Lr/Q;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 359
    .line 360
    .line 361
    :try_start_6
    invoke-virtual {v9}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 362
    .line 363
    .line 364
    :try_start_7
    new-instance v2, LG4/c;

    .line 365
    .line 366
    invoke-direct {v2, v0}, LG4/c;-><init>(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 367
    .line 368
    .line 369
    goto :goto_9

    .line 370
    :catch_1
    move-exception v0

    .line 371
    goto :goto_8

    .line 372
    :goto_6
    :try_start_8
    invoke-virtual {v9}, Ljava/io/BufferedReader;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 373
    .line 374
    .line 375
    goto :goto_7

    .line 376
    :catchall_3
    move-exception v0

    .line 377
    :try_start_9
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 378
    .line 379
    .line 380
    :goto_7
    throw v2
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 381
    :goto_8
    :try_start_a
    new-instance v2, Ljava/lang/RuntimeException;

    .line 382
    .line 383
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 384
    .line 385
    .line 386
    throw v2

    .line 387
    :cond_b
    sget-object v2, LG4/a;->q:LG4/a;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 388
    .line 389
    :goto_9
    :try_start_b
    invoke-static {v4}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 390
    .line 391
    .line 392
    :goto_a
    sput-object v2, Lcom/google/android/gms/internal/measurement/P1;->a:LG4/b;

    .line 393
    .line 394
    goto :goto_c

    .line 395
    :goto_b
    invoke-static {v4}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 396
    .line 397
    .line 398
    throw v0

    .line 399
    :cond_c
    :goto_c
    monitor-exit v3

    .line 400
    return-object v2

    .line 401
    :goto_d
    monitor-exit v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 402
    throw v0

    .line 403
    :cond_d
    return-object v2
.end method
