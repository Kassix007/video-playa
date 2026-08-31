.class public final LB0/d;
.super Lc0/l;
.source "SourceFile"

# interfaces
.implements LB0/z;
.implements LB0/p;
.implements LB0/A0;
.implements LB0/y0;
.implements LA0/f;
.implements LA0/g;
.implements LB0/w0;
.implements LB0/y;
.implements LB0/q;
.implements Lh0/l;
.implements LB0/u0;
.implements Lg0/a;
.implements LB0/m;


# instance fields
.field public E:Lc0/k;

.field public F:LA0/a;

.field public G:Ljava/util/HashSet;


# virtual methods
.method public final A(LI0/i;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, LB0/d;->E:Lc0/k;

    .line 6
    .line 7
    const-string v3, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier"

    .line 8
    .line 9
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v2, Landroidx/compose/ui/semantics/AppendedSemanticsElement;

    .line 13
    .line 14
    new-instance v3, LI0/i;

    .line 15
    .line 16
    invoke-direct {v3}, LI0/i;-><init>()V

    .line 17
    .line 18
    .line 19
    iget-boolean v4, v2, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->q:Z

    .line 20
    .line 21
    iput-boolean v4, v3, LI0/i;->s:Z

    .line 22
    .line 23
    iget-object v2, v2, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->r:LB5/c;

    .line 24
    .line 25
    invoke-interface {v2, v3}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration"

    .line 29
    .line 30
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, v1, LI0/i;->q:Lr/G;

    .line 34
    .line 35
    iget-boolean v4, v3, LI0/i;->s:Z

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    iput-boolean v5, v1, LI0/i;->s:Z

    .line 41
    .line 42
    :cond_0
    iget-boolean v4, v3, LI0/i;->t:Z

    .line 43
    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    iput-boolean v5, v1, LI0/i;->t:Z

    .line 47
    .line 48
    :cond_1
    iget-object v1, v3, LI0/i;->q:Lr/G;

    .line 49
    .line 50
    iget-object v3, v1, Lr/G;->b:[Ljava/lang/Object;

    .line 51
    .line 52
    iget-object v4, v1, Lr/G;->c:[Ljava/lang/Object;

    .line 53
    .line 54
    iget-object v1, v1, Lr/G;->a:[J

    .line 55
    .line 56
    array-length v5, v1

    .line 57
    add-int/lit8 v5, v5, -0x2

    .line 58
    .line 59
    if-ltz v5, :cond_8

    .line 60
    .line 61
    const/4 v7, 0x0

    .line 62
    :goto_0
    aget-wide v8, v1, v7

    .line 63
    .line 64
    not-long v10, v8

    .line 65
    const/4 v12, 0x7

    .line 66
    shl-long/2addr v10, v12

    .line 67
    and-long/2addr v10, v8

    .line 68
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    and-long/2addr v10, v12

    .line 74
    cmp-long v10, v10, v12

    .line 75
    .line 76
    if-eqz v10, :cond_7

    .line 77
    .line 78
    sub-int v10, v7, v5

    .line 79
    .line 80
    not-int v10, v10

    .line 81
    ushr-int/lit8 v10, v10, 0x1f

    .line 82
    .line 83
    const/16 v11, 0x8

    .line 84
    .line 85
    rsub-int/lit8 v10, v10, 0x8

    .line 86
    .line 87
    const/4 v12, 0x0

    .line 88
    :goto_1
    if-ge v12, v10, :cond_6

    .line 89
    .line 90
    const-wide/16 v13, 0xff

    .line 91
    .line 92
    and-long/2addr v13, v8

    .line 93
    const-wide/16 v15, 0x80

    .line 94
    .line 95
    cmp-long v13, v13, v15

    .line 96
    .line 97
    if-gez v13, :cond_5

    .line 98
    .line 99
    shl-int/lit8 v13, v7, 0x3

    .line 100
    .line 101
    add-int/2addr v13, v12

    .line 102
    aget-object v14, v3, v13

    .line 103
    .line 104
    aget-object v13, v4, v13

    .line 105
    .line 106
    check-cast v14, LI0/s;

    .line 107
    .line 108
    invoke-virtual {v2, v14}, Lr/G;->b(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v15

    .line 112
    if-nez v15, :cond_2

    .line 113
    .line 114
    invoke-virtual {v2, v14, v13}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_2
    instance-of v15, v13, LI0/a;

    .line 119
    .line 120
    if-eqz v15, :cond_5

    .line 121
    .line 122
    invoke-virtual {v2, v14}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v15

    .line 126
    const-string v6, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"

    .line 127
    .line 128
    invoke-static {v15, v6}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    check-cast v15, LI0/a;

    .line 132
    .line 133
    new-instance v6, LI0/a;

    .line 134
    .line 135
    move/from16 v16, v11

    .line 136
    .line 137
    iget-object v11, v15, LI0/a;->a:Ljava/lang/String;

    .line 138
    .line 139
    if-nez v11, :cond_3

    .line 140
    .line 141
    move-object v11, v13

    .line 142
    check-cast v11, LI0/a;

    .line 143
    .line 144
    iget-object v11, v11, LI0/a;->a:Ljava/lang/String;

    .line 145
    .line 146
    :cond_3
    iget-object v15, v15, LI0/a;->b:Lm5/e;

    .line 147
    .line 148
    if-nez v15, :cond_4

    .line 149
    .line 150
    check-cast v13, LI0/a;

    .line 151
    .line 152
    iget-object v15, v13, LI0/a;->b:Lm5/e;

    .line 153
    .line 154
    :cond_4
    invoke-direct {v6, v11, v15}, LI0/a;-><init>(Ljava/lang/String;Lm5/e;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v14, v6}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_5
    :goto_2
    move/from16 v16, v11

    .line 162
    .line 163
    :goto_3
    shr-long v8, v8, v16

    .line 164
    .line 165
    add-int/lit8 v12, v12, 0x1

    .line 166
    .line 167
    move/from16 v11, v16

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_6
    move v6, v11

    .line 171
    if-ne v10, v6, :cond_8

    .line 172
    .line 173
    :cond_7
    if-eq v7, v5, :cond_8

    .line 174
    .line 175
    add-int/lit8 v7, v7, 0x1

    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_8
    return-void
.end method

.method public final A0()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lc0/l;->D:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LB0/d;->G:Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, LB0/g;->v(LB0/m;)LB0/t0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, LC0/A;

    .line 15
    .line 16
    invoke-virtual {v0}, LC0/A;->getSnapshotObserver()LB0/v0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, LB0/f;->r:LB0/f;

    .line 21
    .line 22
    new-instance v2, LB0/c;

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    invoke-direct {v2, p0, v3}, LB0/c;-><init>(LB0/d;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0, v1, v2}, LB0/v0;->a(LB0/u0;LB5/c;LB5/a;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final C(Lh0/i;)V
    .locals 1

    .line 1
    iget-object p1, p0, LB0/d;->E:Lc0/k;

    .line 2
    .line 3
    const-string v0, "applyFocusProperties called on wrong node"

    .line 4
    .line 5
    invoke-static {v0}, Ly0/a;->b(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance p1, Ljava/lang/ClassCastException;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 14
    .line 15
    .line 16
    throw p1
.end method

.method public final J(LB0/N;)V
    .locals 2

    .line 1
    iget-object v0, p0, LB0/d;->E:Lc0/k;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Lv/T;

    .line 9
    .line 10
    iget-object v0, v0, Lv/T;->q:Lv/Q;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Lv/Q;->a(LB0/N;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final N()Z
    .locals 2

    .line 1
    iget-object v0, p0, LB0/d;->E:Lc0/k;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Lv0/r;

    .line 9
    .line 10
    iget-object v0, v0, Lv0/r;->t:Lt2/e;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0
.end method

.method public final U()V
    .locals 12

    .line 1
    iget-object v0, p0, LB0/d;->E:Lc0/k;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Lv0/r;

    .line 9
    .line 10
    iget-object v0, v0, Lv0/r;->t:Lt2/e;

    .line 11
    .line 12
    iget-object v1, v0, Lt2/e;->r:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lv0/p;

    .line 15
    .line 16
    iget-object v2, v0, Lt2/e;->s:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lv0/r;

    .line 19
    .line 20
    sget-object v3, Lv0/p;->r:Lv0/p;

    .line 21
    .line 22
    if-ne v1, v3, :cond_0

    .line 23
    .line 24
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    new-instance v1, Lv0/q;

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-direct {v1, v2, v3}, Lv0/q;-><init>(Lv0/r;I)V

    .line 32
    .line 33
    .line 34
    const/4 v10, 0x0

    .line 35
    const/4 v11, 0x0

    .line 36
    const/4 v8, 0x3

    .line 37
    const/4 v9, 0x0

    .line 38
    move-wide v6, v4

    .line 39
    invoke-static/range {v4 .. v11}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-virtual {v3, v4}, Landroid/view/MotionEvent;->setSource(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v3}, Lv0/q;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V

    .line 51
    .line 52
    .line 53
    sget-object v1, Lv0/p;->q:Lv0/p;

    .line 54
    .line 55
    iput-object v1, v0, Lt2/e;->r:Ljava/lang/Object;

    .line 56
    .line 57
    iput-boolean v4, v2, Lv0/r;->s:Z

    .line 58
    .line 59
    :cond_0
    return-void
.end method

.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, LB0/d;->E:Lc0/k;

    .line 2
    .line 3
    instance-of v0, v0, Lv0/r;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LB0/d;->U()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final b()LW0/c;
    .locals 1

    .line 1
    invoke-static {p0}, LB0/g;->u(LB0/m;)LB0/L;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, LB0/L;->N:LW0/c;

    .line 6
    .line 7
    return-object v0
.end method

.method public final c(LB0/T;Lz0/B;J)Lz0/D;
    .locals 2

    .line 1
    iget-object v0, p0, LB0/d;->E:Lc0/k;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Lz0/o;

    .line 9
    .line 10
    invoke-interface {v0, p1, p2, p3, p4}, Lz0/o;->c(LB0/T;Lz0/B;J)Lz0/D;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public final c0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p1, p0, LB0/d;->E:Lc0/k;

    .line 2
    .line 3
    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Lt/h;

    .line 9
    .line 10
    return-object p1
.end method

.method public final d()J
    .locals 2

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {p0, v0}, LB0/g;->s(LB0/m;I)LB0/n0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v0, v0, Lz0/J;->s:J

    .line 8
    .line 9
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/P1;->d0(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
.end method

.method public final d0()V
    .locals 0

    .line 1
    invoke-static {p0}, LB0/g;->l(LB0/p;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final e(LA0/h;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, LB0/d;->G:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 4
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
    move-result-object v1

    .line 25
    :goto_0
    if-eqz v1, :cond_b

    .line 26
    .line 27
    iget-object v2, v1, LB0/L;->U:LB0/g0;

    .line 28
    .line 29
    iget-object v2, v2, LB0/g0;->e:Lc0/l;

    .line 30
    .line 31
    iget v2, v2, Lc0/l;->t:I

    .line 32
    .line 33
    and-int/lit8 v2, v2, 0x20

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    if-eqz v2, :cond_9

    .line 37
    .line 38
    :goto_1
    if-eqz v0, :cond_9

    .line 39
    .line 40
    iget v2, v0, Lc0/l;->s:I

    .line 41
    .line 42
    and-int/lit8 v2, v2, 0x20

    .line 43
    .line 44
    if-eqz v2, :cond_8

    .line 45
    .line 46
    move-object v2, v0

    .line 47
    move-object v4, v3

    .line 48
    :goto_2
    if-eqz v2, :cond_8

    .line 49
    .line 50
    instance-of v5, v2, LA0/f;

    .line 51
    .line 52
    if-eqz v5, :cond_1

    .line 53
    .line 54
    check-cast v2, LA0/f;

    .line 55
    .line 56
    invoke-interface {v2}, LA0/f;->h()Lcom/google/android/gms/internal/measurement/I1;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v5, p1}, Lcom/google/android/gms/internal/measurement/I1;->O(LA0/h;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_7

    .line 65
    .line 66
    invoke-interface {v2}, LA0/f;->h()Lcom/google/android/gms/internal/measurement/I1;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/I1;->X(LA0/h;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :cond_1
    iget v5, v2, Lc0/l;->s:I

    .line 76
    .line 77
    and-int/lit8 v5, v5, 0x20

    .line 78
    .line 79
    if-eqz v5, :cond_7

    .line 80
    .line 81
    instance-of v5, v2, LB0/n;

    .line 82
    .line 83
    if-eqz v5, :cond_7

    .line 84
    .line 85
    move-object v5, v2

    .line 86
    check-cast v5, LB0/n;

    .line 87
    .line 88
    iget-object v5, v5, LB0/n;->F:Lc0/l;

    .line 89
    .line 90
    const/4 v6, 0x0

    .line 91
    :goto_3
    const/4 v7, 0x1

    .line 92
    if-eqz v5, :cond_6

    .line 93
    .line 94
    iget v8, v5, Lc0/l;->s:I

    .line 95
    .line 96
    and-int/lit8 v8, v8, 0x20

    .line 97
    .line 98
    if-eqz v8, :cond_5

    .line 99
    .line 100
    add-int/lit8 v6, v6, 0x1

    .line 101
    .line 102
    if-ne v6, v7, :cond_2

    .line 103
    .line 104
    move-object v2, v5

    .line 105
    goto :goto_4

    .line 106
    :cond_2
    if-nez v4, :cond_3

    .line 107
    .line 108
    new-instance v4, LR/e;

    .line 109
    .line 110
    const/16 v7, 0x10

    .line 111
    .line 112
    new-array v7, v7, [Lc0/l;

    .line 113
    .line 114
    invoke-direct {v4, v7}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_3
    if-eqz v2, :cond_4

    .line 118
    .line 119
    invoke-virtual {v4, v2}, LR/e;->c(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    move-object v2, v3

    .line 123
    :cond_4
    invoke-virtual {v4, v5}, LR/e;->c(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_5
    :goto_4
    iget-object v5, v5, Lc0/l;->v:Lc0/l;

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_6
    if-ne v6, v7, :cond_7

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_7
    invoke-static {v4}, LB0/g;->f(LR/e;)Lc0/l;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    goto :goto_2

    .line 137
    :cond_8
    iget-object v0, v0, Lc0/l;->u:Lc0/l;

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_9
    invoke-virtual {v1}, LB0/L;->s()LB0/L;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    if-eqz v1, :cond_a

    .line 145
    .line 146
    iget-object v0, v1, LB0/L;->U:LB0/g0;

    .line 147
    .line 148
    if-eqz v0, :cond_a

    .line 149
    .line 150
    iget-object v0, v0, LB0/g0;->d:LB0/B0;

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_a
    move-object v0, v3

    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :cond_b
    iget-object p1, p1, LA0/h;->a:Lkotlin/jvm/internal/n;

    .line 157
    .line 158
    invoke-interface {p1}, LB5/a;->invoke()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    return-object p1
.end method

.method public final e0()V
    .locals 2

    .line 1
    iget-object v0, p0, LB0/d;->E:Lc0/k;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Lv0/r;

    .line 9
    .line 10
    iget-object v0, v0, Lv0/r;->t:Lt2/e;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final g(LB0/n0;)V
    .locals 2

    .line 1
    iget-object p1, p0, LB0/d;->E:Lc0/k;

    .line 2
    .line 3
    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast p1, LE/e;

    .line 9
    .line 10
    iget-boolean v0, p1, LE/e;->q:Z

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p1, LE/e;->q:Z

    .line 16
    .line 17
    iget-object v0, p1, LE/e;->r:LM5/h;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    iput-object v0, p1, LE/e;->r:LM5/h;

    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public final getLayoutDirection()LW0/l;
    .locals 1

    .line 1
    invoke-static {p0}, LB0/g;->u(LB0/m;)LB0/L;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, LB0/L;->O:LW0/l;

    .line 6
    .line 7
    return-object v0
.end method

.method public final h()Lcom/google/android/gms/internal/measurement/I1;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/d;->F:LA0/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    sget-object v0, LA0/b;->c:LA0/b;

    .line 7
    .line 8
    return-object v0
.end method

.method public final j0(Lz0/m;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final p0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, LB0/d;->x0(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final q(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final q0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, LB0/d;->z0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final t(Lv0/f;Lv0/g;J)V
    .locals 6

    .line 1
    iget-object p3, p0, LB0/d;->E:Lc0/k;

    .line 2
    .line 3
    const-string p4, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    .line 4
    .line 5
    invoke-static {p3, p4}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast p3, Lv0/r;

    .line 9
    .line 10
    iget-object p3, p3, Lv0/r;->t:Lt2/e;

    .line 11
    .line 12
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p4, p1, Lv0/f;->a:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v0, p3, Lt2/e;->s:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lv0/r;

    .line 20
    .line 21
    iget-boolean v1, v0, Lv0/r;->s:Z

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    move-object v1, p4

    .line 27
    check-cast v1, Ljava/util/Collection;

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    move v3, v2

    .line 34
    :goto_0
    if-ge v3, v1, :cond_1

    .line 35
    .line 36
    invoke-interface {p4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Lv0/l;

    .line 41
    .line 42
    invoke-static {v4}, Lv0/v;->a(Lv0/l;)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-nez v5, :cond_2

    .line 47
    .line 48
    invoke-static {v4}, Lv0/v;->c(Lv0/l;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_0

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    move v1, v2

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    :goto_1
    const/4 v1, 0x1

    .line 61
    :goto_2
    iget-object v3, p3, Lt2/e;->r:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v3, Lv0/p;

    .line 64
    .line 65
    sget-object v4, Lv0/p;->s:Lv0/p;

    .line 66
    .line 67
    sget-object v5, Lv0/g;->s:Lv0/g;

    .line 68
    .line 69
    if-eq v3, v4, :cond_4

    .line 70
    .line 71
    sget-object v3, Lv0/g;->q:Lv0/g;

    .line 72
    .line 73
    if-ne p2, v3, :cond_3

    .line 74
    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    invoke-virtual {p3, p1}, Lt2/e;->f(Lv0/f;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    if-ne p2, v5, :cond_4

    .line 81
    .line 82
    if-nez v1, :cond_4

    .line 83
    .line 84
    invoke-virtual {p3, p1}, Lt2/e;->f(Lv0/f;)V

    .line 85
    .line 86
    .line 87
    :cond_4
    if-ne p2, v5, :cond_7

    .line 88
    .line 89
    move-object p1, p4

    .line 90
    check-cast p1, Ljava/util/Collection;

    .line 91
    .line 92
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    move p2, v2

    .line 97
    :goto_3
    if-ge p2, p1, :cond_6

    .line 98
    .line 99
    invoke-interface {p4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Lv0/l;

    .line 104
    .line 105
    invoke-static {v1}, Lv0/v;->c(Lv0/l;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_5

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_5
    add-int/lit8 p2, p2, 0x1

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_6
    sget-object p1, Lv0/p;->q:Lv0/p;

    .line 116
    .line 117
    iput-object p1, p3, Lt2/e;->r:Ljava/lang/Object;

    .line 118
    .line 119
    iput-boolean v2, v0, Lv0/r;->s:Z

    .line 120
    .line 121
    :cond_7
    :goto_4
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/d;->E:Lc0/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final x()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc0/l;->D:Z

    .line 2
    .line 3
    return v0
.end method

.method public final x0(Z)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lc0/l;->D:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "initializeModifier called on unattached node"

    .line 6
    .line 7
    invoke-static {v0}, Ly0/a;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, LB0/d;->E:Lc0/k;

    .line 11
    .line 12
    iget v1, p0, Lc0/l;->s:I

    .line 13
    .line 14
    and-int/lit8 v1, v1, 0x20

    .line 15
    .line 16
    if-eqz v1, :cond_4

    .line 17
    .line 18
    instance-of v1, v0, LA0/c;

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    new-instance v1, LB0/c;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v1, p0, v2}, LB0/c;-><init>(LB0/d;I)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0}, LB0/g;->v(LB0/m;)LB0/t0;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, LC0/A;

    .line 33
    .line 34
    iget-object v2, v2, LC0/A;->J0:Lr/C;

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Lr/C;->f(Ljava/lang/Object;)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-ltz v3, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {v2, v1}, Lr/C;->a(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_0
    instance-of v1, v0, LA/F;

    .line 47
    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    move-object v1, v0

    .line 51
    check-cast v1, LA/F;

    .line 52
    .line 53
    iget-object v2, p0, LB0/d;->F:LA0/a;

    .line 54
    .line 55
    if-eqz v2, :cond_3

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    sget-object v3, LA/c0;->a:LA0/h;

    .line 61
    .line 62
    invoke-virtual {v2, v3}, LA0/a;->O(LA0/h;)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_3

    .line 67
    .line 68
    iput-object v1, v2, LA0/a;->c:LA/F;

    .line 69
    .line 70
    invoke-static {p0}, LB0/g;->v(LB0/m;)LB0/t0;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, LC0/A;

    .line 75
    .line 76
    invoke-virtual {v1}, LC0/A;->getModifierLocalManager()LA0/e;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iget-object v2, v1, LA0/e;->b:LR/e;

    .line 81
    .line 82
    invoke-virtual {v2, p0}, LR/e;->c(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object v2, v1, LA0/e;->c:LR/e;

    .line 86
    .line 87
    invoke-virtual {v2, v3}, LR/e;->c(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, LA0/e;->a()V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    new-instance v2, LA0/a;

    .line 95
    .line 96
    const/4 v3, 0x1

    .line 97
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/measurement/I1;-><init>(I)V

    .line 98
    .line 99
    .line 100
    iput-object v1, v2, LA0/a;->c:LA/F;

    .line 101
    .line 102
    iput-object v2, p0, LB0/d;->F:LA0/a;

    .line 103
    .line 104
    invoke-static {p0}, LB0/g;->d(LB0/d;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_4

    .line 109
    .line 110
    invoke-static {p0}, LB0/g;->v(LB0/m;)LB0/t0;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    check-cast v2, LC0/A;

    .line 115
    .line 116
    invoke-virtual {v2}, LC0/A;->getModifierLocalManager()LA0/e;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    sget-object v1, LA/c0;->a:LA0/h;

    .line 124
    .line 125
    iget-object v3, v2, LA0/e;->b:LR/e;

    .line 126
    .line 127
    invoke-virtual {v3, p0}, LR/e;->c(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    iget-object v3, v2, LA0/e;->c:LR/e;

    .line 131
    .line 132
    invoke-virtual {v3, v1}, LR/e;->c(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2}, LA0/e;->a()V

    .line 136
    .line 137
    .line 138
    :cond_4
    :goto_1
    iget v1, p0, Lc0/l;->s:I

    .line 139
    .line 140
    and-int/lit8 v1, v1, 0x4

    .line 141
    .line 142
    const/4 v2, 0x2

    .line 143
    if-eqz v1, :cond_5

    .line 144
    .line 145
    if-nez p1, :cond_5

    .line 146
    .line 147
    invoke-static {p0, v2}, LB0/g;->s(LB0/m;I)LB0/n0;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v1}, LB0/n0;->I0()V

    .line 152
    .line 153
    .line 154
    :cond_5
    iget v1, p0, Lc0/l;->s:I

    .line 155
    .line 156
    and-int/2addr v1, v2

    .line 157
    if-eqz v1, :cond_7

    .line 158
    .line 159
    invoke-static {p0}, LB0/g;->d(LB0/d;)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-eqz v1, :cond_6

    .line 164
    .line 165
    iget-object v1, p0, Lc0/l;->x:LB0/n0;

    .line 166
    .line 167
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    move-object v3, v1

    .line 171
    check-cast v3, LB0/B;

    .line 172
    .line 173
    invoke-virtual {v3, p0}, LB0/B;->X0(LB0/z;)V

    .line 174
    .line 175
    .line 176
    iget-object v1, v1, LB0/n0;->V:LB0/s0;

    .line 177
    .line 178
    if-eqz v1, :cond_6

    .line 179
    .line 180
    invoke-interface {v1}, LB0/s0;->invalidate()V

    .line 181
    .line 182
    .line 183
    :cond_6
    if-nez p1, :cond_7

    .line 184
    .line 185
    invoke-static {p0, v2}, LB0/g;->s(LB0/m;I)LB0/n0;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-virtual {p1}, LB0/n0;->I0()V

    .line 190
    .line 191
    .line 192
    invoke-static {p0}, LB0/g;->u(LB0/m;)LB0/L;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-virtual {p1}, LB0/L;->C()V

    .line 197
    .line 198
    .line 199
    :cond_7
    instance-of p1, v0, LC/x;

    .line 200
    .line 201
    if-eqz p1, :cond_8

    .line 202
    .line 203
    move-object p1, v0

    .line 204
    check-cast p1, LC/x;

    .line 205
    .line 206
    invoke-static {p0}, LB0/g;->u(LB0/m;)LB0/L;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    iget v2, p1, LC/x;->q:I

    .line 211
    .line 212
    packed-switch v2, :pswitch_data_0

    .line 213
    .line 214
    .line 215
    iget-object p1, p1, LC/x;->r:Lw/A0;

    .line 216
    .line 217
    check-cast p1, LF/N;

    .line 218
    .line 219
    iget-object p1, p1, LF/N;->x:LP/f0;

    .line 220
    .line 221
    invoke-virtual {p1, v1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    goto :goto_2

    .line 225
    :pswitch_0
    iget-object p1, p1, LC/x;->r:Lw/A0;

    .line 226
    .line 227
    check-cast p1, LD/y;

    .line 228
    .line 229
    iput-object v1, p1, LD/y;->j:LB0/L;

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :pswitch_1
    iget-object p1, p1, LC/x;->r:Lw/A0;

    .line 233
    .line 234
    check-cast p1, LC/A;

    .line 235
    .line 236
    iput-object v1, p1, LC/A;->j:LB0/L;

    .line 237
    .line 238
    :cond_8
    :goto_2
    iget p1, p0, Lc0/l;->s:I

    .line 239
    .line 240
    and-int/lit16 p1, p1, 0x100

    .line 241
    .line 242
    if-eqz p1, :cond_9

    .line 243
    .line 244
    instance-of p1, v0, LE/e;

    .line 245
    .line 246
    if-eqz p1, :cond_9

    .line 247
    .line 248
    invoke-static {p0}, LB0/g;->d(LB0/d;)Z

    .line 249
    .line 250
    .line 251
    move-result p1

    .line 252
    if-eqz p1, :cond_9

    .line 253
    .line 254
    invoke-static {p0}, LB0/g;->u(LB0/m;)LB0/L;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    invoke-virtual {p1}, LB0/L;->C()V

    .line 259
    .line 260
    .line 261
    :cond_9
    iget p1, p0, Lc0/l;->s:I

    .line 262
    .line 263
    and-int/lit8 v1, p1, 0x10

    .line 264
    .line 265
    if-eqz v1, :cond_a

    .line 266
    .line 267
    instance-of v1, v0, Lv0/r;

    .line 268
    .line 269
    if-eqz v1, :cond_a

    .line 270
    .line 271
    check-cast v0, Lv0/r;

    .line 272
    .line 273
    iget-object v0, v0, Lv0/r;->t:Lt2/e;

    .line 274
    .line 275
    iget-object v1, p0, Lc0/l;->x:LB0/n0;

    .line 276
    .line 277
    iput-object v1, v0, Lt2/e;->q:Ljava/lang/Object;

    .line 278
    .line 279
    :cond_a
    and-int/lit8 p1, p1, 0x8

    .line 280
    .line 281
    if-eqz p1, :cond_b

    .line 282
    .line 283
    invoke-static {p0}, LB0/g;->v(LB0/m;)LB0/t0;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    check-cast p1, LC0/A;

    .line 288
    .line 289
    invoke-virtual {p1}, LC0/A;->H()V

    .line 290
    .line 291
    .line 292
    :cond_b
    return-void

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final y0()V
    .locals 2

    .line 1
    iget-object v0, p0, LB0/d;->E:Lc0/k;

    .line 2
    .line 3
    const-string v1, "onFocusEvent called on wrong node"

    .line 4
    .line 5
    invoke-static {v1}, Ly0/a;->b(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/lang/ClassCastException;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 14
    .line 15
    .line 16
    throw v0
.end method

.method public final z0()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lc0/l;->D:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "unInitializeModifier called on unattached node"

    .line 6
    .line 7
    invoke-static {v0}, Ly0/a;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, LB0/d;->E:Lc0/k;

    .line 11
    .line 12
    iget v1, p0, Lc0/l;->s:I

    .line 13
    .line 14
    and-int/lit8 v1, v1, 0x20

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    instance-of v1, v0, LA/F;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-static {p0}, LB0/g;->v(LB0/m;)LB0/t0;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, LC0/A;

    .line 27
    .line 28
    invoke-virtual {v1}, LC0/A;->getModifierLocalManager()LA0/e;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    move-object v2, v0

    .line 33
    check-cast v2, LA/F;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    sget-object v2, LA/c0;->a:LA0/h;

    .line 39
    .line 40
    iget-object v3, v1, LA0/e;->d:LR/e;

    .line 41
    .line 42
    invoke-static {p0}, LB0/g;->u(LB0/m;)LB0/L;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v3, v4}, LR/e;->c(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v3, v1, LA0/e;->e:LR/e;

    .line 50
    .line 51
    invoke-virtual {v3, v2}, LR/e;->c(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, LA0/e;->a()V

    .line 55
    .line 56
    .line 57
    :cond_1
    instance-of v1, v0, LA0/c;

    .line 58
    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    check-cast v0, LA0/c;

    .line 62
    .line 63
    sget-object v1, LB0/g;->a:LB0/e;

    .line 64
    .line 65
    invoke-interface {v0, v1}, LA0/c;->e(LA0/g;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    iget v0, p0, Lc0/l;->s:I

    .line 69
    .line 70
    and-int/lit8 v0, v0, 0x8

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    invoke-static {p0}, LB0/g;->v(LB0/m;)LB0/t0;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, LC0/A;

    .line 79
    .line 80
    invoke-virtual {v0}, LC0/A;->H()V

    .line 81
    .line 82
    .line 83
    :cond_3
    return-void
.end method
