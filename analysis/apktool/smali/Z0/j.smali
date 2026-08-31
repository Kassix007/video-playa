.class public abstract LZ0/j;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Lw1/l;
.implements LP/i;
.implements LB0/u0;
.implements Lw1/m;


# instance fields
.field public A:LB5/c;

.field public B:Landroidx/lifecycle/x;

.field public C:Lg2/e;

.field public final D:[I

.field public E:J

.field public F:Lw1/o0;

.field public final G:LZ0/i;

.field public final H:LZ0/i;

.field public I:LB5/c;

.field public final J:[I

.field public K:I

.field public L:I

.field public final M:LM/t;

.field public N:Z

.field public final O:LB0/L;

.field public final q:Lu0/d;

.field public final r:Landroid/view/View;

.field public final s:LB0/t0;

.field public t:LB5/a;

.field public u:Z

.field public v:LB5/a;

.field public w:LB5/a;

.field public x:Lc0/m;

.field public y:LB5/c;

.field public z:LW0/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;LP/m;ILu0/d;Landroid/view/View;LB0/t0;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, LZ0/j;->q:Lu0/d;

    .line 5
    .line 6
    iput-object p5, p0, LZ0/j;->r:Landroid/view/View;

    .line 7
    .line 8
    iput-object p6, p0, LZ0/j;->s:LB0/t0;

    .line 9
    .line 10
    sget-object p1, LC0/s1;->a:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    const p1, 0x7f09004f

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-virtual {p0, p1}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    new-instance p2, LZ0/a;

    .line 26
    .line 27
    move-object p3, p0

    .line 28
    check-cast p3, LZ0/r;

    .line 29
    .line 30
    invoke-direct {p2, p3, p1}, LZ0/a;-><init>(Landroid/view/ViewGroup;I)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0, p2}, Lw1/K;->o(Landroid/view/View;Lw1/Q;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0, p0}, Lw1/B;->l(Landroid/view/View;Lw1/m;)V

    .line 37
    .line 38
    .line 39
    sget-object p2, LZ0/h;->t:LZ0/h;

    .line 40
    .line 41
    iput-object p2, p0, LZ0/j;->t:LB5/a;

    .line 42
    .line 43
    sget-object p2, LZ0/h;->s:LZ0/h;

    .line 44
    .line 45
    iput-object p2, p0, LZ0/j;->v:LB5/a;

    .line 46
    .line 47
    sget-object p2, LZ0/h;->r:LZ0/h;

    .line 48
    .line 49
    iput-object p2, p0, LZ0/j;->w:LB5/a;

    .line 50
    .line 51
    sget-object p2, Lc0/j;->q:Lc0/j;

    .line 52
    .line 53
    iput-object p2, p0, LZ0/j;->x:Lc0/m;

    .line 54
    .line 55
    invoke-static {}, Lcom/google/android/gms/internal/measurement/I1;->B()LW0/d;

    .line 56
    .line 57
    .line 58
    move-result-object p5

    .line 59
    iput-object p5, p0, LZ0/j;->z:LW0/c;

    .line 60
    .line 61
    const/4 p5, 0x2

    .line 62
    new-array p6, p5, [I

    .line 63
    .line 64
    iput-object p6, p0, LZ0/j;->D:[I

    .line 65
    .line 66
    const-wide/16 v0, 0x0

    .line 67
    .line 68
    iput-wide v0, p0, LZ0/j;->E:J

    .line 69
    .line 70
    new-instance p6, LZ0/i;

    .line 71
    .line 72
    const/4 v0, 0x1

    .line 73
    invoke-direct {p6, p3, v0}, LZ0/i;-><init>(LZ0/r;I)V

    .line 74
    .line 75
    .line 76
    iput-object p6, p0, LZ0/j;->G:LZ0/i;

    .line 77
    .line 78
    new-instance p6, LZ0/i;

    .line 79
    .line 80
    invoke-direct {p6, p3, p1}, LZ0/i;-><init>(LZ0/r;I)V

    .line 81
    .line 82
    .line 83
    iput-object p6, p0, LZ0/j;->H:LZ0/i;

    .line 84
    .line 85
    new-array p6, p5, [I

    .line 86
    .line 87
    iput-object p6, p0, LZ0/j;->J:[I

    .line 88
    .line 89
    const/high16 p6, -0x80000000

    .line 90
    .line 91
    iput p6, p0, LZ0/j;->K:I

    .line 92
    .line 93
    iput p6, p0, LZ0/j;->L:I

    .line 94
    .line 95
    new-instance p6, LM/t;

    .line 96
    .line 97
    invoke-direct {p6}, Ljava/lang/Object;-><init>()V

    .line 98
    .line 99
    .line 100
    iput-object p6, p0, LZ0/j;->M:LM/t;

    .line 101
    .line 102
    new-instance p6, LB0/L;

    .line 103
    .line 104
    const/4 v1, 0x3

    .line 105
    invoke-direct {p6, v1}, LB0/L;-><init>(I)V

    .line 106
    .line 107
    .line 108
    iput-boolean v0, p6, LB0/L;->w:Z

    .line 109
    .line 110
    iput-object p3, p6, LB0/L;->E:LZ0/r;

    .line 111
    .line 112
    sget-object v1, LZ0/l;->a:LZ0/k;

    .line 113
    .line 114
    invoke-static {p2, v1, p4}, Landroidx/compose/ui/input/nestedscroll/a;->a(Lc0/m;Lu0/a;Lu0/d;)Lc0/m;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    sget-object p4, LZ0/b;->t:LZ0/b;

    .line 119
    .line 120
    invoke-static {p2, v0, p4}, LI0/j;->a(Lc0/m;ZLB5/c;)Lc0/m;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    new-instance p4, Lv0/r;

    .line 125
    .line 126
    invoke-direct {p4}, Lv0/r;-><init>()V

    .line 127
    .line 128
    .line 129
    new-instance v1, LZ0/d;

    .line 130
    .line 131
    invoke-direct {v1, p3, v0}, LZ0/d;-><init>(LZ0/r;I)V

    .line 132
    .line 133
    .line 134
    iput-object v1, p4, Lv0/r;->q:LZ0/d;

    .line 135
    .line 136
    new-instance v0, LO5/r;

    .line 137
    .line 138
    invoke-direct {v0}, LO5/r;-><init>()V

    .line 139
    .line 140
    .line 141
    iget-object v1, p4, Lv0/r;->r:LO5/r;

    .line 142
    .line 143
    const/4 v2, 0x0

    .line 144
    if-nez v1, :cond_0

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_0
    iput-object v2, v1, LO5/r;->r:Ljava/lang/Object;

    .line 148
    .line 149
    :goto_0
    iput-object v0, p4, Lv0/r;->r:LO5/r;

    .line 150
    .line 151
    iput-object p4, v0, LO5/r;->r:Ljava/lang/Object;

    .line 152
    .line 153
    invoke-virtual {p0, v0}, LZ0/j;->setOnRequestDisallowInterceptTouchEvent$ui_release(LB5/c;)V

    .line 154
    .line 155
    .line 156
    invoke-interface {p2, p4}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    const/4 p4, 0x0

    .line 161
    const v0, 0x1ffff

    .line 162
    .line 163
    .line 164
    invoke-static {p2, p4, v2, p1, v0}, Landroidx/compose/ui/graphics/a;->b(Lc0/m;FLj0/E;ZI)Lc0/m;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    new-instance p4, LA/J;

    .line 169
    .line 170
    const/4 v0, 0x5

    .line 171
    invoke-direct {p4, p3, p6, p3, v0}, LA/J;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 172
    .line 173
    .line 174
    invoke-static {p2, p4}, Landroidx/compose/ui/draw/a;->a(Lc0/m;LB5/c;)Lc0/m;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    new-instance p4, LZ0/c;

    .line 179
    .line 180
    invoke-direct {p4, p3, p6, p5}, LZ0/c;-><init>(LZ0/r;LB0/L;I)V

    .line 181
    .line 182
    .line 183
    invoke-static {p2, p4}, Landroidx/compose/ui/layout/a;->c(Lc0/m;LZ0/c;)Lc0/m;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    iget-object p4, p0, LZ0/j;->x:Lc0/m;

    .line 188
    .line 189
    invoke-interface {p4, p2}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 190
    .line 191
    .line 192
    move-result-object p4

    .line 193
    invoke-virtual {p6, p4}, LB0/L;->Y(Lc0/m;)V

    .line 194
    .line 195
    .line 196
    new-instance p4, LA/Y;

    .line 197
    .line 198
    const/16 p5, 0x15

    .line 199
    .line 200
    invoke-direct {p4, p5, p6, p2}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    iput-object p4, p0, LZ0/j;->y:LB5/c;

    .line 204
    .line 205
    iget-object p2, p0, LZ0/j;->z:LW0/c;

    .line 206
    .line 207
    invoke-virtual {p6, p2}, LB0/L;->V(LW0/c;)V

    .line 208
    .line 209
    .line 210
    new-instance p2, LB0/a;

    .line 211
    .line 212
    const/16 p4, 0x17

    .line 213
    .line 214
    invoke-direct {p2, p4, p6}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    iput-object p2, p0, LZ0/j;->A:LB5/c;

    .line 218
    .line 219
    new-instance p2, LZ0/c;

    .line 220
    .line 221
    invoke-direct {p2, p3, p6, p1}, LZ0/c;-><init>(LZ0/r;LB0/L;I)V

    .line 222
    .line 223
    .line 224
    iput-object p2, p6, LB0/L;->b0:LZ0/c;

    .line 225
    .line 226
    new-instance p2, LZ0/d;

    .line 227
    .line 228
    invoke-direct {p2, p3, p1}, LZ0/d;-><init>(LZ0/r;I)V

    .line 229
    .line 230
    .line 231
    iput-object p2, p6, LB0/L;->c0:LZ0/d;

    .line 232
    .line 233
    new-instance p1, LZ0/e;

    .line 234
    .line 235
    invoke-direct {p1, p3, p6}, LZ0/e;-><init>(LZ0/r;LB0/L;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p6, p1}, LB0/L;->X(Lz0/C;)V

    .line 239
    .line 240
    .line 241
    iput-object p6, p0, LZ0/j;->O:LB0/L;

    .line 242
    .line 243
    return-void
.end method

.method private final getSnapshotObserver()LB0/v0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "Expected AndroidViewHolder to be attached when observing reads."

    .line 8
    .line 9
    invoke-static {v0}, Ly0/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, LZ0/j;->s:LB0/t0;

    .line 13
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
    return-object v0
.end method

.method public static final synthetic k(LZ0/r;)LB0/v0;
    .locals 0

    .line 1
    invoke-direct {p0}, LZ0/j;->getSnapshotObserver()LB0/v0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final l(LZ0/r;III)I
    .locals 1

    .line 1
    const/high16 p0, 0x40000000    # 2.0f

    .line 2
    .line 3
    if-gez p3, :cond_3

    .line 4
    .line 5
    if-ne p1, p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, -0x2

    .line 9
    const v0, 0x7fffffff

    .line 10
    .line 11
    .line 12
    if-ne p3, p1, :cond_1

    .line 13
    .line 14
    if-eq p2, v0, :cond_1

    .line 15
    .line 16
    const/high16 p0, -0x80000000

    .line 17
    .line 18
    invoke-static {p2, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_1
    const/4 p1, -0x1

    .line 24
    if-ne p3, p1, :cond_2

    .line 25
    .line 26
    if-eq p2, v0, :cond_2

    .line 27
    .line 28
    invoke-static {p2, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0

    .line 33
    :cond_2
    const/4 p0, 0x0

    .line 34
    invoke-static {p0, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0

    .line 39
    :cond_3
    :goto_0
    invoke-static {p3, p1, p2}, LD5/a;->q(III)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-static {p1, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0
.end method

.method public static m(Ln1/b;IIII)Ln1/b;
    .locals 2

    .line 1
    iget v0, p0, Ln1/b;->a:I

    .line 2
    .line 3
    sub-int/2addr v0, p1

    .line 4
    const/4 p1, 0x0

    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    move v0, p1

    .line 8
    :cond_0
    iget v1, p0, Ln1/b;->b:I

    .line 9
    .line 10
    sub-int/2addr v1, p2

    .line 11
    if-gez v1, :cond_1

    .line 12
    .line 13
    move v1, p1

    .line 14
    :cond_1
    iget p2, p0, Ln1/b;->c:I

    .line 15
    .line 16
    sub-int/2addr p2, p3

    .line 17
    if-gez p2, :cond_2

    .line 18
    .line 19
    move p2, p1

    .line 20
    :cond_2
    iget p0, p0, Ln1/b;->d:I

    .line 21
    .line 22
    sub-int/2addr p0, p4

    .line 23
    if-gez p0, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    move p1, p0

    .line 27
    :goto_0
    invoke-static {v0, v1, p2, p1}, Ln1/b;->b(IIII)Ln1/b;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method


# virtual methods
.method public final a(Landroid/view/View;Landroid/view/View;II)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iget-object p2, p0, LZ0/j;->M:LM/t;

    .line 3
    .line 4
    if-ne p4, p1, :cond_0

    .line 5
    .line 6
    iput p3, p2, LM/t;->b:I

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iput p3, p2, LM/t;->a:I

    .line 10
    .line 11
    return-void
.end method

.method public final b(Landroid/view/View;I)V
    .locals 2

    .line 1
    const/4 p1, 0x1

    .line 2
    iget-object v0, p0, LZ0/j;->M:LM/t;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-ne p2, p1, :cond_0

    .line 6
    .line 7
    iput v1, v0, LM/t;->b:I

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput v1, v0, LM/t;->a:I

    .line 11
    .line 12
    return-void
.end method

.method public final c(Landroid/view/View;Lw1/o0;)Lw1/o0;
    .locals 0

    .line 1
    new-instance p1, Lw1/o0;

    .line 2
    .line 3
    invoke-direct {p1, p2}, Lw1/o0;-><init>(Lw1/o0;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LZ0/j;->F:Lw1/o0;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, LZ0/j;->n(Lw1/o0;)Lw1/o0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final d(Landroid/view/View;II[II)V
    .locals 6

    .line 1
    iget-object p1, p0, LZ0/j;->r:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->isNestedScrollingEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    int-to-float p1, p2

    .line 11
    const/4 p2, -0x1

    .line 12
    int-to-float p2, p2

    .line 13
    mul-float/2addr p1, p2

    .line 14
    int-to-float p3, p3

    .line 15
    mul-float/2addr p3, p2

    .line 16
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    int-to-long p1, p1

    .line 21
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    int-to-long v0, p3

    .line 26
    const/16 p3, 0x20

    .line 27
    .line 28
    shl-long/2addr p1, p3

    .line 29
    const-wide v2, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr v0, v2

    .line 35
    or-long/2addr p1, v0

    .line 36
    const/4 v0, 0x1

    .line 37
    if-nez p5, :cond_1

    .line 38
    .line 39
    move p5, v0

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 p5, 0x2

    .line 42
    :goto_0
    iget-object v1, p0, LZ0/j;->q:Lu0/d;

    .line 43
    .line 44
    iget-object v1, v1, Lu0/d;->a:Lu0/g;

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    iget-boolean v5, v1, Lc0/l;->D:Z

    .line 50
    .line 51
    if-eqz v5, :cond_2

    .line 52
    .line 53
    invoke-static {v1}, LB0/g;->j(LB0/E0;)LB0/E0;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    move-object v4, v1

    .line 58
    check-cast v4, Lu0/g;

    .line 59
    .line 60
    :cond_2
    if-eqz v4, :cond_3

    .line 61
    .line 62
    invoke-virtual {v4, p5, p1, p2}, Lu0/g;->b0(IJ)J

    .line 63
    .line 64
    .line 65
    move-result-wide p1

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    const-wide/16 p1, 0x0

    .line 68
    .line 69
    :goto_1
    shr-long v4, p1, p3

    .line 70
    .line 71
    long-to-int p3, v4

    .line 72
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 73
    .line 74
    .line 75
    move-result p3

    .line 76
    invoke-static {p3}, LC0/W;->c(F)I

    .line 77
    .line 78
    .line 79
    move-result p3

    .line 80
    const/4 p5, 0x0

    .line 81
    aput p3, p4, p5

    .line 82
    .line 83
    and-long/2addr p1, v2

    .line 84
    long-to-int p1, p1

    .line 85
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    invoke-static {p1}, LC0/W;->c(F)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    aput p1, p4, v0

    .line 94
    .line 95
    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/j;->r:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eq v1, p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, LZ0/j;->v:LB5/a;

    .line 14
    .line 15
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/j;->w:LB5/a;

    .line 2
    .line 3
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/j;->v:LB5/a;

    .line 2
    .line 3
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViewsInLayout()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final gatherTransparentRegion(Landroid/graphics/Region;)Z
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, LZ0/j;->J:[I

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aget v4, v1, v2

    .line 12
    .line 13
    aget v5, v1, v0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    add-int v6, v2, v4

    .line 20
    .line 21
    aget v1, v1, v0

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    add-int v7, v2, v1

    .line 28
    .line 29
    sget-object v8, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 30
    .line 31
    move-object v3, p1

    .line 32
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Region;->op(IIIILandroid/graphics/Region$Op;)Z

    .line 33
    .line 34
    .line 35
    return v0
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final getDensity()LW0/c;
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/j;->z:LW0/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getInteropView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/j;->r:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLayoutNode()LB0/L;
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/j;->O:LB0/L;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/j;->r:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-object v0
.end method

.method public final getLifecycleOwner()Landroidx/lifecycle/x;
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/j;->B:Landroidx/lifecycle/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getModifier()Lc0/m;
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/j;->x:Lc0/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public getNestedScrollAxes()I
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/j;->M:LM/t;

    .line 2
    .line 3
    iget v1, v0, LM/t;->a:I

    .line 4
    .line 5
    iget v0, v0, LM/t;->b:I

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    return v0
.end method

.method public final getOnDensityChanged$ui_release()LB5/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LB5/c;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, LZ0/j;->A:LB5/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOnModifierChanged$ui_release()LB5/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LB5/c;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, LZ0/j;->y:LB5/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOnRequestDisallowInterceptTouchEvent$ui_release()LB5/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LB5/c;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, LZ0/j;->I:LB5/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRelease()LB5/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LB5/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, LZ0/j;->w:LB5/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getReset()LB5/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LB5/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, LZ0/j;->v:LB5/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSavedStateRegistryOwner()Lg2/e;
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/j;->C:Lg2/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUpdate()LB5/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LB5/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, LZ0/j;->t:LB5/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/j;->r:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h(Landroid/view/View;IIIII[I)V
    .locals 12

    .line 1
    iget-object p1, p0, LZ0/j;->r:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->isNestedScrollingEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    int-to-float p1, p2

    .line 11
    const/4 p2, -0x1

    .line 12
    int-to-float p2, p2

    .line 13
    mul-float/2addr p1, p2

    .line 14
    int-to-float p3, p3

    .line 15
    mul-float/2addr p3, p2

    .line 16
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    int-to-long v0, p1

    .line 21
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    int-to-long v2, p1

    .line 26
    const/16 p1, 0x20

    .line 27
    .line 28
    shl-long/2addr v0, p1

    .line 29
    const-wide v4, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr v2, v4

    .line 35
    or-long v8, v0, v2

    .line 36
    .line 37
    move/from16 p3, p4

    .line 38
    .line 39
    int-to-float p3, p3

    .line 40
    mul-float/2addr p3, p2

    .line 41
    move/from16 v0, p5

    .line 42
    .line 43
    int-to-float v0, v0

    .line 44
    mul-float/2addr v0, p2

    .line 45
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    int-to-long p2, p2

    .line 50
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    int-to-long v0, v0

    .line 55
    shl-long/2addr p2, p1

    .line 56
    and-long/2addr v0, v4

    .line 57
    or-long v10, p2, v0

    .line 58
    .line 59
    const/4 p2, 0x1

    .line 60
    if-nez p6, :cond_1

    .line 61
    .line 62
    move v7, p2

    .line 63
    goto :goto_0

    .line 64
    :cond_1
    const/4 p3, 0x2

    .line 65
    move v7, p3

    .line 66
    :goto_0
    iget-object p3, p0, LZ0/j;->q:Lu0/d;

    .line 67
    .line 68
    iget-object p3, p3, Lu0/d;->a:Lu0/g;

    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    if-eqz p3, :cond_2

    .line 72
    .line 73
    iget-boolean v1, p3, Lc0/l;->D:Z

    .line 74
    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    invoke-static {p3}, LB0/g;->j(LB0/E0;)LB0/E0;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    move-object v0, p3

    .line 82
    check-cast v0, Lu0/g;

    .line 83
    .line 84
    :cond_2
    move-object v6, v0

    .line 85
    if-eqz v6, :cond_3

    .line 86
    .line 87
    invoke-virtual/range {v6 .. v11}, Lu0/g;->F(IJJ)J

    .line 88
    .line 89
    .line 90
    move-result-wide v0

    .line 91
    goto :goto_1

    .line 92
    :cond_3
    const-wide/16 v0, 0x0

    .line 93
    .line 94
    :goto_1
    shr-long v2, v0, p1

    .line 95
    .line 96
    long-to-int p1, v2

    .line 97
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    invoke-static {p1}, LC0/W;->c(F)I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    const/4 p3, 0x0

    .line 106
    aput p1, p7, p3

    .line 107
    .line 108
    and-long/2addr v0, v4

    .line 109
    long-to-int p1, v0

    .line 110
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    invoke-static {p1}, LC0/W;->c(F)I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    aput p1, p7, p2

    .line 119
    .line 120
    return-void
.end method

.method public final i(Landroid/view/View;IIIII)V
    .locals 11

    .line 1
    iget-object v0, p0, LZ0/j;->r:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isNestedScrollingEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    int-to-float v0, p2

    .line 11
    const/4 v1, -0x1

    .line 12
    int-to-float v1, v1

    .line 13
    mul-float/2addr v0, v1

    .line 14
    int-to-float v2, p3

    .line 15
    mul-float/2addr v2, v1

    .line 16
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    int-to-long v3, v0

    .line 21
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    int-to-long v5, v0

    .line 26
    const/16 v0, 0x20

    .line 27
    .line 28
    shl-long v2, v3, v0

    .line 29
    .line 30
    const-wide v7, 0xffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    and-long v4, v5, v7

    .line 36
    .line 37
    or-long/2addr v2, v4

    .line 38
    move v4, p4

    .line 39
    int-to-float v4, v4

    .line 40
    mul-float/2addr v4, v1

    .line 41
    move/from16 v5, p5

    .line 42
    .line 43
    int-to-float v5, v5

    .line 44
    mul-float/2addr v5, v1

    .line 45
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    int-to-long v9, v1

    .line 50
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    int-to-long v4, v1

    .line 55
    shl-long v0, v9, v0

    .line 56
    .line 57
    and-long/2addr v4, v7

    .line 58
    or-long/2addr v0, v4

    .line 59
    if-nez p6, :cond_1

    .line 60
    .line 61
    const/4 v4, 0x1

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    const/4 v4, 0x2

    .line 64
    :goto_0
    iget-object v5, p0, LZ0/j;->q:Lu0/d;

    .line 65
    .line 66
    iget-object v5, v5, Lu0/d;->a:Lu0/g;

    .line 67
    .line 68
    const/4 v6, 0x0

    .line 69
    if-eqz v5, :cond_2

    .line 70
    .line 71
    iget-boolean v7, v5, Lc0/l;->D:Z

    .line 72
    .line 73
    if-eqz v7, :cond_2

    .line 74
    .line 75
    invoke-static {v5}, LB0/g;->j(LB0/E0;)LB0/E0;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    move-object v6, v5

    .line 80
    check-cast v6, Lu0/g;

    .line 81
    .line 82
    :cond_2
    if-eqz v6, :cond_3

    .line 83
    .line 84
    move-wide/from16 p5, v0

    .line 85
    .line 86
    move-wide p3, v2

    .line 87
    move p2, v4

    .line 88
    move-object p1, v6

    .line 89
    invoke-virtual/range {p1 .. p6}, Lu0/g;->F(IJJ)J

    .line 90
    .line 91
    .line 92
    :cond_3
    return-void
.end method

.method public final invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, LZ0/j;->N:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    new-instance p1, LC0/z;

    .line 9
    .line 10
    const/4 p2, 0x1

    .line 11
    iget-object v0, p0, LZ0/j;->H:LZ0/i;

    .line 12
    .line 13
    invoke-direct {p1, v0, p2}, LC0/z;-><init>(LB5/a;I)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, LZ0/j;->r:Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p1, p0, LZ0/j;->O:LB0/L;

    .line 23
    .line 24
    invoke-virtual {p1}, LB0/L;->A()V

    .line 25
    .line 26
    .line 27
    :goto_0
    const/4 p1, 0x0

    .line 28
    return-object p1
.end method

.method public final isNestedScrollingEnabled()Z
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/j;->r:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isNestedScrollingEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final j(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    .line 1
    and-int/lit8 p1, p3, 0x2

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    if-nez p1, :cond_1

    .line 5
    .line 6
    and-int/lit8 p1, p3, 0x1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_1
    :goto_0
    return p2
.end method

.method public final n(Lw1/o0;)Lw1/o0;
    .locals 14

    .line 1
    iget-object v0, p1, Lw1/o0;->a:Lw1/l0;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-virtual {v0, v1}, Lw1/l0;->g(I)Ln1/b;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    sget-object v2, Ln1/b;->e:Ln1/b;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ln1/b;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/16 v1, -0x9

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lw1/l0;->h(I)Ln1/b;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1, v2}, Ln1/b;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Lw1/l0;->f()Lw1/h;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_6

    .line 33
    .line 34
    :cond_0
    iget-object v0, p0, LZ0/j;->O:LB0/L;

    .line 35
    .line 36
    iget-object v0, v0, LB0/L;->U:LB0/g0;

    .line 37
    .line 38
    iget-object v0, v0, LB0/g0;->b:LB0/v;

    .line 39
    .line 40
    iget-object v1, v0, LB0/v;->a0:LB0/B0;

    .line 41
    .line 42
    iget-boolean v1, v1, Lc0/l;->D:Z

    .line 43
    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-wide/16 v1, 0x0

    .line 48
    .line 49
    invoke-virtual {v0, v1, v2}, LB0/n0;->F(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v1

    .line 53
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/K1;->K(J)J

    .line 54
    .line 55
    .line 56
    move-result-wide v1

    .line 57
    const/16 v3, 0x20

    .line 58
    .line 59
    shr-long v4, v1, v3

    .line 60
    .line 61
    long-to-int v4, v4

    .line 62
    const/4 v5, 0x0

    .line 63
    if-gez v4, :cond_2

    .line 64
    .line 65
    move v4, v5

    .line 66
    :cond_2
    const-wide v6, 0xffffffffL

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    and-long/2addr v1, v6

    .line 72
    long-to-int v1, v1

    .line 73
    if-gez v1, :cond_3

    .line 74
    .line 75
    move v1, v5

    .line 76
    :cond_3
    invoke-static {v0}, Lz0/O;->f(Lz0/m;)Lz0/m;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-interface {v2}, Lz0/m;->E()J

    .line 81
    .line 82
    .line 83
    move-result-wide v8

    .line 84
    shr-long v10, v8, v3

    .line 85
    .line 86
    long-to-int v2, v10

    .line 87
    and-long/2addr v8, v6

    .line 88
    long-to-int v8, v8

    .line 89
    iget-wide v9, v0, Lz0/J;->s:J

    .line 90
    .line 91
    shr-long v11, v9, v3

    .line 92
    .line 93
    long-to-int v11, v11

    .line 94
    and-long/2addr v9, v6

    .line 95
    long-to-int v9, v9

    .line 96
    int-to-float v10, v11

    .line 97
    int-to-float v9, v9

    .line 98
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    int-to-long v10, v10

    .line 103
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    int-to-long v12, v9

    .line 108
    shl-long v9, v10, v3

    .line 109
    .line 110
    and-long v11, v12, v6

    .line 111
    .line 112
    or-long/2addr v9, v11

    .line 113
    invoke-virtual {v0, v9, v10}, LB0/n0;->F(J)J

    .line 114
    .line 115
    .line 116
    move-result-wide v9

    .line 117
    invoke-static {v9, v10}, Lcom/google/android/gms/internal/measurement/K1;->K(J)J

    .line 118
    .line 119
    .line 120
    move-result-wide v9

    .line 121
    shr-long v11, v9, v3

    .line 122
    .line 123
    long-to-int v0, v11

    .line 124
    sub-int/2addr v2, v0

    .line 125
    if-gez v2, :cond_4

    .line 126
    .line 127
    move v2, v5

    .line 128
    :cond_4
    and-long/2addr v6, v9

    .line 129
    long-to-int v0, v6

    .line 130
    sub-int/2addr v8, v0

    .line 131
    if-gez v8, :cond_5

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_5
    move v5, v8

    .line 135
    :goto_0
    if-nez v4, :cond_7

    .line 136
    .line 137
    if-nez v1, :cond_7

    .line 138
    .line 139
    if-nez v2, :cond_7

    .line 140
    .line 141
    if-nez v5, :cond_7

    .line 142
    .line 143
    :cond_6
    :goto_1
    return-object p1

    .line 144
    :cond_7
    iget-object p1, p1, Lw1/o0;->a:Lw1/l0;

    .line 145
    .line 146
    invoke-virtual {p1, v4, v1, v2, v5}, Lw1/l0;->n(IIII)Lw1/o0;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    return-object p1
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LZ0/j;->G:LZ0/i;

    .line 5
    .line 6
    invoke-virtual {v0}, LZ0/i;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, LZ0/j;->N:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    new-instance p1, LC0/z;

    .line 9
    .line 10
    const/4 p2, 0x1

    .line 11
    iget-object v0, p0, LZ0/j;->H:LZ0/i;

    .line 12
    .line 13
    invoke-direct {p1, v0, p2}, LC0/z;-><init>(LB5/a;I)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, LZ0/j;->r:Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object p1, p0, LZ0/j;->O:LB0/L;

    .line 23
    .line 24
    invoke-virtual {p1}, LB0/L;->A()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LZ0/j;->getSnapshotObserver()LB0/v0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, LB0/v0;->a:La0/t;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, La0/t;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    sub-int/2addr p4, p2

    .line 2
    sub-int/2addr p5, p3

    .line 3
    iget-object p1, p0, LZ0/j;->r:Landroid/view/View;

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 1
    iget-object v0, p0, LZ0/j;->r:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eq v1, p0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/16 v2, 0x8

    .line 26
    .line 27
    if-ne v1, v2, :cond_1

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 46
    .line 47
    .line 48
    iput p1, p0, LZ0/j;->K:I

    .line 49
    .line 50
    iput p2, p0, LZ0/j;->L:I

    .line 51
    .line 52
    return-void
.end method

.method public final onNestedFling(Landroid/view/View;FFZ)Z
    .locals 7

    .line 1
    iget-object p1, p0, LZ0/j;->r:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->isNestedScrollingEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    const/high16 p1, -0x40800000    # -1.0f

    .line 12
    .line 13
    mul-float/2addr p2, p1

    .line 14
    mul-float/2addr p3, p1

    .line 15
    invoke-static {p2, p3}, Ll6/d;->i(FF)J

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    iget-object p1, p0, LZ0/j;->q:Lu0/d;

    .line 20
    .line 21
    invoke-virtual {p1}, Lu0/d;->c()LM5/w;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v1, LZ0/f;

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    move-object v3, p0

    .line 29
    move v2, p4

    .line 30
    invoke-direct/range {v1 .. v6}, LZ0/f;-><init>(ZLZ0/j;JLq5/c;)V

    .line 31
    .line 32
    .line 33
    const/4 p2, 0x3

    .line 34
    const/4 p3, 0x0

    .line 35
    invoke-static {p1, p3, p3, v1, p2}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 36
    .line 37
    .line 38
    return v0
.end method

.method public final onNestedPreFling(Landroid/view/View;FF)Z
    .locals 3

    .line 1
    iget-object p1, p0, LZ0/j;->r:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->isNestedScrollingEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    const/high16 p1, -0x40800000    # -1.0f

    .line 12
    .line 13
    mul-float/2addr p2, p1

    .line 14
    mul-float/2addr p3, p1

    .line 15
    invoke-static {p2, p3}, Ll6/d;->i(FF)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    iget-object p3, p0, LZ0/j;->q:Lu0/d;

    .line 20
    .line 21
    invoke-virtual {p3}, Lu0/d;->c()LM5/w;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    new-instance v1, LZ0/g;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {v1, p0, p1, p2, v2}, LZ0/g;-><init>(LZ0/j;JLq5/c;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x3

    .line 32
    invoke-static {p3, v2, v2, v1, p1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 33
    .line 34
    .line 35
    return v0
.end method

.method public final onWindowVisibilityChanged(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onWindowVisibilityChanged(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final requestDisallowInterceptTouchEvent(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/j;->I:LB5/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setDensity(LW0/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/j;->z:LW0/c;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, LZ0/j;->z:LW0/c;

    .line 6
    .line 7
    iget-object v0, p0, LZ0/j;->A:LB5/c;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final setLifecycleOwner(Landroidx/lifecycle/x;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/j;->B:Landroidx/lifecycle/x;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, LZ0/j;->B:Landroidx/lifecycle/x;

    .line 6
    .line 7
    invoke-static {p0, p1}, Landroidx/lifecycle/X;->h(Landroid/view/View;Landroidx/lifecycle/x;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setModifier(Lc0/m;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/j;->x:Lc0/m;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, LZ0/j;->x:Lc0/m;

    .line 6
    .line 7
    iget-object v0, p0, LZ0/j;->y:LB5/c;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final setOnDensityChanged$ui_release(LB5/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LB5/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, LZ0/j;->A:LB5/c;

    .line 2
    .line 3
    return-void
.end method

.method public final setOnModifierChanged$ui_release(LB5/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LB5/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, LZ0/j;->y:LB5/c;

    .line 2
    .line 3
    return-void
.end method

.method public final setOnRequestDisallowInterceptTouchEvent$ui_release(LB5/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LB5/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, LZ0/j;->I:LB5/c;

    .line 2
    .line 3
    return-void
.end method

.method public final setRelease(LB5/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LB5/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, LZ0/j;->w:LB5/a;

    .line 2
    .line 3
    return-void
.end method

.method public final setReset(LB5/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LB5/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, LZ0/j;->v:LB5/a;

    .line 2
    .line 3
    return-void
.end method

.method public final setSavedStateRegistryOwner(Lg2/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/j;->C:Lg2/e;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, LZ0/j;->C:Lg2/e;

    .line 6
    .line 7
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/measurement/n2;->M(Landroid/view/View;Lg2/e;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setUpdate(LB5/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LB5/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, LZ0/j;->t:LB5/a;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, LZ0/j;->u:Z

    .line 5
    .line 6
    iget-object p1, p0, LZ0/j;->G:LZ0/i;

    .line 7
    .line 8
    invoke-virtual {p1}, LZ0/i;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final x()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method
