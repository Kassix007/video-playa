.class public final LK2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public final c:Ljava/lang/Object;

.field public d:Ljava/io/Serializable;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LK2/a;->a:I

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object v0, p0, LK2/a;->c:Ljava/lang/Object;

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LK2/a;->d:Ljava/io/Serializable;

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LK2/a;->e:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 46
    iput-boolean v0, p0, LK2/a;->b:Z

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LK2/a;->a:I

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    new-array v0, p1, [J

    iput-object v0, p0, LK2/a;->c:Ljava/lang/Object;

    .line 49
    new-array v0, p1, [Z

    iput-object v0, p0, LK2/a;->d:Ljava/io/Serializable;

    .line 50
    new-array p1, p1, [I

    iput-object p1, p0, LK2/a;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LK2/f;LK2/b;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LK2/a;->a:I

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK2/a;->e:Ljava/lang/Object;

    iput-object p2, p0, LK2/a;->c:Ljava/lang/Object;

    const/4 p1, 0x2

    .line 52
    new-array p1, p1, [Z

    iput-object p1, p0, LK2/a;->d:Ljava/io/Serializable;

    return-void
.end method

.method public constructor <init>(LO3/h0;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LK2/a;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK2/a;->e:Ljava/lang/Object;

    .line 2
    invoke-static {p2}, Lx3/A;->d(Ljava/lang/String;)V

    iput-object p2, p0, LK2/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LR4/k1;)V
    .locals 8

    const/4 v0, 0x4

    iput v0, p0, LK2/a;->a:I

    const-string v0, "dataObject"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK2/a;->c:Ljava/lang/Object;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    iget-object p1, p1, LR4/k1;->d:LR4/i;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 6
    iget-object p1, p1, LR4/i;->d:LR4/a2;

    if-eqz p1, :cond_0

    .line 7
    iget-object p1, p1, LR4/a2;->a:Ljava/util/List;

    goto :goto_0

    :cond_0
    move-object p1, v1

    .line 8
    :goto_0
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 9
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LR4/t2;

    if-eqz v2, :cond_1

    .line 10
    iget-object v3, v2, LR4/t2;->a:Ljava/lang/String;

    .line 11
    iget-object v4, v2, LR4/t2;->b:Ljava/lang/String;

    .line 12
    new-instance v5, Li5/a;

    .line 13
    iget-object v2, v2, LR4/t2;->d:Ljava/lang/String;

    .line 14
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 15
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 16
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 17
    invoke-direct {v5, v2, v4, v3}, Li5/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_2
    const/4 p1, 0x1

    goto :goto_3

    .line 19
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    .line 20
    :goto_3
    invoke-static {v0}, Ln5/l;->B0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 21
    check-cast v0, Ljava/util/List;

    .line 22
    iput-boolean p1, p0, LK2/a;->b:Z

    .line 23
    iput-object v0, p0, LK2/a;->e:Ljava/lang/Object;

    .line 24
    iget-object p1, p0, LK2/a;->c:Ljava/lang/Object;

    check-cast p1, LR4/k1;

    .line 25
    iget-object p1, p1, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 26
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 27
    invoke-static {p1}, Ly4/b;->v(Lcom/web2native/MainActivity;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_a

    .line 28
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 29
    const-string v2, "customHeaders"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_a

    .line 30
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 31
    invoke-virtual {v2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v3

    .line 32
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 33
    :cond_3
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 34
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_9

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    const v7, -0x5866cc5c

    if-eq v6, v7, :cond_8

    const v7, -0x19ef3b4b

    if-eq v6, v7, :cond_6

    const v7, 0x36836739

    if-eq v6, v7, :cond_4

    goto :goto_5

    :cond_4
    const-string v6, "PLAYER_ID"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_5

    :cond_5
    move-object v5, v1

    goto :goto_6

    :cond_6
    const-string v6, "OS_TYPE"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    goto :goto_5

    .line 35
    :cond_7
    const-string v5, "Android"

    goto :goto_6

    .line 36
    :cond_8
    const-string v6, "DEVICE_ID"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 37
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    const-string v6, "android_id"

    invoke-static {v5, v6}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_6

    .line 38
    :cond_9
    :goto_5
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :goto_6
    if-eqz v5, :cond_3

    .line 39
    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 40
    :cond_a
    iput-object v0, p0, LK2/a;->d:Ljava/io/Serializable;

    return-void
.end method

.method public constructor <init>(Lw2/e;Lw2/a;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, LK2/a;->a:I

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK2/a;->e:Ljava/lang/Object;

    iput-object p2, p0, LK2/a;->c:Ljava/lang/Object;

    const/4 p1, 0x2

    .line 54
    new-array p1, p1, [Z

    iput-object p1, p0, LK2/a;->d:Ljava/io/Serializable;

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 3

    .line 1
    iget v0, p0, LK2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LK2/a;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lw2/e;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-boolean v1, p0, LK2/a;->b:Z

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, LK2/a;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lw2/a;

    .line 18
    .line 19
    iget-object v1, v1, Lw2/a;->g:LK2/a;

    .line 20
    .line 21
    invoke-static {v1, p0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-static {v0, p0, p1}, Lw2/e;->a(Lw2/e;LK2/a;Z)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    :goto_0
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, LK2/a;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-void

    .line 38
    :cond_1
    :try_start_1
    const-string p1, "editor is closed"

    .line 39
    .line 40
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    :goto_1
    monitor-exit v0

    .line 47
    throw p1

    .line 48
    :pswitch_0
    iget-object v0, p0, LK2/a;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, LK2/f;

    .line 51
    .line 52
    iget-object v1, v0, LK2/f;->x:Ljava/lang/Object;

    .line 53
    .line 54
    monitor-enter v1

    .line 55
    :try_start_2
    iget-boolean v2, p0, LK2/a;->b:Z

    .line 56
    .line 57
    if-nez v2, :cond_3

    .line 58
    .line 59
    iget-object v2, p0, LK2/a;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, LK2/b;

    .line 62
    .line 63
    iget-object v2, v2, LK2/b;->g:LK2/a;

    .line 64
    .line 65
    invoke-static {v2, p0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_2

    .line 70
    .line 71
    invoke-static {v0, p0, p1}, LK2/f;->a(LK2/f;LK2/a;Z)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :catchall_1
    move-exception p1

    .line 76
    goto :goto_3

    .line 77
    :cond_2
    :goto_2
    const/4 p1, 0x1

    .line 78
    iput-boolean p1, p0, LK2/a;->b:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 79
    .line 80
    monitor-exit v1

    .line 81
    return-void

    .line 82
    :cond_3
    :try_start_3
    const-string p1, "editor is closed"

    .line 83
    .line 84
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 90
    :goto_3
    monitor-exit v1

    .line 91
    throw p1

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(I)Lq6/x;
    .locals 4

    .line 1
    iget v0, p0, LK2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LK2/a;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lw2/e;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-boolean v1, p0, LK2/a;->b:Z

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, LK2/a;->d:Ljava/io/Serializable;

    .line 16
    .line 17
    check-cast v1, [Z

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    aput-boolean v2, v1, p1

    .line 21
    .line 22
    iget-object v1, p0, LK2/a;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lw2/a;

    .line 25
    .line 26
    iget-object v1, v1, Lw2/a;->d:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object v1, v0, Lw2/e;->F:Lw2/c;

    .line 33
    .line 34
    move-object v2, p1

    .line 35
    check-cast v2, Lq6/x;

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Lq6/l;->v(Lq6/x;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-nez v3, :cond_0

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-virtual {v1, v2, v3}, Lw2/c;->W(Lq6/x;Z)Lq6/E;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, LH2/f;->a(Ljava/io/Closeable;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    check-cast p1, Lq6/x;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    monitor-exit v0

    .line 54
    return-object p1

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    :try_start_1
    const-string p1, "editor is closed"

    .line 58
    .line 59
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    :goto_0
    monitor-exit v0

    .line 66
    throw p1

    .line 67
    :pswitch_0
    iget-object v0, p0, LK2/a;->e:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, LK2/f;

    .line 70
    .line 71
    iget-object v1, v0, LK2/f;->x:Ljava/lang/Object;

    .line 72
    .line 73
    monitor-enter v1

    .line 74
    :try_start_2
    iget-boolean v2, p0, LK2/a;->b:Z

    .line 75
    .line 76
    if-nez v2, :cond_2

    .line 77
    .line 78
    iget-object v2, p0, LK2/a;->d:Ljava/io/Serializable;

    .line 79
    .line 80
    check-cast v2, [Z

    .line 81
    .line 82
    const/4 v3, 0x1

    .line 83
    aput-boolean v3, v2, p1

    .line 84
    .line 85
    iget-object v2, p0, LK2/a;->c:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v2, LK2/b;

    .line 88
    .line 89
    iget-object v2, v2, LK2/b;->d:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iget-object v0, v0, LK2/f;->G:LK2/d;

    .line 96
    .line 97
    move-object v2, p1

    .line 98
    check-cast v2, Lq6/x;

    .line 99
    .line 100
    invoke-static {v0, v2}, LC3/a;->s(Lq6/l;Lq6/x;)V

    .line 101
    .line 102
    .line 103
    check-cast p1, Lq6/x;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 104
    .line 105
    monitor-exit v1

    .line 106
    return-object p1

    .line 107
    :catchall_1
    move-exception p1

    .line 108
    goto :goto_1

    .line 109
    :cond_2
    :try_start_3
    const-string p1, "editor is closed"

    .line 110
    .line 111
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 112
    .line 113
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 117
    :goto_1
    monitor-exit v1

    .line 118
    throw p1

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c()[I
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LK2/a;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    :try_start_1
    iget-object v0, p0, LK2/a;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, [J

    .line 12
    .line 13
    array-length v1, v0

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    move v4, v3

    .line 17
    :goto_0
    if-ge v3, v1, :cond_4

    .line 18
    .line 19
    aget-wide v5, v0, v3

    .line 20
    .line 21
    add-int/lit8 v7, v4, 0x1

    .line 22
    .line 23
    const-wide/16 v8, 0x0

    .line 24
    .line 25
    cmp-long v5, v5, v8

    .line 26
    .line 27
    const/4 v6, 0x1

    .line 28
    if-lez v5, :cond_1

    .line 29
    .line 30
    move v5, v6

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v5, v2

    .line 33
    :goto_1
    iget-object v8, p0, LK2/a;->d:Ljava/io/Serializable;

    .line 34
    .line 35
    check-cast v8, [Z

    .line 36
    .line 37
    aget-boolean v9, v8, v4

    .line 38
    .line 39
    if-eq v5, v9, :cond_3

    .line 40
    .line 41
    iget-object v9, p0, LK2/a;->e:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v9, [I

    .line 44
    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/4 v6, 0x2

    .line 49
    :goto_2
    aput v6, v9, v4

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    goto :goto_4

    .line 54
    :cond_3
    iget-object v6, p0, LK2/a;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v6, [I

    .line 57
    .line 58
    aput v2, v6, v4

    .line 59
    .line 60
    :goto_3
    aput-boolean v5, v8, v4

    .line 61
    .line 62
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    move v4, v7

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    iput-boolean v2, p0, LK2/a;->b:Z

    .line 67
    .line 68
    iget-object v0, p0, LK2/a;->e:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, [I

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, [I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    .line 78
    monitor-exit p0

    .line 79
    return-object v0

    .line 80
    :goto_4
    monitor-exit p0

    .line 81
    throw v0
.end method

.method public d(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 10

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LK2/a;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/List;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const-string v2, "allRegexHandling"

    .line 12
    .line 13
    if-eqz v0, :cond_7

    .line 14
    .line 15
    invoke-static {p2, v0}, Ly4/b;->k(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-static {v0, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v4, 0x0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, LK2/a;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, LR4/k1;

    .line 33
    .line 34
    iget-boolean v5, p0, LK2/a;->b:Z

    .line 35
    .line 36
    iget-object v6, p0, LK2/a;->d:Ljava/io/Serializable;

    .line 37
    .line 38
    check-cast v6, Ljava/util/HashMap;

    .line 39
    .line 40
    iget-object v7, p0, LK2/a;->e:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v7, Ljava/util/List;

    .line 43
    .line 44
    if-eqz v7, :cond_6

    .line 45
    .line 46
    const-string v2, "dataObject"

    .line 47
    .line 48
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v2, "customHeaders"

    .line 52
    .line 53
    invoke-static {v6, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p2, v7}, Ly4/b;->k(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    if-eqz v5, :cond_5

    .line 61
    .line 62
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-static {v2, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    const/4 v8, 0x1

    .line 69
    const-string v9, "android.intent.action.VIEW"

    .line 70
    .line 71
    if-eqz v7, :cond_1

    .line 72
    .line 73
    new-instance p1, Landroid/content/Intent;

    .line 74
    .line 75
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-direct {p1, v9, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 80
    .line 81
    .line 82
    const/high16 p2, 0x10000000

    .line 83
    .line 84
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 85
    .line 86
    .line 87
    iget-object p2, v0, LR4/k1;->t:Lj5/d;

    .line 88
    .line 89
    iget-object p2, p2, Lj5/d;->f:LP5/S;

    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, v1, v5}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    iget-object p2, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 98
    .line 99
    invoke-virtual {p2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 100
    .line 101
    .line 102
    return v8

    .line 103
    :cond_1
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-nez v1, :cond_4

    .line 108
    .line 109
    const-string v1, "https://www.smspariaz.com"

    .line 110
    .line 111
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-nez v3, :cond_4

    .line 116
    .line 117
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_2

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_2
    if-nez v2, :cond_3

    .line 125
    .line 126
    new-instance p1, LL/s;

    .line 127
    .line 128
    invoke-direct {p1}, LL/s;-><init>()V

    .line 129
    .line 130
    .line 131
    iget-object v0, v0, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 132
    .line 133
    invoke-virtual {p1}, LL/s;->b()LZ/m;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    iget-object v1, p1, LZ/m;->r:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v1, Landroid/content/Intent;

    .line 144
    .line 145
    const-string v2, "com.android.chrome"

    .line 146
    .line 147
    :try_start_0
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 148
    .line 149
    .line 150
    invoke-static {p2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 154
    .line 155
    .line 156
    iget-object p1, p1, LZ/m;->s:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast p1, Landroid/os/Bundle;

    .line 159
    .line 160
    invoke-virtual {v0, v1, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    .line 162
    .line 163
    return v8

    .line 164
    :catch_0
    new-instance p1, Landroid/content/Intent;

    .line 165
    .line 166
    invoke-direct {p1, v9, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 170
    .line 171
    .line 172
    return v8

    .line 173
    :cond_3
    :goto_0
    return v4

    .line 174
    :cond_4
    :goto_1
    invoke-static {p2, p1, v6, v0}, Ly4/b;->w(Ljava/lang/String;Landroid/webkit/WebView;Ljava/util/HashMap;LR4/k1;)V

    .line 175
    .line 176
    .line 177
    return v4

    .line 178
    :cond_5
    invoke-static {p2, p1, v6, v0}, Ly4/b;->w(Ljava/lang/String;Landroid/webkit/WebView;Ljava/util/HashMap;LR4/k1;)V

    .line 179
    .line 180
    .line 181
    return v4

    .line 182
    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v1

    .line 186
    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw v1
.end method

.method public e()Ljava/lang/String;
    .locals 3

    .line 1
    iget-boolean v0, p0, LK2/a;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LK2/a;->b:Z

    .line 7
    .line 8
    iget-object v0, p0, LK2/a;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LO3/h0;

    .line 11
    .line 12
    iget-object v1, p0, LK2/a;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, LK2/a;->d:Ljava/io/Serializable;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, LK2/a;->d:Ljava/io/Serializable;

    .line 28
    .line 29
    check-cast v0, Ljava/lang/String;

    .line 30
    .line 31
    return-object v0
.end method

.method public f(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, LK2/a;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LO3/h0;

    .line 4
    .line 5
    invoke-virtual {v0}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, LK2/a;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/lang/String;

    .line 16
    .line 17
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, LK2/a;->d:Ljava/io/Serializable;

    .line 24
    .line 25
    return-void
.end method
