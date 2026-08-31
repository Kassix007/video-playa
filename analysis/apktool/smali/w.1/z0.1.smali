.class public final Lw/z0;
.super Lw/C;
.source "SourceFile"

# interfaces
.implements Lt0/c;
.implements LB0/A0;
.implements LB0/l;


# instance fields
.field public O:Lv/l;

.field public P:Lw/I;

.field public final Q:Lu0/d;

.field public final R:Lw/j0;

.field public final S:Lw/l;

.field public final T:Lw/H0;

.field public final U:Lw/r0;

.field public final V:Lw/j;

.field public W:LA/e0;

.field public X:Lw/y0;

.field public Y:Lb2/a;


# direct methods
.method public constructor <init>(Lv/l;Lw/c;Lw/I;Lw/d0;Lw/A0;Ly/i;ZZ)V
    .locals 9

    .line 1
    move/from16 v8, p7

    .line 2
    .line 3
    sget-object v0, Lw/d;->u:Lw/d;

    .line 4
    .line 5
    move-object v1, p6

    .line 6
    invoke-direct {p0, v0, v8, p6, p4}, Lw/C;-><init>(LB5/c;ZLy/i;Lw/d0;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lw/z0;->O:Lv/l;

    .line 10
    .line 11
    iput-object p3, p0, Lw/z0;->P:Lw/I;

    .line 12
    .line 13
    new-instance v6, Lu0/d;

    .line 14
    .line 15
    invoke-direct {v6}, Lu0/d;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v6, p0, Lw/z0;->Q:Lu0/d;

    .line 19
    .line 20
    new-instance v0, Lw/j0;

    .line 21
    .line 22
    invoke-direct {v0}, Lc0/l;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-boolean v8, v0, Lw/j0;->E:Z

    .line 26
    .line 27
    invoke-virtual {p0, v0}, LB0/n;->x0(LB0/m;)LB0/m;

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lw/z0;->R:Lw/j0;

    .line 31
    .line 32
    new-instance v0, Lw/l;

    .line 33
    .line 34
    sget-object v1, Lw/p0;->c:Lw/m0;

    .line 35
    .line 36
    new-instance v2, Li3/a;

    .line 37
    .line 38
    invoke-direct {v2, v1}, Li3/a;-><init>(LW0/c;)V

    .line 39
    .line 40
    .line 41
    new-instance v1, Lu/v;

    .line 42
    .line 43
    invoke-direct {v1, v2}, Lu/v;-><init>(Li3/a;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, v1}, Lw/l;-><init>(Lu/v;)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lw/z0;->S:Lw/l;

    .line 50
    .line 51
    iget-object v2, p0, Lw/z0;->O:Lv/l;

    .line 52
    .line 53
    iget-object v1, p0, Lw/z0;->P:Lw/I;

    .line 54
    .line 55
    if-nez v1, :cond_0

    .line 56
    .line 57
    move-object v3, v0

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move-object v3, v1

    .line 60
    :goto_0
    new-instance v0, Lw/H0;

    .line 61
    .line 62
    new-instance v7, Lv/F;

    .line 63
    .line 64
    const/4 v1, 0x2

    .line 65
    invoke-direct {v7, v1, p0}, Lv/F;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object v4, p4

    .line 69
    move-object v1, p5

    .line 70
    move/from16 v5, p8

    .line 71
    .line 72
    invoke-direct/range {v0 .. v7}, Lw/H0;-><init>(Lw/A0;Lv/l;Lw/I;Lw/d0;ZLu0/d;Lv/F;)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, Lw/z0;->T:Lw/H0;

    .line 76
    .line 77
    new-instance v1, Lw/r0;

    .line 78
    .line 79
    invoke-direct {v1, v0, v8}, Lw/r0;-><init>(Lw/H0;Z)V

    .line 80
    .line 81
    .line 82
    iput-object v1, p0, Lw/z0;->U:Lw/r0;

    .line 83
    .line 84
    new-instance v2, Lw/j;

    .line 85
    .line 86
    invoke-direct {v2, p4, v0, v5, p2}, Lw/j;-><init>(Lw/d0;Lw/H0;ZLw/c;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v2}, LB0/n;->x0(LB0/m;)LB0/m;

    .line 90
    .line 91
    .line 92
    iput-object v2, p0, Lw/z0;->V:Lw/j;

    .line 93
    .line 94
    new-instance v0, Lu0/g;

    .line 95
    .line 96
    invoke-direct {v0, v1, v6}, Lu0/g;-><init>(Lu0/a;Lu0/d;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v0}, LB0/n;->x0(LB0/m;)LB0/m;

    .line 100
    .line 101
    .line 102
    new-instance v0, Lh0/o;

    .line 103
    .line 104
    const/4 v1, 0x4

    .line 105
    const/4 v3, 0x2

    .line 106
    const/4 v4, 0x0

    .line 107
    invoke-direct {v0, v3, v4, v1}, Lh0/o;-><init>(ILB5/e;I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v0}, LB0/n;->x0(LB0/m;)LB0/m;

    .line 111
    .line 112
    .line 113
    new-instance v0, LG/e;

    .line 114
    .line 115
    invoke-direct {v0}, Lc0/l;-><init>()V

    .line 116
    .line 117
    .line 118
    iput-object v2, v0, LG/e;->E:Lw/j;

    .line 119
    .line 120
    invoke-virtual {p0, v0}, LB0/n;->x0(LB0/m;)LB0/m;

    .line 121
    .line 122
    .line 123
    new-instance v0, Lv/J;

    .line 124
    .line 125
    new-instance v1, Lm0/a;

    .line 126
    .line 127
    const/16 v2, 0x9

    .line 128
    .line 129
    invoke-direct {v1, v2, p0}, Lm0/a;-><init>(ILjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-direct {v0}, Lc0/l;-><init>()V

    .line 133
    .line 134
    .line 135
    iput-object v1, v0, Lv/J;->E:Lm0/a;

    .line 136
    .line 137
    invoke-virtual {p0, v0}, LB0/n;->x0(LB0/m;)LB0/m;

    .line 138
    .line 139
    .line 140
    return-void
.end method


# virtual methods
.method public final A(LI0/i;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lw/C;->I:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lw/z0;->W:LA/e0;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lw/z0;->X:Lw/y0;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :cond_0
    new-instance v0, LA/e0;

    .line 15
    .line 16
    const/16 v2, 0x11

    .line 17
    .line 18
    invoke-direct {v0, v2, p0}, LA/e0;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lw/z0;->W:LA/e0;

    .line 22
    .line 23
    new-instance v0, Lw/y0;

    .line 24
    .line 25
    invoke-direct {v0, p0, v1}, Lw/y0;-><init>(Lw/z0;Lq5/c;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lw/z0;->X:Lw/y0;

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Lw/z0;->W:LA/e0;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    sget-object v2, LI0/r;->a:[LH5/k;

    .line 35
    .line 36
    sget-object v2, LI0/h;->d:LI0/s;

    .line 37
    .line 38
    new-instance v3, LI0/a;

    .line 39
    .line 40
    invoke-direct {v3, v1, v0}, LI0/a;-><init>(Ljava/lang/String;Lm5/e;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v2, v3}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-object v0, p0, Lw/z0;->X:Lw/y0;

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    sget-object v1, LI0/r;->a:[LH5/k;

    .line 51
    .line 52
    sget-object v1, LI0/h;->e:LI0/s;

    .line 53
    .line 54
    invoke-virtual {p1, v1, v0}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    return-void
.end method

.method public final E0(Lw/A;Lw/B;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lw/s0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lw/z0;->T:Lw/H0;

    .line 5
    .line 6
    invoke-direct {v0, p1, v2, v1}, Lw/s0;-><init>(Lw/A;Lw/H0;Lq5/c;)V

    .line 7
    .line 8
    .line 9
    sget-object p1, Lv/W;->r:Lv/W;

    .line 10
    .line 11
    invoke-virtual {v2, p1, v0, p2}, Lw/H0;->f(Lv/W;LB5/e;Ls5/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 16
    .line 17
    if-ne p1, p2, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 21
    .line 22
    return-object p1
.end method

.method public final F0(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final G0(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lw/z0;->Q:Lu0/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu0/d;->c()LM5/w;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lw/t0;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p0, p1, p2, v2}, Lw/t0;-><init>(Lw/z0;JLq5/c;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x3

    .line 14
    invoke-static {v0, v2, v2, v1, p1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final H0()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lw/z0;->T:Lw/H0;

    .line 2
    .line 3
    iget-object v1, v0, Lw/H0;->a:Lw/A0;

    .line 4
    .line 5
    invoke-interface {v1}, Lw/A0;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_8

    .line 10
    .line 11
    iget-object v0, v0, Lw/H0;->b:Lv/l;

    .line 12
    .line 13
    if-eqz v0, :cond_7

    .line 14
    .line 15
    iget-object v0, v0, Lv/l;->c:Lv/E;

    .line 16
    .line 17
    iget-object v1, v0, Lv/E;->d:Landroid/widget/EdgeEffect;

    .line 18
    .line 19
    const/16 v2, 0x1f

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    if-lt v4, v2, :cond_0

    .line 27
    .line 28
    invoke-static {v1}, Lv/o;->b(Landroid/widget/EdgeEffect;)F

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v1, v3

    .line 34
    :goto_0
    cmpg-float v1, v1, v3

    .line 35
    .line 36
    if-nez v1, :cond_8

    .line 37
    .line 38
    :cond_1
    iget-object v1, v0, Lv/E;->e:Landroid/widget/EdgeEffect;

    .line 39
    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 43
    .line 44
    if-lt v4, v2, :cond_2

    .line 45
    .line 46
    invoke-static {v1}, Lv/o;->b(Landroid/widget/EdgeEffect;)F

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move v1, v3

    .line 52
    :goto_1
    cmpg-float v1, v1, v3

    .line 53
    .line 54
    if-nez v1, :cond_8

    .line 55
    .line 56
    :cond_3
    iget-object v1, v0, Lv/E;->f:Landroid/widget/EdgeEffect;

    .line 57
    .line 58
    if-eqz v1, :cond_5

    .line 59
    .line 60
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 61
    .line 62
    if-lt v4, v2, :cond_4

    .line 63
    .line 64
    invoke-static {v1}, Lv/o;->b(Landroid/widget/EdgeEffect;)F

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    goto :goto_2

    .line 69
    :cond_4
    move v1, v3

    .line 70
    :goto_2
    cmpg-float v1, v1, v3

    .line 71
    .line 72
    if-nez v1, :cond_8

    .line 73
    .line 74
    :cond_5
    iget-object v0, v0, Lv/E;->g:Landroid/widget/EdgeEffect;

    .line 75
    .line 76
    if-eqz v0, :cond_7

    .line 77
    .line 78
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 79
    .line 80
    if-lt v1, v2, :cond_6

    .line 81
    .line 82
    invoke-static {v0}, Lv/o;->b(Landroid/widget/EdgeEffect;)F

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    goto :goto_3

    .line 87
    :cond_6
    move v0, v3

    .line 88
    :goto_3
    cmpg-float v0, v0, v3

    .line 89
    .line 90
    if-nez v0, :cond_8

    .line 91
    .line 92
    :cond_7
    const/4 v0, 0x0

    .line 93
    return v0

    .line 94
    :cond_8
    const/4 v0, 0x1

    .line 95
    return v0
.end method

.method public final J0(Lv/l;Lw/c;Lw/I;Lw/d0;Lw/A0;Ly/i;ZZ)V
    .locals 11

    .line 1
    move-object/from16 v2, p5

    .line 2
    .line 3
    move/from16 v3, p7

    .line 4
    .line 5
    move/from16 v4, p8

    .line 6
    .line 7
    iget-boolean v5, p0, Lw/C;->I:Z

    .line 8
    .line 9
    const/4 v6, 0x1

    .line 10
    const/4 v7, 0x0

    .line 11
    if-eq v5, v3, :cond_0

    .line 12
    .line 13
    iget-object v5, p0, Lw/z0;->U:Lw/r0;

    .line 14
    .line 15
    iput-boolean v3, v5, Lw/r0;->r:Z

    .line 16
    .line 17
    iget-object v5, p0, Lw/z0;->R:Lw/j0;

    .line 18
    .line 19
    iput-boolean v3, v5, Lw/j0;->E:Z

    .line 20
    .line 21
    move v8, v6

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v8, v7

    .line 24
    :goto_0
    if-nez p3, :cond_1

    .line 25
    .line 26
    iget-object v5, p0, Lw/z0;->S:Lw/l;

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move-object v5, p3

    .line 30
    :goto_1
    iget-object v9, p0, Lw/z0;->T:Lw/H0;

    .line 31
    .line 32
    iget-object v10, v9, Lw/H0;->a:Lw/A0;

    .line 33
    .line 34
    invoke-static {v10, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v10

    .line 38
    if-nez v10, :cond_2

    .line 39
    .line 40
    iput-object v2, v9, Lw/H0;->a:Lw/A0;

    .line 41
    .line 42
    move v7, v6

    .line 43
    :cond_2
    iput-object p1, v9, Lw/H0;->b:Lv/l;

    .line 44
    .line 45
    iget-object v2, v9, Lw/H0;->d:Lw/d0;

    .line 46
    .line 47
    if-eq v2, p4, :cond_3

    .line 48
    .line 49
    iput-object p4, v9, Lw/H0;->d:Lw/d0;

    .line 50
    .line 51
    move v7, v6

    .line 52
    :cond_3
    iget-boolean v2, v9, Lw/H0;->e:Z

    .line 53
    .line 54
    if-eq v2, v4, :cond_4

    .line 55
    .line 56
    iput-boolean v4, v9, Lw/H0;->e:Z

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    move v6, v7

    .line 60
    :goto_2
    iput-object v5, v9, Lw/H0;->c:Lw/I;

    .line 61
    .line 62
    iget-object v2, p0, Lw/z0;->Q:Lu0/d;

    .line 63
    .line 64
    iput-object v2, v9, Lw/H0;->f:Lu0/d;

    .line 65
    .line 66
    iget-object v2, p0, Lw/z0;->V:Lw/j;

    .line 67
    .line 68
    iput-object p4, v2, Lw/j;->E:Lw/d0;

    .line 69
    .line 70
    iput-boolean v4, v2, Lw/j;->G:Z

    .line 71
    .line 72
    iput-object p2, v2, Lw/j;->H:Lw/c;

    .line 73
    .line 74
    iput-object p1, p0, Lw/z0;->O:Lv/l;

    .line 75
    .line 76
    iput-object p3, p0, Lw/z0;->P:Lw/I;

    .line 77
    .line 78
    sget-object v1, Lw/d;->u:Lw/d;

    .line 79
    .line 80
    iget-object p1, v9, Lw/H0;->d:Lw/d0;

    .line 81
    .line 82
    sget-object p2, Lw/d0;->q:Lw/d0;

    .line 83
    .line 84
    if-ne p1, p2, :cond_5

    .line 85
    .line 86
    :goto_3
    move-object v0, p0

    .line 87
    move-object v4, p2

    .line 88
    move v2, v3

    .line 89
    move v5, v6

    .line 90
    move-object/from16 v3, p6

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_5
    sget-object p2, Lw/d0;->r:Lw/d0;

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :goto_4
    invoke-virtual/range {v0 .. v5}, Lw/C;->I0(LB5/c;ZLy/i;Lw/d0;Z)V

    .line 97
    .line 98
    .line 99
    if-eqz v8, :cond_6

    .line 100
    .line 101
    const/4 p1, 0x0

    .line 102
    iput-object p1, p0, Lw/z0;->W:LA/e0;

    .line 103
    .line 104
    iput-object p1, p0, Lw/z0;->X:Lw/y0;

    .line 105
    .line 106
    invoke-static {p0}, LB0/g;->n(LB0/A0;)V

    .line 107
    .line 108
    .line 109
    :cond_6
    return-void
.end method

.method public final K(Landroid/view/KeyEvent;)Z
    .locals 11

    .line 1
    iget-boolean v0, p0, Lw/C;->I:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, LQ2/g;->d(I)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    sget-wide v2, Lt0/a;->l:J

    .line 14
    .line 15
    invoke-static {v0, v1, v2, v3}, Lt0/a;->a(JJ)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {v0}, LQ2/g;->d(I)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    sget-wide v2, Lt0/a;->k:J

    .line 30
    .line 31
    invoke-static {v0, v1, v2, v3}, Lt0/a;->a(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    :cond_0
    invoke-static {p1}, LE3/h;->C(Landroid/view/KeyEvent;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v1, 0x2

    .line 42
    if-ne v0, v1, :cond_4

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_4

    .line 49
    .line 50
    iget-object v0, p0, Lw/z0;->T:Lw/H0;

    .line 51
    .line 52
    iget-object v0, v0, Lw/H0;->d:Lw/d0;

    .line 53
    .line 54
    sget-object v1, Lw/d0;->q:Lw/d0;

    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    iget-object v3, p0, Lw/z0;->V:Lw/j;

    .line 58
    .line 59
    const/16 v4, 0x20

    .line 60
    .line 61
    const-wide v5, 0xffffffffL

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    if-ne v0, v1, :cond_2

    .line 67
    .line 68
    iget-wide v0, v3, Lw/j;->M:J

    .line 69
    .line 70
    and-long/2addr v0, v5

    .line 71
    long-to-int v0, v0

    .line 72
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-static {p1}, LQ2/g;->d(I)J

    .line 77
    .line 78
    .line 79
    move-result-wide v7

    .line 80
    sget-wide v9, Lt0/a;->k:J

    .line 81
    .line 82
    invoke-static {v7, v8, v9, v10}, Lt0/a;->a(JJ)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_1

    .line 87
    .line 88
    int-to-float p1, v0

    .line 89
    goto :goto_0

    .line 90
    :cond_1
    int-to-float p1, v0

    .line 91
    neg-float p1, p1

    .line 92
    :goto_0
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    int-to-long v0, v0

    .line 97
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    :goto_1
    int-to-long v2, p1

    .line 102
    shl-long/2addr v0, v4

    .line 103
    and-long/2addr v2, v5

    .line 104
    or-long/2addr v0, v2

    .line 105
    goto :goto_3

    .line 106
    :cond_2
    iget-wide v0, v3, Lw/j;->M:J

    .line 107
    .line 108
    shr-long/2addr v0, v4

    .line 109
    long-to-int v0, v0

    .line 110
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    invoke-static {p1}, LQ2/g;->d(I)J

    .line 115
    .line 116
    .line 117
    move-result-wide v7

    .line 118
    sget-wide v9, Lt0/a;->k:J

    .line 119
    .line 120
    invoke-static {v7, v8, v9, v10}, Lt0/a;->a(JJ)Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eqz p1, :cond_3

    .line 125
    .line 126
    int-to-float p1, v0

    .line 127
    goto :goto_2

    .line 128
    :cond_3
    int-to-float p1, v0

    .line 129
    neg-float p1, p1

    .line 130
    :goto_2
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    int-to-long v0, p1

    .line 135
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    goto :goto_1

    .line 140
    :goto_3
    invoke-virtual {p0}, Lc0/l;->l0()LM5/w;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    new-instance v2, Lw/v0;

    .line 145
    .line 146
    const/4 v3, 0x0

    .line 147
    invoke-direct {v2, p0, v0, v1, v3}, Lw/v0;-><init>(Lw/z0;JLq5/c;)V

    .line 148
    .line 149
    .line 150
    const/4 v0, 0x3

    .line 151
    invoke-static {p1, v3, v3, v2, v0}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 152
    .line 153
    .line 154
    const/4 p1, 0x1

    .line 155
    return p1

    .line 156
    :cond_4
    const/4 p1, 0x0

    .line 157
    return p1
.end method

.method public final a()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lw/C;->U()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lc0/l;->D:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {p0}, LB0/g;->u(LB0/m;)LB0/L;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, LB0/L;->N:LW0/c;

    .line 14
    .line 15
    iget-object v1, p0, Lw/z0;->S:Lw/l;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v2, Li3/a;

    .line 21
    .line 22
    invoke-direct {v2, v0}, Li3/a;-><init>(LW0/c;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lu/v;

    .line 26
    .line 27
    invoke-direct {v0, v2}, Lu/v;-><init>(Li3/a;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, v1, Lw/l;->a:Lu/v;

    .line 31
    .line 32
    :goto_0
    iget-object v0, p0, Lw/z0;->Y:Lb2/a;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-static {p0}, LB0/g;->u(LB0/m;)LB0/L;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v1, v1, LB0/L;->N:LW0/c;

    .line 41
    .line 42
    iput-object v1, v0, Lb2/a;->e:Ljava/lang/Object;

    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public final k(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final m0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final p0()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lc0/l;->D:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p0}, LB0/g;->u(LB0/m;)LB0/L;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, LB0/L;->N:LW0/c;

    .line 11
    .line 12
    iget-object v1, p0, Lw/z0;->S:Lw/l;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v2, Li3/a;

    .line 18
    .line 19
    invoke-direct {v2, v0}, Li3/a;-><init>(LW0/c;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lu/v;

    .line 23
    .line 24
    invoke-direct {v0, v2}, Lu/v;-><init>(Li3/a;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, v1, Lw/l;->a:Lu/v;

    .line 28
    .line 29
    :goto_0
    iget-object v0, p0, Lw/z0;->Y:Lb2/a;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-static {p0}, LB0/g;->u(LB0/m;)LB0/L;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v1, v1, LB0/L;->N:LW0/c;

    .line 38
    .line 39
    iput-object v1, v0, Lb2/a;->e:Ljava/lang/Object;

    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final t(Lv0/f;Lv0/g;J)V
    .locals 17

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    iget-object v0, v8, Lv0/f;->a:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Ljava/util/Collection;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v10, 0x0

    .line 17
    move v3, v10

    .line 18
    :goto_0
    if-ge v3, v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Lv0/l;

    .line 25
    .line 26
    iget-object v5, v2, Lw/C;->H:Lkotlin/jvm/internal/n;

    .line 27
    .line 28
    invoke-interface {v5, v4}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    invoke-super/range {p0 .. p4}, Lw/C;->t(Lv0/f;Lv0/g;J)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    :goto_1
    iget-boolean v0, v2, Lw/C;->I:Z

    .line 48
    .line 49
    if-eqz v0, :cond_c

    .line 50
    .line 51
    sget-object v0, Lv0/g;->q:Lv0/g;

    .line 52
    .line 53
    const/4 v11, 0x6

    .line 54
    if-ne v9, v0, :cond_3

    .line 55
    .line 56
    iget v0, v8, Lv0/f;->c:I

    .line 57
    .line 58
    if-ne v0, v11, :cond_3

    .line 59
    .line 60
    iget-object v0, v2, Lw/z0;->Y:Lb2/a;

    .line 61
    .line 62
    if-nez v0, :cond_2

    .line 63
    .line 64
    new-instance v12, Lb2/a;

    .line 65
    .line 66
    new-instance v13, Li1/a;

    .line 67
    .line 68
    invoke-static {v2}, LB0/g;->w(LB0/m;)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const/16 v1, 0xc

    .line 81
    .line 82
    invoke-direct {v13, v1, v0}, Li1/a;-><init>(ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance v0, LX/c;

    .line 86
    .line 87
    const/4 v6, 0x4

    .line 88
    const/4 v7, 0x1

    .line 89
    const/4 v1, 0x2

    .line 90
    const-class v3, Lw/z0;

    .line 91
    .line 92
    const-string v4, "onWheelScrollStopped"

    .line 93
    .line 94
    const-string v5, "onWheelScrollStopped-TH1AsA0(J)V"

    .line 95
    .line 96
    invoke-direct/range {v0 .. v7}, LX/c;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 97
    .line 98
    .line 99
    invoke-static {v2}, LB0/g;->u(LB0/m;)LB0/L;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iget-object v1, v1, LB0/L;->N:LW0/c;

    .line 104
    .line 105
    iget-object v3, v2, Lw/z0;->T:Lw/H0;

    .line 106
    .line 107
    invoke-direct {v12, v3, v13, v0, v1}, Lb2/a;-><init>(Lw/H0;Li1/a;LX/c;LW0/c;)V

    .line 108
    .line 109
    .line 110
    iput-object v12, v2, Lw/z0;->Y:Lb2/a;

    .line 111
    .line 112
    :cond_2
    iget-object v0, v2, Lw/z0;->Y:Lb2/a;

    .line 113
    .line 114
    if-eqz v0, :cond_3

    .line 115
    .line 116
    invoke-virtual {v2}, Lc0/l;->l0()LM5/w;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iget-object v3, v0, Lb2/a;->g:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v3, LM5/B;

    .line 123
    .line 124
    if-nez v3, :cond_3

    .line 125
    .line 126
    new-instance v3, Lw/Z;

    .line 127
    .line 128
    const/4 v4, 0x0

    .line 129
    invoke-direct {v3, v0, v4}, Lw/Z;-><init>(Lb2/a;Lq5/c;)V

    .line 130
    .line 131
    .line 132
    const/4 v5, 0x3

    .line 133
    invoke-static {v1, v4, v4, v3, v5}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iput-object v1, v0, Lb2/a;->g:Ljava/lang/Object;

    .line 138
    .line 139
    :cond_3
    iget-object v0, v2, Lw/z0;->Y:Lb2/a;

    .line 140
    .line 141
    if-eqz v0, :cond_c

    .line 142
    .line 143
    sget-object v1, Lv0/g;->r:Lv0/g;

    .line 144
    .line 145
    if-ne v9, v1, :cond_c

    .line 146
    .line 147
    iget v1, v8, Lv0/f;->c:I

    .line 148
    .line 149
    iget-object v3, v8, Lv0/f;->a:Ljava/lang/Object;

    .line 150
    .line 151
    if-ne v1, v11, :cond_c

    .line 152
    .line 153
    move-object v1, v3

    .line 154
    check-cast v1, Ljava/util/Collection;

    .line 155
    .line 156
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    move v5, v10

    .line 161
    :goto_2
    if-ge v5, v4, :cond_5

    .line 162
    .line 163
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    check-cast v6, Lv0/l;

    .line 168
    .line 169
    invoke-virtual {v6}, Lv0/l;->b()Z

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-eqz v6, :cond_4

    .line 174
    .line 175
    goto/16 :goto_b

    .line 176
    .line 177
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_5
    iget-object v4, v0, Lb2/a;->c:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v4, Li1/a;

    .line 183
    .line 184
    iget-object v5, v0, Lb2/a;->e:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v5, LW0/c;

    .line 187
    .line 188
    iget-object v4, v4, Li1/a;->r:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v4, Landroid/view/ViewConfiguration;

    .line 191
    .line 192
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 193
    .line 194
    const/16 v7, 0x40

    .line 195
    .line 196
    const/16 v8, 0x1a

    .line 197
    .line 198
    if-le v6, v8, :cond_6

    .line 199
    .line 200
    invoke-static {v4}, Lw/k1;->b(Landroid/view/ViewConfiguration;)F

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    :goto_3
    neg-float v9, v9

    .line 205
    goto :goto_4

    .line 206
    :cond_6
    int-to-float v9, v7

    .line 207
    invoke-interface {v5, v9}, LW0/c;->u(F)F

    .line 208
    .line 209
    .line 210
    move-result v9

    .line 211
    goto :goto_3

    .line 212
    :goto_4
    if-le v6, v8, :cond_7

    .line 213
    .line 214
    invoke-static {v4}, Lw/k1;->a(Landroid/view/ViewConfiguration;)F

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    :goto_5
    neg-float v4, v4

    .line 219
    goto :goto_6

    .line 220
    :cond_7
    int-to-float v4, v7

    .line 221
    invoke-interface {v5, v4}, LW0/c;->u(F)F

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    goto :goto_5

    .line 226
    :goto_6
    new-instance v5, Li0/b;

    .line 227
    .line 228
    const-wide/16 v6, 0x0

    .line 229
    .line 230
    invoke-direct {v5, v6, v7}, Li0/b;-><init>(J)V

    .line 231
    .line 232
    .line 233
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    move v7, v10

    .line 238
    :goto_7
    iget-wide v11, v5, Li0/b;->a:J

    .line 239
    .line 240
    if-ge v7, v6, :cond_8

    .line 241
    .line 242
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    check-cast v5, Lv0/l;

    .line 247
    .line 248
    iget-wide v13, v5, Lv0/l;->j:J

    .line 249
    .line 250
    invoke-static {v11, v12, v13, v14}, Li0/b;->e(JJ)J

    .line 251
    .line 252
    .line 253
    move-result-wide v11

    .line 254
    new-instance v5, Li0/b;

    .line 255
    .line 256
    invoke-direct {v5, v11, v12}, Li0/b;-><init>(J)V

    .line 257
    .line 258
    .line 259
    add-int/lit8 v7, v7, 0x1

    .line 260
    .line 261
    goto :goto_7

    .line 262
    :cond_8
    const/16 v5, 0x20

    .line 263
    .line 264
    shr-long v6, v11, v5

    .line 265
    .line 266
    long-to-int v6, v6

    .line 267
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    mul-float/2addr v6, v4

    .line 272
    const-wide v7, 0xffffffffL

    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    and-long/2addr v11, v7

    .line 278
    long-to-int v4, v11

    .line 279
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    mul-float/2addr v4, v9

    .line 284
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 285
    .line 286
    .line 287
    move-result v6

    .line 288
    int-to-long v11, v6

    .line 289
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    int-to-long v13, v4

    .line 294
    shl-long v4, v11, v5

    .line 295
    .line 296
    and-long v6, v13, v7

    .line 297
    .line 298
    or-long v12, v4, v6

    .line 299
    .line 300
    iget-object v4, v0, Lb2/a;->b:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v4, Lw/H0;

    .line 303
    .line 304
    invoke-virtual {v4, v12, v13}, Lw/H0;->e(J)J

    .line 305
    .line 306
    .line 307
    move-result-wide v5

    .line 308
    invoke-virtual {v4, v5, v6}, Lw/H0;->g(J)F

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    const/4 v6, 0x0

    .line 313
    cmpg-float v7, v5, v6

    .line 314
    .line 315
    if-nez v7, :cond_9

    .line 316
    .line 317
    move v4, v10

    .line 318
    goto :goto_8

    .line 319
    :cond_9
    cmpl-float v5, v5, v6

    .line 320
    .line 321
    if-lez v5, :cond_a

    .line 322
    .line 323
    iget-object v4, v4, Lw/H0;->a:Lw/A0;

    .line 324
    .line 325
    invoke-interface {v4}, Lw/A0;->c()Z

    .line 326
    .line 327
    .line 328
    move-result v4

    .line 329
    goto :goto_8

    .line 330
    :cond_a
    iget-object v4, v4, Lw/H0;->a:Lw/A0;

    .line 331
    .line 332
    invoke-interface {v4}, Lw/A0;->a()Z

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    :goto_8
    if-eqz v4, :cond_b

    .line 337
    .line 338
    iget-object v0, v0, Lb2/a;->f:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v0, LO5/e;

    .line 341
    .line 342
    new-instance v11, Lw/Q;

    .line 343
    .line 344
    invoke-static {v3}, Ln5/l;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    check-cast v4, Lv0/l;

    .line 349
    .line 350
    iget-wide v14, v4, Lv0/l;->b:J

    .line 351
    .line 352
    const/16 v16, 0x0

    .line 353
    .line 354
    invoke-direct/range {v11 .. v16}, Lw/Q;-><init>(JJZ)V

    .line 355
    .line 356
    .line 357
    invoke-interface {v0, v11}, LO5/w;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    instance-of v0, v0, LO5/k;

    .line 362
    .line 363
    xor-int/lit8 v0, v0, 0x1

    .line 364
    .line 365
    goto :goto_9

    .line 366
    :cond_b
    iget-boolean v0, v0, Lb2/a;->a:Z

    .line 367
    .line 368
    :goto_9
    if-eqz v0, :cond_c

    .line 369
    .line 370
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    :goto_a
    if-ge v10, v0, :cond_c

    .line 375
    .line 376
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    check-cast v1, Lv0/l;

    .line 381
    .line 382
    invoke-virtual {v1}, Lv0/l;->a()V

    .line 383
    .line 384
    .line 385
    add-int/lit8 v10, v10, 0x1

    .line 386
    .line 387
    goto :goto_a

    .line 388
    :cond_c
    :goto_b
    return-void
.end method
