.class public final LL/b;
.super Lc0/l;
.source "SourceFile"

# interfaces
.implements LL/j;
.implements LB0/l;
.implements LB0/p;
.implements LB0/y;


# instance fields
.field public final E:Ly/i;

.field public final F:Z

.field public final G:F

.field public final H:Lk3/d;

.field public final I:LM/r;

.field public J:LL/s;

.field public K:F

.field public L:J

.field public M:Z

.field public final N:Lr/C;

.field public O:LL/i;

.field public P:LL/k;


# direct methods
.method public constructor <init>(Ly/i;ZFLk3/d;LM/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc0/l;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LL/b;->E:Ly/i;

    .line 5
    .line 6
    iput-boolean p2, p0, LL/b;->F:Z

    .line 7
    .line 8
    iput p3, p0, LL/b;->G:F

    .line 9
    .line 10
    iput-object p4, p0, LL/b;->H:Lk3/d;

    .line 11
    .line 12
    iput-object p5, p0, LL/b;->I:LM/r;

    .line 13
    .line 14
    const-wide/16 p1, 0x0

    .line 15
    .line 16
    iput-wide p1, p0, LL/b;->L:J

    .line 17
    .line 18
    new-instance p1, Lr/C;

    .line 19
    .line 20
    invoke-direct {p1}, Lr/C;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, LL/b;->N:Lr/C;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final J(LB0/N;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, LB0/N;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LL/b;->J:LL/s;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget v1, p0, LL/b;->K:F

    .line 9
    .line 10
    iget-object v2, p0, LL/b;->H:Lk3/d;

    .line 11
    .line 12
    invoke-virtual {v2}, Lk3/d;->b()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-virtual {v0, p1, v1, v2, v3}, LL/s;->c(LB0/N;FJ)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object p1, p1, LB0/N;->q:Ll0/b;

    .line 20
    .line 21
    iget-object p1, p1, Ll0/b;->r:LB0/G0;

    .line 22
    .line 23
    invoke-virtual {p1}, LB0/G0;->t()Lj0/m;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v0, p0, LL/b;->P:LL/k;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-wide v1, p0, LL/b;->L:J

    .line 32
    .line 33
    iget v3, p0, LL/b;->K:F

    .line 34
    .line 35
    invoke-static {v3}, LD5/a;->G(F)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    iget-object v4, p0, LL/b;->H:Lk3/d;

    .line 40
    .line 41
    invoke-virtual {v4}, Lk3/d;->b()J

    .line 42
    .line 43
    .line 44
    move-result-wide v4

    .line 45
    iget-object v6, p0, LL/b;->I:LM/r;

    .line 46
    .line 47
    invoke-virtual {v6}, LM/r;->invoke()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    const v6, 0x3dcccccd    # 0.1f

    .line 51
    .line 52
    .line 53
    invoke-virtual/range {v0 .. v6}, LL/k;->e(JIJF)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Lj0/c;->a(Lj0/m;)Landroid/graphics/Canvas;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {v0, p1}, LL/k;->draw(Landroid/graphics/Canvas;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method public final Y()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LL/b;->P:LL/k;

    .line 3
    .line 4
    invoke-static {p0}, LB0/g;->l(LB0/p;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final m0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final p0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lc0/l;->l0()LM5/w;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LL/m;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, LL/m;-><init>(LL/b;Lq5/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    invoke-static {v0, v2, v2, v1, v3}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final q(J)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LL/b;->M:Z

    .line 3
    .line 4
    invoke-static {p0}, LB0/g;->u(LB0/m;)LB0/L;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, LB0/L;->N:LW0/c;

    .line 9
    .line 10
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/measurement/P1;->d0(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    iput-wide p1, p0, LL/b;->L:J

    .line 15
    .line 16
    iget p1, p0, LL/b;->G:F

    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    iget-boolean p1, p0, LL/b;->F:Z

    .line 25
    .line 26
    iget-wide v1, p0, LL/b;->L:J

    .line 27
    .line 28
    invoke-static {v0, p1, v1, v2}, LL/h;->a(LW0/c;ZJ)F

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-interface {v0, p1}, LW0/c;->u(F)F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    :goto_0
    iput p1, p0, LL/b;->K:F

    .line 38
    .line 39
    iget-object p1, p0, LL/b;->N:Lr/C;

    .line 40
    .line 41
    iget-object p2, p1, Lr/C;->a:[Ljava/lang/Object;

    .line 42
    .line 43
    iget v0, p1, Lr/C;->b:I

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    :goto_1
    if-ge v1, v0, :cond_1

    .line 47
    .line 48
    aget-object v2, p2, v1

    .line 49
    .line 50
    check-cast v2, Ly/m;

    .line 51
    .line 52
    invoke-virtual {p0, v2}, LL/b;->x0(Ly/m;)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v1, v1, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-virtual {p1}, Lr/C;->c()V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final q0()V
    .locals 5

    .line 1
    iget-object v0, p0, LL/b;->O:LL/i;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, LL/b;->Y()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, LL/i;->t:LB0/o;

    .line 9
    .line 10
    iget-object v2, v1, LB0/o;->q:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v2, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, LL/k;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v2}, LL/k;->c()V

    .line 23
    .line 24
    .line 25
    iget-object v3, v1, LB0/o;->q:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    invoke-virtual {v3, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, LL/k;

    .line 34
    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    iget-object v1, v1, LB0/o;->r:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    invoke-interface {v1, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, LL/j;

    .line 46
    .line 47
    :cond_0
    invoke-interface {v3, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    iget-object v0, v0, LL/i;->s:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void
.end method

.method public final x0(Ly/m;)V
    .locals 11

    .line 1
    instance-of v0, p1, Ly/k;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    move-object v2, p1

    .line 6
    check-cast v2, Ly/k;

    .line 7
    .line 8
    iget-wide v4, p0, LL/b;->L:J

    .line 9
    .line 10
    iget p1, p0, LL/b;->K:F

    .line 11
    .line 12
    iget-object v0, p0, LL/b;->O:LL/i;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:LP/T0;

    .line 18
    .line 19
    invoke-static {p0, v0}, LB0/g;->i(LB0/l;LP/l0;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Landroid/view/View;

    .line 24
    .line 25
    invoke-static {v0}, Ln5/A;->k(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Ln5/A;->j(Landroid/view/ViewGroup;)LL/i;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, LL/b;->O:LL/i;

    .line 34
    .line 35
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-virtual {v0, p0}, LL/i;->a(LL/j;)LL/k;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {p1}, LD5/a;->G(F)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    iget-object p1, p0, LL/b;->H:Lk3/d;

    .line 47
    .line 48
    invoke-virtual {p1}, Lk3/d;->b()J

    .line 49
    .line 50
    .line 51
    move-result-wide v7

    .line 52
    iget-object p1, p0, LL/b;->I:LM/r;

    .line 53
    .line 54
    invoke-virtual {p1}, LM/r;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    new-instance v10, LA0/d;

    .line 58
    .line 59
    const/4 p1, 0x6

    .line 60
    invoke-direct {v10, p1, p0}, LA0/d;-><init>(ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-boolean v3, p0, LL/b;->F:Z

    .line 64
    .line 65
    const v9, 0x3dcccccd    # 0.1f

    .line 66
    .line 67
    .line 68
    invoke-virtual/range {v1 .. v10}, LL/k;->b(Ly/k;ZJIJFLB5/a;)V

    .line 69
    .line 70
    .line 71
    iput-object v1, p0, LL/b;->P:LL/k;

    .line 72
    .line 73
    invoke-static {p0}, LB0/g;->l(LB0/p;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_1
    instance-of v0, p1, Ly/l;

    .line 78
    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    check-cast p1, Ly/l;

    .line 82
    .line 83
    iget-object p1, p1, Ly/l;->a:Ly/k;

    .line 84
    .line 85
    iget-object p1, p0, LL/b;->P:LL/k;

    .line 86
    .line 87
    if-eqz p1, :cond_3

    .line 88
    .line 89
    invoke-virtual {p1}, LL/k;->d()V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_2
    instance-of v0, p1, Ly/j;

    .line 94
    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    check-cast p1, Ly/j;

    .line 98
    .line 99
    iget-object p1, p1, Ly/j;->a:Ly/k;

    .line 100
    .line 101
    iget-object p1, p0, LL/b;->P:LL/k;

    .line 102
    .line 103
    if-eqz p1, :cond_3

    .line 104
    .line 105
    invoke-virtual {p1}, LL/k;->d()V

    .line 106
    .line 107
    .line 108
    :cond_3
    return-void
.end method
