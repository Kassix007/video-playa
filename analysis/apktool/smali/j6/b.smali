.class public final Lj6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/E;


# instance fields
.field public final q:Lq6/p;

.field public r:Z

.field public final synthetic s:Lj6/f;


# direct methods
.method public constructor <init>(Lj6/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj6/b;->s:Lj6/f;

    .line 5
    .line 6
    new-instance v0, Lq6/p;

    .line 7
    .line 8
    iget-object p1, p1, Lj6/f;->d:Lq6/h;

    .line 9
    .line 10
    invoke-interface {p1}, Lq6/E;->d()Lq6/I;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {v0, p1}, Lq6/p;-><init>(Lq6/I;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lj6/b;->q:Lq6/p;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final Z(JLq6/g;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lj6/b;->s:Lj6/f;

    .line 2
    .line 3
    iget-object v0, v0, Lj6/f;->d:Lq6/h;

    .line 4
    .line 5
    const-string v1, "source"

    .line 6
    .line 7
    invoke-static {p3, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-boolean v1, p0, Lj6/b;->r:Z

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    const-wide/16 v1, 0x0

    .line 15
    .line 16
    cmp-long v1, p1, v1

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-interface {v0, p1, p2}, Lq6/h;->j(J)Lq6/h;

    .line 22
    .line 23
    .line 24
    const-string v1, "\r\n"

    .line 25
    .line 26
    invoke-interface {v0, v1}, Lq6/h;->R(Ljava/lang/String;)Lq6/h;

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, p1, p2, p3}, Lq6/E;->Z(JLq6/g;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v1}, Lq6/h;->R(Ljava/lang/String;)Lq6/h;

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string p2, "closed"

    .line 39
    .line 40
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1
.end method

.method public final declared-synchronized close()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lj6/b;->r:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :try_start_1
    iput-boolean v0, p0, Lj6/b;->r:Z

    .line 10
    .line 11
    iget-object v0, p0, Lj6/b;->s:Lj6/f;

    .line 12
    .line 13
    iget-object v0, v0, Lj6/f;->d:Lq6/h;

    .line 14
    .line 15
    const-string v1, "0\r\n\r\n"

    .line 16
    .line 17
    invoke-interface {v0, v1}, Lq6/h;->R(Ljava/lang/String;)Lq6/h;

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lj6/b;->q:Lq6/p;

    .line 21
    .line 22
    iget-object v1, v0, Lq6/p;->e:Lq6/I;

    .line 23
    .line 24
    sget-object v2, Lq6/I;->d:Lq6/H;

    .line 25
    .line 26
    iput-object v2, v0, Lq6/p;->e:Lq6/I;

    .line 27
    .line 28
    invoke-virtual {v1}, Lq6/I;->a()Lq6/I;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lq6/I;->b()Lq6/I;

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lj6/b;->s:Lj6/f;

    .line 35
    .line 36
    const/4 v1, 0x3

    .line 37
    iput v1, v0, Lj6/f;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    throw v0
.end method

.method public final d()Lq6/I;
    .locals 1

    .line 1
    iget-object v0, p0, Lj6/b;->q:Lq6/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final declared-synchronized flush()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lj6/b;->r:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    iget-object v0, p0, Lj6/b;->s:Lj6/f;

    .line 9
    .line 10
    iget-object v0, v0, Lj6/f;->d:Lq6/h;

    .line 11
    .line 12
    invoke-interface {v0}, Lq6/h;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 19
    throw v0
.end method
