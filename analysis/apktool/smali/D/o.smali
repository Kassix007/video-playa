.class public final LD/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/D;


# instance fields
.field public final a:LD/q;

.field public final b:I

.field public final c:Z

.field public final d:F

.field public final e:Lz0/D;

.field public final f:F

.field public final g:Z

.field public final h:LM5/w;

.field public final i:LW0/c;

.field public final j:I

.field public final k:Lkotlin/jvm/internal/n;

.field public final l:Ljava/lang/Object;

.field public final m:I

.field public final n:I

.field public final o:I

.field public final p:Lw/d0;

.field public final q:I

.field public final r:I


# direct methods
.method public constructor <init>(LD/q;IZFLz0/D;FZLM5/w;LW0/c;ILB5/c;Ljava/util/List;IIILw/d0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LD/o;->a:LD/q;

    .line 3
    iput p2, p0, LD/o;->b:I

    .line 4
    iput-boolean p3, p0, LD/o;->c:Z

    .line 5
    iput p4, p0, LD/o;->d:F

    .line 6
    iput-object p5, p0, LD/o;->e:Lz0/D;

    .line 7
    iput p6, p0, LD/o;->f:F

    .line 8
    iput-boolean p7, p0, LD/o;->g:Z

    .line 9
    iput-object p8, p0, LD/o;->h:LM5/w;

    .line 10
    iput-object p9, p0, LD/o;->i:LW0/c;

    .line 11
    iput p10, p0, LD/o;->j:I

    .line 12
    check-cast p11, Lkotlin/jvm/internal/n;

    iput-object p11, p0, LD/o;->k:Lkotlin/jvm/internal/n;

    .line 13
    iput-object p12, p0, LD/o;->l:Ljava/lang/Object;

    .line 14
    iput p13, p0, LD/o;->m:I

    .line 15
    iput p14, p0, LD/o;->n:I

    .line 16
    iput p15, p0, LD/o;->o:I

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, LD/o;->p:Lw/d0;

    move/from16 p1, p17

    .line 18
    iput p1, p0, LD/o;->q:I

    move/from16 p1, p18

    .line 19
    iput p1, p0, LD/o;->r:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, LD/o;->e:Lz0/D;

    .line 2
    .line 3
    invoke-interface {v0}, Lz0/D;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget-object v0, p0, LD/o;->e:Lz0/D;

    .line 2
    .line 3
    invoke-interface {v0}, Lz0/D;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final c()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LD/o;->e:Lz0/D;

    .line 2
    .line 3
    invoke-interface {v0}, Lz0/D;->c()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final d()V
    .locals 1

    .line 1
    iget-object v0, p0, LD/o;->e:Lz0/D;

    .line 2
    .line 3
    invoke-interface {v0}, Lz0/D;->d()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e()LB5/c;
    .locals 1

    .line 1
    iget-object v0, p0, LD/o;->e:Lz0/D;

    .line 2
    .line 3
    invoke-interface {v0}, Lz0/D;->e()LB5/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final f(IZ)LD/o;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, LD/o;->g:Z

    .line 6
    .line 7
    if-nez v2, :cond_7

    .line 8
    .line 9
    iget-object v15, v0, LD/o;->l:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_7

    .line 16
    .line 17
    iget-object v2, v0, LD/o;->a:LD/q;

    .line 18
    .line 19
    if-eqz v2, :cond_7

    .line 20
    .line 21
    iget v2, v2, LD/q;->g:I

    .line 22
    .line 23
    iget v3, v0, LD/o;->b:I

    .line 24
    .line 25
    sub-int v5, v3, v1

    .line 26
    .line 27
    if-ltz v5, :cond_7

    .line 28
    .line 29
    if-ge v5, v2, :cond_7

    .line 30
    .line 31
    invoke-static {v15}, Ln5/l;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, LD/p;

    .line 36
    .line 37
    invoke-static {v15}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, LD/p;

    .line 42
    .line 43
    iget-boolean v4, v2, LD/p;->r:Z

    .line 44
    .line 45
    if-nez v4, :cond_7

    .line 46
    .line 47
    iget-boolean v4, v3, LD/p;->r:Z

    .line 48
    .line 49
    if-eqz v4, :cond_0

    .line 50
    .line 51
    goto/16 :goto_6

    .line 52
    .line 53
    :cond_0
    iget v4, v0, LD/o;->n:I

    .line 54
    .line 55
    iget v6, v0, LD/o;->m:I

    .line 56
    .line 57
    iget-object v7, v0, LD/o;->p:Lw/d0;

    .line 58
    .line 59
    if-gez v1, :cond_1

    .line 60
    .line 61
    invoke-static {v2, v7}, LD5/a;->y(LD/p;Lw/d0;)I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    iget v2, v2, LD/p;->l:I

    .line 66
    .line 67
    add-int/2addr v8, v2

    .line 68
    sub-int/2addr v8, v6

    .line 69
    invoke-static {v3, v7}, LD5/a;->y(LD/p;Lw/d0;)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    iget v3, v3, LD/p;->l:I

    .line 74
    .line 75
    add-int/2addr v2, v3

    .line 76
    sub-int/2addr v2, v4

    .line 77
    invoke-static {v8, v2}, Ljava/lang/Math;->min(II)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    neg-int v3, v1

    .line 82
    if-le v2, v3, :cond_7

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    invoke-static {v2, v7}, LD5/a;->y(LD/p;Lw/d0;)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    sub-int/2addr v6, v2

    .line 90
    invoke-static {v3, v7}, LD5/a;->y(LD/p;Lw/d0;)I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    sub-int/2addr v4, v2

    .line 95
    invoke-static {v6, v4}, Ljava/lang/Math;->min(II)I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-le v2, v1, :cond_7

    .line 100
    .line 101
    :goto_0
    move-object v2, v15

    .line 102
    check-cast v2, Ljava/util/Collection;

    .line 103
    .line 104
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    const/4 v4, 0x0

    .line 109
    :goto_1
    if-ge v4, v2, :cond_4

    .line 110
    .line 111
    invoke-interface {v15, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    check-cast v6, LD/p;

    .line 116
    .line 117
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-boolean v8, v6, LD/p;->r:Z

    .line 121
    .line 122
    if-eqz v8, :cond_2

    .line 123
    .line 124
    move v14, v4

    .line 125
    goto :goto_3

    .line 126
    :cond_2
    iget-wide v8, v6, LD/p;->o:J

    .line 127
    .line 128
    const/16 v10, 0x20

    .line 129
    .line 130
    shr-long v11, v8, v10

    .line 131
    .line 132
    long-to-int v11, v11

    .line 133
    const-wide v12, 0xffffffffL

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    and-long/2addr v8, v12

    .line 139
    long-to-int v8, v8

    .line 140
    add-int/2addr v8, v1

    .line 141
    move v14, v4

    .line 142
    int-to-long v3, v11

    .line 143
    shl-long/2addr v3, v10

    .line 144
    int-to-long v10, v8

    .line 145
    and-long/2addr v10, v12

    .line 146
    or-long/2addr v3, v10

    .line 147
    iput-wide v3, v6, LD/p;->o:J

    .line 148
    .line 149
    if-eqz p2, :cond_3

    .line 150
    .line 151
    iget-object v3, v6, LD/p;->e:Ljava/util/List;

    .line 152
    .line 153
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    const/4 v4, 0x0

    .line 158
    :goto_2
    if-ge v4, v3, :cond_3

    .line 159
    .line 160
    iget-object v8, v6, LD/p;->h:Landroidx/compose/foundation/lazy/layout/b;

    .line 161
    .line 162
    iget-object v10, v6, LD/p;->b:Ljava/lang/Object;

    .line 163
    .line 164
    invoke-virtual {v8, v4, v10}, Landroidx/compose/foundation/lazy/layout/b;->a(ILjava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    add-int/lit8 v4, v4, 0x1

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_3
    :goto_3
    add-int/lit8 v4, v14, 0x1

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_4
    iget-boolean v2, v0, LD/o;->c:Z

    .line 174
    .line 175
    if-nez v2, :cond_6

    .line 176
    .line 177
    if-lez v1, :cond_5

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_5
    const/4 v6, 0x0

    .line 181
    goto :goto_5

    .line 182
    :cond_6
    :goto_4
    const/4 v3, 0x1

    .line 183
    move v6, v3

    .line 184
    :goto_5
    int-to-float v1, v1

    .line 185
    new-instance v3, LD/o;

    .line 186
    .line 187
    iget-object v4, v0, LD/o;->a:LD/q;

    .line 188
    .line 189
    iget-object v8, v0, LD/o;->e:Lz0/D;

    .line 190
    .line 191
    iget v9, v0, LD/o;->f:F

    .line 192
    .line 193
    iget-boolean v10, v0, LD/o;->g:Z

    .line 194
    .line 195
    iget-object v11, v0, LD/o;->h:LM5/w;

    .line 196
    .line 197
    iget-object v12, v0, LD/o;->i:LW0/c;

    .line 198
    .line 199
    iget v13, v0, LD/o;->j:I

    .line 200
    .line 201
    iget-object v14, v0, LD/o;->k:Lkotlin/jvm/internal/n;

    .line 202
    .line 203
    iget v2, v0, LD/o;->m:I

    .line 204
    .line 205
    move/from16 v16, v1

    .line 206
    .line 207
    iget v1, v0, LD/o;->n:I

    .line 208
    .line 209
    move/from16 v17, v1

    .line 210
    .line 211
    iget v1, v0, LD/o;->o:I

    .line 212
    .line 213
    move/from16 v18, v1

    .line 214
    .line 215
    iget v1, v0, LD/o;->q:I

    .line 216
    .line 217
    move/from16 v20, v1

    .line 218
    .line 219
    iget v1, v0, LD/o;->r:I

    .line 220
    .line 221
    move/from16 v21, v1

    .line 222
    .line 223
    move-object/from16 v19, v7

    .line 224
    .line 225
    move/from16 v7, v16

    .line 226
    .line 227
    move/from16 v16, v2

    .line 228
    .line 229
    invoke-direct/range {v3 .. v21}, LD/o;-><init>(LD/q;IZFLz0/D;FZLM5/w;LW0/c;ILB5/c;Ljava/util/List;IIILw/d0;II)V

    .line 230
    .line 231
    .line 232
    return-object v3

    .line 233
    :cond_7
    :goto_6
    const/4 v1, 0x0

    .line 234
    return-object v1
.end method

.method public final g()J
    .locals 7

    .line 1
    iget-object v0, p0, LD/o;->e:Lz0/D;

    .line 2
    .line 3
    invoke-interface {v0}, Lz0/D;->b()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {v0}, Lz0/D;->a()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    int-to-long v1, v1

    .line 12
    const/16 v3, 0x20

    .line 13
    .line 14
    shl-long/2addr v1, v3

    .line 15
    int-to-long v3, v0

    .line 16
    const-wide v5, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr v3, v5

    .line 22
    or-long v0, v1, v3

    .line 23
    .line 24
    return-wide v0
.end method
