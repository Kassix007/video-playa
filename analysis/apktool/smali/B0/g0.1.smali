.class public final LB0/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LB0/L;

.field public final b:LB0/v;

.field public c:LB0/n0;

.field public final d:LB0/B0;

.field public e:Lc0/l;

.field public f:LR/e;

.field public g:LR/e;

.field public h:LB0/f0;


# direct methods
.method public constructor <init>(LB0/L;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB0/g0;->a:LB0/L;

    .line 5
    .line 6
    new-instance v0, LB0/v;

    .line 7
    .line 8
    invoke-direct {v0, p1}, LB0/v;-><init>(LB0/L;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LB0/g0;->b:LB0/v;

    .line 12
    .line 13
    iput-object v0, p0, LB0/g0;->c:LB0/n0;

    .line 14
    .line 15
    iget-object p1, v0, LB0/v;->a0:LB0/B0;

    .line 16
    .line 17
    iput-object p1, p0, LB0/g0;->d:LB0/B0;

    .line 18
    .line 19
    iput-object p1, p0, LB0/g0;->e:Lc0/l;

    .line 20
    .line 21
    return-void
.end method

.method public static final a(LB0/g0;Lc0/l;LB0/n0;)V
    .locals 1

    .line 1
    iget-object p1, p1, Lc0/l;->u:Lc0/l;

    .line 2
    .line 3
    :goto_0
    if-eqz p1, :cond_3

    .line 4
    .line 5
    sget-object v0, LB0/i0;->a:LB0/h0;

    .line 6
    .line 7
    if-ne p1, v0, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, LB0/g0;->a:LB0/L;

    .line 10
    .line 11
    invoke-virtual {p1}, LB0/L;->s()LB0/L;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, LB0/L;->U:LB0/g0;

    .line 18
    .line 19
    iget-object p1, p1, LB0/g0;->b:LB0/v;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    :goto_1
    iput-object p1, p2, LB0/n0;->D:LB0/n0;

    .line 24
    .line 25
    iput-object p2, p0, LB0/g0;->c:LB0/n0;

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    iget v0, p1, Lc0/l;->s:I

    .line 29
    .line 30
    and-int/lit8 v0, v0, 0x2

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_2
    invoke-virtual {p1, p2}, Lc0/l;->w0(LB0/n0;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p1, Lc0/l;->u:Lc0/l;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    :goto_2
    return-void
.end method

.method public static b(Lc0/k;Lc0/l;)Lc0/l;
    .locals 2

    .line 1
    instance-of v0, p0, LB0/d0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LB0/d0;

    .line 6
    .line 7
    invoke-virtual {p0}, LB0/d0;->f()Lc0/l;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, LB0/o0;->f(Lc0/l;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Lc0/l;->s:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, LB0/d;

    .line 19
    .line 20
    invoke-direct {v0}, Lc0/l;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, LB0/o0;->d(Lc0/k;)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iput v1, v0, Lc0/l;->s:I

    .line 28
    .line 29
    iput-object p0, v0, LB0/d;->E:Lc0/k;

    .line 30
    .line 31
    new-instance p0, Ljava/util/HashSet;

    .line 32
    .line 33
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p0, v0, LB0/d;->G:Ljava/util/HashSet;

    .line 37
    .line 38
    move-object p0, v0

    .line 39
    :goto_0
    iget-boolean v0, p0, Lc0/l;->D:Z

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    const-string v0, "A ModifierNodeElement cannot return an already attached node from create() "

    .line 44
    .line 45
    invoke-static {v0}, Ly0/a;->b(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    const/4 v0, 0x1

    .line 49
    iput-boolean v0, p0, Lc0/l;->y:Z

    .line 50
    .line 51
    iget-object v0, p1, Lc0/l;->v:Lc0/l;

    .line 52
    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    iput-object p0, v0, Lc0/l;->u:Lc0/l;

    .line 56
    .line 57
    iput-object v0, p0, Lc0/l;->v:Lc0/l;

    .line 58
    .line 59
    :cond_2
    iput-object p0, p1, Lc0/l;->v:Lc0/l;

    .line 60
    .line 61
    iput-object p1, p0, Lc0/l;->u:Lc0/l;

    .line 62
    .line 63
    return-object p0
.end method

.method public static c(Lc0/l;)Lc0/l;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lc0/l;->D:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object v1, LB0/o0;->a:Lr/B;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "autoInvalidateRemovedNode called on unattached node"

    .line 10
    .line 11
    invoke-static {v0}, Ly0/a;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, -0x1

    .line 15
    const/4 v1, 0x2

    .line 16
    invoke-static {p0, v0, v1}, LB0/o0;->a(Lc0/l;II)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lc0/l;->u0()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lc0/l;->o0()V

    .line 23
    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lc0/l;->v:Lc0/l;

    .line 26
    .line 27
    iget-object v1, p0, Lc0/l;->u:Lc0/l;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    iput-object v1, v0, Lc0/l;->u:Lc0/l;

    .line 33
    .line 34
    iput-object v2, p0, Lc0/l;->v:Lc0/l;

    .line 35
    .line 36
    :cond_2
    if-eqz v1, :cond_3

    .line 37
    .line 38
    iput-object v0, v1, Lc0/l;->v:Lc0/l;

    .line 39
    .line 40
    iput-object v2, p0, Lc0/l;->u:Lc0/l;

    .line 41
    .line 42
    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object v1
.end method

.method public static i(Lc0/k;Lc0/k;Lc0/l;)V
    .locals 2

    .line 1
    instance-of p0, p0, LB0/d0;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    instance-of p0, p1, LB0/d0;

    .line 7
    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    check-cast p1, LB0/d0;

    .line 11
    .line 12
    sget-object p0, LB0/i0;->a:LB0/h0;

    .line 13
    .line 14
    const-string p0, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe"

    .line 15
    .line 16
    invoke-static {p2, p0}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, LB0/d0;->g(Lc0/l;)V

    .line 20
    .line 21
    .line 22
    iget-boolean p0, p2, Lc0/l;->D:Z

    .line 23
    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    invoke-static {p2}, LB0/o0;->c(Lc0/l;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    iput-boolean v0, p2, Lc0/l;->z:Z

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    instance-of p0, p2, LB0/d;

    .line 34
    .line 35
    if-eqz p0, :cond_5

    .line 36
    .line 37
    move-object p0, p2

    .line 38
    check-cast p0, LB0/d;

    .line 39
    .line 40
    iget-boolean v1, p0, Lc0/l;->D:Z

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, LB0/d;->z0()V

    .line 45
    .line 46
    .line 47
    :cond_2
    iput-object p1, p0, LB0/d;->E:Lc0/k;

    .line 48
    .line 49
    invoke-static {p1}, LB0/o0;->d(Lc0/k;)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    iput p1, p0, Lc0/l;->s:I

    .line 54
    .line 55
    iget-boolean p1, p0, Lc0/l;->D:Z

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    invoke-virtual {p0, p1}, LB0/d;->x0(Z)V

    .line 61
    .line 62
    .line 63
    :cond_3
    iget-boolean p0, p2, Lc0/l;->D:Z

    .line 64
    .line 65
    if-eqz p0, :cond_4

    .line 66
    .line 67
    invoke-static {p2}, LB0/o0;->c(Lc0/l;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_4
    iput-boolean v0, p2, Lc0/l;->z:Z

    .line 72
    .line 73
    return-void

    .line 74
    :cond_5
    const-string p0, "Unknown Modifier.Node type"

    .line 75
    .line 76
    invoke-static {p0}, Ly0/a;->b(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method


# virtual methods
.method public final d(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, LB0/g0;->e:Lc0/l;

    .line 2
    .line 3
    iget v0, v0, Lc0/l;->t:I

    .line 4
    .line 5
    and-int/2addr p1, v0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1
.end method

.method public final e()V
    .locals 3

    .line 1
    iget-object v0, p0, LB0/g0;->c:LB0/n0;

    .line 2
    .line 3
    :goto_0
    iget-object v1, p0, LB0/g0;->b:LB0/v;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, LB0/n0;->L0()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, LB0/n0;->C:LB0/n0;

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v1}, LB0/n0;->L0()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, LB0/g0;->e:Lc0/l;

    .line 20
    .line 21
    :goto_1
    if-eqz v0, :cond_4

    .line 22
    .line 23
    invoke-virtual {v0}, Lc0/l;->t0()V

    .line 24
    .line 25
    .line 26
    iget-boolean v1, v0, Lc0/l;->y:Z

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    sget-object v1, LB0/o0;->a:Lr/B;

    .line 31
    .line 32
    iget-boolean v1, v0, Lc0/l;->D:Z

    .line 33
    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    const-string v1, "autoInvalidateInsertedNode called on unattached node"

    .line 37
    .line 38
    invoke-static {v1}, Ly0/a;->b(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    const/4 v1, -0x1

    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-static {v0, v1, v2}, LB0/o0;->a(Lc0/l;II)V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-boolean v1, v0, Lc0/l;->z:Z

    .line 47
    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    invoke-static {v0}, LB0/o0;->c(Lc0/l;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    const/4 v1, 0x0

    .line 54
    iput-boolean v1, v0, Lc0/l;->y:Z

    .line 55
    .line 56
    iput-boolean v1, v0, Lc0/l;->z:Z

    .line 57
    .line 58
    iget-object v0, v0, Lc0/l;->v:Lc0/l;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    return-void
.end method

.method public final f()V
    .locals 4

    .line 1
    iget-object v0, p0, LB0/g0;->d:LB0/B0;

    .line 2
    .line 3
    :goto_0
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v1, v0, Lc0/l;->D:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lc0/l;->u0()V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, v0, Lc0/l;->u:Lc0/l;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    iget-object v0, p0, LB0/g0;->c:LB0/n0;

    .line 16
    .line 17
    iget-object v1, p0, LB0/g0;->b:LB0/v;

    .line 18
    .line 19
    :goto_1
    const/4 v2, 0x0

    .line 20
    if-eq v1, v0, :cond_3

    .line 21
    .line 22
    iget-object v3, v1, LB0/n0;->V:LB0/s0;

    .line 23
    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    invoke-interface {v3}, LB0/s0;->destroy()V

    .line 27
    .line 28
    .line 29
    :cond_2
    iput-object v2, v1, LB0/n0;->V:LB0/s0;

    .line 30
    .line 31
    iget-object v1, v1, LB0/n0;->D:LB0/n0;

    .line 32
    .line 33
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_3
    iget-object v1, v0, LB0/n0;->V:LB0/s0;

    .line 38
    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    invoke-interface {v1}, LB0/s0;->destroy()V

    .line 42
    .line 43
    .line 44
    :cond_4
    iput-object v2, v0, LB0/n0;->V:LB0/s0;

    .line 45
    .line 46
    return-void
.end method

.method public final g(ILR/e;LR/e;Lc0/l;Z)V
    .locals 31

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LB0/g0;->h:LB0/f0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LB0/f0;

    .line 8
    .line 9
    move/from16 v3, p1

    .line 10
    .line 11
    move-object/from16 v4, p2

    .line 12
    .line 13
    move-object/from16 v5, p3

    .line 14
    .line 15
    move-object/from16 v2, p4

    .line 16
    .line 17
    move/from16 v6, p5

    .line 18
    .line 19
    invoke-direct/range {v0 .. v6}, LB0/f0;-><init>(LB0/g0;Lc0/l;ILR/e;LR/e;Z)V

    .line 20
    .line 21
    .line 22
    iput-object v0, v1, LB0/g0;->h:LB0/f0;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move/from16 v3, p1

    .line 26
    .line 27
    move-object/from16 v4, p2

    .line 28
    .line 29
    move-object/from16 v5, p3

    .line 30
    .line 31
    move-object/from16 v2, p4

    .line 32
    .line 33
    iput-object v2, v0, LB0/f0;->c:Ljava/lang/Object;

    .line 34
    .line 35
    iput v3, v0, LB0/f0;->a:I

    .line 36
    .line 37
    iput-object v4, v0, LB0/f0;->d:Ljava/lang/Object;

    .line 38
    .line 39
    iput-object v5, v0, LB0/f0;->e:Ljava/lang/Object;

    .line 40
    .line 41
    move/from16 v6, p5

    .line 42
    .line 43
    iput-boolean v6, v0, LB0/f0;->b:Z

    .line 44
    .line 45
    :goto_0
    iget-object v2, v0, LB0/f0;->f:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, LB0/g0;

    .line 48
    .line 49
    iget v4, v4, LR/e;->s:I

    .line 50
    .line 51
    sub-int/2addr v4, v3

    .line 52
    iget v5, v5, LR/e;->s:I

    .line 53
    .line 54
    sub-int/2addr v5, v3

    .line 55
    add-int v3, v4, v5

    .line 56
    .line 57
    const/4 v6, 0x1

    .line 58
    add-int/2addr v3, v6

    .line 59
    const/4 v7, 0x2

    .line 60
    div-int/2addr v3, v7

    .line 61
    new-instance v8, LB0/w;

    .line 62
    .line 63
    mul-int/lit8 v9, v3, 0x3

    .line 64
    .line 65
    invoke-direct {v8, v9}, LB0/w;-><init>(I)V

    .line 66
    .line 67
    .line 68
    new-instance v9, LB0/w;

    .line 69
    .line 70
    mul-int/lit8 v10, v3, 0x4

    .line 71
    .line 72
    invoke-direct {v9, v10}, LB0/w;-><init>(I)V

    .line 73
    .line 74
    .line 75
    const/4 v10, 0x0

    .line 76
    invoke-virtual {v9, v10, v4, v10, v5}, LB0/w;->e(IIII)V

    .line 77
    .line 78
    .line 79
    mul-int/2addr v3, v7

    .line 80
    add-int/2addr v3, v6

    .line 81
    new-array v11, v3, [I

    .line 82
    .line 83
    new-array v12, v3, [I

    .line 84
    .line 85
    const/4 v13, 0x5

    .line 86
    new-array v13, v13, [I

    .line 87
    .line 88
    :goto_1
    iget v14, v9, LB0/w;->b:I

    .line 89
    .line 90
    if-eqz v14, :cond_1d

    .line 91
    .line 92
    move/from16 p1, v7

    .line 93
    .line 94
    iget-object v7, v9, LB0/w;->a:[I

    .line 95
    .line 96
    move/from16 p2, v10

    .line 97
    .line 98
    add-int/lit8 v10, v14, -0x1

    .line 99
    .line 100
    iput v10, v9, LB0/w;->b:I

    .line 101
    .line 102
    aget v10, v7, v10

    .line 103
    .line 104
    const/16 p3, 0x3

    .line 105
    .line 106
    add-int/lit8 v15, v14, -0x2

    .line 107
    .line 108
    iput v15, v9, LB0/w;->b:I

    .line 109
    .line 110
    aget v15, v7, v15

    .line 111
    .line 112
    add-int/lit8 v6, v14, -0x3

    .line 113
    .line 114
    iput v6, v9, LB0/w;->b:I

    .line 115
    .line 116
    aget v6, v7, v6

    .line 117
    .line 118
    add-int/lit8 v14, v14, -0x4

    .line 119
    .line 120
    iput v14, v9, LB0/w;->b:I

    .line 121
    .line 122
    aget v7, v7, v14

    .line 123
    .line 124
    sub-int v14, v6, v7

    .line 125
    .line 126
    move/from16 p5, v3

    .line 127
    .line 128
    sub-int v3, v10, v15

    .line 129
    .line 130
    move-object/from16 v16, v11

    .line 131
    .line 132
    const/4 v11, 0x1

    .line 133
    if-lt v14, v11, :cond_1c

    .line 134
    .line 135
    if-ge v3, v11, :cond_1

    .line 136
    .line 137
    goto/16 :goto_19

    .line 138
    .line 139
    :cond_1
    add-int v17, v14, v3

    .line 140
    .line 141
    add-int/lit8 v17, v17, 0x1

    .line 142
    .line 143
    move/from16 p4, v11

    .line 144
    .line 145
    div-int/lit8 v11, v17, 0x2

    .line 146
    .line 147
    div-int/lit8 v17, p5, 0x2

    .line 148
    .line 149
    add-int/lit8 v18, v17, 0x1

    .line 150
    .line 151
    aput v7, v16, v18

    .line 152
    .line 153
    aput v6, v12, v18

    .line 154
    .line 155
    move/from16 v18, v3

    .line 156
    .line 157
    move/from16 v3, p2

    .line 158
    .line 159
    :goto_2
    if-ge v3, v11, :cond_1c

    .line 160
    .line 161
    sub-int v19, v14, v18

    .line 162
    .line 163
    invoke-static/range {v19 .. v19}, Ljava/lang/Math;->abs(I)I

    .line 164
    .line 165
    .line 166
    move-result v20

    .line 167
    move/from16 v21, v11

    .line 168
    .line 169
    and-int/lit8 v11, v20, 0x1

    .line 170
    .line 171
    move-object/from16 v20, v12

    .line 172
    .line 173
    move/from16 v12, p4

    .line 174
    .line 175
    if-ne v11, v12, :cond_2

    .line 176
    .line 177
    const/4 v11, 0x1

    .line 178
    goto :goto_3

    .line 179
    :cond_2
    move/from16 v11, p2

    .line 180
    .line 181
    :goto_3
    neg-int v12, v3

    .line 182
    move/from16 v22, v11

    .line 183
    .line 184
    move v11, v12

    .line 185
    :goto_4
    const/16 v23, 0x4

    .line 186
    .line 187
    if-gt v11, v3, :cond_b

    .line 188
    .line 189
    if-eq v11, v12, :cond_5

    .line 190
    .line 191
    if-eq v11, v3, :cond_3

    .line 192
    .line 193
    add-int/lit8 v24, v11, 0x1

    .line 194
    .line 195
    add-int v24, v24, v17

    .line 196
    .line 197
    move/from16 v25, v11

    .line 198
    .line 199
    aget v11, v16, v24

    .line 200
    .line 201
    add-int/lit8 v24, v25, -0x1

    .line 202
    .line 203
    add-int v24, v24, v17

    .line 204
    .line 205
    move-object/from16 v26, v13

    .line 206
    .line 207
    aget v13, v16, v24

    .line 208
    .line 209
    if-le v11, v13, :cond_4

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_3
    move/from16 v25, v11

    .line 213
    .line 214
    move-object/from16 v26, v13

    .line 215
    .line 216
    :cond_4
    add-int/lit8 v11, v25, -0x1

    .line 217
    .line 218
    add-int v11, v11, v17

    .line 219
    .line 220
    aget v11, v16, v11

    .line 221
    .line 222
    add-int/lit8 v13, v11, 0x1

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_5
    move/from16 v25, v11

    .line 226
    .line 227
    move-object/from16 v26, v13

    .line 228
    .line 229
    :goto_5
    add-int/lit8 v11, v25, 0x1

    .line 230
    .line 231
    add-int v11, v11, v17

    .line 232
    .line 233
    aget v11, v16, v11

    .line 234
    .line 235
    move v13, v11

    .line 236
    :goto_6
    sub-int v24, v13, v7

    .line 237
    .line 238
    add-int v24, v24, v15

    .line 239
    .line 240
    sub-int v24, v24, v25

    .line 241
    .line 242
    if-eqz v3, :cond_6

    .line 243
    .line 244
    const/16 v27, 0x1

    .line 245
    .line 246
    goto :goto_7

    .line 247
    :cond_6
    move/from16 v27, p2

    .line 248
    .line 249
    :goto_7
    if-ne v13, v11, :cond_7

    .line 250
    .line 251
    const/16 v28, 0x1

    .line 252
    .line 253
    goto :goto_8

    .line 254
    :cond_7
    move/from16 v28, p2

    .line 255
    .line 256
    :goto_8
    and-int v27, v27, v28

    .line 257
    .line 258
    sub-int v27, v24, v27

    .line 259
    .line 260
    move/from16 v30, v24

    .line 261
    .line 262
    move/from16 v24, v11

    .line 263
    .line 264
    move/from16 v11, v30

    .line 265
    .line 266
    :goto_9
    if-ge v13, v6, :cond_8

    .line 267
    .line 268
    if-ge v11, v10, :cond_8

    .line 269
    .line 270
    invoke-virtual {v0, v13, v11}, LB0/f0;->a(II)Z

    .line 271
    .line 272
    .line 273
    move-result v28

    .line 274
    if-eqz v28, :cond_8

    .line 275
    .line 276
    add-int/lit8 v13, v13, 0x1

    .line 277
    .line 278
    add-int/lit8 v11, v11, 0x1

    .line 279
    .line 280
    goto :goto_9

    .line 281
    :cond_8
    add-int v28, v17, v25

    .line 282
    .line 283
    aput v13, v16, v28

    .line 284
    .line 285
    if-eqz v22, :cond_9

    .line 286
    .line 287
    move/from16 v28, v11

    .line 288
    .line 289
    sub-int v11, v19, v25

    .line 290
    .line 291
    move/from16 v29, v14

    .line 292
    .line 293
    add-int/lit8 v14, v12, 0x1

    .line 294
    .line 295
    if-lt v11, v14, :cond_a

    .line 296
    .line 297
    add-int/lit8 v14, v3, -0x1

    .line 298
    .line 299
    if-gt v11, v14, :cond_a

    .line 300
    .line 301
    add-int v11, v17, v11

    .line 302
    .line 303
    aget v11, v20, v11

    .line 304
    .line 305
    if-gt v11, v13, :cond_a

    .line 306
    .line 307
    aput v24, v26, p2

    .line 308
    .line 309
    const/4 v11, 0x1

    .line 310
    aput v27, v26, v11

    .line 311
    .line 312
    aput v13, v26, p1

    .line 313
    .line 314
    aput v28, v26, p3

    .line 315
    .line 316
    aput p2, v26, v23

    .line 317
    .line 318
    const/4 v11, 0x1

    .line 319
    goto/16 :goto_11

    .line 320
    .line 321
    :cond_9
    move/from16 v29, v14

    .line 322
    .line 323
    :cond_a
    add-int/lit8 v11, v25, 0x2

    .line 324
    .line 325
    move-object/from16 v13, v26

    .line 326
    .line 327
    move/from16 v14, v29

    .line 328
    .line 329
    goto/16 :goto_4

    .line 330
    .line 331
    :cond_b
    move-object/from16 v26, v13

    .line 332
    .line 333
    move/from16 v29, v14

    .line 334
    .line 335
    and-int/lit8 v11, v19, 0x1

    .line 336
    .line 337
    if-nez v11, :cond_c

    .line 338
    .line 339
    const/4 v11, 0x1

    .line 340
    goto :goto_a

    .line 341
    :cond_c
    move/from16 v11, p2

    .line 342
    .line 343
    :goto_a
    move v13, v12

    .line 344
    :goto_b
    if-gt v13, v3, :cond_1b

    .line 345
    .line 346
    if-eq v13, v12, :cond_f

    .line 347
    .line 348
    if-eq v13, v3, :cond_d

    .line 349
    .line 350
    add-int/lit8 v14, v13, 0x1

    .line 351
    .line 352
    add-int v14, v14, v17

    .line 353
    .line 354
    aget v14, v20, v14

    .line 355
    .line 356
    add-int/lit8 v22, v13, -0x1

    .line 357
    .line 358
    add-int v22, v22, v17

    .line 359
    .line 360
    move/from16 v24, v11

    .line 361
    .line 362
    aget v11, v20, v22

    .line 363
    .line 364
    if-ge v14, v11, :cond_e

    .line 365
    .line 366
    goto :goto_c

    .line 367
    :cond_d
    move/from16 v24, v11

    .line 368
    .line 369
    :cond_e
    add-int/lit8 v11, v13, -0x1

    .line 370
    .line 371
    add-int v11, v11, v17

    .line 372
    .line 373
    aget v11, v20, v11

    .line 374
    .line 375
    add-int/lit8 v14, v11, -0x1

    .line 376
    .line 377
    goto :goto_d

    .line 378
    :cond_f
    move/from16 v24, v11

    .line 379
    .line 380
    :goto_c
    add-int/lit8 v11, v13, 0x1

    .line 381
    .line 382
    add-int v11, v11, v17

    .line 383
    .line 384
    aget v11, v20, v11

    .line 385
    .line 386
    move v14, v11

    .line 387
    :goto_d
    sub-int v22, v6, v14

    .line 388
    .line 389
    sub-int v22, v22, v13

    .line 390
    .line 391
    sub-int v22, v10, v22

    .line 392
    .line 393
    if-eqz v3, :cond_10

    .line 394
    .line 395
    const/16 v25, 0x1

    .line 396
    .line 397
    goto :goto_e

    .line 398
    :cond_10
    move/from16 v25, p2

    .line 399
    .line 400
    :goto_e
    if-ne v14, v11, :cond_11

    .line 401
    .line 402
    const/16 v27, 0x1

    .line 403
    .line 404
    goto :goto_f

    .line 405
    :cond_11
    move/from16 v27, p2

    .line 406
    .line 407
    :goto_f
    and-int v25, v25, v27

    .line 408
    .line 409
    add-int v25, v22, v25

    .line 410
    .line 411
    move/from16 v30, v22

    .line 412
    .line 413
    move/from16 v22, v11

    .line 414
    .line 415
    move/from16 v11, v30

    .line 416
    .line 417
    :goto_10
    if-le v14, v7, :cond_12

    .line 418
    .line 419
    if-le v11, v15, :cond_12

    .line 420
    .line 421
    move/from16 v27, v11

    .line 422
    .line 423
    add-int/lit8 v11, v14, -0x1

    .line 424
    .line 425
    move/from16 v28, v13

    .line 426
    .line 427
    add-int/lit8 v13, v27, -0x1

    .line 428
    .line 429
    invoke-virtual {v0, v11, v13}, LB0/f0;->a(II)Z

    .line 430
    .line 431
    .line 432
    move-result v11

    .line 433
    if-eqz v11, :cond_13

    .line 434
    .line 435
    add-int/lit8 v14, v14, -0x1

    .line 436
    .line 437
    add-int/lit8 v11, v27, -0x1

    .line 438
    .line 439
    move/from16 v13, v28

    .line 440
    .line 441
    goto :goto_10

    .line 442
    :cond_12
    move/from16 v27, v11

    .line 443
    .line 444
    move/from16 v28, v13

    .line 445
    .line 446
    :cond_13
    add-int v13, v17, v28

    .line 447
    .line 448
    aput v14, v20, v13

    .line 449
    .line 450
    if-eqz v24, :cond_1a

    .line 451
    .line 452
    sub-int v11, v19, v28

    .line 453
    .line 454
    if-lt v11, v12, :cond_1a

    .line 455
    .line 456
    if-gt v11, v3, :cond_1a

    .line 457
    .line 458
    add-int v11, v17, v11

    .line 459
    .line 460
    aget v11, v16, v11

    .line 461
    .line 462
    if-lt v11, v14, :cond_1a

    .line 463
    .line 464
    aput v14, v26, p2

    .line 465
    .line 466
    const/4 v11, 0x1

    .line 467
    aput v27, v26, v11

    .line 468
    .line 469
    aput v22, v26, p1

    .line 470
    .line 471
    aput v25, v26, p3

    .line 472
    .line 473
    aput v11, v26, v23

    .line 474
    .line 475
    :goto_11
    aget v3, v26, p1

    .line 476
    .line 477
    aget v12, v26, p2

    .line 478
    .line 479
    sub-int/2addr v3, v12

    .line 480
    aget v12, v26, p3

    .line 481
    .line 482
    aget v13, v26, v11

    .line 483
    .line 484
    sub-int/2addr v12, v13

    .line 485
    invoke-static {v3, v12}, Ljava/lang/Math;->min(II)I

    .line 486
    .line 487
    .line 488
    move-result v3

    .line 489
    if-lez v3, :cond_19

    .line 490
    .line 491
    aget v3, v26, p2

    .line 492
    .line 493
    aget v12, v26, v11

    .line 494
    .line 495
    aget v11, v26, p3

    .line 496
    .line 497
    sub-int/2addr v11, v12

    .line 498
    aget v13, v26, p1

    .line 499
    .line 500
    sub-int/2addr v13, v3

    .line 501
    if-eq v11, v13, :cond_18

    .line 502
    .line 503
    invoke-static {v13, v11}, Ljava/lang/Math;->min(II)I

    .line 504
    .line 505
    .line 506
    move-result v13

    .line 507
    aget v11, v26, v23

    .line 508
    .line 509
    if-eqz v11, :cond_14

    .line 510
    .line 511
    const/4 v14, 0x1

    .line 512
    goto :goto_12

    .line 513
    :cond_14
    move/from16 v14, p2

    .line 514
    .line 515
    :goto_12
    aget v17, v26, p3

    .line 516
    .line 517
    const/16 v18, 0x1

    .line 518
    .line 519
    aget v19, v26, v18

    .line 520
    .line 521
    move/from16 p4, v3

    .line 522
    .line 523
    sub-int v3, v17, v19

    .line 524
    .line 525
    aget v21, v26, p1

    .line 526
    .line 527
    aget v22, v26, p2

    .line 528
    .line 529
    move/from16 v23, v11

    .line 530
    .line 531
    sub-int v11, v21, v22

    .line 532
    .line 533
    if-le v3, v11, :cond_15

    .line 534
    .line 535
    move/from16 v3, v18

    .line 536
    .line 537
    goto :goto_13

    .line 538
    :cond_15
    move/from16 v3, p2

    .line 539
    .line 540
    :goto_13
    or-int/2addr v3, v14

    .line 541
    xor-int/lit8 v3, v3, 0x1

    .line 542
    .line 543
    add-int v3, p4, v3

    .line 544
    .line 545
    if-eqz v23, :cond_16

    .line 546
    .line 547
    move/from16 v11, v18

    .line 548
    .line 549
    goto :goto_14

    .line 550
    :cond_16
    move/from16 v11, p2

    .line 551
    .line 552
    :goto_14
    sub-int v14, v17, v19

    .line 553
    .line 554
    move/from16 p4, v3

    .line 555
    .line 556
    sub-int v3, v21, v22

    .line 557
    .line 558
    if-le v14, v3, :cond_17

    .line 559
    .line 560
    move/from16 v3, v18

    .line 561
    .line 562
    goto :goto_15

    .line 563
    :cond_17
    move/from16 v3, p2

    .line 564
    .line 565
    :goto_15
    xor-int/lit8 v3, v3, 0x1

    .line 566
    .line 567
    or-int/2addr v3, v11

    .line 568
    xor-int/lit8 v3, v3, 0x1

    .line 569
    .line 570
    add-int/2addr v12, v3

    .line 571
    move/from16 v3, p4

    .line 572
    .line 573
    goto :goto_16

    .line 574
    :cond_18
    move/from16 p4, v3

    .line 575
    .line 576
    const/16 v18, 0x1

    .line 577
    .line 578
    :goto_16
    invoke-virtual {v8, v3, v12, v13}, LB0/w;->d(III)V

    .line 579
    .line 580
    .line 581
    goto :goto_17

    .line 582
    :cond_19
    move/from16 v18, v11

    .line 583
    .line 584
    :goto_17
    aget v3, v26, p2

    .line 585
    .line 586
    aget v11, v26, v18

    .line 587
    .line 588
    invoke-virtual {v9, v7, v3, v15, v11}, LB0/w;->e(IIII)V

    .line 589
    .line 590
    .line 591
    aget v3, v26, p1

    .line 592
    .line 593
    aget v7, v26, p3

    .line 594
    .line 595
    invoke-virtual {v9, v3, v6, v7, v10}, LB0/w;->e(IIII)V

    .line 596
    .line 597
    .line 598
    :goto_18
    move/from16 v7, p1

    .line 599
    .line 600
    move/from16 v10, p2

    .line 601
    .line 602
    move/from16 v3, p5

    .line 603
    .line 604
    move-object/from16 v11, v16

    .line 605
    .line 606
    move-object/from16 v12, v20

    .line 607
    .line 608
    move-object/from16 v13, v26

    .line 609
    .line 610
    const/4 v6, 0x1

    .line 611
    goto/16 :goto_1

    .line 612
    .line 613
    :cond_1a
    add-int/lit8 v13, v28, 0x2

    .line 614
    .line 615
    move/from16 v11, v24

    .line 616
    .line 617
    goto/16 :goto_b

    .line 618
    .line 619
    :cond_1b
    add-int/lit8 v3, v3, 0x1

    .line 620
    .line 621
    move-object/from16 v12, v20

    .line 622
    .line 623
    move/from16 v11, v21

    .line 624
    .line 625
    move-object/from16 v13, v26

    .line 626
    .line 627
    move/from16 v14, v29

    .line 628
    .line 629
    const/16 p4, 0x1

    .line 630
    .line 631
    goto/16 :goto_2

    .line 632
    .line 633
    :cond_1c
    :goto_19
    move-object/from16 v20, v12

    .line 634
    .line 635
    move-object/from16 v26, v13

    .line 636
    .line 637
    goto :goto_18

    .line 638
    :cond_1d
    move/from16 p1, v7

    .line 639
    .line 640
    move/from16 p2, v10

    .line 641
    .line 642
    const/16 p3, 0x3

    .line 643
    .line 644
    iget v3, v8, LB0/w;->b:I

    .line 645
    .line 646
    rem-int/lit8 v6, v3, 0x3

    .line 647
    .line 648
    if-nez v6, :cond_1e

    .line 649
    .line 650
    :goto_1a
    move/from16 v6, p3

    .line 651
    .line 652
    goto :goto_1b

    .line 653
    :cond_1e
    const-string v6, "Array size not a multiple of 3"

    .line 654
    .line 655
    invoke-static {v6}, Ly0/a;->b(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    goto :goto_1a

    .line 659
    :goto_1b
    if-le v3, v6, :cond_1f

    .line 660
    .line 661
    sub-int/2addr v3, v6

    .line 662
    move/from16 v6, p2

    .line 663
    .line 664
    invoke-virtual {v8, v6, v3}, LB0/w;->f(II)V

    .line 665
    .line 666
    .line 667
    goto :goto_1c

    .line 668
    :cond_1f
    move/from16 v6, p2

    .line 669
    .line 670
    :goto_1c
    invoke-virtual {v8, v4, v5, v6}, LB0/w;->d(III)V

    .line 671
    .line 672
    .line 673
    move v3, v6

    .line 674
    move v4, v3

    .line 675
    move v5, v4

    .line 676
    :cond_20
    iget v7, v8, LB0/w;->b:I

    .line 677
    .line 678
    if-ge v3, v7, :cond_29

    .line 679
    .line 680
    iget-object v7, v8, LB0/w;->a:[I

    .line 681
    .line 682
    aget v9, v7, v3

    .line 683
    .line 684
    add-int/lit8 v10, v3, 0x2

    .line 685
    .line 686
    aget v10, v7, v10

    .line 687
    .line 688
    sub-int/2addr v9, v10

    .line 689
    add-int/lit8 v11, v3, 0x1

    .line 690
    .line 691
    aget v7, v7, v11

    .line 692
    .line 693
    sub-int/2addr v7, v10

    .line 694
    add-int/lit8 v3, v3, 0x3

    .line 695
    .line 696
    :goto_1d
    if-ge v4, v9, :cond_23

    .line 697
    .line 698
    iget-object v11, v0, LB0/f0;->c:Ljava/lang/Object;

    .line 699
    .line 700
    check-cast v11, Lc0/l;

    .line 701
    .line 702
    iget-object v11, v11, Lc0/l;->v:Lc0/l;

    .line 703
    .line 704
    invoke-static {v11}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 705
    .line 706
    .line 707
    iget v12, v11, Lc0/l;->s:I

    .line 708
    .line 709
    and-int/lit8 v12, v12, 0x2

    .line 710
    .line 711
    if-eqz v12, :cond_22

    .line 712
    .line 713
    iget-object v12, v11, Lc0/l;->x:LB0/n0;

    .line 714
    .line 715
    invoke-static {v12}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 716
    .line 717
    .line 718
    iget-object v13, v12, LB0/n0;->D:LB0/n0;

    .line 719
    .line 720
    iget-object v12, v12, LB0/n0;->C:LB0/n0;

    .line 721
    .line 722
    invoke-static {v12}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 723
    .line 724
    .line 725
    if-nez v13, :cond_21

    .line 726
    .line 727
    goto :goto_1e

    .line 728
    :cond_21
    iput-object v12, v13, LB0/n0;->C:LB0/n0;

    .line 729
    .line 730
    :goto_1e
    iput-object v13, v12, LB0/n0;->D:LB0/n0;

    .line 731
    .line 732
    iget-object v13, v0, LB0/f0;->c:Ljava/lang/Object;

    .line 733
    .line 734
    check-cast v13, Lc0/l;

    .line 735
    .line 736
    invoke-static {v2, v13, v12}, LB0/g0;->a(LB0/g0;Lc0/l;LB0/n0;)V

    .line 737
    .line 738
    .line 739
    :cond_22
    invoke-static {v11}, LB0/g0;->c(Lc0/l;)Lc0/l;

    .line 740
    .line 741
    .line 742
    move-result-object v11

    .line 743
    iput-object v11, v0, LB0/f0;->c:Ljava/lang/Object;

    .line 744
    .line 745
    add-int/lit8 v4, v4, 0x1

    .line 746
    .line 747
    goto :goto_1d

    .line 748
    :cond_23
    :goto_1f
    if-ge v5, v7, :cond_27

    .line 749
    .line 750
    iget v9, v0, LB0/f0;->a:I

    .line 751
    .line 752
    add-int/2addr v9, v5

    .line 753
    iget-object v11, v0, LB0/f0;->c:Ljava/lang/Object;

    .line 754
    .line 755
    check-cast v11, Lc0/l;

    .line 756
    .line 757
    iget-object v12, v0, LB0/f0;->e:Ljava/lang/Object;

    .line 758
    .line 759
    check-cast v12, LR/e;

    .line 760
    .line 761
    iget-object v12, v12, LR/e;->q:[Ljava/lang/Object;

    .line 762
    .line 763
    aget-object v9, v12, v9

    .line 764
    .line 765
    check-cast v9, Lc0/k;

    .line 766
    .line 767
    invoke-static {v9, v11}, LB0/g0;->b(Lc0/k;Lc0/l;)Lc0/l;

    .line 768
    .line 769
    .line 770
    move-result-object v9

    .line 771
    iput-object v9, v0, LB0/f0;->c:Ljava/lang/Object;

    .line 772
    .line 773
    iget-boolean v11, v0, LB0/f0;->b:Z

    .line 774
    .line 775
    if-eqz v11, :cond_26

    .line 776
    .line 777
    iget-object v9, v9, Lc0/l;->v:Lc0/l;

    .line 778
    .line 779
    invoke-static {v9}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 780
    .line 781
    .line 782
    iget-object v9, v9, Lc0/l;->x:LB0/n0;

    .line 783
    .line 784
    invoke-static {v9}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 785
    .line 786
    .line 787
    iget-object v11, v0, LB0/f0;->c:Ljava/lang/Object;

    .line 788
    .line 789
    check-cast v11, Lc0/l;

    .line 790
    .line 791
    invoke-static {v11}, LB0/g;->g(Lc0/l;)LB0/z;

    .line 792
    .line 793
    .line 794
    move-result-object v11

    .line 795
    if-eqz v11, :cond_24

    .line 796
    .line 797
    new-instance v12, LB0/B;

    .line 798
    .line 799
    iget-object v13, v2, LB0/g0;->a:LB0/L;

    .line 800
    .line 801
    invoke-direct {v12, v13, v11}, LB0/B;-><init>(LB0/L;LB0/z;)V

    .line 802
    .line 803
    .line 804
    iget-object v11, v0, LB0/f0;->c:Ljava/lang/Object;

    .line 805
    .line 806
    check-cast v11, Lc0/l;

    .line 807
    .line 808
    invoke-virtual {v11, v12}, Lc0/l;->w0(LB0/n0;)V

    .line 809
    .line 810
    .line 811
    iget-object v11, v0, LB0/f0;->c:Ljava/lang/Object;

    .line 812
    .line 813
    check-cast v11, Lc0/l;

    .line 814
    .line 815
    invoke-static {v2, v11, v12}, LB0/g0;->a(LB0/g0;Lc0/l;LB0/n0;)V

    .line 816
    .line 817
    .line 818
    iget-object v11, v9, LB0/n0;->D:LB0/n0;

    .line 819
    .line 820
    iput-object v11, v12, LB0/n0;->D:LB0/n0;

    .line 821
    .line 822
    iput-object v9, v12, LB0/n0;->C:LB0/n0;

    .line 823
    .line 824
    iput-object v12, v9, LB0/n0;->D:LB0/n0;

    .line 825
    .line 826
    goto :goto_20

    .line 827
    :cond_24
    iget-object v11, v0, LB0/f0;->c:Ljava/lang/Object;

    .line 828
    .line 829
    check-cast v11, Lc0/l;

    .line 830
    .line 831
    invoke-virtual {v11, v9}, Lc0/l;->w0(LB0/n0;)V

    .line 832
    .line 833
    .line 834
    :goto_20
    iget-object v9, v0, LB0/f0;->c:Ljava/lang/Object;

    .line 835
    .line 836
    check-cast v9, Lc0/l;

    .line 837
    .line 838
    invoke-virtual {v9}, Lc0/l;->n0()V

    .line 839
    .line 840
    .line 841
    iget-object v9, v0, LB0/f0;->c:Ljava/lang/Object;

    .line 842
    .line 843
    check-cast v9, Lc0/l;

    .line 844
    .line 845
    invoke-virtual {v9}, Lc0/l;->t0()V

    .line 846
    .line 847
    .line 848
    iget-object v9, v0, LB0/f0;->c:Ljava/lang/Object;

    .line 849
    .line 850
    check-cast v9, Lc0/l;

    .line 851
    .line 852
    sget-object v11, LB0/o0;->a:Lr/B;

    .line 853
    .line 854
    iget-boolean v11, v9, Lc0/l;->D:Z

    .line 855
    .line 856
    if-nez v11, :cond_25

    .line 857
    .line 858
    const-string v11, "autoInvalidateInsertedNode called on unattached node"

    .line 859
    .line 860
    invoke-static {v11}, Ly0/a;->b(Ljava/lang/String;)V

    .line 861
    .line 862
    .line 863
    :cond_25
    const/4 v11, -0x1

    .line 864
    const/4 v12, 0x1

    .line 865
    invoke-static {v9, v11, v12}, LB0/o0;->a(Lc0/l;II)V

    .line 866
    .line 867
    .line 868
    goto :goto_21

    .line 869
    :cond_26
    const/4 v12, 0x1

    .line 870
    iput-boolean v12, v9, Lc0/l;->y:Z

    .line 871
    .line 872
    :goto_21
    add-int/lit8 v5, v5, 0x1

    .line 873
    .line 874
    goto :goto_1f

    .line 875
    :cond_27
    const/4 v12, 0x1

    .line 876
    :goto_22
    add-int/lit8 v7, v10, -0x1

    .line 877
    .line 878
    if-lez v10, :cond_20

    .line 879
    .line 880
    iget-object v9, v0, LB0/f0;->c:Ljava/lang/Object;

    .line 881
    .line 882
    check-cast v9, Lc0/l;

    .line 883
    .line 884
    iget-object v9, v9, Lc0/l;->v:Lc0/l;

    .line 885
    .line 886
    invoke-static {v9}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 887
    .line 888
    .line 889
    iput-object v9, v0, LB0/f0;->c:Ljava/lang/Object;

    .line 890
    .line 891
    iget-object v9, v0, LB0/f0;->d:Ljava/lang/Object;

    .line 892
    .line 893
    check-cast v9, LR/e;

    .line 894
    .line 895
    iget v10, v0, LB0/f0;->a:I

    .line 896
    .line 897
    add-int v11, v10, v4

    .line 898
    .line 899
    iget-object v9, v9, LR/e;->q:[Ljava/lang/Object;

    .line 900
    .line 901
    aget-object v9, v9, v11

    .line 902
    .line 903
    check-cast v9, Lc0/k;

    .line 904
    .line 905
    iget-object v11, v0, LB0/f0;->e:Ljava/lang/Object;

    .line 906
    .line 907
    check-cast v11, LR/e;

    .line 908
    .line 909
    add-int/2addr v10, v5

    .line 910
    iget-object v11, v11, LR/e;->q:[Ljava/lang/Object;

    .line 911
    .line 912
    aget-object v10, v11, v10

    .line 913
    .line 914
    check-cast v10, Lc0/k;

    .line 915
    .line 916
    invoke-static {v9, v10}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 917
    .line 918
    .line 919
    move-result v11

    .line 920
    if-nez v11, :cond_28

    .line 921
    .line 922
    iget-object v11, v0, LB0/f0;->c:Ljava/lang/Object;

    .line 923
    .line 924
    check-cast v11, Lc0/l;

    .line 925
    .line 926
    invoke-static {v9, v10, v11}, LB0/g0;->i(Lc0/k;Lc0/k;Lc0/l;)V

    .line 927
    .line 928
    .line 929
    :cond_28
    add-int/lit8 v4, v4, 0x1

    .line 930
    .line 931
    add-int/lit8 v5, v5, 0x1

    .line 932
    .line 933
    move v10, v7

    .line 934
    goto :goto_22

    .line 935
    :cond_29
    iget-object v0, v1, LB0/g0;->d:LB0/B0;

    .line 936
    .line 937
    iget-object v0, v0, Lc0/l;->u:Lc0/l;

    .line 938
    .line 939
    move v10, v6

    .line 940
    :goto_23
    if-eqz v0, :cond_2a

    .line 941
    .line 942
    sget-object v2, LB0/i0;->a:LB0/h0;

    .line 943
    .line 944
    if-eq v0, v2, :cond_2a

    .line 945
    .line 946
    iget v2, v0, Lc0/l;->s:I

    .line 947
    .line 948
    or-int/2addr v10, v2

    .line 949
    iput v10, v0, Lc0/l;->t:I

    .line 950
    .line 951
    iget-object v0, v0, Lc0/l;->u:Lc0/l;

    .line 952
    .line 953
    goto :goto_23

    .line 954
    :cond_2a
    return-void
.end method

.method public final h()V
    .locals 5

    .line 1
    iget-object v0, p0, LB0/g0;->d:LB0/B0;

    .line 2
    .line 3
    iget-object v0, v0, Lc0/l;->u:Lc0/l;

    .line 4
    .line 5
    iget-object v1, p0, LB0/g0;->b:LB0/v;

    .line 6
    .line 7
    :goto_0
    iget-object v2, p0, LB0/g0;->a:LB0/L;

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    invoke-static {v0}, LB0/g;->g(Lc0/l;)LB0/z;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    if-eqz v3, :cond_2

    .line 16
    .line 17
    iget-object v4, v0, Lc0/l;->x:LB0/n0;

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    check-cast v4, LB0/B;

    .line 22
    .line 23
    iget-object v2, v4, LB0/B;->a0:LB0/z;

    .line 24
    .line 25
    invoke-virtual {v4, v3}, LB0/B;->X0(LB0/z;)V

    .line 26
    .line 27
    .line 28
    if-eq v2, v0, :cond_1

    .line 29
    .line 30
    iget-object v2, v4, LB0/n0;->V:LB0/s0;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-interface {v2}, LB0/s0;->invalidate()V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    new-instance v4, LB0/B;

    .line 39
    .line 40
    invoke-direct {v4, v2, v3}, LB0/B;-><init>(LB0/L;LB0/z;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v4}, Lc0/l;->w0(LB0/n0;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_1
    iput-object v4, v1, LB0/n0;->D:LB0/n0;

    .line 47
    .line 48
    iput-object v1, v4, LB0/n0;->C:LB0/n0;

    .line 49
    .line 50
    move-object v1, v4

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    invoke-virtual {v0, v1}, Lc0/l;->w0(LB0/n0;)V

    .line 53
    .line 54
    .line 55
    :goto_2
    iget-object v0, v0, Lc0/l;->u:Lc0/l;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-virtual {v2}, LB0/L;->s()LB0/L;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    iget-object v0, v0, LB0/L;->U:LB0/g0;

    .line 65
    .line 66
    iget-object v0, v0, LB0/g0;->b:LB0/v;

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    const/4 v0, 0x0

    .line 70
    :goto_3
    iput-object v0, v1, LB0/n0;->D:LB0/n0;

    .line 71
    .line 72
    iput-object v1, p0, LB0/g0;->c:LB0/n0;

    .line 73
    .line 74
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LB0/g0;->e:Lc0/l;

    .line 9
    .line 10
    const-string v2, "]"

    .line 11
    .line 12
    iget-object v3, p0, LB0/g0;->d:LB0/B0;

    .line 13
    .line 14
    if-ne v1, v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    if-eqz v1, :cond_2

    .line 21
    .line 22
    if-eq v1, v3, :cond_2

    .line 23
    .line 24
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v4, v1, Lc0/l;->v:Lc0/l;

    .line 32
    .line 33
    if-ne v4, v3, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string v4, ","

    .line 40
    .line 41
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget-object v1, v1, Lc0/l;->v:Lc0/l;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "toString(...)"

    .line 52
    .line 53
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v0
.end method
