.class public final Lw/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW0/c;


# instance fields
.field public final synthetic q:LW0/c;

.field public r:Z

.field public s:Z

.field public final t:LU5/c;


# direct methods
.method public constructor <init>(LW0/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw/g0;->q:LW0/c;

    .line 5
    .line 6
    new-instance p1, LU5/c;

    .line 7
    .line 8
    invoke-direct {p1}, LU5/c;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lw/g0;->t:LU5/c;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final D(J)F
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g0;->q:LW0/c;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LW0/c;->D(J)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final G(F)I
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g0;->q:LW0/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW0/c;->G(F)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final Q(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g0;->q:LW0/c;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LW0/c;->Q(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public final T(J)F
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g0;->q:LW0/c;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LW0/c;->T(J)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final a()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lw/g0;->s:Z

    .line 3
    .line 4
    iget-object v0, p0, Lw/g0;->t:LU5/c;

    .line 5
    .line 6
    invoke-virtual {v0}, LU5/c;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, LU5/c;->g(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final a0(F)J
    .locals 2

    .line 1
    iget-object v0, p0, Lw/g0;->q:LW0/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW0/c;->a0(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g0;->q:LW0/c;

    .line 2
    .line 3
    invoke-interface {v0}, LW0/c;->b()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final c()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lw/g0;->r:Z

    .line 3
    .line 4
    iget-object v0, p0, Lw/g0;->t:LU5/c;

    .line 5
    .line 6
    invoke-virtual {v0}, LU5/c;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, LU5/c;->g(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final e(Ls5/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lw/e0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lw/e0;

    .line 7
    .line 8
    iget v1, v0, Lw/e0;->t:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lw/e0;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lw/e0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lw/e0;-><init>(Lw/g0;Ls5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lw/e0;->r:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lw/e0;->t:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object v0, v0, Lw/e0;->q:Lw/g0;

    .line 35
    .line 36
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iput-object p0, v0, Lw/e0;->q:Lw/g0;

    .line 52
    .line 53
    iput v2, v0, Lw/e0;->t:I

    .line 54
    .line 55
    iget-object p1, p0, Lw/g0;->t:LU5/c;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, LU5/c;->e(Ls5/c;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 62
    .line 63
    if-ne p1, v0, :cond_3

    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_3
    move-object v0, p0

    .line 67
    :goto_1
    const/4 p1, 0x0

    .line 68
    iput-boolean p1, v0, Lw/g0;->r:Z

    .line 69
    .line 70
    iput-boolean p1, v0, Lw/g0;->s:Z

    .line 71
    .line 72
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 73
    .line 74
    return-object p1
.end method

.method public final f0(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g0;->q:LW0/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW0/c;->f0(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final g(Ls5/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lw/f0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lw/f0;

    .line 7
    .line 8
    iget v1, v0, Lw/f0;->t:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lw/f0;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lw/f0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lw/f0;-><init>(Lw/g0;Ls5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lw/f0;->r:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lw/f0;->t:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object v0, v0, Lw/f0;->q:Lw/g0;

    .line 35
    .line 36
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-boolean p1, p0, Lw/g0;->r:Z

    .line 52
    .line 53
    if-nez p1, :cond_4

    .line 54
    .line 55
    iget-boolean p1, p0, Lw/g0;->s:Z

    .line 56
    .line 57
    if-nez p1, :cond_4

    .line 58
    .line 59
    iput-object p0, v0, Lw/f0;->q:Lw/g0;

    .line 60
    .line 61
    iput v2, v0, Lw/f0;->t:I

    .line 62
    .line 63
    iget-object p1, p0, Lw/g0;->t:LU5/c;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, LU5/c;->e(Ls5/c;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 70
    .line 71
    if-ne p1, v0, :cond_3

    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_3
    move-object v0, p0

    .line 75
    :goto_1
    iget-object p1, v0, Lw/g0;->t:LU5/c;

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    invoke-virtual {p1, v1}, LU5/c;->g(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    move-object v0, p0

    .line 83
    :goto_2
    iget-boolean p1, v0, Lw/g0;->r:Z

    .line 84
    .line 85
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    return-object p1
.end method

.method public final i0(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g0;->q:LW0/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW0/c;->i0(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final l()F
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g0;->q:LW0/c;

    .line 2
    .line 3
    invoke-interface {v0}, LW0/c;->l()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final s(F)J
    .locals 2

    .line 1
    iget-object v0, p0, Lw/g0;->q:LW0/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW0/c;->s(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final u(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g0;->q:LW0/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW0/c;->u(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
