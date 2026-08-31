.class public final LC/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/D;


# instance fields
.field public final a:LC/t;

.field public final b:I

.field public final c:Z

.field public final d:F

.field public final e:Lz0/D;

.field public final f:F

.field public final g:Z

.field public final h:LM5/w;

.field public final i:LW0/c;

.field public final j:J

.field public final k:Ljava/lang/Object;

.field public final l:I

.field public final m:I

.field public final n:I

.field public final o:Lw/d0;

.field public final p:I

.field public final q:I


# direct methods
.method public constructor <init>(LC/t;IZFLz0/D;FZLM5/w;LW0/c;JLjava/util/List;IIILw/d0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LC/s;->a:LC/t;

    .line 3
    iput p2, p0, LC/s;->b:I

    .line 4
    iput-boolean p3, p0, LC/s;->c:Z

    .line 5
    iput p4, p0, LC/s;->d:F

    .line 6
    iput-object p5, p0, LC/s;->e:Lz0/D;

    .line 7
    iput p6, p0, LC/s;->f:F

    .line 8
    iput-boolean p7, p0, LC/s;->g:Z

    .line 9
    iput-object p8, p0, LC/s;->h:LM5/w;

    .line 10
    iput-object p9, p0, LC/s;->i:LW0/c;

    .line 11
    iput-wide p10, p0, LC/s;->j:J

    .line 12
    iput-object p12, p0, LC/s;->k:Ljava/lang/Object;

    .line 13
    iput p13, p0, LC/s;->l:I

    .line 14
    iput p14, p0, LC/s;->m:I

    .line 15
    iput p15, p0, LC/s;->n:I

    move-object/from16 p1, p16

    .line 16
    iput-object p1, p0, LC/s;->o:Lw/d0;

    move/from16 p1, p17

    .line 17
    iput p1, p0, LC/s;->p:I

    move/from16 p1, p18

    .line 18
    iput p1, p0, LC/s;->q:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, LC/s;->e:Lz0/D;

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
    iget-object v0, p0, LC/s;->e:Lz0/D;

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
    iget-object v0, p0, LC/s;->e:Lz0/D;

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
    iget-object v0, p0, LC/s;->e:Lz0/D;

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
    iget-object v0, p0, LC/s;->e:Lz0/D;

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

.method public final f(IZ)LC/s;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, LC/s;->g:Z

    .line 6
    .line 7
    if-nez v2, :cond_9

    .line 8
    .line 9
    iget-object v15, v0, LC/s;->k:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_9

    .line 16
    .line 17
    iget-object v2, v0, LC/s;->a:LC/t;

    .line 18
    .line 19
    if-eqz v2, :cond_9

    .line 20
    .line 21
    iget v2, v2, LC/t;->l:I

    .line 22
    .line 23
    iget v3, v0, LC/s;->b:I

    .line 24
    .line 25
    sub-int v5, v3, v1

    .line 26
    .line 27
    if-ltz v5, :cond_9

    .line 28
    .line 29
    if-ge v5, v2, :cond_9

    .line 30
    .line 31
    invoke-static {v15}, Ln5/l;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, LC/t;

    .line 36
    .line 37
    invoke-static {v15}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, LC/t;

    .line 42
    .line 43
    iget-boolean v4, v2, LC/t;->n:Z

    .line 44
    .line 45
    if-nez v4, :cond_9

    .line 46
    .line 47
    iget-boolean v4, v3, LC/t;->n:Z

    .line 48
    .line 49
    if-eqz v4, :cond_0

    .line 50
    .line 51
    goto/16 :goto_9

    .line 52
    .line 53
    :cond_0
    iget v4, v0, LC/s;->m:I

    .line 54
    .line 55
    iget v6, v0, LC/s;->l:I

    .line 56
    .line 57
    if-gez v1, :cond_1

    .line 58
    .line 59
    iget v7, v2, LC/t;->j:I

    .line 60
    .line 61
    iget v2, v2, LC/t;->l:I

    .line 62
    .line 63
    add-int/2addr v7, v2

    .line 64
    sub-int/2addr v7, v6

    .line 65
    iget v2, v3, LC/t;->j:I

    .line 66
    .line 67
    iget v3, v3, LC/t;->l:I

    .line 68
    .line 69
    add-int/2addr v2, v3

    .line 70
    sub-int/2addr v2, v4

    .line 71
    invoke-static {v7, v2}, Ljava/lang/Math;->min(II)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    neg-int v3, v1

    .line 76
    if-le v2, v3, :cond_9

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    iget v2, v2, LC/t;->j:I

    .line 80
    .line 81
    sub-int/2addr v6, v2

    .line 82
    iget v2, v3, LC/t;->j:I

    .line 83
    .line 84
    sub-int/2addr v4, v2

    .line 85
    invoke-static {v6, v4}, Ljava/lang/Math;->min(II)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-le v2, v1, :cond_9

    .line 90
    .line 91
    :goto_0
    move-object v2, v15

    .line 92
    check-cast v2, Ljava/util/Collection;

    .line 93
    .line 94
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    const/4 v3, 0x0

    .line 99
    move v4, v3

    .line 100
    :goto_1
    if-ge v4, v2, :cond_6

    .line 101
    .line 102
    invoke-interface {v15, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    check-cast v6, LC/t;

    .line 107
    .line 108
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v7, v6, LC/t;->p:[I

    .line 112
    .line 113
    iget-boolean v8, v6, LC/t;->n:Z

    .line 114
    .line 115
    if-eqz v8, :cond_2

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_2
    iget v8, v6, LC/t;->j:I

    .line 119
    .line 120
    add-int/2addr v8, v1

    .line 121
    iput v8, v6, LC/t;->j:I

    .line 122
    .line 123
    array-length v8, v7

    .line 124
    move v9, v3

    .line 125
    :goto_2
    if-ge v9, v8, :cond_4

    .line 126
    .line 127
    and-int/lit8 v10, v9, 0x1

    .line 128
    .line 129
    if-nez v10, :cond_3

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_3
    aget v10, v7, v9

    .line 133
    .line 134
    add-int/2addr v10, v1

    .line 135
    aput v10, v7, v9

    .line 136
    .line 137
    :goto_3
    add-int/lit8 v9, v9, 0x1

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_4
    if-eqz p2, :cond_5

    .line 141
    .line 142
    iget-object v7, v6, LC/t;->b:Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    move v8, v3

    .line 149
    :goto_4
    if-ge v8, v7, :cond_5

    .line 150
    .line 151
    iget-object v9, v6, LC/t;->i:Landroidx/compose/foundation/lazy/layout/b;

    .line 152
    .line 153
    iget-object v10, v6, LC/t;->g:Ljava/lang/Object;

    .line 154
    .line 155
    invoke-virtual {v9, v8, v10}, Landroidx/compose/foundation/lazy/layout/b;->a(ILjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    add-int/lit8 v8, v8, 0x1

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_5
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_6
    new-instance v2, LC/s;

    .line 165
    .line 166
    iget-boolean v4, v0, LC/s;->c:Z

    .line 167
    .line 168
    if-nez v4, :cond_8

    .line 169
    .line 170
    if-lez v1, :cond_7

    .line 171
    .line 172
    goto :goto_7

    .line 173
    :cond_7
    :goto_6
    move v6, v3

    .line 174
    goto :goto_8

    .line 175
    :cond_8
    :goto_7
    const/4 v3, 0x1

    .line 176
    goto :goto_6

    .line 177
    :goto_8
    int-to-float v7, v1

    .line 178
    iget v1, v0, LC/s;->p:I

    .line 179
    .line 180
    iget v3, v0, LC/s;->q:I

    .line 181
    .line 182
    iget-object v4, v0, LC/s;->a:LC/t;

    .line 183
    .line 184
    iget-object v8, v0, LC/s;->e:Lz0/D;

    .line 185
    .line 186
    iget v9, v0, LC/s;->f:F

    .line 187
    .line 188
    iget-boolean v10, v0, LC/s;->g:Z

    .line 189
    .line 190
    iget-object v11, v0, LC/s;->h:LM5/w;

    .line 191
    .line 192
    iget-object v12, v0, LC/s;->i:LW0/c;

    .line 193
    .line 194
    iget-wide v13, v0, LC/s;->j:J

    .line 195
    .line 196
    move/from16 v20, v1

    .line 197
    .line 198
    iget v1, v0, LC/s;->l:I

    .line 199
    .line 200
    move/from16 v16, v1

    .line 201
    .line 202
    iget v1, v0, LC/s;->m:I

    .line 203
    .line 204
    move/from16 v17, v1

    .line 205
    .line 206
    iget v1, v0, LC/s;->n:I

    .line 207
    .line 208
    move/from16 v18, v1

    .line 209
    .line 210
    iget-object v1, v0, LC/s;->o:Lw/d0;

    .line 211
    .line 212
    move-object/from16 v19, v1

    .line 213
    .line 214
    move/from16 v21, v3

    .line 215
    .line 216
    move-object v3, v2

    .line 217
    invoke-direct/range {v3 .. v21}, LC/s;-><init>(LC/t;IZFLz0/D;FZLM5/w;LW0/c;JLjava/util/List;IIILw/d0;II)V

    .line 218
    .line 219
    .line 220
    return-object v3

    .line 221
    :cond_9
    :goto_9
    const/4 v1, 0x0

    .line 222
    return-object v1
.end method

.method public final g()J
    .locals 7

    .line 1
    iget-object v0, p0, LC/s;->e:Lz0/D;

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
