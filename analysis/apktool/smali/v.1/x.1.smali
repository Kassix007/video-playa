.class public final Lv/x;
.super LB0/n;
.source "SourceFile"

# interfaces
.implements LB0/y0;
.implements Lt0/c;
.implements LB0/A0;
.implements LB0/E0;


# static fields
.field public static final V:Lv/M;


# instance fields
.field public G:Ly/i;

.field public H:Lv/V;

.field public I:LI0/f;

.field public J:Z

.field public K:LB5/a;

.field public final L:Lv/I;

.field public M:Lv0/A;

.field public N:LB0/m;

.field public O:Ly/k;

.field public P:Ly/f;

.field public final Q:Lr/y;

.field public R:J

.field public S:Ly/i;

.field public T:Z

.field public final U:Lv/M;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lv/M;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lv/M;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lv/x;->V:Lv/M;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ly/i;Lv/V;ZLI0/f;LB5/a;)V
    .locals 8

    .line 1
    invoke-direct {p0}, LB0/n;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv/x;->G:Ly/i;

    .line 5
    .line 6
    iput-object p2, p0, Lv/x;->H:Lv/V;

    .line 7
    .line 8
    iput-object p4, p0, Lv/x;->I:LI0/f;

    .line 9
    .line 10
    iput-boolean p3, p0, Lv/x;->J:Z

    .line 11
    .line 12
    iput-object p5, p0, Lv/x;->K:LB5/a;

    .line 13
    .line 14
    new-instance p2, Lv/I;

    .line 15
    .line 16
    new-instance v0, LC0/s;

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v7, 0x3

    .line 20
    const/4 v1, 0x1

    .line 21
    const-class v3, Lv/x;

    .line 22
    .line 23
    const-string v4, "onFocusChange"

    .line 24
    .line 25
    const-string v5, "onFocusChange(Z)V"

    .line 26
    .line 27
    move-object v2, p0

    .line 28
    invoke-direct/range {v0 .. v7}, LC0/s;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p2, p1, v0}, Lv/I;-><init>(Ly/i;LC0/s;)V

    .line 32
    .line 33
    .line 34
    iput-object p2, v2, Lv/x;->L:Lv/I;

    .line 35
    .line 36
    sget p1, Lr/o;->a:I

    .line 37
    .line 38
    new-instance p1, Lr/y;

    .line 39
    .line 40
    const/4 p2, 0x6

    .line 41
    invoke-direct {p1, p2}, Lr/y;-><init>(I)V

    .line 42
    .line 43
    .line 44
    iput-object p1, v2, Lv/x;->Q:Lr/y;

    .line 45
    .line 46
    const-wide/16 p1, 0x0

    .line 47
    .line 48
    iput-wide p1, v2, Lv/x;->R:J

    .line 49
    .line 50
    iget-object p1, v2, Lv/x;->G:Ly/i;

    .line 51
    .line 52
    iput-object p1, v2, Lv/x;->S:Ly/i;

    .line 53
    .line 54
    if-nez p1, :cond_0

    .line 55
    .line 56
    iget-object p1, v2, Lv/x;->H:Lv/V;

    .line 57
    .line 58
    if-eqz p1, :cond_0

    .line 59
    .line 60
    const/4 p1, 0x1

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const/4 p1, 0x0

    .line 63
    :goto_0
    iput-boolean p1, v2, Lv/x;->T:Z

    .line 64
    .line 65
    sget-object p1, Lv/x;->V:Lv/M;

    .line 66
    .line 67
    iput-object p1, v2, Lv/x;->U:Lv/M;

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public final A(LI0/i;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lv/x;->I:LI0/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, v0, LI0/f;->a:I

    .line 6
    .line 7
    invoke-static {p1, v0}, LI0/r;->d(LI0/i;I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    new-instance v0, LA0/d;

    .line 11
    .line 12
    const/16 v1, 0x1d

    .line 13
    .line 14
    invoke-direct {v0, v1, p0}, LA0/d;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sget-object v1, LI0/r;->a:[LH5/k;

    .line 18
    .line 19
    sget-object v1, LI0/h;->b:LI0/s;

    .line 20
    .line 21
    new-instance v2, LI0/a;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-direct {v2, v3, v0}, LI0/a;-><init>(Ljava/lang/String;Lm5/e;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1, v2}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-boolean v0, p0, Lv/x;->J:Z

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lv/x;->L:Lv/I;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lv/I;->A(LI0/i;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    sget-object v0, LI0/p;->i:LI0/s;

    .line 41
    .line 42
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 43
    .line 44
    invoke-virtual {p1, v0, v1}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final A0()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lv/x;->G:Ly/i;

    .line 4
    .line 5
    iget-object v2, v0, Lv/x;->Q:Lr/y;

    .line 6
    .line 7
    if-eqz v1, :cond_5

    .line 8
    .line 9
    iget-object v3, v0, Lv/x;->O:Ly/k;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    new-instance v4, Ly/j;

    .line 14
    .line 15
    invoke-direct {v4, v3}, Ly/j;-><init>(Ly/k;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v4}, Ly/i;->b(Ly/h;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v3, v0, Lv/x;->P:Ly/f;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    new-instance v4, Ly/g;

    .line 26
    .line 27
    invoke-direct {v4, v3}, Ly/g;-><init>(Ly/f;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v4}, Ly/i;->b(Ly/h;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object v3, v2, Lr/y;->c:[Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v4, v2, Lr/y;->a:[J

    .line 36
    .line 37
    array-length v5, v4

    .line 38
    add-int/lit8 v5, v5, -0x2

    .line 39
    .line 40
    if-ltz v5, :cond_5

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    move v7, v6

    .line 44
    :goto_0
    aget-wide v8, v4, v7

    .line 45
    .line 46
    not-long v10, v8

    .line 47
    const/4 v12, 0x7

    .line 48
    shl-long/2addr v10, v12

    .line 49
    and-long/2addr v10, v8

    .line 50
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    and-long/2addr v10, v12

    .line 56
    cmp-long v10, v10, v12

    .line 57
    .line 58
    if-eqz v10, :cond_4

    .line 59
    .line 60
    sub-int v10, v7, v5

    .line 61
    .line 62
    not-int v10, v10

    .line 63
    ushr-int/lit8 v10, v10, 0x1f

    .line 64
    .line 65
    const/16 v11, 0x8

    .line 66
    .line 67
    rsub-int/lit8 v10, v10, 0x8

    .line 68
    .line 69
    move v12, v6

    .line 70
    :goto_1
    if-ge v12, v10, :cond_3

    .line 71
    .line 72
    const-wide/16 v13, 0xff

    .line 73
    .line 74
    and-long/2addr v13, v8

    .line 75
    const-wide/16 v15, 0x80

    .line 76
    .line 77
    cmp-long v13, v13, v15

    .line 78
    .line 79
    if-gez v13, :cond_2

    .line 80
    .line 81
    shl-int/lit8 v13, v7, 0x3

    .line 82
    .line 83
    add-int/2addr v13, v12

    .line 84
    aget-object v13, v3, v13

    .line 85
    .line 86
    check-cast v13, Ly/k;

    .line 87
    .line 88
    new-instance v14, Ly/j;

    .line 89
    .line 90
    invoke-direct {v14, v13}, Ly/j;-><init>(Ly/k;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v14}, Ly/i;->b(Ly/h;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    shr-long/2addr v8, v11

    .line 97
    add-int/lit8 v12, v12, 0x1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    if-ne v10, v11, :cond_5

    .line 101
    .line 102
    :cond_4
    if-eq v7, v5, :cond_5

    .line 103
    .line 104
    add-int/lit8 v7, v7, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_5
    const/4 v1, 0x0

    .line 108
    iput-object v1, v0, Lv/x;->O:Ly/k;

    .line 109
    .line 110
    iput-object v1, v0, Lv/x;->P:Ly/f;

    .line 111
    .line 112
    invoke-virtual {v2}, Lr/y;->a()V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final B0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lv/x;->N:LB0/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lv/x;->H:Lv/V;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-object v1, p0, Lv/x;->G:Ly/i;

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    new-instance v1, Ly/i;

    .line 15
    .line 16
    invoke-direct {v1}, Ly/i;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lv/x;->G:Ly/i;

    .line 20
    .line 21
    :cond_1
    iget-object v1, p0, Lv/x;->L:Lv/I;

    .line 22
    .line 23
    iget-object v2, p0, Lv/x;->G:Ly/i;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lv/I;->C0(Ly/i;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lv/x;->G:Ly/i;

    .line 29
    .line 30
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0, v1}, Lv/V;->b(Ly/i;)LB0/m;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p0, v0}, LB0/n;->x0(LB0/m;)LB0/m;

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lv/x;->N:LB0/m;

    .line 41
    .line 42
    :cond_2
    :goto_0
    return-void
.end method

.method public final K(Landroid/view/KeyEvent;)Z
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lv/x;->B0()V

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, LQ2/g;->d(I)J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    iget-boolean v3, v0, Lv/x;->J:Z

    .line 15
    .line 16
    const/4 v4, 0x3

    .line 17
    iget-object v5, v0, Lv/x;->Q:Lr/y;

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x1

    .line 21
    if-eqz v3, :cond_2

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, LE3/h;->C(Landroid/view/KeyEvent;)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v9, 0x2

    .line 28
    if-ne v3, v9, :cond_2

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/a;->e(Landroid/view/KeyEvent;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    invoke-virtual {v5, v1, v2}, Lr/y;->b(J)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_1

    .line 41
    .line 42
    new-instance v3, Ly/k;

    .line 43
    .line 44
    iget-wide v8, v0, Lv/x;->R:J

    .line 45
    .line 46
    invoke-direct {v3, v8, v9}, Ly/k;-><init>(J)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5, v1, v2, v3}, Lr/y;->f(JLjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, v0, Lv/x;->G:Ly/i;

    .line 53
    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    invoke-virtual {v0}, Lc0/l;->l0()LM5/w;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    new-instance v2, Lv/f;

    .line 61
    .line 62
    invoke-direct {v2, v0, v3, v6}, Lv/f;-><init>(Lv/x;Ly/k;Lq5/c;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v1, v6, v6, v2, v4}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 66
    .line 67
    .line 68
    return v7

    .line 69
    :cond_0
    move/from16 v17, v7

    .line 70
    .line 71
    goto/16 :goto_4

    .line 72
    .line 73
    :cond_1
    const/16 v18, 0x0

    .line 74
    .line 75
    goto/16 :goto_5

    .line 76
    .line 77
    :cond_2
    iget-boolean v3, v0, Lv/x;->J:Z

    .line 78
    .line 79
    if-eqz v3, :cond_1

    .line 80
    .line 81
    invoke-static/range {p1 .. p1}, LE3/h;->C(Landroid/view/KeyEvent;)I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-ne v3, v7, :cond_1

    .line 86
    .line 87
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/a;->e(Landroid/view/KeyEvent;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_1

    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    const v9, -0x3361d2af    # -8.2930312E7f

    .line 101
    .line 102
    .line 103
    mul-int/2addr v3, v9

    .line 104
    shl-int/lit8 v9, v3, 0x10

    .line 105
    .line 106
    xor-int/2addr v3, v9

    .line 107
    and-int/lit8 v9, v3, 0x7f

    .line 108
    .line 109
    iget v10, v5, Lr/y;->d:I

    .line 110
    .line 111
    ushr-int/lit8 v3, v3, 0x7

    .line 112
    .line 113
    and-int/2addr v3, v10

    .line 114
    const/4 v11, 0x0

    .line 115
    :goto_0
    iget-object v12, v5, Lr/y;->a:[J

    .line 116
    .line 117
    shr-int/lit8 v13, v3, 0x3

    .line 118
    .line 119
    and-int/lit8 v14, v3, 0x7

    .line 120
    .line 121
    shl-int/2addr v14, v4

    .line 122
    aget-wide v15, v12, v13

    .line 123
    .line 124
    ushr-long/2addr v15, v14

    .line 125
    add-int/2addr v13, v7

    .line 126
    aget-wide v17, v12, v13

    .line 127
    .line 128
    rsub-int/lit8 v12, v14, 0x40

    .line 129
    .line 130
    shl-long v12, v17, v12

    .line 131
    .line 132
    move/from16 v17, v7

    .line 133
    .line 134
    const/16 v18, 0x0

    .line 135
    .line 136
    int-to-long v7, v14

    .line 137
    neg-long v7, v7

    .line 138
    const/16 v14, 0x3f

    .line 139
    .line 140
    shr-long/2addr v7, v14

    .line 141
    and-long/2addr v7, v12

    .line 142
    or-long/2addr v7, v15

    .line 143
    int-to-long v12, v9

    .line 144
    const-wide v14, 0x101010101010101L

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    mul-long/2addr v12, v14

    .line 150
    xor-long/2addr v12, v7

    .line 151
    sub-long v14, v12, v14

    .line 152
    .line 153
    not-long v12, v12

    .line 154
    and-long/2addr v12, v14

    .line 155
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    and-long/2addr v12, v14

    .line 161
    :goto_1
    const-wide/16 v19, 0x0

    .line 162
    .line 163
    cmp-long v16, v12, v19

    .line 164
    .line 165
    if-eqz v16, :cond_4

    .line 166
    .line 167
    invoke-static {v12, v13}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 168
    .line 169
    .line 170
    move-result v16

    .line 171
    shr-int/lit8 v16, v16, 0x3

    .line 172
    .line 173
    add-int v16, v3, v16

    .line 174
    .line 175
    and-int v16, v16, v10

    .line 176
    .line 177
    move-wide/from16 v21, v14

    .line 178
    .line 179
    iget-object v14, v5, Lr/y;->b:[J

    .line 180
    .line 181
    aget-wide v19, v14, v16

    .line 182
    .line 183
    cmp-long v14, v19, v1

    .line 184
    .line 185
    if-nez v14, :cond_3

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_3
    const-wide/16 v14, 0x1

    .line 189
    .line 190
    sub-long v14, v12, v14

    .line 191
    .line 192
    and-long/2addr v12, v14

    .line 193
    move-wide/from16 v14, v21

    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_4
    move-wide/from16 v21, v14

    .line 197
    .line 198
    not-long v12, v7

    .line 199
    const/4 v14, 0x6

    .line 200
    shl-long/2addr v12, v14

    .line 201
    and-long/2addr v7, v12

    .line 202
    and-long v7, v7, v21

    .line 203
    .line 204
    cmp-long v7, v7, v19

    .line 205
    .line 206
    if-eqz v7, :cond_8

    .line 207
    .line 208
    const/16 v16, -0x1

    .line 209
    .line 210
    :goto_2
    if-ltz v16, :cond_5

    .line 211
    .line 212
    iget v1, v5, Lr/y;->e:I

    .line 213
    .line 214
    add-int/lit8 v1, v1, -0x1

    .line 215
    .line 216
    iput v1, v5, Lr/y;->e:I

    .line 217
    .line 218
    iget-object v1, v5, Lr/y;->a:[J

    .line 219
    .line 220
    iget v2, v5, Lr/y;->d:I

    .line 221
    .line 222
    shr-int/lit8 v3, v16, 0x3

    .line 223
    .line 224
    and-int/lit8 v7, v16, 0x7

    .line 225
    .line 226
    shl-int/2addr v7, v4

    .line 227
    aget-wide v8, v1, v3

    .line 228
    .line 229
    const-wide/16 v10, 0xff

    .line 230
    .line 231
    shl-long/2addr v10, v7

    .line 232
    not-long v10, v10

    .line 233
    and-long/2addr v8, v10

    .line 234
    const-wide/16 v10, 0xfe

    .line 235
    .line 236
    shl-long/2addr v10, v7

    .line 237
    or-long v7, v8, v10

    .line 238
    .line 239
    aput-wide v7, v1, v3

    .line 240
    .line 241
    add-int/lit8 v3, v16, -0x7

    .line 242
    .line 243
    and-int/2addr v3, v2

    .line 244
    and-int/lit8 v2, v2, 0x7

    .line 245
    .line 246
    add-int/2addr v3, v2

    .line 247
    shr-int/lit8 v2, v3, 0x3

    .line 248
    .line 249
    aput-wide v7, v1, v2

    .line 250
    .line 251
    iget-object v1, v5, Lr/y;->c:[Ljava/lang/Object;

    .line 252
    .line 253
    aget-object v2, v1, v16

    .line 254
    .line 255
    aput-object v6, v1, v16

    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_5
    move-object v2, v6

    .line 259
    :goto_3
    check-cast v2, Ly/k;

    .line 260
    .line 261
    if-eqz v2, :cond_7

    .line 262
    .line 263
    iget-object v1, v0, Lv/x;->G:Ly/i;

    .line 264
    .line 265
    if-eqz v1, :cond_6

    .line 266
    .line 267
    invoke-virtual {v0}, Lc0/l;->l0()LM5/w;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    new-instance v3, Lv/g;

    .line 272
    .line 273
    invoke-direct {v3, v0, v2, v6}, Lv/g;-><init>(Lv/x;Ly/k;Lq5/c;)V

    .line 274
    .line 275
    .line 276
    invoke-static {v1, v6, v6, v3, v4}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 277
    .line 278
    .line 279
    :cond_6
    iget-object v1, v0, Lv/x;->K:LB5/a;

    .line 280
    .line 281
    invoke-interface {v1}, LB5/a;->invoke()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    :cond_7
    if-eqz v2, :cond_9

    .line 285
    .line 286
    :goto_4
    return v17

    .line 287
    :cond_8
    add-int/lit8 v11, v11, 0x8

    .line 288
    .line 289
    add-int/2addr v3, v11

    .line 290
    and-int/2addr v3, v10

    .line 291
    move/from16 v7, v17

    .line 292
    .line 293
    goto/16 :goto_0

    .line 294
    .line 295
    :cond_9
    :goto_5
    return v18
.end method

.method public final U()V
    .locals 3

    .line 1
    iget-object v0, p0, Lv/x;->G:Ly/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lv/x;->P:Ly/f;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v2, Ly/g;

    .line 10
    .line 11
    invoke-direct {v2, v1}, Ly/g;-><init>(Ly/f;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ly/i;->b(Ly/h;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lv/x;->P:Ly/f;

    .line 19
    .line 20
    iget-object v0, p0, Lv/x;->M:Lv0/A;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Lv0/A;->U()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final Z()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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

.method public final o()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lv/x;->U:Lv/M;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lv/x;->T:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lv/x;->B0()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-boolean v0, p0, Lv/x;->J:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lv/x;->L:Lv/I;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, LB0/n;->x0(LB0/m;)LB0/m;

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
.end method

.method public final q0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lv/x;->A0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv/x;->S:Ly/i;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object v1, p0, Lv/x;->G:Ly/i;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lv/x;->N:LB0/m;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, v0}, LB0/n;->y0(LB0/m;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    iput-object v1, p0, Lv/x;->N:LB0/m;

    .line 19
    .line 20
    return-void
.end method

.method public final t(Lv0/f;Lv0/g;J)V
    .locals 8

    .line 1
    const/16 v0, 0x21

    .line 2
    .line 3
    shr-long v1, p3, v0

    .line 4
    .line 5
    const/16 v3, 0x20

    .line 6
    .line 7
    shl-long/2addr v1, v3

    .line 8
    shl-long v4, p3, v3

    .line 9
    .line 10
    shr-long/2addr v4, v0

    .line 11
    const-wide v6, 0xffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    and-long/2addr v4, v6

    .line 17
    or-long v0, v1, v4

    .line 18
    .line 19
    shr-long v4, v0, v3

    .line 20
    .line 21
    long-to-int v2, v4

    .line 22
    int-to-float v2, v2

    .line 23
    and-long/2addr v0, v6

    .line 24
    long-to-int v0, v0

    .line 25
    int-to-float v0, v0

    .line 26
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    int-to-long v1, v1

    .line 31
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    int-to-long v4, v0

    .line 36
    shl-long v0, v1, v3

    .line 37
    .line 38
    and-long v2, v4, v6

    .line 39
    .line 40
    or-long/2addr v0, v2

    .line 41
    iput-wide v0, p0, Lv/x;->R:J

    .line 42
    .line 43
    invoke-virtual {p0}, Lv/x;->B0()V

    .line 44
    .line 45
    .line 46
    iget-boolean v0, p0, Lv/x;->J:Z

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    sget-object v0, Lv0/g;->r:Lv0/g;

    .line 52
    .line 53
    if-ne p2, v0, :cond_1

    .line 54
    .line 55
    iget v0, p1, Lv0/f;->c:I

    .line 56
    .line 57
    const/4 v2, 0x4

    .line 58
    const/4 v3, 0x3

    .line 59
    if-ne v0, v2, :cond_0

    .line 60
    .line 61
    invoke-virtual {p0}, Lc0/l;->l0()LM5/w;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    new-instance v2, Lv/h;

    .line 66
    .line 67
    invoke-direct {v2, p0, v1}, Lv/h;-><init>(Lv/x;Lq5/c;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v1, v1, v2, v3}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    const/4 v2, 0x5

    .line 75
    if-ne v0, v2, :cond_1

    .line 76
    .line 77
    invoke-virtual {p0}, Lc0/l;->l0()LM5/w;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    new-instance v2, Lv/i;

    .line 82
    .line 83
    invoke-direct {v2, p0, v1}, Lv/i;-><init>(Lv/x;Lq5/c;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v0, v1, v1, v2, v3}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 87
    .line 88
    .line 89
    :cond_1
    :goto_0
    iget-object v0, p0, Lv/x;->M:Lv0/A;

    .line 90
    .line 91
    if-nez v0, :cond_2

    .line 92
    .line 93
    new-instance v0, LF/j;

    .line 94
    .line 95
    const/4 v2, 0x2

    .line 96
    invoke-direct {v0, v2, p0}, LF/j;-><init>(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    sget-object v2, Lv0/u;->a:Lv0/f;

    .line 100
    .line 101
    new-instance v2, Lv0/A;

    .line 102
    .line 103
    invoke-direct {v2, v1, v1, v0}, Lv0/A;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v2}, LB0/n;->x0(LB0/m;)LB0/m;

    .line 107
    .line 108
    .line 109
    iput-object v2, p0, Lv/x;->M:Lv0/A;

    .line 110
    .line 111
    :cond_2
    iget-object v0, p0, Lv/x;->M:Lv0/A;

    .line 112
    .line 113
    if-eqz v0, :cond_3

    .line 114
    .line 115
    invoke-virtual {v0, p1, p2, p3, p4}, Lv0/A;->t(Lv0/f;Lv0/g;J)V

    .line 116
    .line 117
    .line 118
    :cond_3
    return-void
.end method
