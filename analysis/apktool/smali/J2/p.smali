.class public final LJ2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ2/q;


# instance fields
.field public final q:Lq6/x;

.field public final r:Lq6/l;

.field public final s:Ljava/lang/String;

.field public final t:Ljava/lang/AutoCloseable;

.field public final u:Ljava/lang/Object;

.field public v:Z

.field public w:Lq6/A;


# direct methods
.method public constructor <init>(Lq6/x;Lq6/l;Ljava/lang/String;Ljava/lang/AutoCloseable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJ2/p;->q:Lq6/x;

    .line 5
    .line 6
    iput-object p2, p0, LJ2/p;->r:Lq6/l;

    .line 7
    .line 8
    iput-object p3, p0, LJ2/p;->s:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, LJ2/p;->t:Ljava/lang/AutoCloseable;

    .line 11
    .line 12
    new-instance p1, Ljava/lang/Object;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, LJ2/p;->u:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final A()Lq6/x;
    .locals 3

    .line 1
    iget-object v0, p0, LJ2/p;->u:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, LJ2/p;->v:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, LJ2/p;->q:Lq6/x;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-object v1

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    :try_start_1
    const-string v1, "closed"

    .line 15
    .line 16
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    :goto_0
    monitor-exit v0

    .line 23
    throw v1
.end method

.method public final C()LE3/h;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final O()Lq6/i;
    .locals 3

    .line 1
    iget-object v0, p0, LJ2/p;->u:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, LJ2/p;->v:Z

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, LJ2/p;->w:Lq6/A;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-object v1

    .line 14
    :cond_0
    :try_start_1
    iget-object v1, p0, LJ2/p;->r:Lq6/l;

    .line 15
    .line 16
    iget-object v2, p0, LJ2/p;->q:Lq6/x;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lq6/l;->a0(Lq6/x;)Lq6/G;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, La/a;->j(Lq6/G;)Lq6/A;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iput-object v1, p0, LJ2/p;->w:Lq6/A;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-object v1

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    :try_start_2
    const-string v1, "closed"

    .line 33
    .line 34
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    :goto_0
    monitor-exit v0

    .line 41
    throw v1
.end method

.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, LJ2/p;->u:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, LJ2/p;->v:Z

    .line 6
    .line 7
    iget-object v1, p0, LJ2/p;->w:Lq6/A;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    :try_start_1
    invoke-virtual {v1}, Lq6/A;->close()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception v1

    .line 16
    :try_start_2
    throw v1

    .line 17
    :catch_1
    :cond_0
    :goto_0
    iget-object v1, p0, LJ2/p;->t:Ljava/lang/AutoCloseable;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    :try_start_3
    invoke-static {v1}, LC0/S;->s(Ljava/lang/AutoCloseable;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :catch_2
    move-exception v1

    .line 26
    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 27
    :catch_3
    :cond_1
    :goto_1
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    monitor-exit v0

    .line 31
    throw v1
.end method

.method public final getFileSystem()Lq6/l;
    .locals 1

    .line 1
    iget-object v0, p0, LJ2/p;->r:Lq6/l;

    .line 2
    .line 3
    return-object v0
.end method
