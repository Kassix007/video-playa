.class public final Lv/I;
.super LB0/n;
.source "SourceFile"

# interfaces
.implements LB0/A0;
.implements LB0/q;
.implements LB0/l;
.implements LB0/p0;
.implements LB0/E0;


# static fields
.field public static final N:Lv/M;


# instance fields
.field public G:Ly/i;

.field public final H:LC0/s;

.field public I:Ly/d;

.field public J:LE/G;

.field public K:LB0/n0;

.field public final L:Lh0/o;

.field public M:Lv/F;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lv/M;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lv/M;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lv/I;->N:Lv/M;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ly/i;LC0/s;)V
    .locals 8

    .line 1
    invoke-direct {p0}, LB0/n;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv/I;->G:Ly/i;

    .line 5
    .line 6
    iput-object p2, p0, Lv/I;->H:LC0/s;

    .line 7
    .line 8
    new-instance v0, LC0/t;

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x2

    .line 12
    const/4 v1, 0x2

    .line 13
    const-class v3, Lv/I;

    .line 14
    .line 15
    const-string v4, "onFocusStateChange"

    .line 16
    .line 17
    const-string v5, "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V"

    .line 18
    .line 19
    move-object v2, p0

    .line 20
    invoke-direct/range {v0 .. v7}, LC0/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 21
    .line 22
    .line 23
    new-instance p1, Lh0/o;

    .line 24
    .line 25
    const/4 p2, 0x4

    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {p1, v1, v0, p2}, Lh0/o;-><init>(ILB5/e;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1}, LB0/n;->x0(LB0/m;)LB0/m;

    .line 31
    .line 32
    .line 33
    iput-object p1, v2, Lv/I;->L:Lh0/o;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final A(LI0/i;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lv/I;->L:Lh0/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh0/o;->z0()Lh0/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lh0/n;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sget-object v1, LI0/r;->a:[LH5/k;

    .line 12
    .line 13
    sget-object v1, LI0/p;->k:LI0/s;

    .line 14
    .line 15
    sget-object v2, LI0/r;->a:[LH5/k;

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    aget-object v2, v2, v3

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v1, p1, v0}, LI0/s;->a(LI0/i;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lv/I;->M:Lv/F;

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    new-instance v0, Lv/F;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, v1, p0}, Lv/F;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lv/I;->M:Lv/F;

    .line 38
    .line 39
    :cond_0
    iget-object v0, p0, Lv/I;->M:Lv/F;

    .line 40
    .line 41
    sget-object v1, LI0/h;->u:LI0/s;

    .line 42
    .line 43
    new-instance v2, LI0/a;

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-direct {v2, v3, v0}, LI0/a;-><init>(Ljava/lang/String;Lm5/e;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v1, v2}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final A0(Ly/i;Ly/h;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lc0/l;->D:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lc0/l;->l0()LM5/w;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, LR5/d;

    .line 10
    .line 11
    iget-object v0, v0, LR5/d;->q:Lq5/h;

    .line 12
    .line 13
    sget-object v1, LM5/t;->r:LM5/t;

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, LM5/b0;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v2, Lv/u;

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    invoke-direct {v2, v3, p1, p2}, Lv/u;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v2}, LM5/b0;->G(LB5/c;)LM5/J;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v0, v1

    .line 36
    :goto_0
    invoke-virtual {p0}, Lc0/l;->l0()LM5/w;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    new-instance v3, Lv/G;

    .line 41
    .line 42
    invoke-direct {v3, p1, p2, v0, v1}, Lv/G;-><init>(Ly/i;Ly/h;LM5/J;Lq5/c;)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x3

    .line 46
    invoke-static {v2, v1, v1, v3, p1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    invoke-virtual {p1, p2}, Ly/i;->b(Ly/h;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final B0()Lv/J;
    .locals 10

    .line 1
    iget-boolean v0, p0, Lc0/l;->D:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_c

    .line 5
    .line 6
    iget-object v0, p0, Lc0/l;->q:Lc0/l;

    .line 7
    .line 8
    iget-boolean v0, v0, Lc0/l;->D:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "visitAncestors called on an unattached node"

    .line 13
    .line 14
    invoke-static {v0}, Ly0/a;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lc0/l;->q:Lc0/l;

    .line 18
    .line 19
    iget-object v0, v0, Lc0/l;->u:Lc0/l;

    .line 20
    .line 21
    invoke-static {p0}, LB0/g;->u(LB0/m;)LB0/L;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    :goto_0
    if-eqz v2, :cond_b

    .line 26
    .line 27
    iget-object v3, v2, LB0/L;->U:LB0/g0;

    .line 28
    .line 29
    iget-object v3, v3, LB0/g0;->e:Lc0/l;

    .line 30
    .line 31
    iget v3, v3, Lc0/l;->t:I

    .line 32
    .line 33
    const/high16 v4, 0x40000

    .line 34
    .line 35
    and-int/2addr v3, v4

    .line 36
    if-eqz v3, :cond_9

    .line 37
    .line 38
    :goto_1
    if-eqz v0, :cond_9

    .line 39
    .line 40
    iget v3, v0, Lc0/l;->s:I

    .line 41
    .line 42
    and-int/2addr v3, v4

    .line 43
    if-eqz v3, :cond_8

    .line 44
    .line 45
    move-object v3, v0

    .line 46
    move-object v5, v1

    .line 47
    :goto_2
    if-eqz v3, :cond_8

    .line 48
    .line 49
    instance-of v6, v3, LB0/E0;

    .line 50
    .line 51
    if-eqz v6, :cond_1

    .line 52
    .line 53
    check-cast v3, LB0/E0;

    .line 54
    .line 55
    invoke-interface {v3}, LB0/E0;->o()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    sget-object v7, Lv/J;->F:Lv/M;

    .line 60
    .line 61
    invoke-virtual {v7, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_7

    .line 66
    .line 67
    goto :goto_5

    .line 68
    :cond_1
    iget v6, v3, Lc0/l;->s:I

    .line 69
    .line 70
    and-int/2addr v6, v4

    .line 71
    if-eqz v6, :cond_7

    .line 72
    .line 73
    instance-of v6, v3, LB0/n;

    .line 74
    .line 75
    if-eqz v6, :cond_7

    .line 76
    .line 77
    move-object v6, v3

    .line 78
    check-cast v6, LB0/n;

    .line 79
    .line 80
    iget-object v6, v6, LB0/n;->F:Lc0/l;

    .line 81
    .line 82
    const/4 v7, 0x0

    .line 83
    :goto_3
    const/4 v8, 0x1

    .line 84
    if-eqz v6, :cond_6

    .line 85
    .line 86
    iget v9, v6, Lc0/l;->s:I

    .line 87
    .line 88
    and-int/2addr v9, v4

    .line 89
    if-eqz v9, :cond_5

    .line 90
    .line 91
    add-int/lit8 v7, v7, 0x1

    .line 92
    .line 93
    if-ne v7, v8, :cond_2

    .line 94
    .line 95
    move-object v3, v6

    .line 96
    goto :goto_4

    .line 97
    :cond_2
    if-nez v5, :cond_3

    .line 98
    .line 99
    new-instance v5, LR/e;

    .line 100
    .line 101
    const/16 v8, 0x10

    .line 102
    .line 103
    new-array v8, v8, [Lc0/l;

    .line 104
    .line 105
    invoke-direct {v5, v8}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    if-eqz v3, :cond_4

    .line 109
    .line 110
    invoke-virtual {v5, v3}, LR/e;->c(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    move-object v3, v1

    .line 114
    :cond_4
    invoke-virtual {v5, v6}, LR/e;->c(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_5
    :goto_4
    iget-object v6, v6, Lc0/l;->v:Lc0/l;

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_6
    if-ne v7, v8, :cond_7

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_7
    invoke-static {v5}, LB0/g;->f(LR/e;)Lc0/l;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    goto :goto_2

    .line 128
    :cond_8
    iget-object v0, v0, Lc0/l;->u:Lc0/l;

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_9
    invoke-virtual {v2}, LB0/L;->s()LB0/L;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    if-eqz v2, :cond_a

    .line 136
    .line 137
    iget-object v0, v2, LB0/L;->U:LB0/g0;

    .line 138
    .line 139
    if-eqz v0, :cond_a

    .line 140
    .line 141
    iget-object v0, v0, LB0/g0;->d:LB0/B0;

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_a
    move-object v0, v1

    .line 145
    goto :goto_0

    .line 146
    :cond_b
    move-object v3, v1

    .line 147
    :goto_5
    instance-of v0, v3, Lv/J;

    .line 148
    .line 149
    if-eqz v0, :cond_c

    .line 150
    .line 151
    check-cast v3, Lv/J;

    .line 152
    .line 153
    return-object v3

    .line 154
    :cond_c
    return-object v1
.end method

.method public final C0(Ly/i;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lv/I;->G:Ly/i;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lv/I;->G:Ly/i;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lv/I;->I:Ly/d;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    new-instance v2, Ly/e;

    .line 18
    .line 19
    invoke-direct {v2, v1}, Ly/e;-><init>(Ly/d;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ly/i;->b(Ly/h;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, Lv/I;->I:Ly/d;

    .line 27
    .line 28
    iput-object p1, p0, Lv/I;->G:Ly/i;

    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public final E()V
    .locals 3

    .line 1
    new-instance v0, Lkotlin/jvm/internal/y;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LB0/K;

    .line 7
    .line 8
    const/16 v2, 0x12

    .line 9
    .line 10
    invoke-direct {v1, v0, p0, v2}, LB0/K;-><init>(Lkotlin/jvm/internal/y;Lc0/l;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1}, LB0/g;->r(Lc0/l;LB5/a;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LE/G;

    .line 19
    .line 20
    iget-object v1, p0, Lv/I;->L:Lh0/o;

    .line 21
    .line 22
    invoke-virtual {v1}, Lh0/o;->z0()Lh0/n;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Lh0/n;->a()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iget-object v1, p0, Lv/I;->J:LE/G;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v1}, LE/G;->b()V

    .line 37
    .line 38
    .line 39
    :cond_0
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, LE/G;->a()LE/G;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v0, 0x0

    .line 46
    :goto_0
    iput-object v0, p0, Lv/I;->J:LE/G;

    .line 47
    .line 48
    :cond_2
    return-void
.end method

.method public final g(LB0/n0;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lv/I;->K:LB0/n0;

    .line 2
    .line 3
    iget-object v0, p0, Lv/I;->L:Lh0/o;

    .line 4
    .line 5
    invoke-virtual {v0}, Lh0/o;->z0()Lh0/n;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lh0/n;->a()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, LB0/n0;->B0()Lc0/l;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-boolean p1, p1, Lc0/l;->D:Z

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, Lv/I;->K:LB0/n0;

    .line 25
    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    invoke-virtual {p1}, LB0/n0;->B0()Lc0/l;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-boolean p1, p1, Lc0/l;->D:Z

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0}, Lv/I;->B0()Lv/J;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    iget-object v0, p0, Lv/I;->K:LB0/n0;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lv/J;->x0(Lz0/m;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    invoke-virtual {p0}, Lv/I;->B0()Lv/J;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-virtual {p1, v0}, Lv/J;->x0(Lz0/m;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_0
    return-void
.end method

.method public final o()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lv/I;->N:Lv/M;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lv/I;->J:LE/G;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, LE/G;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lv/I;->J:LE/G;

    .line 10
    .line 11
    return-void
.end method
