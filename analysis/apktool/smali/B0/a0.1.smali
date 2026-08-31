.class public final LB0/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LB0/L;

.field public final b:LB0/o;

.field public c:Z

.field public d:Z

.field public final e:LB0/o;

.field public final f:LR/e;

.field public final g:J

.field public final h:LR/e;

.field public i:LW0/a;


# direct methods
.method public constructor <init>(LB0/L;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB0/a0;->a:LB0/L;

    .line 5
    .line 6
    new-instance p1, LB0/o;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, v0}, LB0/o;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, LB0/a0;->b:LB0/o;

    .line 13
    .line 14
    new-instance p1, LB0/o;

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    invoke-direct {p1, v0}, LB0/o;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, LB0/a0;->e:LB0/o;

    .line 21
    .line 22
    new-instance p1, LR/e;

    .line 23
    .line 24
    const/16 v0, 0x10

    .line 25
    .line 26
    new-array v1, v0, [LB0/L;

    .line 27
    .line 28
    invoke-direct {p1, v1}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, LB0/a0;->f:LR/e;

    .line 32
    .line 33
    const-wide/16 v1, 0x1

    .line 34
    .line 35
    iput-wide v1, p0, LB0/a0;->g:J

    .line 36
    .line 37
    new-instance p1, LR/e;

    .line 38
    .line 39
    new-array v0, v0, [LB0/Z;

    .line 40
    .line 41
    invoke-direct {p1, v0}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, LB0/a0;->h:LR/e;

    .line 45
    .line 46
    return-void
.end method

.method public static b(LB0/L;LW0/a;)Z
    .locals 5

    .line 1
    iget-object v0, p0, LB0/L;->x:LB0/L;

    .line 2
    .line 3
    iget-object v1, p0, LB0/L;->V:LB0/P;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    if-eqz p1, :cond_2

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v1, LB0/P;->q:LB0/Y;

    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-wide v3, p1, LW0/a;->a:J

    .line 19
    .line 20
    invoke-virtual {v0, v3, v4}, LB0/Y;->e0(J)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move p1, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    iget-object p1, v1, LB0/P;->q:LB0/Y;

    .line 28
    .line 29
    if-eqz p1, :cond_3

    .line 30
    .line 31
    iget-object v1, p1, LB0/Y;->C:LW0/a;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-eqz v1, :cond_1

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-wide v0, v1, LW0/a;->a:J

    .line 43
    .line 44
    invoke-virtual {p1, v0, v1}, LB0/Y;->e0(J)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    :goto_1
    invoke-virtual {p0}, LB0/L;->s()LB0/L;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz p1, :cond_6

    .line 53
    .line 54
    if-eqz v0, :cond_6

    .line 55
    .line 56
    iget-object v1, v0, LB0/L;->x:LB0/L;

    .line 57
    .line 58
    const/4 v3, 0x3

    .line 59
    if-nez v1, :cond_4

    .line 60
    .line 61
    invoke-static {v0, v2, v3}, LB0/L;->S(LB0/L;ZI)V

    .line 62
    .line 63
    .line 64
    return p1

    .line 65
    :cond_4
    invoke-virtual {p0}, LB0/L;->r()LB0/I;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    sget-object v4, LB0/I;->q:LB0/I;

    .line 70
    .line 71
    if-ne v1, v4, :cond_5

    .line 72
    .line 73
    invoke-static {v0, v2, v3}, LB0/L;->Q(LB0/L;ZI)V

    .line 74
    .line 75
    .line 76
    return p1

    .line 77
    :cond_5
    invoke-virtual {p0}, LB0/L;->r()LB0/I;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    sget-object v1, LB0/I;->r:LB0/I;

    .line 82
    .line 83
    if-ne p0, v1, :cond_6

    .line 84
    .line 85
    invoke-virtual {v0, v2}, LB0/L;->P(Z)V

    .line 86
    .line 87
    .line 88
    :cond_6
    return p1
.end method

.method public static c(LB0/L;LW0/a;)Z
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, LB0/L;->R:LB0/I;

    .line 4
    .line 5
    sget-object v1, LB0/I;->s:LB0/I;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, LB0/L;->c()V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, LB0/L;->V:LB0/P;

    .line 13
    .line 14
    iget-object v0, v0, LB0/P;->p:LB0/c0;

    .line 15
    .line 16
    iget-wide v1, p1, LW0/a;->a:J

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, LB0/c0;->h0(J)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    iget-object p1, p0, LB0/L;->V:LB0/P;

    .line 24
    .line 25
    iget-object p1, p1, LB0/P;->p:LB0/c0;

    .line 26
    .line 27
    iget-boolean v0, p1, LB0/c0;->z:Z

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget-wide v0, p1, Lz0/J;->t:J

    .line 32
    .line 33
    new-instance p1, LW0/a;

    .line 34
    .line 35
    invoke-direct {p1, v0, v1}, LW0/a;-><init>(J)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const/4 p1, 0x0

    .line 40
    :goto_0
    if-eqz p1, :cond_4

    .line 41
    .line 42
    iget-object v0, p0, LB0/L;->R:LB0/I;

    .line 43
    .line 44
    sget-object v1, LB0/I;->s:LB0/I;

    .line 45
    .line 46
    if-ne v0, v1, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0}, LB0/L;->c()V

    .line 49
    .line 50
    .line 51
    :cond_3
    iget-object v0, p0, LB0/L;->V:LB0/P;

    .line 52
    .line 53
    iget-object v0, v0, LB0/P;->p:LB0/c0;

    .line 54
    .line 55
    iget-wide v1, p1, LW0/a;->a:J

    .line 56
    .line 57
    invoke-virtual {v0, v1, v2}, LB0/c0;->h0(J)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    goto :goto_1

    .line 62
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    :goto_1
    invoke-virtual {p0}, LB0/L;->s()LB0/L;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz p1, :cond_6

    .line 71
    .line 72
    if-eqz v0, :cond_6

    .line 73
    .line 74
    iget-object p0, p0, LB0/L;->V:LB0/P;

    .line 75
    .line 76
    iget-object p0, p0, LB0/P;->p:LB0/c0;

    .line 77
    .line 78
    iget-object p0, p0, LB0/c0;->B:LB0/I;

    .line 79
    .line 80
    sget-object v1, LB0/I;->q:LB0/I;

    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    if-ne p0, v1, :cond_5

    .line 84
    .line 85
    const/4 p0, 0x3

    .line 86
    invoke-static {v0, v2, p0}, LB0/L;->S(LB0/L;ZI)V

    .line 87
    .line 88
    .line 89
    return p1

    .line 90
    :cond_5
    sget-object v1, LB0/I;->r:LB0/I;

    .line 91
    .line 92
    if-ne p0, v1, :cond_6

    .line 93
    .line 94
    invoke-virtual {v0, v2}, LB0/L;->R(Z)V

    .line 95
    .line 96
    .line 97
    :cond_6
    return p1
.end method

.method public static h(LB0/L;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LB0/L;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    :cond_0
    invoke-static {p0}, LB0/a0;->i(LB0/L;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0}, LB0/L;->s()LB0/L;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, v0, LB0/L;->V:LB0/P;

    .line 20
    .line 21
    iget-object v0, v0, LB0/P;->d:LB0/G;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    :goto_0
    sget-object v1, LB0/G;->q:LB0/G;

    .line 26
    .line 27
    if-ne v0, v1, :cond_4

    .line 28
    .line 29
    :cond_2
    invoke-virtual {p0}, LB0/L;->s()LB0/L;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-nez p0, :cond_3

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_3
    invoke-virtual {p0}, LB0/L;->G()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 45
    return p0
.end method

.method public static i(LB0/L;)Z
    .locals 2

    .line 1
    iget-object p0, p0, LB0/L;->V:LB0/P;

    .line 2
    .line 3
    iget-object p0, p0, LB0/P;->p:LB0/c0;

    .line 4
    .line 5
    iget-object v0, p0, LB0/c0;->B:LB0/I;

    .line 6
    .line 7
    sget-object v1, LB0/I;->q:LB0/I;

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    iget-object p0, p0, LB0/c0;->M:LB0/M;

    .line 12
    .line 13
    invoke-virtual {p0}, LB0/M;->e()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0
.end method


# virtual methods
.method public final a(Z)V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, LB0/a0;->e:LB0/o;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object p1, v1, LB0/o;->q:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, LR/e;

    .line 9
    .line 10
    invoke-virtual {p1}, LR/e;->i()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, LB0/a0;->a:LB0/L;

    .line 14
    .line 15
    invoke-virtual {p1, v2}, LR/e;->c(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput-boolean v0, v2, LB0/L;->d0:Z

    .line 19
    .line 20
    :cond_0
    iget-object p1, v1, LB0/o;->q:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, LR/e;

    .line 23
    .line 24
    sget-object v2, LB0/r0;->b:LB0/r0;

    .line 25
    .line 26
    invoke-virtual {p1, v2}, LR/e;->q(Ljava/util/Comparator;)V

    .line 27
    .line 28
    .line 29
    iget v2, p1, LR/e;->s:I

    .line 30
    .line 31
    iget-object v3, v1, LB0/o;->r:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, [LB0/L;

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    array-length v4, v3

    .line 38
    if-ge v4, v2, :cond_2

    .line 39
    .line 40
    :cond_1
    const/16 v3, 0x10

    .line 41
    .line 42
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    new-array v3, v3, [LB0/L;

    .line 47
    .line 48
    :cond_2
    const/4 v4, 0x0

    .line 49
    iput-object v4, v1, LB0/o;->r:Ljava/lang/Object;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    :goto_0
    if-ge v4, v2, :cond_3

    .line 53
    .line 54
    iget-object v5, p1, LR/e;->q:[Ljava/lang/Object;

    .line 55
    .line 56
    aget-object v5, v5, v4

    .line 57
    .line 58
    aput-object v5, v3, v4

    .line 59
    .line 60
    add-int/lit8 v4, v4, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    invoke-virtual {p1}, LR/e;->i()V

    .line 64
    .line 65
    .line 66
    sub-int/2addr v2, v0

    .line 67
    :goto_1
    const/4 p1, -0x1

    .line 68
    if-ge p1, v2, :cond_5

    .line 69
    .line 70
    aget-object p1, v3, v2

    .line 71
    .line 72
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-boolean v0, p1, LB0/L;->d0:Z

    .line 76
    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    invoke-static {p1}, LB0/o;->n(LB0/L;)V

    .line 80
    .line 81
    .line 82
    :cond_4
    add-int/lit8 v2, v2, -0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_5
    iput-object v3, v1, LB0/o;->r:Ljava/lang/Object;

    .line 86
    .line 87
    return-void
.end method

.method public final d()V
    .locals 8

    .line 1
    iget-object v0, p0, LB0/a0;->h:LR/e;

    .line 2
    .line 3
    iget v1, v0, LR/e;->s:I

    .line 4
    .line 5
    if-eqz v1, :cond_3

    .line 6
    .line 7
    iget-object v2, v0, LR/e;->q:[Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    :goto_0
    if-ge v3, v1, :cond_2

    .line 11
    .line 12
    aget-object v4, v2, v3

    .line 13
    .line 14
    check-cast v4, LB0/Z;

    .line 15
    .line 16
    iget-object v5, v4, LB0/Z;->a:LB0/L;

    .line 17
    .line 18
    iget-boolean v6, v4, LB0/Z;->c:Z

    .line 19
    .line 20
    iget-object v7, v4, LB0/Z;->a:LB0/L;

    .line 21
    .line 22
    invoke-virtual {v5}, LB0/L;->F()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_1

    .line 27
    .line 28
    iget-boolean v4, v4, LB0/Z;->b:Z

    .line 29
    .line 30
    const/4 v5, 0x2

    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    invoke-static {v7, v6, v5}, LB0/L;->S(LB0/L;ZI)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-static {v7, v6, v5}, LB0/L;->Q(LB0/L;ZI)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-virtual {v0}, LR/e;->i()V

    .line 44
    .line 45
    .line 46
    :cond_3
    return-void
.end method

.method public final e(LB0/L;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, LB0/L;->w()LR/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, LR/e;->q:[Ljava/lang/Object;

    .line 6
    .line 7
    iget p1, p1, LR/e;->s:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, p1, :cond_2

    .line 11
    .line 12
    aget-object v2, v0, v1

    .line 13
    .line 14
    check-cast v2, LB0/L;

    .line 15
    .line 16
    invoke-virtual {v2}, LB0/L;->H()Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-static {v3, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    iget-boolean v3, v2, LB0/L;->e0:Z

    .line 29
    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    iget-object v3, p0, LB0/a0;->b:LB0/o;

    .line 33
    .line 34
    iget-object v3, v3, LB0/o;->q:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, Lk3/d;

    .line 37
    .line 38
    iget-object v3, v3, Lk3/d;->r:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, LB0/F0;

    .line 41
    .line 42
    invoke-virtual {v3, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    invoke-virtual {v2}, LB0/L;->I()V

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-virtual {p0, v2}, LB0/a0;->e(LB0/L;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    return-void
.end method

.method public final f(LB0/L;Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LB0/a0;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "forceMeasureTheSubtree should be executed during the measureAndLayout pass"

    .line 6
    .line 7
    invoke-static {v0}, Ly0/a;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    if-eqz p2, :cond_1

    .line 11
    .line 12
    iget-object v0, p1, LB0/L;->V:LB0/P;

    .line 13
    .line 14
    iget-boolean v0, v0, LB0/P;->e:Z

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p1}, LB0/L;->q()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    const-string v0, "node not yet measured"

    .line 24
    .line 25
    invoke-static {v0}, Ly0/a;->a(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    invoke-virtual {p0, p1, p2}, LB0/a0;->g(LB0/L;Z)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final g(LB0/L;Z)V
    .locals 8

    .line 1
    invoke-virtual {p1}, LB0/L;->w()LR/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, LR/e;->q:[Ljava/lang/Object;

    .line 6
    .line 7
    iget v0, v0, LR/e;->s:I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v3, v0, :cond_8

    .line 12
    .line 13
    aget-object v4, v1, v3

    .line 14
    .line 15
    check-cast v4, LB0/L;

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    invoke-static {v4}, LB0/a0;->i(LB0/L;)Z

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-nez v6, :cond_1

    .line 25
    .line 26
    :cond_0
    if-eqz p2, :cond_7

    .line 27
    .line 28
    invoke-virtual {v4}, LB0/L;->r()LB0/I;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    sget-object v7, LB0/I;->q:LB0/I;

    .line 33
    .line 34
    if-eq v6, v7, :cond_1

    .line 35
    .line 36
    iget-object v6, v4, LB0/L;->V:LB0/P;

    .line 37
    .line 38
    iget-object v6, v6, LB0/P;->q:LB0/Y;

    .line 39
    .line 40
    if-eqz v6, :cond_7

    .line 41
    .line 42
    iget-object v6, v6, LB0/Y;->G:LB0/M;

    .line 43
    .line 44
    if-eqz v6, :cond_7

    .line 45
    .line 46
    invoke-virtual {v6}, LB0/M;->e()Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-ne v6, v5, :cond_7

    .line 51
    .line 52
    :cond_1
    invoke-static {v4}, LB0/g;->q(LB0/L;)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    iget-object v7, v4, LB0/L;->V:LB0/P;

    .line 57
    .line 58
    if-eqz v6, :cond_3

    .line 59
    .line 60
    if-nez p2, :cond_3

    .line 61
    .line 62
    iget-boolean v6, v7, LB0/P;->e:Z

    .line 63
    .line 64
    if-eqz v6, :cond_2

    .line 65
    .line 66
    iget-object v6, p0, LB0/a0;->b:LB0/o;

    .line 67
    .line 68
    iget-object v6, v6, LB0/o;->q:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v6, Lk3/d;

    .line 71
    .line 72
    iget-object v6, v6, Lk3/d;->r:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v6, LB0/F0;

    .line 75
    .line 76
    invoke-virtual {v6, v4}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-eqz v6, :cond_2

    .line 81
    .line 82
    invoke-virtual {p0, v4, v5, v2}, LB0/a0;->m(LB0/L;ZZ)Z

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    invoke-virtual {p0, v4, v5}, LB0/a0;->f(LB0/L;Z)V

    .line 87
    .line 88
    .line 89
    :cond_3
    :goto_1
    if-eqz p2, :cond_4

    .line 90
    .line 91
    iget-boolean v5, v7, LB0/P;->e:Z

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    invoke-virtual {v4}, LB0/L;->q()Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    :goto_2
    if-eqz v5, :cond_5

    .line 99
    .line 100
    invoke-virtual {p0, v4, p2, v2}, LB0/a0;->m(LB0/L;ZZ)Z

    .line 101
    .line 102
    .line 103
    :cond_5
    if-eqz p2, :cond_6

    .line 104
    .line 105
    iget-boolean v5, v7, LB0/P;->e:Z

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_6
    invoke-virtual {v4}, LB0/L;->q()Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    :goto_3
    if-nez v5, :cond_7

    .line 113
    .line 114
    invoke-virtual {p0, v4, p2}, LB0/a0;->g(LB0/L;Z)V

    .line 115
    .line 116
    .line 117
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_8
    if-eqz p2, :cond_9

    .line 121
    .line 122
    iget-object v0, p1, LB0/L;->V:LB0/P;

    .line 123
    .line 124
    iget-boolean v0, v0, LB0/P;->e:Z

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_9
    invoke-virtual {p1}, LB0/L;->q()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    :goto_4
    if-eqz v0, :cond_a

    .line 132
    .line 133
    invoke-virtual {p0, p1, p2, v2}, LB0/a0;->m(LB0/L;ZZ)Z

    .line 134
    .line 135
    .line 136
    :cond_a
    return-void
.end method

.method public final j(LC0/y;)Z
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LB0/a0;->b:LB0/o;

    .line 4
    .line 5
    iget-object v2, v1, LB0/a0;->a:LB0/L;

    .line 6
    .line 7
    invoke-virtual {v2}, LB0/L;->F()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    const-string v3, "performMeasureAndLayout called with unattached root"

    .line 14
    .line 15
    invoke-static {v3}, Ly0/a;->a(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {v2}, LB0/L;->G()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    const-string v3, "performMeasureAndLayout called with unplaced root"

    .line 25
    .line 26
    invoke-static {v3}, Ly0/a;->a(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-boolean v3, v1, LB0/a0;->c:Z

    .line 30
    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    const-string v3, "performMeasureAndLayout called during measure layout"

    .line 34
    .line 35
    invoke-static {v3}, Ly0/a;->a(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iget-object v3, v1, LB0/a0;->i:LW0/a;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    const/4 v5, 0x1

    .line 42
    if-eqz v3, :cond_8

    .line 43
    .line 44
    iput-boolean v5, v1, LB0/a0;->c:Z

    .line 45
    .line 46
    iput-boolean v5, v1, LB0/a0;->d:Z

    .line 47
    .line 48
    :try_start_0
    invoke-virtual {v0}, LB0/o;->E()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_6

    .line 53
    .line 54
    move v3, v4

    .line 55
    :cond_3
    :goto_0
    invoke-virtual {v0}, LB0/o;->E()Z

    .line 56
    .line 57
    .line 58
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    iget-object v7, v0, LB0/o;->q:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v7, Lk3/d;

    .line 62
    .line 63
    if-eqz v6, :cond_5

    .line 64
    .line 65
    :try_start_1
    iget-object v6, v7, Lk3/d;->r:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v6, LB0/F0;

    .line 68
    .line 69
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    xor-int/lit8 v8, v6, 0x1

    .line 74
    .line 75
    if-nez v6, :cond_4

    .line 76
    .line 77
    iget-object v6, v7, Lk3/d;->r:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v6, LB0/F0;

    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    check-cast v6, LB0/L;

    .line 86
    .line 87
    invoke-virtual {v7, v6}, Lk3/d;->z(LB0/L;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    iget-object v6, v0, LB0/o;->r:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v6, Lk3/d;

    .line 94
    .line 95
    iget-object v7, v6, Lk3/d;->r:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v7, LB0/F0;

    .line 98
    .line 99
    invoke-virtual {v7}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    check-cast v7, LB0/L;

    .line 104
    .line 105
    invoke-virtual {v6, v7}, Lk3/d;->z(LB0/L;)Z

    .line 106
    .line 107
    .line 108
    move-object v6, v7

    .line 109
    :goto_1
    invoke-virtual {v1, v6, v8, v5}, LB0/a0;->m(LB0/L;ZZ)Z

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    if-ne v6, v2, :cond_3

    .line 114
    .line 115
    if-eqz v7, :cond_3

    .line 116
    .line 117
    move v3, v5

    .line 118
    goto :goto_0

    .line 119
    :catchall_0
    move-exception v0

    .line 120
    goto :goto_3

    .line 121
    :cond_5
    if-eqz p1, :cond_7

    .line 122
    .line 123
    invoke-virtual/range {p1 .. p1}, LC0/y;->invoke()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_6
    move v3, v4

    .line 128
    :cond_7
    :goto_2
    iput-boolean v4, v1, LB0/a0;->c:Z

    .line 129
    .line 130
    iput-boolean v4, v1, LB0/a0;->d:Z

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :goto_3
    iput-boolean v4, v1, LB0/a0;->c:Z

    .line 134
    .line 135
    iput-boolean v4, v1, LB0/a0;->d:Z

    .line 136
    .line 137
    throw v0

    .line 138
    :cond_8
    move v3, v4

    .line 139
    :goto_4
    iget-object v0, v1, LB0/a0;->f:LR/e;

    .line 140
    .line 141
    iget-object v2, v0, LR/e;->q:[Ljava/lang/Object;

    .line 142
    .line 143
    iget v6, v0, LR/e;->s:I

    .line 144
    .line 145
    move v7, v4

    .line 146
    :goto_5
    if-ge v7, v6, :cond_14

    .line 147
    .line 148
    aget-object v8, v2, v7

    .line 149
    .line 150
    check-cast v8, LB0/L;

    .line 151
    .line 152
    iget-object v8, v8, LB0/L;->U:LB0/g0;

    .line 153
    .line 154
    iget-object v9, v8, LB0/g0;->b:LB0/v;

    .line 155
    .line 156
    const/16 v10, 0x80

    .line 157
    .line 158
    invoke-static {v10}, LB0/o0;->g(I)Z

    .line 159
    .line 160
    .line 161
    move-result v11

    .line 162
    if-eqz v11, :cond_9

    .line 163
    .line 164
    iget-object v12, v9, LB0/v;->a0:LB0/B0;

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_9
    iget-object v12, v9, LB0/v;->a0:LB0/B0;

    .line 168
    .line 169
    iget-object v12, v12, Lc0/l;->u:Lc0/l;

    .line 170
    .line 171
    if-nez v12, :cond_a

    .line 172
    .line 173
    goto/16 :goto_d

    .line 174
    .line 175
    :cond_a
    :goto_6
    sget-object v13, LB0/n0;->W:Lj0/C;

    .line 176
    .line 177
    invoke-virtual {v9, v11}, LB0/n0;->D0(Z)Lc0/l;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    :goto_7
    if-eqz v9, :cond_13

    .line 182
    .line 183
    iget v11, v9, Lc0/l;->t:I

    .line 184
    .line 185
    and-int/2addr v11, v10

    .line 186
    if-eqz v11, :cond_13

    .line 187
    .line 188
    iget v11, v9, Lc0/l;->s:I

    .line 189
    .line 190
    and-int/2addr v11, v10

    .line 191
    if-eqz v11, :cond_12

    .line 192
    .line 193
    move-object v13, v9

    .line 194
    const/4 v14, 0x0

    .line 195
    :goto_8
    if-eqz v13, :cond_12

    .line 196
    .line 197
    instance-of v15, v13, LB0/y;

    .line 198
    .line 199
    if-eqz v15, :cond_b

    .line 200
    .line 201
    check-cast v13, LB0/y;

    .line 202
    .line 203
    iget-object v15, v8, LB0/g0;->b:LB0/v;

    .line 204
    .line 205
    invoke-interface {v13, v15}, LB0/y;->j0(Lz0/m;)V

    .line 206
    .line 207
    .line 208
    goto :goto_c

    .line 209
    :cond_b
    iget v15, v13, Lc0/l;->s:I

    .line 210
    .line 211
    and-int/2addr v15, v10

    .line 212
    if-eqz v15, :cond_11

    .line 213
    .line 214
    instance-of v15, v13, LB0/n;

    .line 215
    .line 216
    if-eqz v15, :cond_11

    .line 217
    .line 218
    move-object v15, v13

    .line 219
    check-cast v15, LB0/n;

    .line 220
    .line 221
    iget-object v15, v15, LB0/n;->F:Lc0/l;

    .line 222
    .line 223
    :goto_9
    if-eqz v15, :cond_10

    .line 224
    .line 225
    iget v11, v15, Lc0/l;->s:I

    .line 226
    .line 227
    and-int/2addr v11, v10

    .line 228
    if-eqz v11, :cond_f

    .line 229
    .line 230
    add-int/lit8 v4, v4, 0x1

    .line 231
    .line 232
    if-ne v4, v5, :cond_c

    .line 233
    .line 234
    move-object v13, v15

    .line 235
    goto :goto_a

    .line 236
    :cond_c
    if-nez v14, :cond_d

    .line 237
    .line 238
    new-instance v14, LR/e;

    .line 239
    .line 240
    const/16 v11, 0x10

    .line 241
    .line 242
    new-array v11, v11, [Lc0/l;

    .line 243
    .line 244
    invoke-direct {v14, v11}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    :cond_d
    if-eqz v13, :cond_e

    .line 248
    .line 249
    invoke-virtual {v14, v13}, LR/e;->c(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    const/4 v13, 0x0

    .line 253
    :cond_e
    invoke-virtual {v14, v15}, LR/e;->c(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    :cond_f
    :goto_a
    iget-object v15, v15, Lc0/l;->v:Lc0/l;

    .line 257
    .line 258
    goto :goto_9

    .line 259
    :cond_10
    if-ne v4, v5, :cond_11

    .line 260
    .line 261
    :goto_b
    const/4 v4, 0x0

    .line 262
    goto :goto_8

    .line 263
    :cond_11
    :goto_c
    invoke-static {v14}, LB0/g;->f(LR/e;)Lc0/l;

    .line 264
    .line 265
    .line 266
    move-result-object v13

    .line 267
    goto :goto_b

    .line 268
    :cond_12
    if-eq v9, v12, :cond_13

    .line 269
    .line 270
    iget-object v9, v9, Lc0/l;->v:Lc0/l;

    .line 271
    .line 272
    const/4 v4, 0x0

    .line 273
    goto :goto_7

    .line 274
    :cond_13
    :goto_d
    add-int/lit8 v7, v7, 0x1

    .line 275
    .line 276
    const/4 v4, 0x0

    .line 277
    goto/16 :goto_5

    .line 278
    .line 279
    :cond_14
    invoke-virtual {v0}, LR/e;->i()V

    .line 280
    .line 281
    .line 282
    return v3
.end method

.method public final k(LB0/L;J)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    iget-boolean v4, v0, LB0/L;->e0:Z

    .line 8
    .line 9
    iget-object v5, v0, LB0/L;->V:LB0/P;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v4, v1, LB0/a0;->a:LB0/L;

    .line 15
    .line 16
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    if-eqz v6, :cond_1

    .line 21
    .line 22
    const-string v6, "measureAndLayout called on root"

    .line 23
    .line 24
    invoke-static {v6}, Ly0/a;->a(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {v4}, LB0/L;->F()Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-nez v6, :cond_2

    .line 32
    .line 33
    const-string v6, "performMeasureAndLayout called with unattached root"

    .line 34
    .line 35
    invoke-static {v6}, Ly0/a;->a(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    invoke-virtual {v4}, LB0/L;->G()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-nez v4, :cond_3

    .line 43
    .line 44
    const-string v4, "performMeasureAndLayout called with unplaced root"

    .line 45
    .line 46
    invoke-static {v4}, Ly0/a;->a(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_3
    iget-boolean v4, v1, LB0/a0;->c:Z

    .line 50
    .line 51
    if-eqz v4, :cond_4

    .line 52
    .line 53
    const-string v4, "performMeasureAndLayout called during measure layout"

    .line 54
    .line 55
    invoke-static {v4}, Ly0/a;->a(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_4
    iget-object v4, v1, LB0/a0;->i:LW0/a;

    .line 59
    .line 60
    const/4 v6, 0x1

    .line 61
    const/4 v7, 0x0

    .line 62
    if-eqz v4, :cond_b

    .line 63
    .line 64
    iput-boolean v6, v1, LB0/a0;->c:Z

    .line 65
    .line 66
    iput-boolean v7, v1, LB0/a0;->d:Z

    .line 67
    .line 68
    :try_start_0
    iget-object v4, v1, LB0/a0;->b:LB0/o;

    .line 69
    .line 70
    iget-object v8, v4, LB0/o;->q:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v8, Lk3/d;

    .line 73
    .line 74
    invoke-virtual {v8, v0}, Lk3/d;->z(LB0/L;)Z

    .line 75
    .line 76
    .line 77
    iget-object v4, v4, LB0/o;->r:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v4, Lk3/d;

    .line 80
    .line 81
    invoke-virtual {v4, v0}, Lk3/d;->z(LB0/L;)Z

    .line 82
    .line 83
    .line 84
    new-instance v4, LW0/a;

    .line 85
    .line 86
    invoke-direct {v4, v2, v3}, LW0/a;-><init>(J)V

    .line 87
    .line 88
    .line 89
    invoke-static {v0, v4}, LB0/a0;->b(LB0/L;LW0/a;)Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-nez v4, :cond_5

    .line 94
    .line 95
    iget-boolean v4, v5, LB0/P;->f:Z

    .line 96
    .line 97
    if-eqz v4, :cond_6

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :catchall_0
    move-exception v0

    .line 101
    goto :goto_2

    .line 102
    :cond_5
    :goto_0
    invoke-virtual {v0}, LB0/L;->H()Ljava/lang/Boolean;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-static {v4, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-eqz v4, :cond_6

    .line 113
    .line 114
    invoke-virtual {v0}, LB0/L;->I()V

    .line 115
    .line 116
    .line 117
    :cond_6
    invoke-virtual/range {p0 .. p1}, LB0/a0;->e(LB0/L;)V

    .line 118
    .line 119
    .line 120
    iget-object v4, v0, LB0/L;->R:LB0/I;

    .line 121
    .line 122
    sget-object v8, LB0/I;->s:LB0/I;

    .line 123
    .line 124
    if-ne v4, v8, :cond_7

    .line 125
    .line 126
    invoke-virtual {v0}, LB0/L;->c()V

    .line 127
    .line 128
    .line 129
    :cond_7
    iget-object v4, v5, LB0/P;->p:LB0/c0;

    .line 130
    .line 131
    invoke-virtual {v4, v2, v3}, LB0/c0;->h0(J)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    invoke-virtual {v0}, LB0/L;->s()LB0/L;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    if-eqz v2, :cond_9

    .line 140
    .line 141
    if-eqz v3, :cond_9

    .line 142
    .line 143
    iget-object v2, v5, LB0/P;->p:LB0/c0;

    .line 144
    .line 145
    iget-object v2, v2, LB0/c0;->B:LB0/I;

    .line 146
    .line 147
    sget-object v4, LB0/I;->q:LB0/I;

    .line 148
    .line 149
    if-ne v2, v4, :cond_8

    .line 150
    .line 151
    const/4 v2, 0x3

    .line 152
    invoke-static {v3, v7, v2}, LB0/L;->S(LB0/L;ZI)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_8
    sget-object v4, LB0/I;->r:LB0/I;

    .line 157
    .line 158
    if-ne v2, v4, :cond_9

    .line 159
    .line 160
    invoke-virtual {v3, v7}, LB0/L;->R(Z)V

    .line 161
    .line 162
    .line 163
    :cond_9
    :goto_1
    invoke-virtual {v0}, LB0/L;->p()Z

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    if-eqz v2, :cond_a

    .line 168
    .line 169
    invoke-virtual {v0}, LB0/L;->G()Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-eqz v2, :cond_a

    .line 174
    .line 175
    invoke-virtual {v0}, LB0/L;->O()V

    .line 176
    .line 177
    .line 178
    iget-object v2, v1, LB0/a0;->e:LB0/o;

    .line 179
    .line 180
    iget-object v2, v2, LB0/o;->q:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v2, LR/e;

    .line 183
    .line 184
    invoke-virtual {v2, v0}, LR/e;->c(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    iput-boolean v6, v0, LB0/L;->d0:Z

    .line 188
    .line 189
    :cond_a
    invoke-virtual {v1}, LB0/a0;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    .line 191
    .line 192
    iput-boolean v7, v1, LB0/a0;->c:Z

    .line 193
    .line 194
    iput-boolean v7, v1, LB0/a0;->d:Z

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :goto_2
    iput-boolean v7, v1, LB0/a0;->c:Z

    .line 198
    .line 199
    iput-boolean v7, v1, LB0/a0;->d:Z

    .line 200
    .line 201
    throw v0

    .line 202
    :cond_b
    :goto_3
    iget-object v0, v1, LB0/a0;->f:LR/e;

    .line 203
    .line 204
    iget-object v2, v0, LR/e;->q:[Ljava/lang/Object;

    .line 205
    .line 206
    iget v3, v0, LR/e;->s:I

    .line 207
    .line 208
    move v4, v7

    .line 209
    :goto_4
    if-ge v4, v3, :cond_17

    .line 210
    .line 211
    aget-object v5, v2, v4

    .line 212
    .line 213
    check-cast v5, LB0/L;

    .line 214
    .line 215
    iget-object v5, v5, LB0/L;->U:LB0/g0;

    .line 216
    .line 217
    iget-object v8, v5, LB0/g0;->b:LB0/v;

    .line 218
    .line 219
    const/16 v9, 0x80

    .line 220
    .line 221
    invoke-static {v9}, LB0/o0;->g(I)Z

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    if-eqz v10, :cond_c

    .line 226
    .line 227
    iget-object v11, v8, LB0/v;->a0:LB0/B0;

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_c
    iget-object v11, v8, LB0/v;->a0:LB0/B0;

    .line 231
    .line 232
    iget-object v11, v11, Lc0/l;->u:Lc0/l;

    .line 233
    .line 234
    if-nez v11, :cond_d

    .line 235
    .line 236
    goto/16 :goto_c

    .line 237
    .line 238
    :cond_d
    :goto_5
    sget-object v12, LB0/n0;->W:Lj0/C;

    .line 239
    .line 240
    invoke-virtual {v8, v10}, LB0/n0;->D0(Z)Lc0/l;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    :goto_6
    if-eqz v8, :cond_16

    .line 245
    .line 246
    iget v10, v8, Lc0/l;->t:I

    .line 247
    .line 248
    and-int/2addr v10, v9

    .line 249
    if-eqz v10, :cond_16

    .line 250
    .line 251
    iget v10, v8, Lc0/l;->s:I

    .line 252
    .line 253
    and-int/2addr v10, v9

    .line 254
    if-eqz v10, :cond_15

    .line 255
    .line 256
    const/4 v10, 0x0

    .line 257
    move-object v12, v8

    .line 258
    move-object v13, v10

    .line 259
    :goto_7
    if-eqz v12, :cond_15

    .line 260
    .line 261
    instance-of v14, v12, LB0/y;

    .line 262
    .line 263
    if-eqz v14, :cond_e

    .line 264
    .line 265
    check-cast v12, LB0/y;

    .line 266
    .line 267
    iget-object v14, v5, LB0/g0;->b:LB0/v;

    .line 268
    .line 269
    invoke-interface {v12, v14}, LB0/y;->j0(Lz0/m;)V

    .line 270
    .line 271
    .line 272
    goto :goto_b

    .line 273
    :cond_e
    iget v14, v12, Lc0/l;->s:I

    .line 274
    .line 275
    and-int/2addr v14, v9

    .line 276
    if-eqz v14, :cond_14

    .line 277
    .line 278
    instance-of v14, v12, LB0/n;

    .line 279
    .line 280
    if-eqz v14, :cond_14

    .line 281
    .line 282
    move-object v14, v12

    .line 283
    check-cast v14, LB0/n;

    .line 284
    .line 285
    iget-object v14, v14, LB0/n;->F:Lc0/l;

    .line 286
    .line 287
    move v15, v7

    .line 288
    :goto_8
    if-eqz v14, :cond_13

    .line 289
    .line 290
    iget v7, v14, Lc0/l;->s:I

    .line 291
    .line 292
    and-int/2addr v7, v9

    .line 293
    if-eqz v7, :cond_12

    .line 294
    .line 295
    add-int/lit8 v15, v15, 0x1

    .line 296
    .line 297
    if-ne v15, v6, :cond_f

    .line 298
    .line 299
    move-object v12, v14

    .line 300
    goto :goto_9

    .line 301
    :cond_f
    if-nez v13, :cond_10

    .line 302
    .line 303
    new-instance v13, LR/e;

    .line 304
    .line 305
    const/16 v7, 0x10

    .line 306
    .line 307
    new-array v7, v7, [Lc0/l;

    .line 308
    .line 309
    invoke-direct {v13, v7}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    :cond_10
    if-eqz v12, :cond_11

    .line 313
    .line 314
    invoke-virtual {v13, v12}, LR/e;->c(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    move-object v12, v10

    .line 318
    :cond_11
    invoke-virtual {v13, v14}, LR/e;->c(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    :cond_12
    :goto_9
    iget-object v14, v14, Lc0/l;->v:Lc0/l;

    .line 322
    .line 323
    const/4 v7, 0x0

    .line 324
    goto :goto_8

    .line 325
    :cond_13
    if-ne v15, v6, :cond_14

    .line 326
    .line 327
    :goto_a
    const/4 v7, 0x0

    .line 328
    goto :goto_7

    .line 329
    :cond_14
    :goto_b
    invoke-static {v13}, LB0/g;->f(LR/e;)Lc0/l;

    .line 330
    .line 331
    .line 332
    move-result-object v12

    .line 333
    goto :goto_a

    .line 334
    :cond_15
    if-eq v8, v11, :cond_16

    .line 335
    .line 336
    iget-object v8, v8, Lc0/l;->v:Lc0/l;

    .line 337
    .line 338
    const/4 v7, 0x0

    .line 339
    goto :goto_6

    .line 340
    :cond_16
    :goto_c
    add-int/lit8 v4, v4, 0x1

    .line 341
    .line 342
    const/4 v7, 0x0

    .line 343
    goto/16 :goto_4

    .line 344
    .line 345
    :cond_17
    invoke-virtual {v0}, LR/e;->i()V

    .line 346
    .line 347
    .line 348
    return-void
.end method

.method public final l()V
    .locals 4

    .line 1
    iget-object v0, p0, LB0/a0;->b:LB0/o;

    .line 2
    .line 3
    invoke-virtual {v0}, LB0/o;->E()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_5

    .line 8
    .line 9
    iget-object v1, p0, LB0/a0;->a:LB0/L;

    .line 10
    .line 11
    invoke-virtual {v1}, LB0/L;->F()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    const-string v2, "performMeasureAndLayout called with unattached root"

    .line 18
    .line 19
    invoke-static {v2}, Ly0/a;->a(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {v1}, LB0/L;->G()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    const-string v2, "performMeasureAndLayout called with unplaced root"

    .line 29
    .line 30
    invoke-static {v2}, Ly0/a;->a(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-boolean v2, p0, LB0/a0;->c:Z

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    const-string v2, "performMeasureAndLayout called during measure layout"

    .line 38
    .line 39
    invoke-static {v2}, Ly0/a;->a(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object v2, p0, LB0/a0;->i:LW0/a;

    .line 43
    .line 44
    if-eqz v2, :cond_5

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    iput-boolean v2, p0, LB0/a0;->c:Z

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    iput-boolean v3, p0, LB0/a0;->d:Z

    .line 51
    .line 52
    :try_start_0
    iget-object v0, v0, LB0/o;->q:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Lk3/d;

    .line 55
    .line 56
    iget-object v0, v0, Lk3/d;->r:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, LB0/F0;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_4

    .line 65
    .line 66
    iget-object v0, v1, LB0/L;->x:LB0/L;

    .line 67
    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    invoke-virtual {p0, v1, v2}, LB0/a0;->o(LB0/L;Z)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    goto :goto_1

    .line 76
    :cond_3
    invoke-virtual {p0, v1}, LB0/a0;->n(LB0/L;)V

    .line 77
    .line 78
    .line 79
    :cond_4
    :goto_0
    invoke-virtual {p0, v1, v3}, LB0/a0;->o(LB0/L;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    iput-boolean v3, p0, LB0/a0;->c:Z

    .line 83
    .line 84
    iput-boolean v3, p0, LB0/a0;->d:Z

    .line 85
    .line 86
    return-void

    .line 87
    :goto_1
    iput-boolean v3, p0, LB0/a0;->c:Z

    .line 88
    .line 89
    iput-boolean v3, p0, LB0/a0;->d:Z

    .line 90
    .line 91
    throw v0

    .line 92
    :cond_5
    return-void
.end method

.method public final m(LB0/L;ZZ)Z
    .locals 5

    .line 1
    iget-boolean v0, p1, LB0/L;->e0:Z

    .line 2
    .line 3
    iget-object v1, p1, LB0/L;->V:LB0/P;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1}, LB0/L;->G()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    iget-object v0, v1, LB0/P;->p:LB0/c0;

    .line 17
    .line 18
    iget-boolean v0, v0, LB0/c0;->I:Z

    .line 19
    .line 20
    if-nez v0, :cond_3

    .line 21
    .line 22
    invoke-static {p1}, LB0/a0;->h(LB0/L;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    invoke-virtual {p1}, LB0/L;->H()Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-static {v0, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_3

    .line 39
    .line 40
    iget-boolean v0, v1, LB0/P;->e:Z

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1}, LB0/L;->r()LB0/I;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sget-object v4, LB0/I;->q:LB0/I;

    .line 49
    .line 50
    if-eq v0, v4, :cond_3

    .line 51
    .line 52
    iget-object v0, v1, LB0/P;->q:LB0/Y;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    iget-object v0, v0, LB0/Y;->G:LB0/M;

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    invoke-virtual {v0}, LB0/M;->e()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-ne v0, v3, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    iget-object v0, v1, LB0/P;->p:LB0/c0;

    .line 68
    .line 69
    iget-object v0, v0, LB0/c0;->M:LB0/M;

    .line 70
    .line 71
    invoke-virtual {v0}, LB0/M;->e()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_3

    .line 76
    .line 77
    iget-object v0, v1, LB0/P;->q:LB0/Y;

    .line 78
    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    iget-object v0, v0, LB0/Y;->G:LB0/M;

    .line 82
    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    invoke-virtual {v0}, LB0/M;->e()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-ne v0, v3, :cond_2

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    :goto_0
    return v2

    .line 93
    :cond_3
    :goto_1
    iget-object v0, p0, LB0/a0;->a:LB0/L;

    .line 94
    .line 95
    if-ne p1, v0, :cond_4

    .line 96
    .line 97
    iget-object v4, p0, LB0/a0;->i:LW0/a;

    .line 98
    .line 99
    invoke-static {v4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    const/4 v4, 0x0

    .line 104
    :goto_2
    if-eqz p2, :cond_7

    .line 105
    .line 106
    iget-boolean p2, v1, LB0/P;->e:Z

    .line 107
    .line 108
    if-eqz p2, :cond_5

    .line 109
    .line 110
    invoke-static {p1, v4}, LB0/a0;->b(LB0/L;LW0/a;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    :cond_5
    if-eqz p3, :cond_f

    .line 115
    .line 116
    if-nez v2, :cond_6

    .line 117
    .line 118
    iget-boolean p2, v1, LB0/P;->f:Z

    .line 119
    .line 120
    if-eqz p2, :cond_f

    .line 121
    .line 122
    :cond_6
    invoke-virtual {p1}, LB0/L;->H()Ljava/lang/Boolean;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 127
    .line 128
    invoke-static {p2, p3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    if-eqz p2, :cond_f

    .line 133
    .line 134
    invoke-virtual {p1}, LB0/L;->I()V

    .line 135
    .line 136
    .line 137
    goto/16 :goto_5

    .line 138
    .line 139
    :cond_7
    invoke-virtual {p1}, LB0/L;->q()Z

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    if-eqz p2, :cond_8

    .line 144
    .line 145
    invoke-static {p1, v4}, LB0/a0;->c(LB0/L;LW0/a;)Z

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    goto :goto_3

    .line 150
    :cond_8
    move p2, v2

    .line 151
    :goto_3
    if-eqz p3, :cond_e

    .line 152
    .line 153
    invoke-virtual {p1}, LB0/L;->p()Z

    .line 154
    .line 155
    .line 156
    move-result p3

    .line 157
    if-eqz p3, :cond_e

    .line 158
    .line 159
    if-eq p1, v0, :cond_9

    .line 160
    .line 161
    invoke-virtual {p1}, LB0/L;->s()LB0/L;

    .line 162
    .line 163
    .line 164
    move-result-object p3

    .line 165
    if-eqz p3, :cond_e

    .line 166
    .line 167
    invoke-virtual {p3}, LB0/L;->G()Z

    .line 168
    .line 169
    .line 170
    move-result p3

    .line 171
    if-ne p3, v3, :cond_e

    .line 172
    .line 173
    iget-object p3, v1, LB0/P;->p:LB0/c0;

    .line 174
    .line 175
    iget-boolean p3, p3, LB0/c0;->I:Z

    .line 176
    .line 177
    if-eqz p3, :cond_e

    .line 178
    .line 179
    :cond_9
    if-ne p1, v0, :cond_d

    .line 180
    .line 181
    iget-object p3, p1, LB0/L;->R:LB0/I;

    .line 182
    .line 183
    sget-object v0, LB0/I;->s:LB0/I;

    .line 184
    .line 185
    if-ne p3, v0, :cond_a

    .line 186
    .line 187
    invoke-virtual {p1}, LB0/L;->d()V

    .line 188
    .line 189
    .line 190
    :cond_a
    invoke-virtual {p1}, LB0/L;->s()LB0/L;

    .line 191
    .line 192
    .line 193
    move-result-object p3

    .line 194
    if-eqz p3, :cond_b

    .line 195
    .line 196
    iget-object p3, p3, LB0/L;->U:LB0/g0;

    .line 197
    .line 198
    iget-object p3, p3, LB0/g0;->b:LB0/v;

    .line 199
    .line 200
    if-eqz p3, :cond_b

    .line 201
    .line 202
    iget-object p3, p3, LB0/T;->y:Lz0/z;

    .line 203
    .line 204
    if-nez p3, :cond_c

    .line 205
    .line 206
    :cond_b
    invoke-static {p1}, LB0/O;->a(LB0/L;)LB0/t0;

    .line 207
    .line 208
    .line 209
    move-result-object p3

    .line 210
    check-cast p3, LC0/A;

    .line 211
    .line 212
    invoke-virtual {p3}, LC0/A;->getPlacementScope()Lz0/I;

    .line 213
    .line 214
    .line 215
    move-result-object p3

    .line 216
    :cond_c
    iget-object v0, v1, LB0/P;->p:LB0/c0;

    .line 217
    .line 218
    invoke-static {p3, v0, v2, v2}, Lz0/I;->f(Lz0/I;Lz0/J;II)V

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_d
    invoke-virtual {p1}, LB0/L;->O()V

    .line 223
    .line 224
    .line 225
    :goto_4
    iget-object p3, p0, LB0/a0;->e:LB0/o;

    .line 226
    .line 227
    iget-object p3, p3, LB0/o;->q:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast p3, LR/e;

    .line 230
    .line 231
    invoke-virtual {p3, p1}, LR/e;->c(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    iput-boolean v3, p1, LB0/L;->d0:Z

    .line 235
    .line 236
    invoke-static {p1}, LB0/O;->a(LB0/L;)LB0/t0;

    .line 237
    .line 238
    .line 239
    move-result-object p3

    .line 240
    check-cast p3, LC0/A;

    .line 241
    .line 242
    invoke-virtual {p3}, LC0/A;->getRectManager()LJ0/a;

    .line 243
    .line 244
    .line 245
    move-result-object p3

    .line 246
    invoke-virtual {p3, p1}, LJ0/a;->d(LB0/L;)V

    .line 247
    .line 248
    .line 249
    :cond_e
    move v2, p2

    .line 250
    :cond_f
    :goto_5
    invoke-virtual {p0}, LB0/a0;->d()V

    .line 251
    .line 252
    .line 253
    return v2
.end method

.method public final n(LB0/L;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, LB0/L;->w()LR/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, LR/e;->q:[Ljava/lang/Object;

    .line 6
    .line 7
    iget p1, p1, LR/e;->s:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, p1, :cond_2

    .line 11
    .line 12
    aget-object v2, v0, v1

    .line 13
    .line 14
    check-cast v2, LB0/L;

    .line 15
    .line 16
    invoke-static {v2}, LB0/a0;->i(LB0/L;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    invoke-static {v2}, LB0/g;->q(LB0/L;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    invoke-virtual {p0, v2, v3}, LB0/a0;->o(LB0/L;Z)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-virtual {p0, v2}, LB0/a0;->n(LB0/L;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    return-void
.end method

.method public final o(LB0/L;Z)V
    .locals 1

    .line 1
    iget-boolean v0, p1, LB0/L;->e0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, LB0/a0;->a:LB0/L;

    .line 7
    .line 8
    if-ne p1, v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, LB0/a0;->i:LW0/a;

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-eqz p2, :cond_2

    .line 18
    .line 19
    invoke-static {p1, v0}, LB0/a0;->b(LB0/L;LW0/a;)Z

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    invoke-static {p1, v0}, LB0/a0;->c(LB0/L;LW0/a;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final p(LB0/L;Z)Z
    .locals 4

    .line 1
    iget-object v0, p1, LB0/L;->V:LB0/P;

    .line 2
    .line 3
    iget-object v0, v0, LB0/P;->d:LB0/G;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_6

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq v0, v2, :cond_6

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    if-eq v0, v3, :cond_5

    .line 17
    .line 18
    const/4 v3, 0x3

    .line 19
    if-eq v0, v3, :cond_5

    .line 20
    .line 21
    const/4 v3, 0x4

    .line 22
    if-ne v0, v3, :cond_4

    .line 23
    .line 24
    invoke-virtual {p1}, LB0/L;->q()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    if-nez p2, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iget-object p2, p1, LB0/L;->V:LB0/P;

    .line 34
    .line 35
    iget-object p2, p2, LB0/P;->p:LB0/c0;

    .line 36
    .line 37
    iput-boolean v2, p2, LB0/c0;->J:Z

    .line 38
    .line 39
    iget-boolean p2, p1, LB0/L;->e0:Z

    .line 40
    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {p1}, LB0/L;->G()Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-nez p2, :cond_2

    .line 49
    .line 50
    invoke-static {p1}, LB0/a0;->h(LB0/L;)Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_6

    .line 55
    .line 56
    :cond_2
    invoke-virtual {p1}, LB0/L;->s()LB0/L;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    if-eqz p2, :cond_3

    .line 61
    .line 62
    invoke-virtual {p2}, LB0/L;->q()Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-ne p2, v2, :cond_3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    iget-object p2, p0, LB0/a0;->b:LB0/o;

    .line 70
    .line 71
    invoke-virtual {p2, p1, v1}, LB0/o;->l(LB0/L;Z)V

    .line 72
    .line 73
    .line 74
    :goto_0
    iget-boolean p1, p0, LB0/a0;->d:Z

    .line 75
    .line 76
    if-nez p1, :cond_6

    .line 77
    .line 78
    return v2

    .line 79
    :cond_4
    new-instance p1, LC2/e;

    .line 80
    .line 81
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :cond_5
    new-instance v0, LB0/Z;

    .line 86
    .line 87
    invoke-direct {v0, p1, v1, p2}, LB0/Z;-><init>(LB0/L;ZZ)V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, LB0/a0;->h:LR/e;

    .line 91
    .line 92
    invoke-virtual {p1, v0}, LR/e;->c(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_6
    :goto_1
    return v1
.end method

.method public final q(J)V
    .locals 4

    .line 1
    iget-object v0, p0, LB0/a0;->i:LW0/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-wide v2, v0, LW0/a;->a:J

    .line 9
    .line 10
    invoke-static {v2, v3, p1, p2}, LW0/a;->b(JJ)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    :goto_0
    if-nez v0, :cond_4

    .line 15
    .line 16
    iget-boolean v0, p0, LB0/a0;->c:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const-string v0, "updateRootConstraints called while measuring"

    .line 21
    .line 22
    invoke-static {v0}, Ly0/a;->a(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    new-instance v0, LW0/a;

    .line 26
    .line 27
    invoke-direct {v0, p1, p2}, LW0/a;-><init>(J)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, LB0/a0;->i:LW0/a;

    .line 31
    .line 32
    iget-object p1, p0, LB0/a0;->a:LB0/L;

    .line 33
    .line 34
    iget-object p2, p1, LB0/L;->x:LB0/L;

    .line 35
    .line 36
    iget-object v0, p1, LB0/L;->V:LB0/P;

    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    if-eqz p2, :cond_2

    .line 40
    .line 41
    iput-boolean v2, v0, LB0/P;->e:Z

    .line 42
    .line 43
    :cond_2
    iget-object v0, v0, LB0/P;->p:LB0/c0;

    .line 44
    .line 45
    iput-boolean v2, v0, LB0/c0;->J:Z

    .line 46
    .line 47
    if-eqz p2, :cond_3

    .line 48
    .line 49
    move v1, v2

    .line 50
    :cond_3
    iget-object p2, p0, LB0/a0;->b:LB0/o;

    .line 51
    .line 52
    invoke-virtual {p2, p1, v1}, LB0/o;->l(LB0/L;Z)V

    .line 53
    .line 54
    .line 55
    :cond_4
    return-void
.end method
