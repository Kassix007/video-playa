.class public final LO0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO0/d;


# instance fields
.field public final a:Lx3/k;

.field public final b:LO0/a;

.field public final c:LB0/o;

.field public final d:LO0/g;

.field public final e:Lk3/c;


# direct methods
.method public constructor <init>(Lx3/k;LO0/a;)V
    .locals 5

    .line 1
    sget-object v0, LO0/f;->a:LB0/o;

    .line 2
    .line 3
    new-instance v1, LO0/g;

    .line 4
    .line 5
    sget-object v2, LO0/f;->a:LB0/o;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v2, LO0/g;->a:LI2/z;

    .line 11
    .line 12
    sget-object v3, LS0/h;->a:LN5/f;

    .line 13
    .line 14
    invoke-interface {v2, v3}, Lq5/h;->plus(Lq5/h;)Lq5/h;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    sget-object v3, Lq5/i;->q:Lq5/i;

    .line 19
    .line 20
    invoke-interface {v2, v3}, Lq5/h;->plus(Lq5/h;)Lq5/h;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    new-instance v3, LM5/q0;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-direct {v3, v4}, LM5/d0;-><init>(LM5/b0;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v2, v3}, Lq5/h;->plus(Lq5/h;)Lq5/h;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v2}, LM5/y;->a(Lq5/h;)LR5/d;

    .line 35
    .line 36
    .line 37
    new-instance v2, Lk3/c;

    .line 38
    .line 39
    const/16 v3, 0x9

    .line 40
    .line 41
    invoke-direct {v2, v3}, Lk3/c;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, LO0/e;->a:Lx3/k;

    .line 48
    .line 49
    iput-object p2, p0, LO0/e;->b:LO0/a;

    .line 50
    .line 51
    iput-object v0, p0, LO0/e;->c:LB0/o;

    .line 52
    .line 53
    iput-object v1, p0, LO0/e;->d:LO0/g;

    .line 54
    .line 55
    iput-object v2, p0, LO0/e;->e:Lk3/c;

    .line 56
    .line 57
    new-instance p1, LB0/a;

    .line 58
    .line 59
    const/16 p2, 0x13

    .line 60
    .line 61
    invoke-direct {p1, p2, p0}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final a(LO0/q;)LO0/r;
    .locals 5

    .line 1
    iget-object v0, p0, LO0/e;->c:LB0/o;

    .line 2
    .line 3
    new-instance v1, LA/Y;

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    invoke-direct {v1, v2, p0, p1}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, LB0/o;->q:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, LO3/D;

    .line 13
    .line 14
    monitor-enter v2

    .line 15
    :try_start_0
    iget-object v3, v0, LB0/o;->r:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Ld2/d0;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Ld2/d0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, LO0/r;

    .line 24
    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    iget-boolean v4, v3, LO0/r;->r:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    monitor-exit v2

    .line 32
    return-object v3

    .line 33
    :cond_0
    :try_start_1
    iget-object v3, v0, LB0/o;->r:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, Ld2/d0;

    .line 36
    .line 37
    invoke-virtual {v3, p1}, Ld2/d0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, LO0/r;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_3

    .line 46
    :cond_1
    :goto_0
    monitor-exit v2

    .line 47
    :try_start_2
    new-instance v2, LA/Y;

    .line 48
    .line 49
    const/16 v3, 0xf

    .line 50
    .line 51
    invoke-direct {v2, v3, v0, p1}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, LA/Y;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, LO0/r;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 59
    .line 60
    iget-object v2, v0, LB0/o;->q:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, LO3/D;

    .line 63
    .line 64
    monitor-enter v2

    .line 65
    :try_start_3
    iget-object v3, v0, LB0/o;->r:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, Ld2/d0;

    .line 68
    .line 69
    invoke-virtual {v3, p1}, Ld2/d0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    if-nez v3, :cond_2

    .line 74
    .line 75
    iget-boolean v3, v1, LO0/r;->r:Z

    .line 76
    .line 77
    if-eqz v3, :cond_2

    .line 78
    .line 79
    iget-object v0, v0, LB0/o;->r:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Ld2/d0;

    .line 82
    .line 83
    invoke-virtual {v0, p1, v1}, Ld2/d0;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :catchall_1
    move-exception p1

    .line 88
    goto :goto_2

    .line 89
    :cond_2
    :goto_1
    monitor-exit v2

    .line 90
    return-object v1

    .line 91
    :goto_2
    monitor-exit v2

    .line 92
    throw p1

    .line 93
    :catch_0
    move-exception p1

    .line 94
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 95
    .line 96
    const-string v1, "Could not load font"

    .line 97
    .line 98
    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    throw v0

    .line 102
    :goto_3
    monitor-exit v2

    .line 103
    throw p1
.end method

.method public final b(LO0/p;LO0/j;II)LO0/r;
    .locals 6

    .line 1
    new-instance v0, LO0/q;

    .line 2
    .line 3
    iget-object v1, p0, LO0/e;->b:LO0/a;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, v1, LO0/a;->q:I

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    const v2, 0x7fffffff

    .line 13
    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget p2, p2, LO0/j;->q:I

    .line 19
    .line 20
    add-int/2addr p2, v1

    .line 21
    const/4 v1, 0x1

    .line 22
    const/16 v2, 0x3e8

    .line 23
    .line 24
    invoke-static {p2, v1, v2}, LD5/a;->q(III)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    new-instance v1, LO0/j;

    .line 29
    .line 30
    invoke-direct {v1, p2}, LO0/j;-><init>(I)V

    .line 31
    .line 32
    .line 33
    move-object v2, v1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    move-object v2, p2

    .line 36
    :goto_1
    iget-object p2, p0, LO0/e;->a:Lx3/k;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    move-object v1, p1

    .line 43
    move v3, p3

    .line 44
    move v4, p4

    .line 45
    invoke-direct/range {v0 .. v5}, LO0/q;-><init>(LO0/p;LO0/j;IILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, LO0/e;->a(LO0/q;)LO0/r;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1
.end method
