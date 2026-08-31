.class public final Lp0/H;
.super Lo0/b;
.source "SourceFile"


# instance fields
.field public A:Lj0/j;

.field public B:I

.field public final v:LP/f0;

.field public final w:LP/f0;

.field public final x:Lp0/D;

.field public final y:LP/c0;

.field public z:F


# direct methods
.method public constructor <init>(Lp0/c;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lo0/b;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Li0/e;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Li0/e;-><init>(J)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lp0/H;->v:LP/f0;

    .line 16
    .line 17
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-static {v0}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lp0/H;->w:LP/f0;

    .line 24
    .line 25
    new-instance v0, Lp0/D;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Lp0/D;-><init>(Lp0/c;)V

    .line 28
    .line 29
    .line 30
    new-instance p1, LA0/d;

    .line 31
    .line 32
    const/16 v1, 0x18

    .line 33
    .line 34
    invoke-direct {p1, v1, p0}, LA0/d;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, v0, Lp0/D;->f:Lkotlin/jvm/internal/n;

    .line 38
    .line 39
    iput-object v0, p0, Lp0/H;->x:Lp0/D;

    .line 40
    .line 41
    new-instance p1, LP/c0;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-direct {p1, v0}, LP/c0;-><init>(I)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lp0/H;->y:LP/c0;

    .line 48
    .line 49
    const/high16 p1, 0x3f800000    # 1.0f

    .line 50
    .line 51
    iput p1, p0, Lp0/H;->z:F

    .line 52
    .line 53
    const/4 p1, -0x1

    .line 54
    iput p1, p0, Lp0/H;->B:I

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final a(F)Z
    .locals 0

    .line 1
    iput p1, p0, Lp0/H;->z:F

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1
.end method

.method public final d(Lj0/j;)Z
    .locals 0

    .line 1
    iput-object p1, p0, Lp0/H;->A:Lj0/j;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1
.end method

.method public final h()J
    .locals 2

    .line 1
    iget-object v0, p0, Lp0/H;->v:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Li0/e;

    .line 8
    .line 9
    iget-wide v0, v0, Li0/e;->a:J

    .line 10
    .line 11
    return-wide v0
.end method

.method public final i(LB0/N;)V
    .locals 10

    .line 1
    iget-object v0, p1, LB0/N;->q:Ll0/b;

    .line 2
    .line 3
    iget-object v1, p0, Lp0/H;->A:Lj0/j;

    .line 4
    .line 5
    iget-object v2, p0, Lp0/H;->x:Lp0/D;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v2, Lp0/D;->g:LP/f0;

    .line 10
    .line 11
    invoke-virtual {v1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lj0/j;

    .line 16
    .line 17
    :cond_0
    iget-object v3, p0, Lp0/H;->w:LP/f0;

    .line 18
    .line 19
    invoke-virtual {v3}, LP/f0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, LB0/N;->getLayoutDirection()LW0/l;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    sget-object v4, LW0/l;->r:LW0/l;

    .line 36
    .line 37
    if-ne v3, v4, :cond_1

    .line 38
    .line 39
    invoke-interface {v0}, Ll0/d;->M()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    iget-object v0, v0, Ll0/b;->r:LB0/G0;

    .line 44
    .line 45
    invoke-virtual {v0}, LB0/G0;->E()J

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    invoke-virtual {v0}, LB0/G0;->t()Lj0/m;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-interface {v7}, Lj0/m;->k()V

    .line 54
    .line 55
    .line 56
    :try_start_0
    iget-object v7, v0, LB0/G0;->r:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v7, Li1/a;

    .line 59
    .line 60
    const/high16 v8, -0x40800000    # -1.0f

    .line 61
    .line 62
    const/high16 v9, 0x3f800000    # 1.0f

    .line 63
    .line 64
    invoke-virtual {v7, v8, v9, v3, v4}, Li1/a;->y(FFJ)V

    .line 65
    .line 66
    .line 67
    iget v3, p0, Lp0/H;->z:F

    .line 68
    .line 69
    invoke-virtual {v2, p1, v3, v1}, Lp0/D;->e(Ll0/d;FLj0/j;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, LB0/G0;->t()Lj0/m;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-interface {p1}, Lj0/m;->i()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v5, v6}, LB0/G0;->X(J)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception p1

    .line 84
    invoke-virtual {v0}, LB0/G0;->t()Lj0/m;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-interface {v1}, Lj0/m;->i()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v5, v6}, LB0/G0;->X(J)V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_1
    iget v0, p0, Lp0/H;->z:F

    .line 96
    .line 97
    invoke-virtual {v2, p1, v0, v1}, Lp0/D;->e(Ll0/d;FLj0/j;)V

    .line 98
    .line 99
    .line 100
    :goto_0
    iget-object p1, p0, Lp0/H;->y:LP/c0;

    .line 101
    .line 102
    invoke-virtual {p1}, LP/c0;->e()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    iput p1, p0, Lp0/H;->B:I

    .line 107
    .line 108
    return-void
.end method
